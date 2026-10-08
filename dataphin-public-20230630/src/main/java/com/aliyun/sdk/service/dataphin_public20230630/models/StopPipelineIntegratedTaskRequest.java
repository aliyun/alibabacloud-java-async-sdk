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
 * {@link StopPipelineIntegratedTaskRequest} extends {@link RequestModel}
 *
 * <p>StopPipelineIntegratedTaskRequest</p>
 */
public class StopPipelineIntegratedTaskRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("StopCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private StopCommand stopCommand;

    private StopPipelineIntegratedTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.context = builder.context;
        this.opTenantId = builder.opTenantId;
        this.opUserId = builder.opUserId;
        this.stopCommand = builder.stopCommand;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopPipelineIntegratedTaskRequest create() {
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
     * @return stopCommand
     */
    public StopCommand getStopCommand() {
        return this.stopCommand;
    }

    public static final class Builder extends Request.Builder<StopPipelineIntegratedTaskRequest, Builder> {
        private String regionId; 
        private Context context; 
        private Long opTenantId; 
        private String opUserId; 
        private StopCommand stopCommand; 

        private Builder() {
            super();
        } 

        private Builder(StopPipelineIntegratedTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.context = request.context;
            this.opTenantId = request.opTenantId;
            this.opUserId = request.opUserId;
            this.stopCommand = request.stopCommand;
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
        public Builder stopCommand(StopCommand stopCommand) {
            String stopCommandShrink = shrink(stopCommand, "StopCommand", "json");
            this.putBodyParameter("StopCommand", stopCommandShrink);
            this.stopCommand = stopCommand;
            return this;
        }

        @Override
        public StopPipelineIntegratedTaskRequest build() {
            return new StopPipelineIntegratedTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link StopPipelineIntegratedTaskRequest} extends {@link TeaModel}
     *
     * <p>StopPipelineIntegratedTaskRequest</p>
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
             * <p>PROD</p>
             */
            public Builder env(String env) {
                this.env = env;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
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
     * {@link StopPipelineIntegratedTaskRequest} extends {@link TeaModel}
     *
     * <p>StopPipelineIntegratedTaskRequest</p>
     */
    public static class StopCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TaskIds")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> taskIds;

        private StopCommand(Builder builder) {
            this.taskIds = builder.taskIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StopCommand create() {
            return builder().build();
        }

        /**
         * @return taskIds
         */
        public java.util.List<String> getTaskIds() {
            return this.taskIds;
        }

        public static final class Builder {
            private java.util.List<String> taskIds; 

            private Builder() {
            } 

            private Builder(StopCommand model) {
                this.taskIds = model.taskIds;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder taskIds(java.util.List<String> taskIds) {
                this.taskIds = taskIds;
                return this;
            }

            public StopCommand build() {
                return new StopCommand(this);
            } 

        } 

    }
}
