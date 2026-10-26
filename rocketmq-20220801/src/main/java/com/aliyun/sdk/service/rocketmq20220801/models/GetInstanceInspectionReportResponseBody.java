// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

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
 * {@link GetInstanceInspectionReportResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceInspectionReportResponseBody</p>
 */
public class GetInstanceInspectionReportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("completion")
    private String completion;

    @com.aliyun.core.annotation.NameInMap("coverage")
    private java.util.List<Coverage> coverage;

    @com.aliyun.core.annotation.NameInMap("findings")
    private java.util.List<Findings> findings;

    @com.aliyun.core.annotation.NameInMap("finishedAt")
    private String finishedAt;

    @com.aliyun.core.annotation.NameInMap("html")
    private String html;

    @com.aliyun.core.annotation.NameInMap("inspectionRunId")
    private String inspectionRunId;

    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("instanceName")
    private String instanceName;

    @com.aliyun.core.annotation.NameInMap("markdown")
    private String markdown;

    @com.aliyun.core.annotation.NameInMap("overview")
    private String overview;

    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("reportId")
    private String reportId;

    @com.aliyun.core.annotation.NameInMap("reportSummary")
    private ReportSummary reportSummary;

    @com.aliyun.core.annotation.NameInMap("templateVersion")
    private String templateVersion;

    @com.aliyun.core.annotation.NameInMap("timeRange")
    private TimeRange timeRange;

    private GetInstanceInspectionReportResponseBody(Builder builder) {
        this.completion = builder.completion;
        this.coverage = builder.coverage;
        this.findings = builder.findings;
        this.finishedAt = builder.finishedAt;
        this.html = builder.html;
        this.inspectionRunId = builder.inspectionRunId;
        this.instanceId = builder.instanceId;
        this.instanceName = builder.instanceName;
        this.markdown = builder.markdown;
        this.overview = builder.overview;
        this.regionId = builder.regionId;
        this.reportId = builder.reportId;
        this.reportSummary = builder.reportSummary;
        this.templateVersion = builder.templateVersion;
        this.timeRange = builder.timeRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceInspectionReportResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return completion
     */
    public String getCompletion() {
        return this.completion;
    }

    /**
     * @return coverage
     */
    public java.util.List<Coverage> getCoverage() {
        return this.coverage;
    }

    /**
     * @return findings
     */
    public java.util.List<Findings> getFindings() {
        return this.findings;
    }

    /**
     * @return finishedAt
     */
    public String getFinishedAt() {
        return this.finishedAt;
    }

    /**
     * @return html
     */
    public String getHtml() {
        return this.html;
    }

    /**
     * @return inspectionRunId
     */
    public String getInspectionRunId() {
        return this.inspectionRunId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return markdown
     */
    public String getMarkdown() {
        return this.markdown;
    }

    /**
     * @return overview
     */
    public String getOverview() {
        return this.overview;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return reportId
     */
    public String getReportId() {
        return this.reportId;
    }

    /**
     * @return reportSummary
     */
    public ReportSummary getReportSummary() {
        return this.reportSummary;
    }

    /**
     * @return templateVersion
     */
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    /**
     * @return timeRange
     */
    public TimeRange getTimeRange() {
        return this.timeRange;
    }

    public static final class Builder {
        private String completion; 
        private java.util.List<Coverage> coverage; 
        private java.util.List<Findings> findings; 
        private String finishedAt; 
        private String html; 
        private String inspectionRunId; 
        private String instanceId; 
        private String instanceName; 
        private String markdown; 
        private String overview; 
        private String regionId; 
        private String reportId; 
        private ReportSummary reportSummary; 
        private String templateVersion; 
        private TimeRange timeRange; 

        private Builder() {
        } 

        private Builder(GetInstanceInspectionReportResponseBody model) {
            this.completion = model.completion;
            this.coverage = model.coverage;
            this.findings = model.findings;
            this.finishedAt = model.finishedAt;
            this.html = model.html;
            this.inspectionRunId = model.inspectionRunId;
            this.instanceId = model.instanceId;
            this.instanceName = model.instanceName;
            this.markdown = model.markdown;
            this.overview = model.overview;
            this.regionId = model.regionId;
            this.reportId = model.reportId;
            this.reportSummary = model.reportSummary;
            this.templateVersion = model.templateVersion;
            this.timeRange = model.timeRange;
        } 

        /**
         * completion.
         */
        public Builder completion(String completion) {
            this.completion = completion;
            return this;
        }

        /**
         * coverage.
         */
        public Builder coverage(java.util.List<Coverage> coverage) {
            this.coverage = coverage;
            return this;
        }

        /**
         * findings.
         */
        public Builder findings(java.util.List<Findings> findings) {
            this.findings = findings;
            return this;
        }

        /**
         * finishedAt.
         */
        public Builder finishedAt(String finishedAt) {
            this.finishedAt = finishedAt;
            return this;
        }

        /**
         * html.
         */
        public Builder html(String html) {
            this.html = html;
            return this;
        }

        /**
         * inspectionRunId.
         */
        public Builder inspectionRunId(String inspectionRunId) {
            this.inspectionRunId = inspectionRunId;
            return this;
        }

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * instanceName.
         */
        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }

        /**
         * markdown.
         */
        public Builder markdown(String markdown) {
            this.markdown = markdown;
            return this;
        }

        /**
         * overview.
         */
        public Builder overview(String overview) {
            this.overview = overview;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
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
         * reportSummary.
         */
        public Builder reportSummary(ReportSummary reportSummary) {
            this.reportSummary = reportSummary;
            return this;
        }

        /**
         * templateVersion.
         */
        public Builder templateVersion(String templateVersion) {
            this.templateVersion = templateVersion;
            return this;
        }

        /**
         * timeRange.
         */
        public Builder timeRange(TimeRange timeRange) {
            this.timeRange = timeRange;
            return this;
        }

        public GetInstanceInspectionReportResponseBody build() {
            return new GetInstanceInspectionReportResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetInstanceInspectionReportResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceInspectionReportResponseBody</p>
     */
    public static class CoverageTimeRange extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("endTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private String startTime;

        private CoverageTimeRange(Builder builder) {
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CoverageTimeRange create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String endTime; 
            private String startTime; 

            private Builder() {
            } 

            private Builder(CoverageTimeRange model) {
                this.endTime = model.endTime;
                this.startTime = model.startTime;
            } 

            /**
             * endTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * startTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public CoverageTimeRange build() {
                return new CoverageTimeRange(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceInspectionReportResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceInspectionReportResponseBody</p>
     */
    public static class Coverage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("diagnosisStatus")
        private String diagnosisStatus;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("observedAt")
        private String observedAt;

        @com.aliyun.core.annotation.NameInMap("result")
        private String result;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("templateCode")
        private String templateCode;

        @com.aliyun.core.annotation.NameInMap("timeRange")
        private CoverageTimeRange timeRange;

        private Coverage(Builder builder) {
            this.diagnosisStatus = builder.diagnosisStatus;
            this.name = builder.name;
            this.observedAt = builder.observedAt;
            this.result = builder.result;
            this.status = builder.status;
            this.templateCode = builder.templateCode;
            this.timeRange = builder.timeRange;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Coverage create() {
            return builder().build();
        }

        /**
         * @return diagnosisStatus
         */
        public String getDiagnosisStatus() {
            return this.diagnosisStatus;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return observedAt
         */
        public String getObservedAt() {
            return this.observedAt;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return templateCode
         */
        public String getTemplateCode() {
            return this.templateCode;
        }

        /**
         * @return timeRange
         */
        public CoverageTimeRange getTimeRange() {
            return this.timeRange;
        }

        public static final class Builder {
            private String diagnosisStatus; 
            private String name; 
            private String observedAt; 
            private String result; 
            private String status; 
            private String templateCode; 
            private CoverageTimeRange timeRange; 

            private Builder() {
            } 

            private Builder(Coverage model) {
                this.diagnosisStatus = model.diagnosisStatus;
                this.name = model.name;
                this.observedAt = model.observedAt;
                this.result = model.result;
                this.status = model.status;
                this.templateCode = model.templateCode;
                this.timeRange = model.timeRange;
            } 

            /**
             * diagnosisStatus.
             */
            public Builder diagnosisStatus(String diagnosisStatus) {
                this.diagnosisStatus = diagnosisStatus;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * observedAt.
             */
            public Builder observedAt(String observedAt) {
                this.observedAt = observedAt;
                return this;
            }

            /**
             * result.
             */
            public Builder result(String result) {
                this.result = result;
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
             * templateCode.
             */
            public Builder templateCode(String templateCode) {
                this.templateCode = templateCode;
                return this;
            }

            /**
             * timeRange.
             */
            public Builder timeRange(CoverageTimeRange timeRange) {
                this.timeRange = timeRange;
                return this;
            }

            public Coverage build() {
                return new Coverage(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceInspectionReportResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceInspectionReportResponseBody</p>
     */
    public static class Resource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Resource(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resource create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String id; 
            private String name; 
            private String type; 

            private Builder() {
            } 

            private Builder(Resource model) {
                this.id = model.id;
                this.name = model.name;
                this.type = model.type;
            } 

            /**
             * id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Resource build() {
                return new Resource(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceInspectionReportResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceInspectionReportResponseBody</p>
     */
    public static class FindingsTimeRange extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("endTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private String startTime;

        private FindingsTimeRange(Builder builder) {
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FindingsTimeRange create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String endTime; 
            private String startTime; 

            private Builder() {
            } 

            private Builder(FindingsTimeRange model) {
                this.endTime = model.endTime;
                this.startTime = model.startTime;
            } 

            /**
             * endTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * startTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public FindingsTimeRange build() {
                return new FindingsTimeRange(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceInspectionReportResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceInspectionReportResponseBody</p>
     */
    public static class Findings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("alternatives")
        private java.util.List<String> alternatives;

        @com.aliyun.core.annotation.NameInMap("boundary")
        private String boundary;

        @com.aliyun.core.annotation.NameInMap("cause")
        private String cause;

        @com.aliyun.core.annotation.NameInMap("confidence")
        private String confidence;

        @com.aliyun.core.annotation.NameInMap("evidence")
        private java.util.List<String> evidence;

        @com.aliyun.core.annotation.NameInMap("impact")
        private String impact;

        @com.aliyun.core.annotation.NameInMap("location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("missingEvidence")
        private java.util.List<String> missingEvidence;

        @com.aliyun.core.annotation.NameInMap("observations")
        private java.util.List<String> observations;

        @com.aliyun.core.annotation.NameInMap("observedAt")
        private String observedAt;

        @com.aliyun.core.annotation.NameInMap("recommendations")
        private java.util.List<String> recommendations;

        @com.aliyun.core.annotation.NameInMap("resource")
        private Resource resource;

        @com.aliyun.core.annotation.NameInMap("riskType")
        private String riskType;

        @com.aliyun.core.annotation.NameInMap("source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("templateCode")
        private String templateCode;

        @com.aliyun.core.annotation.NameInMap("timeRange")
        private FindingsTimeRange timeRange;

        @com.aliyun.core.annotation.NameInMap("verification")
        private java.util.List<String> verification;

        private Findings(Builder builder) {
            this.alternatives = builder.alternatives;
            this.boundary = builder.boundary;
            this.cause = builder.cause;
            this.confidence = builder.confidence;
            this.evidence = builder.evidence;
            this.impact = builder.impact;
            this.location = builder.location;
            this.missingEvidence = builder.missingEvidence;
            this.observations = builder.observations;
            this.observedAt = builder.observedAt;
            this.recommendations = builder.recommendations;
            this.resource = builder.resource;
            this.riskType = builder.riskType;
            this.source = builder.source;
            this.templateCode = builder.templateCode;
            this.timeRange = builder.timeRange;
            this.verification = builder.verification;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Findings create() {
            return builder().build();
        }

        /**
         * @return alternatives
         */
        public java.util.List<String> getAlternatives() {
            return this.alternatives;
        }

        /**
         * @return boundary
         */
        public String getBoundary() {
            return this.boundary;
        }

        /**
         * @return cause
         */
        public String getCause() {
            return this.cause;
        }

        /**
         * @return confidence
         */
        public String getConfidence() {
            return this.confidence;
        }

        /**
         * @return evidence
         */
        public java.util.List<String> getEvidence() {
            return this.evidence;
        }

        /**
         * @return impact
         */
        public String getImpact() {
            return this.impact;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return missingEvidence
         */
        public java.util.List<String> getMissingEvidence() {
            return this.missingEvidence;
        }

        /**
         * @return observations
         */
        public java.util.List<String> getObservations() {
            return this.observations;
        }

        /**
         * @return observedAt
         */
        public String getObservedAt() {
            return this.observedAt;
        }

        /**
         * @return recommendations
         */
        public java.util.List<String> getRecommendations() {
            return this.recommendations;
        }

        /**
         * @return resource
         */
        public Resource getResource() {
            return this.resource;
        }

        /**
         * @return riskType
         */
        public String getRiskType() {
            return this.riskType;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return templateCode
         */
        public String getTemplateCode() {
            return this.templateCode;
        }

        /**
         * @return timeRange
         */
        public FindingsTimeRange getTimeRange() {
            return this.timeRange;
        }

        /**
         * @return verification
         */
        public java.util.List<String> getVerification() {
            return this.verification;
        }

        public static final class Builder {
            private java.util.List<String> alternatives; 
            private String boundary; 
            private String cause; 
            private String confidence; 
            private java.util.List<String> evidence; 
            private String impact; 
            private String location; 
            private java.util.List<String> missingEvidence; 
            private java.util.List<String> observations; 
            private String observedAt; 
            private java.util.List<String> recommendations; 
            private Resource resource; 
            private String riskType; 
            private String source; 
            private String templateCode; 
            private FindingsTimeRange timeRange; 
            private java.util.List<String> verification; 

            private Builder() {
            } 

            private Builder(Findings model) {
                this.alternatives = model.alternatives;
                this.boundary = model.boundary;
                this.cause = model.cause;
                this.confidence = model.confidence;
                this.evidence = model.evidence;
                this.impact = model.impact;
                this.location = model.location;
                this.missingEvidence = model.missingEvidence;
                this.observations = model.observations;
                this.observedAt = model.observedAt;
                this.recommendations = model.recommendations;
                this.resource = model.resource;
                this.riskType = model.riskType;
                this.source = model.source;
                this.templateCode = model.templateCode;
                this.timeRange = model.timeRange;
                this.verification = model.verification;
            } 

            /**
             * alternatives.
             */
            public Builder alternatives(java.util.List<String> alternatives) {
                this.alternatives = alternatives;
                return this;
            }

            /**
             * boundary.
             */
            public Builder boundary(String boundary) {
                this.boundary = boundary;
                return this;
            }

            /**
             * cause.
             */
            public Builder cause(String cause) {
                this.cause = cause;
                return this;
            }

            /**
             * confidence.
             */
            public Builder confidence(String confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * evidence.
             */
            public Builder evidence(java.util.List<String> evidence) {
                this.evidence = evidence;
                return this;
            }

            /**
             * impact.
             */
            public Builder impact(String impact) {
                this.impact = impact;
                return this;
            }

            /**
             * location.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * missingEvidence.
             */
            public Builder missingEvidence(java.util.List<String> missingEvidence) {
                this.missingEvidence = missingEvidence;
                return this;
            }

            /**
             * observations.
             */
            public Builder observations(java.util.List<String> observations) {
                this.observations = observations;
                return this;
            }

            /**
             * observedAt.
             */
            public Builder observedAt(String observedAt) {
                this.observedAt = observedAt;
                return this;
            }

            /**
             * recommendations.
             */
            public Builder recommendations(java.util.List<String> recommendations) {
                this.recommendations = recommendations;
                return this;
            }

            /**
             * resource.
             */
            public Builder resource(Resource resource) {
                this.resource = resource;
                return this;
            }

            /**
             * riskType.
             */
            public Builder riskType(String riskType) {
                this.riskType = riskType;
                return this;
            }

            /**
             * source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * templateCode.
             */
            public Builder templateCode(String templateCode) {
                this.templateCode = templateCode;
                return this;
            }

            /**
             * timeRange.
             */
            public Builder timeRange(FindingsTimeRange timeRange) {
                this.timeRange = timeRange;
                return this;
            }

            /**
             * verification.
             */
            public Builder verification(java.util.List<String> verification) {
                this.verification = verification;
                return this;
            }

            public Findings build() {
                return new Findings(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceInspectionReportResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceInspectionReportResponseBody</p>
     */
    public static class ReportSummary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("infoCount")
        private Integer infoCount;

        @com.aliyun.core.annotation.NameInMap("riskCount")
        private Integer riskCount;

        private ReportSummary(Builder builder) {
            this.infoCount = builder.infoCount;
            this.riskCount = builder.riskCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReportSummary create() {
            return builder().build();
        }

        /**
         * @return infoCount
         */
        public Integer getInfoCount() {
            return this.infoCount;
        }

        /**
         * @return riskCount
         */
        public Integer getRiskCount() {
            return this.riskCount;
        }

        public static final class Builder {
            private Integer infoCount; 
            private Integer riskCount; 

            private Builder() {
            } 

            private Builder(ReportSummary model) {
                this.infoCount = model.infoCount;
                this.riskCount = model.riskCount;
            } 

            /**
             * infoCount.
             */
            public Builder infoCount(Integer infoCount) {
                this.infoCount = infoCount;
                return this;
            }

            /**
             * riskCount.
             */
            public Builder riskCount(Integer riskCount) {
                this.riskCount = riskCount;
                return this;
            }

            public ReportSummary build() {
                return new ReportSummary(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetInstanceInspectionReportResponseBody} extends {@link TeaModel}
     *
     * <p>GetInstanceInspectionReportResponseBody</p>
     */
    public static class TimeRange extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("endTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private String startTime;

        private TimeRange(Builder builder) {
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimeRange create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String endTime; 
            private String startTime; 

            private Builder() {
            } 

            private Builder(TimeRange model) {
                this.endTime = model.endTime;
                this.startTime = model.startTime;
            } 

            /**
             * endTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * startTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public TimeRange build() {
                return new TimeRange(this);
            } 

        } 

    }
}
