// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nis20211216.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNisInspectionReportStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNisInspectionReportStatusResponseBody</p>
 */
public class DescribeNisInspectionReportStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("InspectionProject")
    private String inspectionProject;

    @com.aliyun.core.annotation.NameInMap("InspectionReportId")
    private String inspectionReportId;

    @com.aliyun.core.annotation.NameInMap("InspectionTaskId")
    private String inspectionTaskId;

    @com.aliyun.core.annotation.NameInMap("InspectionTaskName")
    private String inspectionTaskName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private DescribeNisInspectionReportStatusResponseBody(Builder builder) {
        this.endTime = builder.endTime;
        this.inspectionProject = builder.inspectionProject;
        this.inspectionReportId = builder.inspectionReportId;
        this.inspectionTaskId = builder.inspectionTaskId;
        this.inspectionTaskName = builder.inspectionTaskName;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNisInspectionReportStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return inspectionProject
     */
    public String getInspectionProject() {
        return this.inspectionProject;
    }

    /**
     * @return inspectionReportId
     */
    public String getInspectionReportId() {
        return this.inspectionReportId;
    }

    /**
     * @return inspectionTaskId
     */
    public String getInspectionTaskId() {
        return this.inspectionTaskId;
    }

    /**
     * @return inspectionTaskName
     */
    public String getInspectionTaskName() {
        return this.inspectionTaskName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String endTime; 
        private String inspectionProject; 
        private String inspectionReportId; 
        private String inspectionTaskId; 
        private String inspectionTaskName; 
        private String requestId; 
        private String startTime; 
        private String status; 

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * InspectionProject.
         */
        public Builder inspectionProject(String inspectionProject) {
            this.inspectionProject = inspectionProject;
            return this;
        }

        /**
         * InspectionReportId.
         */
        public Builder inspectionReportId(String inspectionReportId) {
            this.inspectionReportId = inspectionReportId;
            return this;
        }

        /**
         * InspectionTaskId.
         */
        public Builder inspectionTaskId(String inspectionTaskId) {
            this.inspectionTaskId = inspectionTaskId;
            return this;
        }

        /**
         * InspectionTaskName.
         */
        public Builder inspectionTaskName(String inspectionTaskName) {
            this.inspectionTaskName = inspectionTaskName;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DescribeNisInspectionReportStatusResponseBody build() {
            return new DescribeNisInspectionReportStatusResponseBody(this);
        } 

    } 

}
