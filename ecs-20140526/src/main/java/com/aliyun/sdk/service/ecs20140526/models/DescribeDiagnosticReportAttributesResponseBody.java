// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link DescribeDiagnosticReportAttributesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDiagnosticReportAttributesResponseBody</p>
 */
public class DescribeDiagnosticReportAttributesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Attributes")
    private String attributes;

    @com.aliyun.core.annotation.NameInMap("CreationTime")
    private String creationTime;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("FinishedTime")
    private String finishedTime;

    @com.aliyun.core.annotation.NameInMap("MetricResults")
    private MetricResults metricResults;

    @com.aliyun.core.annotation.NameInMap("MetricSetId")
    private String metricSetId;

    @com.aliyun.core.annotation.NameInMap("ReportId")
    private String reportId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.NameInMap("Severity")
    private String severity;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("Status")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeDiagnosticReportAttributesResponseBody model) {
            this.attributes = model.attributes;
            this.creationTime = model.creationTime;
            this.endTime = model.endTime;
            this.finishedTime = model.finishedTime;
            this.metricResults = model.metricResults;
            this.metricSetId = model.metricSetId;
            this.reportId = model.reportId;
            this.requestId = model.requestId;
            this.resourceId = model.resourceId;
            this.resourceType = model.resourceType;
            this.severity = model.severity;
            this.startTime = model.startTime;
            this.status = model.status;
        } 

        /**
         * <p>The extended attributes of the diagnostic report.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;OfflineDiagReportStatus&quot;:&quot;CONFIRMED&quot;
         * }</p>
         */
        public Builder attributes(String attributes) {
            this.attributes = attributes;
            return this;
        }

        /**
         * <p>The time when the diagnostic report was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-11T12:00:00Z</p>
         */
        public Builder creationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        /**
         * <p>The end of the reporting period of the diagnostic report. The value is the EndTime value that was passed in when you called the <a href="https://help.aliyun.com/document_detail/442490.html">CreateDiagnosticReport</a> operation to create the diagnostic report.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-11T14:00:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The time when the diagnostic report was complete.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-11T14:00:00Z</p>
         */
        public Builder finishedTime(String finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }

        /**
         * <p>The results of all diagnostic metrics in the diagnostic metric set.</p>
         */
        public Builder metricResults(MetricResults metricResults) {
            this.metricResults = metricResults;
            return this;
        }

        /**
         * <p>The ID of the diagnostic metric set.</p>
         * 
         * <strong>example:</strong>
         * <p>dms-bp17p0qwtr72zmu*****</p>
         */
        public Builder metricSetId(String metricSetId) {
            this.metricSetId = metricSetId;
            return this;
        }

        /**
         * <p>The ID of the diagnostic report, which is the unique identifier of the report.</p>
         * 
         * <strong>example:</strong>
         * <p>dr-uf6i0tv2refv8wz*****</p>
         */
        public Builder reportId(String reportId) {
            this.reportId = reportId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-uf6i0tv2refv8wz*****</p>
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>The type of the resource. ResourceType can only be set to instance, which indicates that only instances are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>instance</p>
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The severity level of the diagnostic report. The value of this parameter is determined by the highest severity level of all diagnostic metrics. Valid values:</p>
         * <ul>
         * <li>Unknown: The diagnostic has not started, failed to run, or exited unexpectedly without a diagnosis.</li>
         * <li>Normal: No exceptions were detected.</li>
         * <li>Info: Diagnostic information was recorded and may be related to exceptions.</li>
         * <li>Warn: Diagnostic information was recorded and may indicate potential exceptions.</li>
         * <li>Critical: Critical exceptions were detected.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        public Builder severity(String severity) {
            this.severity = severity;
            return this;
        }

        /**
         * <p>The beginning of the reporting period of the diagnostic report. The value is the StartTime value that was passed in when you called the <a href="https://help.aliyun.com/document_detail/442490.html">CreateDiagnosticReport</a> operation to create the diagnostic report.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-11T12:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The state of the diagnostic report. Valid values:</p>
         * <ul>
         * <li>InProgress: The diagnostic is in progress.</li>
         * <li>Finished: The diagnostic is complete.</li>
         * <li>Failed: The diagnostic failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Finished</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DescribeDiagnosticReportAttributesResponseBody build() {
            return new DescribeDiagnosticReportAttributesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDiagnosticReportAttributesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDiagnosticReportAttributesResponseBody</p>
     */
    public static class Issue extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Additional")
        private String additional;

        @com.aliyun.core.annotation.NameInMap("IssueId")
        private String issueId;

        @com.aliyun.core.annotation.NameInMap("OccurrenceTime")
        private String occurrenceTime;

        @com.aliyun.core.annotation.NameInMap("Severity")
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

            private Builder() {
            } 

            private Builder(Issue model) {
                this.additional = model.additional;
                this.issueId = model.issueId;
                this.occurrenceTime = model.occurrenceTime;
                this.severity = model.severity;
            } 

            /**
             * <p>The additional data about the diagnosed issue. The value is a JSON string.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *   &quot;TotalPercent&quot;: 95,
             *   &quot;TopUtilizationProcesses&quot;: [
             *     {
             *       &quot;Pid&quot;: &quot;1223&quot;,
             *       &quot;CommandName&quot;: &quot;/usr/bin/mem.py&quot;,
             *       &quot;PhysicalMemoryPercent&quot;: 50
             *     }
             *   ]
             * }</p>
             */
            public Builder additional(String additional) {
                this.additional = additional;
                return this;
            }

            /**
             * <p>The ID of the diagnosed issue, which is the unique identifier of the issue.</p>
             * 
             * <strong>example:</strong>
             * <p>GuestOS.CPU.HighUtiliz*****</p>
             */
            public Builder issueId(String issueId) {
                this.issueId = issueId;
                return this;
            }

            /**
             * <p>The time when the diagnosed issue occurred.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-07-11T14:00:00Z</p>
             */
            public Builder occurrenceTime(String occurrenceTime) {
                this.occurrenceTime = occurrenceTime;
                return this;
            }

            /**
             * <p>The severity level of the diagnosed issue. Valid values:</p>
             * <ul>
             * <li>Info: Diagnostic information was recorded and may be related to exceptions.</li>
             * <li>Warn: Diagnostic information was recorded and may indicate potential exceptions.</li>
             * <li>Critical: Critical exceptions were detected.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Info</p>
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
    /**
     * 
     * {@link DescribeDiagnosticReportAttributesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDiagnosticReportAttributesResponseBody</p>
     */
    public static class Issues extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Issue")
        private java.util.List<Issue> issue;

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
        public java.util.List<Issue> getIssue() {
            return this.issue;
        }

        public static final class Builder {
            private java.util.List<Issue> issue; 

            private Builder() {
            } 

            private Builder(Issues model) {
                this.issue = model.issue;
            } 

            /**
             * Issue.
             */
            public Builder issue(java.util.List<Issue> issue) {
                this.issue = issue;
                return this;
            }

            public Issues build() {
                return new Issues(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDiagnosticReportAttributesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDiagnosticReportAttributesResponseBody</p>
     */
    public static class MetricResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Issues")
        private Issues issues;

        @com.aliyun.core.annotation.NameInMap("MetricCategory")
        private String metricCategory;

        @com.aliyun.core.annotation.NameInMap("MetricId")
        private String metricId;

        @com.aliyun.core.annotation.NameInMap("Severity")
        private String severity;

        @com.aliyun.core.annotation.NameInMap("Status")
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

            private Builder() {
            } 

            private Builder(MetricResult model) {
                this.issues = model.issues;
                this.metricCategory = model.metricCategory;
                this.metricId = model.metricId;
                this.severity = model.severity;
                this.status = model.status;
            } 

            /**
             * <p>The diagnosed issues.</p>
             */
            public Builder issues(Issues issues) {
                this.issues = issues;
                return this;
            }

            /**
             * <p>The category of the diagnostic metric.</p>
             * 
             * <strong>example:</strong>
             * <p>CPU</p>
             */
            public Builder metricCategory(String metricCategory) {
                this.metricCategory = metricCategory;
                return this;
            }

            /**
             * <p>The ID of the diagnostic metric.</p>
             * 
             * <strong>example:</strong>
             * <p>GuestOS.WinFirewall</p>
             */
            public Builder metricId(String metricId) {
                this.metricId = metricId;
                return this;
            }

            /**
             * <p>The severity level of the diagnostic metric. Valid values:</p>
             * <ul>
             * <li>Unknown: The diagnostic has not started, failed to run, or exited unexpectedly without a diagnosis.</li>
             * <li>Normal: No exceptions were detected.</li>
             * <li>Info: Diagnostic information was recorded and may be related to exceptions.</li>
             * <li>NotSupport: The version of the guest operating system does support diagnosing the metric.</li>
             * <li>Warn: Diagnostic information was recorded and may indicate potential exceptions.</li>
             * <li>Critical: Critical exceptions were detected.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * <p>The state of the diagnostic metric. Valid values:</p>
             * <ul>
             * <li>InProgress.</li>
             * <li>Finished.</li>
             * <li>Failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
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
    /**
     * 
     * {@link DescribeDiagnosticReportAttributesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDiagnosticReportAttributesResponseBody</p>
     */
    public static class MetricResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MetricResult")
        private java.util.List<MetricResult> metricResult;

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
        public java.util.List<MetricResult> getMetricResult() {
            return this.metricResult;
        }

        public static final class Builder {
            private java.util.List<MetricResult> metricResult; 

            private Builder() {
            } 

            private Builder(MetricResults model) {
                this.metricResult = model.metricResult;
            } 

            /**
             * MetricResult.
             */
            public Builder metricResult(java.util.List<MetricResult> metricResult) {
                this.metricResult = metricResult;
                return this;
            }

            public MetricResults build() {
                return new MetricResults(this);
            } 

        } 

    }
}
