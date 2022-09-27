// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiagnosticReportsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDiagnosticReportsResponseBody</p>
 */
public class DescribeDiagnosticReportsResponseBody extends TeaModel {
    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("Reports")
    private java.util.List < Reports> reports;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDiagnosticReportsResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.reports = builder.reports;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiagnosticReportsResponseBody create() {
        return builder().build();
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
    public java.util.List < Reports> getReports() {
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
        private java.util.List < Reports> reports; 
        private String requestId; 

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * Reports.
         */
        public Builder reports(java.util.List < Reports> reports) {
            this.reports = reports;
            return this;
        }

        /**
         * 请求ID
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDiagnosticReportsResponseBody build() {
            return new DescribeDiagnosticReportsResponseBody(this);
        } 

    } 

    public static class Issues extends TeaModel {
        @NameInMap("IssueId")
        private String issueId;

        @NameInMap("MetricCategory")
        private String metricCategory;

        @NameInMap("MetricId")
        private String metricId;

        @NameInMap("Severity")
        private String severity;

        private Issues(Builder builder) {
            this.issueId = builder.issueId;
            this.metricCategory = builder.metricCategory;
            this.metricId = builder.metricId;
            this.severity = builder.severity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Issues create() {
            return builder().build();
        }

        /**
         * @return issueId
         */
        public String getIssueId() {
            return this.issueId;
        }

        /**
         * @return metricCategory
         */
        public String getMetricCategory() {
            return this.metricCategory;
        }

        /**
         * @return metricId
         */
        public String getMetricId() {
            return this.metricId;
        }

        /**
         * @return severity
         */
        public String getSeverity() {
            return this.severity;
        }

        public static final class Builder {
            private String issueId; 
            private String metricCategory; 
            private String metricId; 
            private String severity; 

            /**
             * IssueId.
             */
            public Builder issueId(String issueId) {
                this.issueId = issueId;
                return this;
            }

            /**
             * MetricCategory.
             */
            public Builder metricCategory(String metricCategory) {
                this.metricCategory = metricCategory;
                return this;
            }

            /**
             * MetricId.
             */
            public Builder metricId(String metricId) {
                this.metricId = metricId;
                return this;
            }

            /**
             * Severity.
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            public Issues build() {
                return new Issues(this);
            } 

        } 

    }
    public static class Reports extends TeaModel {
        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("FinishedTime")
        private String finishedTime;

        @NameInMap("Issues")
        private java.util.List < Issues> issues;

        @NameInMap("MetricSetId")
        private String metricSetId;

        @NameInMap("ReportId")
        private String reportId;

        @NameInMap("ResourceId")
        private String resourceId;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("Severity")
        private String severity;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Status")
        private String status;

        private Reports(Builder builder) {
            this.creationTime = builder.creationTime;
            this.endTime = builder.endTime;
            this.finishedTime = builder.finishedTime;
            this.issues = builder.issues;
            this.metricSetId = builder.metricSetId;
            this.reportId = builder.reportId;
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
            this.severity = builder.severity;
            this.startTime = builder.startTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Reports create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return finishedTime
         */
        public String getFinishedTime() {
            return this.finishedTime;
        }

        /**
         * @return issues
         */
        public java.util.List < Issues> getIssues() {
            return this.issues;
        }

        /**
         * @return metricSetId
         */
        public String getMetricSetId() {
            return this.metricSetId;
        }

        /**
         * @return reportId
         */
        public String getReportId() {
            return this.reportId;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return severity
         */
        public String getSeverity() {
            return this.severity;
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
            private String creationTime; 
            private String endTime; 
            private String finishedTime; 
            private java.util.List < Issues> issues; 
            private String metricSetId; 
            private String reportId; 
            private String resourceId; 
            private String resourceType; 
            private String severity; 
            private String startTime; 
            private String status; 

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * FinishedTime.
             */
            public Builder finishedTime(String finishedTime) {
                this.finishedTime = finishedTime;
                return this;
            }

            /**
             * Issues.
             */
            public Builder issues(java.util.List < Issues> issues) {
                this.issues = issues;
                return this;
            }

            /**
             * MetricSetId.
             */
            public Builder metricSetId(String metricSetId) {
                this.metricSetId = metricSetId;
                return this;
            }

            /**
             * ReportId.
             */
            public Builder reportId(String reportId) {
                this.reportId = reportId;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * Severity.
             */
            public Builder severity(String severity) {
                this.severity = severity;
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

            public Reports build() {
                return new Reports(this);
            } 

        } 

    }
}
