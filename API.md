# API Spec

## Client POST Request: `/generate`

The client is in charge of sending user courses to the server.  
The format is a list of course identifiers.
The list is ordered with the first having the highest priority and last lowest.

**Example:**
```
[
    {
        "subject: "CS",
    	"id": "14"
    },

    {
        "subject": "MATH",
    	"id": "10A"
    }
]
```

Each course identifier must contain a subject and an id field.

### Subject

The subject can have any mix of upper and lower case characters.  
`"subject": "CS"` and `"subject: "cs"` are fine.

The subject must only be alphabetic.  
`"subject": "CS"` is fine but `"subject": "cs1"` is not.

### ID

The ID can be upper or lower case.  
`"id": "10a"` is fine.

The ID can be any combination of alphanumeric.  
`"id": "10"`, `"id": "10A"` and, `"id": "A10"` are all fine.

## Server POST Response: `/generate`

The server is responsible for returning a list of possible schedules.  
The schedules are ranked with the highest score first.  

Example:
```
{
    "subjectArea": "EE",
    "courseNumber": "120A",
    "section": 2,
    "callNumber": 36802,
    "courseName": "Digital Design and Analysis",
    "courseId": "EE  120A",
    "instructor": "John Malarkey",
    "classType": "LEC",
    "days": [true, false, true, false, false, false],
    "times": {
        "start": {
            "hour": 14,
            "minute": 40
        },
        "end": {
            "hour": 16,
            "minute": 0
        }
    },
    "availableSeats": 12,
    "maxEnrollment": 51,
    "courseStatus": "OPEN",
    "finalExam": {
        "month": 3,
        "day": 14,
        "year": 2016,
        "time": {
            "start": {
                "hour": 8,
                "minute": 0
            },
            "end": {
                "hour": 11,
                "minute": 0
            }
        }
    },
    "coRequisites": "blah blah blah",
    "preRequisites": "foo bar",
    "units": 6
}
```
This is what one course object looks like. The `/generate` response will have
a list of these courses.
