package org.libucr.course.server;

import org.libucr.course.Course;
import org.libucr.course.CourseQuery;
import org.libucr.course.SubjectArea;

public class CourseGetter {
    private CourseGetter() {
    }

    public static Course[] getCourses(String subjectArea, String courseNumber) throws CourseGenerationException {
        SubjectArea area = getSubjectArea(subjectArea);
        if (area == null) {
            throw new CourseGenerationException("Invalid subject area: " + subjectArea);
        }

        CourseQuery query = new CourseQuery.Builder()
            .setSubjectArea(getSubjectArea(subjectArea))
            .setCourseNumber(courseNumber)
            .build();
        return query.run();
    }

    private static SubjectArea getSubjectArea(String name) {
        switch (name) {
            case "ANTH": return SubjectArea.ANTH;
            case "ARBC": return SubjectArea.ARBC;
            case "ARLC": return SubjectArea.ARLC;
            case "ARC":  return SubjectArea.ARC;
            case "ART":  return SubjectArea.ART;
            case "AHS":  return SubjectArea.AHS;
            case "AST":  return SubjectArea.AST;
            case "BSWT": return SubjectArea.BSWT;
            case "BCH":  return SubjectArea.BCH;
            case "BIEN": return SubjectArea.BIEN;
            case "BIOL": return SubjectArea.BIOL;
            case "BMSC": return SubjectArea.BMSC;
            case "BPSC": return SubjectArea.BPSC;
            case "BUS":  return SubjectArea.BUS;
            case "CBNS": return SubjectArea.CBNS;
            case "CMDB": return SubjectArea.CMDB;
            case "CHFY": return SubjectArea.CHFY;
            case "CEE":  return SubjectArea.CEE;
            case "CHE":  return SubjectArea.CHE;
            case "CHEM": return SubjectArea.CHEM;
            case "CHN":  return SubjectArea.CHN;
            case "CLA":  return SubjectArea.CLA;
            case "CNAS": return SubjectArea.CNAS;
            case "CPAC": return SubjectArea.CPAC;
            case "CPLT": return SubjectArea.CPLT;
            case "CS":   return SubjectArea.CS;
            case "CRWT": return SubjectArea.CRWT;
            case "CWPA": return SubjectArea.CWPA;
            case "DNCE": return SubjectArea.DNCE;
            case "ECON": return SubjectArea.ECON;
            case "EDUC": return SubjectArea.EDUC;
            case "EE":   return SubjectArea.EE;
            case "ENGR": return SubjectArea.ENGR;
            case "ENGL": return SubjectArea.ENGL;
            case "ENTM": return SubjectArea.ENTM;
            case "ENVE": return SubjectArea.ENVE;
            case "ENSC": return SubjectArea.ENSC;
            case "ENTX": return SubjectArea.ENTX;
            case "ETST": return SubjectArea.ETST;
            case "EUR":  return SubjectArea.EUR;
            case "EEOB": return SubjectArea.EEOB;
            case "FIL":  return SubjectArea.FIL;
            case "FREN": return SubjectArea.FREN;
            case "GDIV": return SubjectArea.GDIV;
            case "GSST": return SubjectArea.GSST;
            case "GEN":  return SubjectArea.GEN;
            case "GEO":  return SubjectArea.GEO;
            case "GER":  return SubjectArea.GER;
            case "GBST": return SubjectArea.GBST;
            case "GRK":  return SubjectArea.GRK;
            case "HIST": return SubjectArea.HIST;
            case "HISE": return SubjectArea.HISE;
            case "HISA": return SubjectArea.HISA;
            case "HNPG": return SubjectArea.HNPG;
            case "HASS": return SubjectArea.HASS;
            case "ITAL": return SubjectArea.ITAL;
            case "JPN":  return SubjectArea.JPN;
            case "KOR":  return SubjectArea.KOR;
            case "LATN": return SubjectArea.LATN;
            case "LNST": return SubjectArea.LNST;
            case "LWSO": return SubjectArea.LWSO;
            case "LGBS": return SubjectArea.LGBS;
            case "LING": return SubjectArea.LING;
            case "MGT":  return SubjectArea.MGT;
            case "MSE":  return SubjectArea.MSE;
            case "MATH": return SubjectArea.MATH;
            case "MDCL": return SubjectArea.MDCL;
            case "ME":   return SubjectArea.ME;
            case "MCS":  return SubjectArea.MCS;
            case "MCBL": return SubjectArea.MCBL;
            case "MEIS": return SubjectArea.MEIS;
            case "MUS":  return SubjectArea.MUS;
            case "NASC": return SubjectArea.NASC;
            case "NEM":  return SubjectArea.NEM;
            case "NRSC": return SubjectArea.NRSC;
            case "PCST": return SubjectArea.PCST;
            case "PHIL": return SubjectArea.PHIL;
            case "PHYS": return SubjectArea.PHYS;
            case "PLPA": return SubjectArea.PLPA;
            case "POSC": return SubjectArea.POSC;
            case "PSYC": return SubjectArea.PSYC;
            case "PBPL": return SubjectArea.PBPL;
            case "REC":  return SubjectArea.REC;
            case "RLST": return SubjectArea.RLST;
            case "RUSN": return SubjectArea.RUSN;
            case "SOC":  return SubjectArea.SOC;
            case "SWSC": return SubjectArea.SWSC;
            case "SEAS": return SubjectArea.SEAS;
            case "SPN":  return SubjectArea.SPN;
            case "STAT": return SubjectArea.STAT;
            case "TFDP": return SubjectArea.TFDP;
            case "URST": return SubjectArea.URST;
            case "VNM":  return SubjectArea.VNM;
            default: return null;
        }
    }
}
