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
    private Reports reports;

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
    public Reports getReports() {
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
        private Reports reports; 
        private String requestId; 

        /**
         * The query token returned in this call.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The list of reports.
         */
        public Builder reports(Reports reports) {
            this.reports = reports;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDiagnosticReportsResponseBody build() {
            return new DescribeDiagnosticReportsResponseBody(this);
        } 

    } 

    public static class Issue extends TeaModel {
        @NameInMap("IssueId")
        private String issueId;

        @NameInMap("MetricCategory")
        private String metricCategory;

        @NameInMap("MetricId")
        private String metricId;

        @NameInMap("Severity")
        private String severity;

        private Issue(Builder builder) {
            this.issueId = builder.issueId;
            this.metricCategory = builder.metricCategory;
            this.metricId = builder.metricId;
            this.severity = builder.severity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Issue create() {
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
             * The unique ID of the diagnosed issue.
             */
            public Builder issueId(String issueId) {
                this.issueId = issueId;
                return this;
            }

            /**
             * The category of the diagnostic metric.
             */
            public Builder metricCategory(String metricCategory) {
                this.metricCategory = metricCategory;
                return this;
            }

            /**
             * The ID of the diagnostic metric.
             */
            public Builder metricId(String metricId) {
                this.metricId = metricId;
                return this;
            }

            /**
             * The severity level of the diagnostic metric. Valid values:
             * <p>
             * 
             * *   Info: Diagnostic information was recorded and may be related to exceptions.
             * *   Warn: Diagnostic information was recorded and may indicate exceptions.
             * *   Critical: Critical exceptions were detected.
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            public Issue build() {
                return new Issue(this);
            } 

        } 

    }
    public static class Issues extends TeaModel {
        @NameInMap("Issue")
        private java.util.List < Issue> issue;

        private Issues(Builder builder) {
            this.issue = builder.issue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Issues create() {
            return builder().build();
        }

        /**
         * @return issue
         */
        public java.util.List < Issue> getIssue() {
            return this.issue;
        }

        public static final class Builder {
            private java.util.List < Issue> issue; 

            /**
             * Issue.
             */
            public Builder issue(java.util.List < Issue> issue) {
                this.issue = issue;
                return this;
            }

            public Issues build() {
                return new Issues(this);
            } 

        } 

    }
    public static class Report extends TeaModel {
        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("FinishedTime")
        private String finishedTime;

        @NameInMap("Issues")
        private Issues issues;

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

        private Report(Builder builder) {
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

        public static Report create() {
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
        public Issues getIssues() {
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
            private Issues issues; 
            private String metricSetId; 
            private String reportId; 
            private String resourceId; 
            private String resourceType; 
            private String severity; 
            private String startTime; 
            private String status; 

            /**
             * The time when the diagnostic report was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The end of the reporting period of the diagnostic report. The value is the EndTime value that was passed in when you called the [CreateDiagnosticReport](~~442490~~) operation to create the diagnostic report.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The time when the diagnostic was complete.
             */
            public Builder finishedTime(String finishedTime) {
                this.finishedTime = finishedTime;
                return this;
            }

            /**
             * The list of issues.
             */
            public Builder issues(Issues issues) {
                this.issues = issues;
                return this;
            }

            /**
             * The ID of the diagnostic metric set.
             */
            public Builder metricSetId(String metricSetId) {
                this.metricSetId = metricSetId;
                return this;
            }

            /**
             * The ID of the diagnostic report.
             */
            public Builder reportId(String reportId) {
                this.reportId = reportId;
                return this;
            }

            /**
             * The ID of the resource.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * The type of the resource.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * The severity level of the diagnostic report. Valid values:
             * <p>
             * 
             * *   Unknown: The diagnostic has not started, failed to run, or exited unexpectedly without a diagnosis.
             * *   Normal: No exceptions were detected.
             * *   Info: Diagnostic information was recorded and may be related to exceptions.
             * *   Warn: Diagnostic information was recorded and may indicate exceptions.
             * *   Critical: Critical exceptions were detected.
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * The beginning of the reporting period of the diagnostic report. The value is the StartTime value that was passed in when you called the [CreateDiagnosticReport](~~442490~~) operation to create the diagnostic report.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The state of the diagnostic report.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Report build() {
                return new Report(this);
            } 

        } 

    }
    public static class Reports extends TeaModel {
        @NameInMap("Report")
        private java.util.List < Report> report;

        private Reports(Builder builder) {
            this.report = builder.report;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Reports create() {
            return builder().build();
        }

        /**
         * @return report
         */
        public java.util.List < Report> getReport() {
            return this.report;
        }

        public static final class Builder {
            private java.util.List < Report> report; 

            /**
             * Report.
             */
            public Builder report(java.util.List < Report> report) {
                this.report = report;
                return this;
            }

            public Reports build() {
                return new Reports(this);
            } 

        } 

    }
}
