// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link StartPipelineIntegratedTaskRequest} extends {@link RequestModel}
 *
 * <p>StartPipelineIntegratedTaskRequest</p>
 */
public class StartPipelineIntegratedTaskRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Context")
    @com.aliyun.core.annotation.Validation(required = true)
    private Context context;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpUserId")
    private String opUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private StartCommand startCommand;

    private StartPipelineIntegratedTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.context = builder.context;
        this.opTenantId = builder.opTenantId;
        this.opUserId = builder.opUserId;
        this.startCommand = builder.startCommand;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartPipelineIntegratedTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return context
     */
    public Context getContext() {
        return this.context;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return opUserId
     */
    public String getOpUserId() {
        return this.opUserId;
    }

    /**
     * @return startCommand
     */
    public StartCommand getStartCommand() {
        return this.startCommand;
    }

    public static final class Builder extends Request.Builder<StartPipelineIntegratedTaskRequest, Builder> {
        private String regionId; 
        private Context context; 
        private Long opTenantId; 
        private String opUserId; 
        private StartCommand startCommand; 

        private Builder() {
            super();
        } 

        private Builder(StartPipelineIntegratedTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.context = request.context;
            this.opTenantId = request.opTenantId;
            this.opUserId = request.opUserId;
            this.startCommand = request.startCommand;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder context(Context context) {
            String contextShrink = shrink(context, "Context", "json");
            this.putBodyParameter("Context", contextShrink);
            this.context = context;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        /**
         * OpUserId.
         */
        public Builder opUserId(String opUserId) {
            this.putQueryParameter("OpUserId", opUserId);
            this.opUserId = opUserId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder startCommand(StartCommand startCommand) {
            String startCommandShrink = shrink(startCommand, "StartCommand", "json");
            this.putBodyParameter("StartCommand", startCommandShrink);
            this.startCommand = startCommand;
            return this;
        }

        @Override
        public StartPipelineIntegratedTaskRequest build() {
            return new StartPipelineIntegratedTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link StartPipelineIntegratedTaskRequest} extends {@link TeaModel}
     *
     * <p>StartPipelineIntegratedTaskRequest</p>
     */
    public static class Context extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Env")
        @com.aliyun.core.annotation.Validation(required = true)
        private String env;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long projectId;

        private Context(Builder builder) {
            this.env = builder.env;
            this.projectId = builder.projectId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Context create() {
            return builder().build();
        }

        /**
         * @return env
         */
        public String getEnv() {
            return this.env;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        public static final class Builder {
            private String env; 
            private Long projectId; 

            private Builder() {
            } 

            private Builder(Context model) {
                this.env = model.env;
                this.projectId = model.projectId;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>DEV</p>
             */
            public Builder env(String env) {
                this.env = env;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1234567890</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            public Context build() {
                return new Context(this);
            } 

        } 

    }
    /**
     * 
     * {@link StartPipelineIntegratedTaskRequest} extends {@link TeaModel}
     *
     * <p>StartPipelineIntegratedTaskRequest</p>
     */
    public static class StartCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ByteSpeed")
        private Integer byteSpeed;

        @com.aliyun.core.annotation.NameInMap("Checkpoint")
        private String checkpoint;

        @com.aliyun.core.annotation.NameInMap("Concurrent")
        private Integer concurrent;

        @com.aliyun.core.annotation.NameInMap("FullTaskMode")
        private String fullTaskMode;

        @com.aliyun.core.annotation.NameInMap("IncrementalTaskId")
        private String incrementalTaskId;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Integer memory;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("QuotaGroupId")
        private String quotaGroupId;

        @com.aliyun.core.annotation.NameInMap("SyncMode")
        private String syncMode;

        private StartCommand(Builder builder) {
            this.byteSpeed = builder.byteSpeed;
            this.checkpoint = builder.checkpoint;
            this.concurrent = builder.concurrent;
            this.fullTaskMode = builder.fullTaskMode;
            this.incrementalTaskId = builder.incrementalTaskId;
            this.memory = builder.memory;
            this.nodeId = builder.nodeId;
            this.quotaGroupId = builder.quotaGroupId;
            this.syncMode = builder.syncMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StartCommand create() {
            return builder().build();
        }

        /**
         * @return byteSpeed
         */
        public Integer getByteSpeed() {
            return this.byteSpeed;
        }

        /**
         * @return checkpoint
         */
        public String getCheckpoint() {
            return this.checkpoint;
        }

        /**
         * @return concurrent
         */
        public Integer getConcurrent() {
            return this.concurrent;
        }

        /**
         * @return fullTaskMode
         */
        public String getFullTaskMode() {
            return this.fullTaskMode;
        }

        /**
         * @return incrementalTaskId
         */
        public String getIncrementalTaskId() {
            return this.incrementalTaskId;
        }

        /**
         * @return memory
         */
        public Integer getMemory() {
            return this.memory;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return quotaGroupId
         */
        public String getQuotaGroupId() {
            return this.quotaGroupId;
        }

        /**
         * @return syncMode
         */
        public String getSyncMode() {
            return this.syncMode;
        }

        public static final class Builder {
            private Integer byteSpeed; 
            private String checkpoint; 
            private Integer concurrent; 
            private String fullTaskMode; 
            private String incrementalTaskId; 
            private Integer memory; 
            private String nodeId; 
            private String quotaGroupId; 
            private String syncMode; 

            private Builder() {
            } 

            private Builder(StartCommand model) {
                this.byteSpeed = model.byteSpeed;
                this.checkpoint = model.checkpoint;
                this.concurrent = model.concurrent;
                this.fullTaskMode = model.fullTaskMode;
                this.incrementalTaskId = model.incrementalTaskId;
                this.memory = model.memory;
                this.nodeId = model.nodeId;
                this.quotaGroupId = model.quotaGroupId;
                this.syncMode = model.syncMode;
            } 

            /**
             * ByteSpeed.
             */
            public Builder byteSpeed(Integer byteSpeed) {
                this.byteSpeed = byteSpeed;
                return this;
            }

            /**
             * Checkpoint.
             */
            public Builder checkpoint(String checkpoint) {
                this.checkpoint = checkpoint;
                return this;
            }

            /**
             * Concurrent.
             */
            public Builder concurrent(Integer concurrent) {
                this.concurrent = concurrent;
                return this;
            }

            /**
             * FullTaskMode.
             */
            public Builder fullTaskMode(String fullTaskMode) {
                this.fullTaskMode = fullTaskMode;
                return this;
            }

            /**
             * IncrementalTaskId.
             */
            public Builder incrementalTaskId(String incrementalTaskId) {
                this.incrementalTaskId = incrementalTaskId;
                return this;
            }

            /**
             * Memory.
             */
            public Builder memory(Integer memory) {
                this.memory = memory;
                return this;
            }

            /**
             * NodeId.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * QuotaGroupId.
             */
            public Builder quotaGroupId(String quotaGroupId) {
                this.quotaGroupId = quotaGroupId;
                return this;
            }

            /**
             * SyncMode.
             */
            public Builder syncMode(String syncMode) {
                this.syncMode = syncMode;
                return this;
            }

            public StartCommand build() {
                return new StartCommand(this);
            } 

        } 

    }
}
