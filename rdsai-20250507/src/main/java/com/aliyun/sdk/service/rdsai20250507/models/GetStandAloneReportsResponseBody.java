// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetStandAloneReportsResponseBody} extends {@link TeaModel}
 *
 * <p>GetStandAloneReportsResponseBody</p>
 */
public class GetStandAloneReportsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("Reports")
    private java.util.List<Reports> reports;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private GetStandAloneReportsResponseBody(Builder builder) {
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.reports = builder.reports;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStandAloneReportsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return reports
     */
    public java.util.List<Reports> getReports() {
        return this.reports;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String message; 
        private Long pageNumber; 
        private Long pageSize; 
        private java.util.List<Reports> reports; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(GetStandAloneReportsResponseBody model) {
            this.message = model.message;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.reports = model.reports;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The response message.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The page number. Pages start from 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of records on each page. Default value: 20. Maximum value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The reports.</p>
         */
        public Builder reports(java.util.List<Reports> reports) {
            this.reports = reports;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned results.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public GetStandAloneReportsResponseBody build() {
            return new GetStandAloneReportsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetStandAloneReportsResponseBody} extends {@link TeaModel}
     *
     * <p>GetStandAloneReportsResponseBody</p>
     */
    public static class Reports extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private String createdTime;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("ReportLanguage")
        private String reportLanguage;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private Reports(Builder builder) {
            this.createdTime = builder.createdTime;
            this.endTime = builder.endTime;
            this.reportLanguage = builder.reportLanguage;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Reports create() {
            return builder().build();
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return reportLanguage
         */
        public String getReportLanguage() {
            return this.reportLanguage;
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

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String createdTime; 
            private String endTime; 
            private String reportLanguage; 
            private String startTime; 
            private String status; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(Reports model) {
                this.createdTime = model.createdTime;
                this.endTime = model.endTime;
                this.reportLanguage = model.reportLanguage;
                this.startTime = model.startTime;
                this.status = model.status;
                this.taskId = model.taskId;
            } 

            /**
             * <p>The creation time of the inspection task.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-22T08:20:31Z</p>
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>The end time of the inspection. The time is in the YYYY-MM-DDTHH:mm:ssZ format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-23T08:20:31Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * ReportLanguage.
             */
            public Builder reportLanguage(String reportLanguage) {
                this.reportLanguage = reportLanguage;
                return this;
            }

            /**
             * <p>The start time of the inspection. The time is in the YYYY-MM-DDTHH:mm:ssZ format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-23T08:00:31Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The status of the inspection task.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the inspection report.</p>
             * 
             * <strong>example:</strong>
             * <p>0f19210c-7bb8-4e38-a099-f94152df****</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public Reports build() {
                return new Reports(this);
            } 

        } 

    }
}
