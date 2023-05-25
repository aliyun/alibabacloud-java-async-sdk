// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiagnosticReportAttributesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDiagnosticReportAttributesResponseBody</p>
 */
public class DescribeDiagnosticReportAttributesResponseBody extends TeaModel {
    @NameInMap("Attributes")
    private String attributes;

    @NameInMap("CreationTime")
    private String creationTime;

    @NameInMap("EndTime")
    private String endTime;

    @NameInMap("FinishedTime")
    private String finishedTime;

    @NameInMap("MetricResults")
    private MetricResults metricResults;

    @NameInMap("MetricSetId")
    private String metricSetId;

    @NameInMap("ReportId")
    private String reportId;

    @NameInMap("RequestId")
    private String requestId;

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

    private DescribeDiagnosticReportAttributesResponseBody(Builder builder) {
        this.attributes = builder.attributes;
        this.creationTime = builder.creationTime;
        this.endTime = builder.endTime;
        this.finishedTime = builder.finishedTime;
        this.metricResults = builder.metricResults;
        this.metricSetId = builder.metricSetId;
        this.reportId = builder.reportId;
        this.requestId = builder.requestId;
        this.resourceId = builder.resourceId;
        this.resourceType = builder.resourceType;
        this.severity = builder.severity;
        this.startTime = builder.startTime;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiagnosticReportAttributesResponseBody create() {
        return builder().build();
    }

    /**
     * @return attributes
     */
    public String getAttributes() {
        return this.attributes;
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
     * @return metricResults
     */
    public MetricResults getMetricResults() {
        return this.metricResults;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private String attributes; 
        private String creationTime; 
        private String endTime; 
        private String finishedTime; 
        private MetricResults metricResults; 
        private String metricSetId; 
        private String reportId; 
        private String requestId; 
        private String resourceId; 
        private String resourceType; 
        private String severity; 
        private String startTime; 
        private String status; 

        /**
         * The extended attributes of the diagnostic report.
         */
        public Builder attributes(String attributes) {
            this.attributes = attributes;
            return this;
        }

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
         * The time when the diagnostic report was complete.
         */
        public Builder finishedTime(String finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }

        /**
         * The results of all diagnostic metrics in the diagnostic metric set.
         */
        public Builder metricResults(MetricResults metricResults) {
            this.metricResults = metricResults;
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
         * The ID of the diagnostic report, which is the unique identifier of the report.
         */
        public Builder reportId(String reportId) {
            this.reportId = reportId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
         * The resource type. The value of ResourceType can only be instance, which indicates that only instances are supported.
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * The severity level of the diagnostic report. The value of this parameter is determined by the metric with the highest severity level among all diagnostic metrics. Valid values:
         * <p>
         * 
         * *   Unknown: The diagnostic has not started, failed to run, or exited unexpectedly without a diagnosis.
         * *   Normal: No exceptions were detected.
         * *   Info: Diagnostic information was recorded and may be related to exceptions.
         * *   Warn: Diagnostic information was recorded and may indicate potential exceptions.
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
         * The state of the diagnostic report. Valid values:
         * <p>
         * 
         * *   InProgress: The diagnostic is in progress.
         * *   Finished: The diagnostic is complete.
         * *   Failed: The diagnostic failed.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DescribeDiagnosticReportAttributesResponseBody build() {
            return new DescribeDiagnosticReportAttributesResponseBody(this);
        } 

    } 

    public static class Issue extends TeaModel {
        @NameInMap("Additional")
        private String additional;

        @NameInMap("IssueId")
        private String issueId;

        @NameInMap("OccurrenceTime")
        private String occurrenceTime;

        @NameInMap("Severity")
        private String severity;

        private Issue(Builder builder) {
            this.additional = builder.additional;
            this.issueId = builder.issueId;
            this.occurrenceTime = builder.occurrenceTime;
            this.severity = builder.severity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Issue create() {
            return builder().build();
        }

        /**
         * @return additional
         */
        public String getAdditional() {
            return this.additional;
        }

        /**
         * @return issueId
         */
        public String getIssueId() {
            return this.issueId;
        }

        /**
         * @return occurrenceTime
         */
        public String getOccurrenceTime() {
            return this.occurrenceTime;
        }

        /**
         * @return severity
         */
        public String getSeverity() {
            return this.severity;
        }

        public static final class Builder {
            private String additional; 
            private String issueId; 
            private String occurrenceTime; 
            private String severity; 

            /**
             * The additional data about the diagnosed issue. The value is a JSON string.
             */
            public Builder additional(String additional) {
                this.additional = additional;
                return this;
            }

            /**
             * The ID of the diagnosed issue, which is the unique identifier of the issue.
             */
            public Builder issueId(String issueId) {
                this.issueId = issueId;
                return this;
            }

            /**
             * The time when the diagnosed issue occurred.
             */
            public Builder occurrenceTime(String occurrenceTime) {
                this.occurrenceTime = occurrenceTime;
                return this;
            }

            /**
             * The severity level of the diagnosed issue. Valid values:
             * <p>
             * 
             * *   Info: Diagnostic information was recorded and may be related to exceptions.
             * *   Warn: Diagnostic information was recorded and may indicate potential exceptions.
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
    public static class MetricResult extends TeaModel {
        @NameInMap("Issues")
        private Issues issues;

        @NameInMap("MetricCategory")
        private String metricCategory;

        @NameInMap("MetricId")
        private String metricId;

        @NameInMap("Severity")
        private String severity;

        @NameInMap("Status")
        private String status;

        private MetricResult(Builder builder) {
            this.issues = builder.issues;
            this.metricCategory = builder.metricCategory;
            this.metricId = builder.metricId;
            this.severity = builder.severity;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MetricResult create() {
            return builder().build();
        }

        /**
         * @return issues
         */
        public Issues getIssues() {
            return this.issues;
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

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Issues issues; 
            private String metricCategory; 
            private String metricId; 
            private String severity; 
            private String status; 

            /**
             * An array that consists of the details about the diagnosed issues.
             */
            public Builder issues(Issues issues) {
                this.issues = issues;
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
             * *   Unknown: The diagnostic has not started, failed to run, or exited unexpectedly without a diagnosis.
             * *   Normal: No exceptions were detected.
             * *   Info: Diagnostic information was recorded and may be related to exceptions.
             * *   NotSupport: The version of the guest operating system does support diagnosing the metric.
             * *   Warn: Diagnostic information was recorded and may indicate potential exceptions.
             * *   Critical: Critical exceptions were detected.
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * The state of the diagnostic metric. Valid values:
             * <p>
             * 
             * *   InProgress: The diagnostic is in progress.
             * *   Finished: The diagnostic is complete.
             * *   Failed: The diagnostic failed.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public MetricResult build() {
                return new MetricResult(this);
            } 

        } 

    }
    public static class MetricResults extends TeaModel {
        @NameInMap("MetricResult")
        private java.util.List < MetricResult> metricResult;

        private MetricResults(Builder builder) {
            this.metricResult = builder.metricResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MetricResults create() {
            return builder().build();
        }

        /**
         * @return metricResult
         */
        public java.util.List < MetricResult> getMetricResult() {
            return this.metricResult;
        }

        public static final class Builder {
            private java.util.List < MetricResult> metricResult; 

            /**
             * MetricResult.
             */
            public Builder metricResult(java.util.List < MetricResult> metricResult) {
                this.metricResult = metricResult;
                return this;
            }

            public MetricResults build() {
                return new MetricResults(this);
            } 

        } 

    }
}
