// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
 * {@link ListOptimizeTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListOptimizeTasksResponseBody</p>
 */
public class ListOptimizeTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("optimizeTasks")
    private java.util.List<OptimizeTasks> optimizeTasks;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    private ListOptimizeTasksResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.optimizeTasks = builder.optimizeTasks;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOptimizeTasksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return optimizeTasks
     */
    public java.util.List<OptimizeTasks> getOptimizeTasks() {
        return this.optimizeTasks;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List<OptimizeTasks> optimizeTasks; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListOptimizeTasksResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.optimizeTasks = model.optimizeTasks;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The maximum number of results per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token for the next page.</p>
         * 
         * <strong>example:</strong>
         * <p>MTIzNDU2Nzg5MA==</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The list of optimization tasks.</p>
         */
        public Builder optimizeTasks(java.util.List<OptimizeTasks> optimizeTasks) {
            this.optimizeTasks = optimizeTasks;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9ACFB10A-1B2C-3D4E-5F6G-7H8I9J0K1L2M</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total count.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListOptimizeTasksResponseBody build() {
            return new ListOptimizeTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListOptimizeTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListOptimizeTasksResponseBody</p>
     */
    public static class OptimizeTasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("checkpoint")
        private java.util.Map<String, ?> checkpoint;

        @com.aliyun.core.annotation.NameInMap("config")
        private java.util.Map<String, ?> config;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("nextTriggerTime")
        private String nextTriggerTime;

        @com.aliyun.core.annotation.NameInMap("optimizeTaskName")
        private String optimizeTaskName;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("updateTime")
        private String updateTime;

        private OptimizeTasks(Builder builder) {
            this.checkpoint = builder.checkpoint;
            this.config = builder.config;
            this.createTime = builder.createTime;
            this.nextTriggerTime = builder.nextTriggerTime;
            this.optimizeTaskName = builder.optimizeTaskName;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.type = builder.type;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OptimizeTasks create() {
            return builder().build();
        }

        /**
         * @return checkpoint
         */
        public java.util.Map<String, ?> getCheckpoint() {
            return this.checkpoint;
        }

        /**
         * @return config
         */
        public java.util.Map<String, ?> getConfig() {
            return this.config;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return nextTriggerTime
         */
        public String getNextTriggerTime() {
            return this.nextTriggerTime;
        }

        /**
         * @return optimizeTaskName
         */
        public String getOptimizeTaskName() {
            return this.optimizeTaskName;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private java.util.Map<String, ?> checkpoint; 
            private java.util.Map<String, ?> config; 
            private String createTime; 
            private String nextTriggerTime; 
            private String optimizeTaskName; 
            private String regionId; 
            private String status; 
            private String type; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(OptimizeTasks model) {
                this.checkpoint = model.checkpoint;
                this.config = model.config;
                this.createTime = model.createTime;
                this.nextTriggerTime = model.nextTriggerTime;
                this.optimizeTaskName = model.optimizeTaskName;
                this.regionId = model.regionId;
                this.status = model.status;
                this.type = model.type;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The scheduling checkpoint that stores states such as the general scheduling watermark.</p>
             */
            public Builder checkpoint(java.util.Map<String, ?> checkpoint) {
                this.checkpoint = checkpoint;
                return this;
            }

            /**
             * <p>The type-specific configuration. For ExperienceMining and SkillOptimize, optional prompts support only inline Markdown, and the body is stored in inputs.prompt.content (non-empty UTF-8, up to 16 KiB).</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;ioVersion&quot;:2,&quot;inputs&quot;:{&quot;experienceLibrary&quot;:{&quot;type&quot;:&quot;dataset&quot;,&quot;dataset&quot;:&quot;experiences&quot;},&quot;trajectory&quot;:{&quot;type&quot;:&quot;sls&quot;,&quot;project&quot;:&quot;my-project&quot;,&quot;logstore&quot;:&quot;agent-trajectory&quot;,&quot;format&quot;:&quot;atif&quot;},&quot;prompt&quot;:{&quot;type&quot;:&quot;inline&quot;,&quot;format&quot;:&quot;markdown&quot;,&quot;content&quot;:&quot;# Guidance\\nExtract evidence-backed tool contracts.&quot;}},&quot;outputs&quot;:{&quot;changePlan&quot;:{&quot;type&quot;:&quot;dataset&quot;,&quot;dataset&quot;:&quot;experience-plans&quot;}},&quot;operators&quot;:[&quot;tool_contract&quot;],&quot;application&quot;:{&quot;mode&quot;:&quot;manual&quot;}}</p>
             */
            public Builder config(java.util.Map<String, ?> config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-12T10:00:00Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The next scheduling trigger time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-13T16:00:00Z</p>
             */
            public Builder nextTriggerTime(String nextTriggerTime) {
                this.nextTriggerTime = nextTriggerTime;
                return this;
            }

            /**
             * <p>The name of the optimization task.</p>
             * 
             * <strong>example:</strong>
             * <p>efficiency-analysis</p>
             */
            public Builder optimizeTaskName(String optimizeTaskName) {
                this.optimizeTaskName = optimizeTaskName;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The task status.</p>
             * 
             * <strong>example:</strong>
             * <p>Enabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The type of the optimization task. Valid values: ExperienceMining, SkillOptimize, EfficiencyAnalysis, SOPGeneration, EvalMining, PolicyMining, and AssetMining.</p>
             * 
             * <strong>example:</strong>
             * <p>EfficiencyAnalysis</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The update time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-12T10:00:00Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public OptimizeTasks build() {
                return new OptimizeTasks(this);
            } 

        } 

    }
}
