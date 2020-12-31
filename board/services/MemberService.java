package board.services;
<<<<<<< HEAD
import board.domains.MemberDto;
// 학생등록, 강사등록, 학생정보수정, 학생정보삭제, 학생로그인,
// 강사등록, 강사접속, 학생목록보기, 학생상세정보, 성적합계, 성적평균, 아이디중복체크
public interface MemberService {
    public void registerGrade(MemberDto grade);
    public void registerStudent(MemberDto student);
    public void registerTeacher(MemberDto teacher);
    public void modifyGrade(MemberDto grade);
    public void removeGrade(MemberDto grade);
    public void modifyStudent(MemberDto student);
    public void removeStudent(MemberDto student);
    public MemberDto login(MemberDto student);
    public MemberDto access(MemberDto teacher);
    public MemberDto[] fetchStudentList();
    public MemberDto fetchStudentDetail(String userId); 
    public int sum(MemberDto grade);
    public float avg(int sum);
    public boolean existId(String userid);

}

=======

import board.domains.StudentDTO;
import board.domains.TeacherDTO;

public interface MemberService {
    public void registerStudent(StudentDTO student);
    public void registerTeacher(TeacherDTO teacher);
    public void modifyStudent(StudentDTO student);
    public void removeStudent(StudentDTO student);
    public StudentDTO login(StudentDTO student);
    public TeacherDTO access(TeacherDTO teacher);
    public StudentDTO[] fetchstudentList();
    public StudentDTO fetchStudentDetail(String userId);
    public int sum(StudentDTO student);
    public float avg(int sum);
    public boolean existId(String userId);
}
// 학생등록, 강사등록, 학생정보수정, 학생정보삭제, 학생로그인
// 강사접속, 학생목록보기, 학생상세정보, 성적합계, 성적평균, 아이디중복체크
>>>>>>> 02bb71477c4c8cdccfe81c1929f0e810d1379a8e
