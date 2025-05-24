package com.bapsdelhibalmandal.balbalika_management_system.model;

import jakarta.persistence.Entity;
import lombok.Builder;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Entity
@Builder
public class Attendance {

    private Long attendanceId;

    @DateTimeFormat(pattern = "ddMMyyyy")
    private LocalDate attendanceDate;

    public Long getAttendanceId() {
        return attendanceId;
    }

    public void setAttendanceId(Long attendanceId) {
        this.attendanceId = attendanceId;
    }

    public LocalDate getAttendanceDate() {
        return attendanceDate;
    }

    public void setAttendanceDate(LocalDate attendanceDate) {
        this.attendanceDate = attendanceDate;
    }

    public Attendance() {
    }

    public Attendance(Long attendanceId, LocalDate attendanceDate) {
        this.attendanceId = attendanceId;
        this.attendanceDate = attendanceDate;
    }


}
