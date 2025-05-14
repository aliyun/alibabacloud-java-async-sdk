// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link ListClusterInspectReportsResponseBody} extends {@link TeaModel}
 *
 * <p>ListClusterInspectReportsResponseBody</p>
 */
public class ListClusterInspectReportsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("reports")
    private java.util.List<Reports> reports;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListClusterInspectReportsResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.reports = builder.reports;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClusterInspectReportsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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

    public static final class Builder {
        private String nextToken; 
        private java.util.List<Reports> reports; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListClusterInspectReportsResponseBody model) {
            this.nextToken = model.nextToken;
            this.reports = model.reports;
            this.requestId = model.requestId;
        } 

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * reports.
         */
        public Builder reports(java.util.List<Reports> reports) {
            this.reports = reports;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListClusterInspectReportsResponseBody build() {
            return new ListClusterInspectReportsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListClusterInspectReportsResponseBody} extends {@link TeaModel}
     *
     * <p>ListClusterInspectReportsResponseBody</p>
     */
    public static class Summary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("adviceCount")
        private Integer adviceCount;

        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("errorCount")
        private Integer errorCount;

        @com.aliyun.core.annotation.NameInMap("normalCount")
        private Integer normalCount;

        @com.aliyun.core.annotation.NameInMap("warnCount")
        private Integer warnCount;

        private Summary(Builder builder) {
            this.adviceCount = builder.adviceCount;
            this.code = builder.code;
            this.errorCount = builder.errorCount;
            this.normalCount = builder.normalCount;
            this.warnCount = builder.warnCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Summary create() {
            return builder().build();
        }

        /**
         * @return adviceCount
         */
        public Integer getAdviceCount() {
            return this.adviceCount;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return errorCount
         */
        public Integer getErrorCount() {
            return this.errorCount;
        }

        /**
         * @return normalCount
         */
        public Integer getNormalCount() {
            return this.normalCount;
        }

        /**
         * @return warnCount
         */
        public Integer getWarnCount() {
            return this.warnCount;
        }

        public static final class Builder {
            private Integer adviceCount; 
            private String code; 
            private Integer errorCount; 
            private Integer normalCount; 
            private Integer warnCount; 

            private Builder() {
            } 

            private Builder(Summary model) {
                this.adviceCount = model.adviceCount;
                this.code = model.code;
                this.errorCount = model.errorCount;
                this.normalCount = model.normalCount;
                this.warnCount = model.warnCount;
            } 

            /**
             * adviceCount.
             */
            public Builder adviceCount(Integer adviceCount) {
                this.adviceCount = adviceCount;
                return this;
            }

            /**
             * code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * errorCount.
             */
            public Builder errorCount(Integer errorCount) {
                this.errorCount = errorCount;
                return this;
            }

            /**
             * normalCount.
             */
            public Builder normalCount(Integer normalCount) {
                this.normalCount = normalCount;
                return this;
            }

            /**
             * warnCount.
             */
            public Builder warnCount(Integer warnCount) {
                this.warnCount = warnCount;
                return this;
            }

            public Summary build() {
                return new Summary(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListClusterInspectReportsResponseBody} extends {@link TeaModel}
     *
     * <p>ListClusterInspectReportsResponseBody</p>
     */
    public static class Reports extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("endTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("reportId")
        private String reportId;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("summary")
        private Summary summary;

        private Reports(Builder builder) {
            this.endTime = builder.endTime;
            this.reportId = builder.reportId;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.summary = builder.summary;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Reports create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return reportId
         */
        public String getReportId() {
            return this.reportId;
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
         * @return summary
         */
        public Summary getSummary() {
            return this.summary;
        }

        public static final class Builder {
            private String endTime; 
            private String reportId; 
            private String startTime; 
            private String status; 
            private Summary summary; 

            private Builder() {
            } 

            private Builder(Reports model) {
                this.endTime = model.endTime;
                this.reportId = model.reportId;
                this.startTime = model.startTime;
                this.status = model.status;
                this.summary = model.summary;
            } 

            /**
             * endTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * reportId.
             */
            public Builder reportId(String reportId) {
                this.reportId = reportId;
                return this;
            }

            /**
             * startTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * summary.
             */
            public Builder summary(Summary summary) {
                this.summary = summary;
                return this;
            }

            public Reports build() {
                return new Reports(this);
            } 

        } 

    }
}
