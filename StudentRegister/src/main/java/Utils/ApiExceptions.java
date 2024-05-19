package Utils;

public enum ApiExceptions {
    STUDENT_NOT_FOUND(new RuntimeException("Student not found")),
    COURSE_NOT_FOUND(new RuntimeException("Course not found")),
    STUDENT_ALREADY_EXISTS(new RuntimeException("Student already exists")),
    COURSE_ALREADY_EXISTS(new RuntimeException("Course already exists")),
    STUDENT_ID_NOT_FOUND(new RuntimeException("Student id not found")),
    COURSE_ID_NOT_FOUND(new RuntimeException("Course id not found"));

    private RuntimeException exception;

    ApiExceptions(RuntimeException exception) {
        this.exception = exception;
    }

    public RuntimeException getException() {
        return this.exception;
    }
}
