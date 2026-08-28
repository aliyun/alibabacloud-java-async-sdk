// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

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
 * {@link GetPatrolReportDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetPatrolReportDetailResponseBody</p>
 */
public class GetPatrolReportDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("httpCode")
    private Integer httpCode;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GetPatrolReportDetailResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.httpCode = builder.httpCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPatrolReportDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return httpCode
     */
    public Integer getHttpCode() {
        return this.httpCode;
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

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private Integer httpCode; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetPatrolReportDetailResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.httpCode = model.httpCode;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * httpCode.
         */
        public Builder httpCode(Integer httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetPatrolReportDetailResponseBody build() {
            return new GetPatrolReportDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPatrolReportDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetPatrolReportDetailResponseBody</p>
     */
    public static class ProblemSummary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("delayAndBackpressure")
        private Integer delayAndBackpressure;

        @com.aliyun.core.annotation.NameInMap("unhealthy")
        private Integer unhealthy;

        @com.aliyun.core.annotation.NameInMap("unhealthyCheckpoints")
        private Integer unhealthyCheckpoints;

        private ProblemSummary(Builder builder) {
            this.delayAndBackpressure = builder.delayAndBackpressure;
            this.unhealthy = builder.unhealthy;
            this.unhealthyCheckpoints = builder.unhealthyCheckpoints;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProblemSummary create() {
            return builder().build();
        }

        /**
         * @return delayAndBackpressure
         */
        public Integer getDelayAndBackpressure() {
            return this.delayAndBackpressure;
        }

        /**
         * @return unhealthy
         */
        public Integer getUnhealthy() {
            return this.unhealthy;
        }

        /**
         * @return unhealthyCheckpoints
         */
        public Integer getUnhealthyCheckpoints() {
            return this.unhealthyCheckpoints;
        }

        public static final class Builder {
            private Integer delayAndBackpressure; 
            private Integer unhealthy; 
            private Integer unhealthyCheckpoints; 

            private Builder() {
            } 

            private Builder(ProblemSummary model) {
                this.delayAndBackpressure = model.delayAndBackpressure;
                this.unhealthy = model.unhealthy;
                this.unhealthyCheckpoints = model.unhealthyCheckpoints;
            } 

            /**
             * delayAndBackpressure.
             */
            public Builder delayAndBackpressure(Integer delayAndBackpressure) {
                this.delayAndBackpressure = delayAndBackpressure;
                return this;
            }

            /**
             * unhealthy.
             */
            public Builder unhealthy(Integer unhealthy) {
                this.unhealthy = unhealthy;
                return this;
            }

            /**
             * unhealthyCheckpoints.
             */
            public Builder unhealthyCheckpoints(Integer unhealthyCheckpoints) {
                this.unhealthyCheckpoints = unhealthyCheckpoints;
                return this;
            }

            public ProblemSummary build() {
                return new ProblemSummary(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPatrolReportDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetPatrolReportDetailResponseBody</p>
     */
    public static class RiskSummary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("critical")
        private Integer critical;

        @com.aliyun.core.annotation.NameInMap("info")
        private Integer info;

        @com.aliyun.core.annotation.NameInMap("warning")
        private Integer warning;

        private RiskSummary(Builder builder) {
            this.critical = builder.critical;
            this.info = builder.info;
            this.warning = builder.warning;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RiskSummary create() {
            return builder().build();
        }

        /**
         * @return critical
         */
        public Integer getCritical() {
            return this.critical;
        }

        /**
         * @return info
         */
        public Integer getInfo() {
            return this.info;
        }

        /**
         * @return warning
         */
        public Integer getWarning() {
            return this.warning;
        }

        public static final class Builder {
            private Integer critical; 
            private Integer info; 
            private Integer warning; 

            private Builder() {
            } 

            private Builder(RiskSummary model) {
                this.critical = model.critical;
                this.info = model.info;
                this.warning = model.warning;
            } 

            /**
             * critical.
             */
            public Builder critical(Integer critical) {
                this.critical = critical;
                return this;
            }

            /**
             * info.
             */
            public Builder info(Integer info) {
                this.info = info;
                return this;
            }

            /**
             * warning.
             */
            public Builder warning(Integer warning) {
                this.warning = warning;
                return this;
            }

            public RiskSummary build() {
                return new RiskSummary(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPatrolReportDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetPatrolReportDetailResponseBody</p>
     */
    public static class Overview extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("problemSummary")
        private ProblemSummary problemSummary;

        @com.aliyun.core.annotation.NameInMap("riskSummary")
        private RiskSummary riskSummary;

        @com.aliyun.core.annotation.NameInMap("total")
        private Integer total;

        private Overview(Builder builder) {
            this.problemSummary = builder.problemSummary;
            this.riskSummary = builder.riskSummary;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Overview create() {
            return builder().build();
        }

        /**
         * @return problemSummary
         */
        public ProblemSummary getProblemSummary() {
            return this.problemSummary;
        }

        /**
         * @return riskSummary
         */
        public RiskSummary getRiskSummary() {
            return this.riskSummary;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private ProblemSummary problemSummary; 
            private RiskSummary riskSummary; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(Overview model) {
                this.problemSummary = model.problemSummary;
                this.riskSummary = model.riskSummary;
                this.total = model.total;
            } 

            /**
             * problemSummary.
             */
            public Builder problemSummary(ProblemSummary problemSummary) {
                this.problemSummary = problemSummary;
                return this;
            }

            /**
             * riskSummary.
             */
            public Builder riskSummary(RiskSummary riskSummary) {
                this.riskSummary = riskSummary;
                return this;
            }

            /**
             * total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Overview build() {
                return new Overview(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPatrolReportDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetPatrolReportDetailResponseBody</p>
     */
    public static class ScopeConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("deploymentIds")
        private java.util.List<String> deploymentIds;

        @com.aliyun.core.annotation.NameInMap("tags")
        private java.util.Map<String, java.util.List<String>> tags;

        private ScopeConfig(Builder builder) {
            this.deploymentIds = builder.deploymentIds;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScopeConfig create() {
            return builder().build();
        }

        /**
         * @return deploymentIds
         */
        public java.util.List<String> getDeploymentIds() {
            return this.deploymentIds;
        }

        /**
         * @return tags
         */
        public java.util.Map<String, java.util.List<String>> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private java.util.List<String> deploymentIds; 
            private java.util.Map<String, java.util.List<String>> tags; 

            private Builder() {
            } 

            private Builder(ScopeConfig model) {
                this.deploymentIds = model.deploymentIds;
                this.tags = model.tags;
            } 

            /**
             * deploymentIds.
             */
            public Builder deploymentIds(java.util.List<String> deploymentIds) {
                this.deploymentIds = deploymentIds;
                return this;
            }

            /**
             * tags.
             */
            public Builder tags(java.util.Map<String, java.util.List<String>> tags) {
                this.tags = tags;
                return this;
            }

            public ScopeConfig build() {
                return new ScopeConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPatrolReportDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetPatrolReportDetailResponseBody</p>
     */
    public static class UnhealthyJobs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("analysis")
        private String analysis;

        @com.aliyun.core.annotation.NameInMap("deploymentId")
        private String deploymentId;

        @com.aliyun.core.annotation.NameInMap("deploymentName")
        private String deploymentName;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("jobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("recommendation")
        private String recommendation;

        @com.aliyun.core.annotation.NameInMap("riskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("tags")
        private java.util.List<String> tags;

        private UnhealthyJobs(Builder builder) {
            this.analysis = builder.analysis;
            this.deploymentId = builder.deploymentId;
            this.deploymentName = builder.deploymentName;
            this.description = builder.description;
            this.jobId = builder.jobId;
            this.recommendation = builder.recommendation;
            this.riskLevel = builder.riskLevel;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UnhealthyJobs create() {
            return builder().build();
        }

        /**
         * @return analysis
         */
        public String getAnalysis() {
            return this.analysis;
        }

        /**
         * @return deploymentId
         */
        public String getDeploymentId() {
            return this.deploymentId;
        }

        /**
         * @return deploymentName
         */
        public String getDeploymentName() {
            return this.deploymentName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return recommendation
         */
        public String getRecommendation() {
            return this.recommendation;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return tags
         */
        public java.util.List<String> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String analysis; 
            private String deploymentId; 
            private String deploymentName; 
            private String description; 
            private String jobId; 
            private String recommendation; 
            private String riskLevel; 
            private java.util.List<String> tags; 

            private Builder() {
            } 

            private Builder(UnhealthyJobs model) {
                this.analysis = model.analysis;
                this.deploymentId = model.deploymentId;
                this.deploymentName = model.deploymentName;
                this.description = model.description;
                this.jobId = model.jobId;
                this.recommendation = model.recommendation;
                this.riskLevel = model.riskLevel;
                this.tags = model.tags;
            } 

            /**
             * analysis.
             */
            public Builder analysis(String analysis) {
                this.analysis = analysis;
                return this;
            }

            /**
             * deploymentId.
             */
            public Builder deploymentId(String deploymentId) {
                this.deploymentId = deploymentId;
                return this;
            }

            /**
             * deploymentName.
             */
            public Builder deploymentName(String deploymentName) {
                this.deploymentName = deploymentName;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * jobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * recommendation.
             */
            public Builder recommendation(String recommendation) {
                this.recommendation = recommendation;
                return this;
            }

            /**
             * riskLevel.
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * tags.
             */
            public Builder tags(java.util.List<String> tags) {
                this.tags = tags;
                return this;
            }

            public UnhealthyJobs build() {
                return new UnhealthyJobs(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPatrolReportDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetPatrolReportDetailResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("completedAt")
        private String completedAt;

        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("overview")
        private Overview overview;

        @com.aliyun.core.annotation.NameInMap("reportId")
        private String reportId;

        @com.aliyun.core.annotation.NameInMap("scopeConfig")
        private ScopeConfig scopeConfig;

        @com.aliyun.core.annotation.NameInMap("scopeType")
        private String scopeType;

        @com.aliyun.core.annotation.NameInMap("triggerType")
        private String triggerType;

        @com.aliyun.core.annotation.NameInMap("unhealthyJobs")
        private java.util.List<UnhealthyJobs> unhealthyJobs;

        @com.aliyun.core.annotation.NameInMap("updatedAt")
        private String updatedAt;

        @com.aliyun.core.annotation.NameInMap("workspace")
        private String workspace;

        private Data(Builder builder) {
            this.completedAt = builder.completedAt;
            this.createdAt = builder.createdAt;
            this.namespace = builder.namespace;
            this.overview = builder.overview;
            this.reportId = builder.reportId;
            this.scopeConfig = builder.scopeConfig;
            this.scopeType = builder.scopeType;
            this.triggerType = builder.triggerType;
            this.unhealthyJobs = builder.unhealthyJobs;
            this.updatedAt = builder.updatedAt;
            this.workspace = builder.workspace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return completedAt
         */
        public String getCompletedAt() {
            return this.completedAt;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return overview
         */
        public Overview getOverview() {
            return this.overview;
        }

        /**
         * @return reportId
         */
        public String getReportId() {
            return this.reportId;
        }

        /**
         * @return scopeConfig
         */
        public ScopeConfig getScopeConfig() {
            return this.scopeConfig;
        }

        /**
         * @return scopeType
         */
        public String getScopeType() {
            return this.scopeType;
        }

        /**
         * @return triggerType
         */
        public String getTriggerType() {
            return this.triggerType;
        }

        /**
         * @return unhealthyJobs
         */
        public java.util.List<UnhealthyJobs> getUnhealthyJobs() {
            return this.unhealthyJobs;
        }

        /**
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        /**
         * @return workspace
         */
        public String getWorkspace() {
            return this.workspace;
        }

        public static final class Builder {
            private String completedAt; 
            private String createdAt; 
            private String namespace; 
            private Overview overview; 
            private String reportId; 
            private ScopeConfig scopeConfig; 
            private String scopeType; 
            private String triggerType; 
            private java.util.List<UnhealthyJobs> unhealthyJobs; 
            private String updatedAt; 
            private String workspace; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.completedAt = model.completedAt;
                this.createdAt = model.createdAt;
                this.namespace = model.namespace;
                this.overview = model.overview;
                this.reportId = model.reportId;
                this.scopeConfig = model.scopeConfig;
                this.scopeType = model.scopeType;
                this.triggerType = model.triggerType;
                this.unhealthyJobs = model.unhealthyJobs;
                this.updatedAt = model.updatedAt;
                this.workspace = model.workspace;
            } 

            /**
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
             * 
             * <strong>example:</strong>
             * <p>1785981634652</p>
             */
            public Builder completedAt(String completedAt) {
                this.completedAt = completedAt;
                return this;
            }

            /**
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
             * 
             * <strong>example:</strong>
             * <p>1772936711518</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * overview.
             */
            public Builder overview(Overview overview) {
                this.overview = overview;
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
             * scopeConfig.
             */
            public Builder scopeConfig(ScopeConfig scopeConfig) {
                this.scopeConfig = scopeConfig;
                return this;
            }

            /**
             * scopeType.
             */
            public Builder scopeType(String scopeType) {
                this.scopeType = scopeType;
                return this;
            }

            /**
             * triggerType.
             */
            public Builder triggerType(String triggerType) {
                this.triggerType = triggerType;
                return this;
            }

            /**
             * unhealthyJobs.
             */
            public Builder unhealthyJobs(java.util.List<UnhealthyJobs> unhealthyJobs) {
                this.unhealthyJobs = unhealthyJobs;
                return this;
            }

            /**
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
             * 
             * <strong>example:</strong>
             * <p>1758248445816</p>
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            /**
             * workspace.
             */
            public Builder workspace(String workspace) {
                this.workspace = workspace;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
