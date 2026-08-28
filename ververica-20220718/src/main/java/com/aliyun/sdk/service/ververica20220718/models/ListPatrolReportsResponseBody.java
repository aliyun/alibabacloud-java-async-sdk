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
 * {@link ListPatrolReportsResponseBody} extends {@link TeaModel}
 *
 * <p>ListPatrolReportsResponseBody</p>
 */
public class ListPatrolReportsResponseBody extends TeaModel {
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

    private ListPatrolReportsResponseBody(Builder builder) {
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

    public static ListPatrolReportsResponseBody create() {
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

        private Builder(ListPatrolReportsResponseBody model) {
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

        public ListPatrolReportsResponseBody build() {
            return new ListPatrolReportsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPatrolReportsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPatrolReportsResponseBody</p>
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
     * {@link ListPatrolReportsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPatrolReportsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("completedAt")
        private String completedAt;

        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("errorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("inspectedJobs")
        private Integer inspectedJobs;

        @com.aliyun.core.annotation.NameInMap("namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("problemDelayBackpressureCount")
        private Integer problemDelayBackpressureCount;

        @com.aliyun.core.annotation.NameInMap("problemUnhealthyCheckpointCount")
        private Integer problemUnhealthyCheckpointCount;

        @com.aliyun.core.annotation.NameInMap("problemUnhealthyCount")
        private Integer problemUnhealthyCount;

        @com.aliyun.core.annotation.NameInMap("reportId")
        private String reportId;

        @com.aliyun.core.annotation.NameInMap("riskCriticalCount")
        private Integer riskCriticalCount;

        @com.aliyun.core.annotation.NameInMap("riskInfoCount")
        private Integer riskInfoCount;

        @com.aliyun.core.annotation.NameInMap("riskWarningCount")
        private Integer riskWarningCount;

        @com.aliyun.core.annotation.NameInMap("scopeConfig")
        private ScopeConfig scopeConfig;

        @com.aliyun.core.annotation.NameInMap("scopeType")
        private String scopeType;

        @com.aliyun.core.annotation.NameInMap("startedAt")
        private String startedAt;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("totalJobs")
        private Integer totalJobs;

        @com.aliyun.core.annotation.NameInMap("triggerType")
        private String triggerType;

        @com.aliyun.core.annotation.NameInMap("updatedAt")
        private String updatedAt;

        @com.aliyun.core.annotation.NameInMap("workspace")
        private String workspace;

        private Items(Builder builder) {
            this.completedAt = builder.completedAt;
            this.createdAt = builder.createdAt;
            this.errorMessage = builder.errorMessage;
            this.inspectedJobs = builder.inspectedJobs;
            this.namespace = builder.namespace;
            this.problemDelayBackpressureCount = builder.problemDelayBackpressureCount;
            this.problemUnhealthyCheckpointCount = builder.problemUnhealthyCheckpointCount;
            this.problemUnhealthyCount = builder.problemUnhealthyCount;
            this.reportId = builder.reportId;
            this.riskCriticalCount = builder.riskCriticalCount;
            this.riskInfoCount = builder.riskInfoCount;
            this.riskWarningCount = builder.riskWarningCount;
            this.scopeConfig = builder.scopeConfig;
            this.scopeType = builder.scopeType;
            this.startedAt = builder.startedAt;
            this.status = builder.status;
            this.totalJobs = builder.totalJobs;
            this.triggerType = builder.triggerType;
            this.updatedAt = builder.updatedAt;
            this.workspace = builder.workspace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
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
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return inspectedJobs
         */
        public Integer getInspectedJobs() {
            return this.inspectedJobs;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return problemDelayBackpressureCount
         */
        public Integer getProblemDelayBackpressureCount() {
            return this.problemDelayBackpressureCount;
        }

        /**
         * @return problemUnhealthyCheckpointCount
         */
        public Integer getProblemUnhealthyCheckpointCount() {
            return this.problemUnhealthyCheckpointCount;
        }

        /**
         * @return problemUnhealthyCount
         */
        public Integer getProblemUnhealthyCount() {
            return this.problemUnhealthyCount;
        }

        /**
         * @return reportId
         */
        public String getReportId() {
            return this.reportId;
        }

        /**
         * @return riskCriticalCount
         */
        public Integer getRiskCriticalCount() {
            return this.riskCriticalCount;
        }

        /**
         * @return riskInfoCount
         */
        public Integer getRiskInfoCount() {
            return this.riskInfoCount;
        }

        /**
         * @return riskWarningCount
         */
        public Integer getRiskWarningCount() {
            return this.riskWarningCount;
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
         * @return startedAt
         */
        public String getStartedAt() {
            return this.startedAt;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return totalJobs
         */
        public Integer getTotalJobs() {
            return this.totalJobs;
        }

        /**
         * @return triggerType
         */
        public String getTriggerType() {
            return this.triggerType;
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
            private String errorMessage; 
            private Integer inspectedJobs; 
            private String namespace; 
            private Integer problemDelayBackpressureCount; 
            private Integer problemUnhealthyCheckpointCount; 
            private Integer problemUnhealthyCount; 
            private String reportId; 
            private Integer riskCriticalCount; 
            private Integer riskInfoCount; 
            private Integer riskWarningCount; 
            private ScopeConfig scopeConfig; 
            private String scopeType; 
            private String startedAt; 
            private String status; 
            private Integer totalJobs; 
            private String triggerType; 
            private String updatedAt; 
            private String workspace; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.completedAt = model.completedAt;
                this.createdAt = model.createdAt;
                this.errorMessage = model.errorMessage;
                this.inspectedJobs = model.inspectedJobs;
                this.namespace = model.namespace;
                this.problemDelayBackpressureCount = model.problemDelayBackpressureCount;
                this.problemUnhealthyCheckpointCount = model.problemUnhealthyCheckpointCount;
                this.problemUnhealthyCount = model.problemUnhealthyCount;
                this.reportId = model.reportId;
                this.riskCriticalCount = model.riskCriticalCount;
                this.riskInfoCount = model.riskInfoCount;
                this.riskWarningCount = model.riskWarningCount;
                this.scopeConfig = model.scopeConfig;
                this.scopeType = model.scopeType;
                this.startedAt = model.startedAt;
                this.status = model.status;
                this.totalJobs = model.totalJobs;
                this.triggerType = model.triggerType;
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
             * <p>1755158793586</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
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
             * inspectedJobs.
             */
            public Builder inspectedJobs(Integer inspectedJobs) {
                this.inspectedJobs = inspectedJobs;
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
             * problemDelayBackpressureCount.
             */
            public Builder problemDelayBackpressureCount(Integer problemDelayBackpressureCount) {
                this.problemDelayBackpressureCount = problemDelayBackpressureCount;
                return this;
            }

            /**
             * problemUnhealthyCheckpointCount.
             */
            public Builder problemUnhealthyCheckpointCount(Integer problemUnhealthyCheckpointCount) {
                this.problemUnhealthyCheckpointCount = problemUnhealthyCheckpointCount;
                return this;
            }

            /**
             * problemUnhealthyCount.
             */
            public Builder problemUnhealthyCount(Integer problemUnhealthyCount) {
                this.problemUnhealthyCount = problemUnhealthyCount;
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
             * riskCriticalCount.
             */
            public Builder riskCriticalCount(Integer riskCriticalCount) {
                this.riskCriticalCount = riskCriticalCount;
                return this;
            }

            /**
             * riskInfoCount.
             */
            public Builder riskInfoCount(Integer riskInfoCount) {
                this.riskInfoCount = riskInfoCount;
                return this;
            }

            /**
             * riskWarningCount.
             */
            public Builder riskWarningCount(Integer riskWarningCount) {
                this.riskWarningCount = riskWarningCount;
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
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
             * 
             * <strong>example:</strong>
             * <p>1755158793586</p>
             */
            public Builder startedAt(String startedAt) {
                this.startedAt = startedAt;
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
             * totalJobs.
             */
            public Builder totalJobs(Integer totalJobs) {
                this.totalJobs = totalJobs;
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
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
             * 
             * <strong>example:</strong>
             * <p>1784168829417</p>
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

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPatrolReportsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPatrolReportsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("items")
        private java.util.List<Items> items;

        @com.aliyun.core.annotation.NameInMap("page")
        private Integer page;

        @com.aliyun.core.annotation.NameInMap("size")
        private Integer size;

        @com.aliyun.core.annotation.NameInMap("total")
        private Integer total;

        private Data(Builder builder) {
            this.items = builder.items;
            this.page = builder.page;
            this.size = builder.size;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public java.util.List<Items> getItems() {
            return this.items;
        }

        /**
         * @return page
         */
        public Integer getPage() {
            return this.page;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<Items> items; 
            private Integer page; 
            private Integer size; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.items = model.items;
                this.page = model.page;
                this.size = model.size;
                this.total = model.total;
            } 

            /**
             * items.
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            /**
             * page.
             */
            public Builder page(Integer page) {
                this.page = page;
                return this;
            }

            /**
             * size.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
