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
 * {@link DescribeDiagnosticReportsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDiagnosticReportsResponseBody</p>
 */
public class DescribeDiagnosticReportsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("Reports")
    private Reports reports;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

        private Builder() {
        } 

        private Builder(DescribeDiagnosticReportsResponseBody model) {
            this.nextToken = model.nextToken;
            this.reports = model.reports;
            this.requestId = model.requestId;
        } 

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The diagnostic reports.</p>
         */
        public Builder reports(Reports reports) {
            this.reports = reports;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE*****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDiagnosticReportsResponseBody build() {
            return new DescribeDiagnosticReportsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDiagnosticReportsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDiagnosticReportsResponseBody</p>
     */
    public static class Issue extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IssueId")
        private String issueId;

        @com.aliyun.core.annotation.NameInMap("MetricCategory")
        private String metricCategory;

        @com.aliyun.core.annotation.NameInMap("MetricId")
        private String metricId;

        @com.aliyun.core.annotation.NameInMap("Severity")
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

            private Builder() {
            } 

            private Builder(Issue model) {
                this.issueId = model.issueId;
                this.metricCategory = model.metricCategory;
                this.metricId = model.metricId;
                this.severity = model.severity;
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
             * <p>The category of the diagnostic metric.</p>
             * 
             * <strong>example:</strong>
             * <p>ECSService.GuestOS</p>
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
             * <li>Info: Diagnostic information was recorded and may be related to exceptions.</li>
             * <li>Warn: Diagnostic information was recorded and may indicate exceptions.</li>
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
     * {@link DescribeDiagnosticReportsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDiagnosticReportsResponseBody</p>
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
     * {@link DescribeDiagnosticReportsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDiagnosticReportsResponseBody</p>
     */
    public static class Report extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("FinishedTime")
        private String finishedTime;

        @com.aliyun.core.annotation.NameInMap("Issues")
        private Issues issues;

        @com.aliyun.core.annotation.NameInMap("MetricSetId")
        private String metricSetId;

        @com.aliyun.core.annotation.NameInMap("ReportId")
        private String reportId;

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

            private Builder() {
            } 

            private Builder(Report model) {
                this.creationTime = model.creationTime;
                this.endTime = model.endTime;
                this.finishedTime = model.finishedTime;
                this.issues = model.issues;
                this.metricSetId = model.metricSetId;
                this.reportId = model.reportId;
                this.resourceId = model.resourceId;
                this.resourceType = model.resourceType;
                this.severity = model.severity;
                this.startTime = model.startTime;
                this.status = model.status;
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
             * <p>The end of the time range during which data was queried. The value is the EndTime value that was passed in when you called the <a href="https://help.aliyun.com/document_detail/442490.html">CreateDiagnosticReport</a> operation to create the diagnostic report.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-07-11T14:00:00Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The time when the diagnostic was complete.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-07-11T14:00:00Z</p>
             */
            public Builder finishedTime(String finishedTime) {
                this.finishedTime = finishedTime;
                return this;
            }

            /**
             * <p>The diagnosed issues.</p>
             */
            public Builder issues(Issues issues) {
                this.issues = issues;
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
             * <p>The ID of the diagnostic report.</p>
             * 
             * <strong>example:</strong>
             * <p>dr-uf6i0tv2refv8wz*****</p>
             */
            public Builder reportId(String reportId) {
                this.reportId = reportId;
                return this;
            }

            /**
             * <p>The ID of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>i-uf6i0tv2refv8wz*****</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The type of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>instance</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The severity level of the diagnostic report. Valid values:</p>
             * <ul>
             * <li>Unknown: The diagnostic did not start, failed to run, or unexpectedly exited without a diagnosis.</li>
             * <li>Normal: No exceptions were detected.</li>
             * <li>Info: Diagnostic information was recorded and may be related to exceptions.</li>
             * <li>Warn: Diagnostic information was recorded and may indicate exceptions.</li>
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
             * <p>The beginning of the time range during which data was queried. The value is the StartTime value that was passed in when you called the <a href="https://help.aliyun.com/document_detail/442490.html">CreateDiagnosticReport</a> operation to create the diagnostic report.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-07-11T12:00:00Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The status of the diagnostic report.</p>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
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
    /**
     * 
     * {@link DescribeDiagnosticReportsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDiagnosticReportsResponseBody</p>
     */
    public static class Reports extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Report")
        private java.util.List<Report> report;

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
        public java.util.List<Report> getReport() {
            return this.report;
        }

        public static final class Builder {
            private java.util.List<Report> report; 

            private Builder() {
            } 

            private Builder(Reports model) {
                this.report = model.report;
            } 

            /**
             * Report.
             */
            public Builder report(java.util.List<Report> report) {
                this.report = report;
                return this;
            }

            public Reports build() {
                return new Reports(this);
            } 

        } 

    }
}
