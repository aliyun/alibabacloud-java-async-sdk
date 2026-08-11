// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.modelstudio20260210.models;

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
 * {@link UpdateModelLimitsRequest} extends {@link RequestModel}
 *
 * <p>UpdateModelLimitsRequest</p>
 */
public class UpdateModelLimitsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("workspaceLimits")
    private java.util.List<WorkspaceLimits> workspaceLimits;

    private UpdateModelLimitsRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.workspaceLimits = builder.workspaceLimits;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateModelLimitsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return workspaceLimits
     */
    public java.util.List<WorkspaceLimits> getWorkspaceLimits() {
        return this.workspaceLimits;
    }

    public static final class Builder extends Request.Builder<UpdateModelLimitsRequest, Builder> {
        private String workspaceId; 
        private java.util.List<WorkspaceLimits> workspaceLimits; 

        private Builder() {
            super();
        } 

        private Builder(UpdateModelLimitsRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.workspaceLimits = request.workspaceLimits;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-ac3ef438bec22dc5</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * workspaceLimits.
         */
        public Builder workspaceLimits(java.util.List<WorkspaceLimits> workspaceLimits) {
            String workspaceLimitsShrink = shrink(workspaceLimits, "workspaceLimits", "json");
            this.putBodyParameter("workspaceLimits", workspaceLimitsShrink);
            this.workspaceLimits = workspaceLimits;
            return this;
        }

        @Override
        public UpdateModelLimitsRequest build() {
            return new UpdateModelLimitsRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateModelLimitsRequest} extends {@link TeaModel}
     *
     * <p>UpdateModelLimitsRequest</p>
     */
    public static class WorkspaceLimits extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("operationType")
        private String operationType;

        @com.aliyun.core.annotation.NameInMap("requestLimit")
        private Long requestLimit;

        @com.aliyun.core.annotation.NameInMap("requestLimitPeriod")
        private Long requestLimitPeriod;

        @com.aliyun.core.annotation.NameInMap("usageLimit")
        private Long usageLimit;

        @com.aliyun.core.annotation.NameInMap("usageLimitPeriod")
        private Long usageLimitPeriod;

        private WorkspaceLimits(Builder builder) {
            this.model = builder.model;
            this.operationType = builder.operationType;
            this.requestLimit = builder.requestLimit;
            this.requestLimitPeriod = builder.requestLimitPeriod;
            this.usageLimit = builder.usageLimit;
            this.usageLimitPeriod = builder.usageLimitPeriod;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WorkspaceLimits create() {
            return builder().build();
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return operationType
         */
        public String getOperationType() {
            return this.operationType;
        }

        /**
         * @return requestLimit
         */
        public Long getRequestLimit() {
            return this.requestLimit;
        }

        /**
         * @return requestLimitPeriod
         */
        public Long getRequestLimitPeriod() {
            return this.requestLimitPeriod;
        }

        /**
         * @return usageLimit
         */
        public Long getUsageLimit() {
            return this.usageLimit;
        }

        /**
         * @return usageLimitPeriod
         */
        public Long getUsageLimitPeriod() {
            return this.usageLimitPeriod;
        }

        public static final class Builder {
            private String model; 
            private String operationType; 
            private Long requestLimit; 
            private Long requestLimitPeriod; 
            private Long usageLimit; 
            private Long usageLimitPeriod; 

            private Builder() {
            } 

            private Builder(WorkspaceLimits model) {
                this.model = model.model;
                this.operationType = model.operationType;
                this.requestLimit = model.requestLimit;
                this.requestLimitPeriod = model.requestLimitPeriod;
                this.usageLimit = model.usageLimit;
                this.usageLimitPeriod = model.usageLimitPeriod;
            } 

            /**
             * model.
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * operationType.
             */
            public Builder operationType(String operationType) {
                this.operationType = operationType;
                return this;
            }

            /**
             * requestLimit.
             */
            public Builder requestLimit(Long requestLimit) {
                this.requestLimit = requestLimit;
                return this;
            }

            /**
             * requestLimitPeriod.
             */
            public Builder requestLimitPeriod(Long requestLimitPeriod) {
                this.requestLimitPeriod = requestLimitPeriod;
                return this;
            }

            /**
             * usageLimit.
             */
            public Builder usageLimit(Long usageLimit) {
                this.usageLimit = usageLimit;
                return this;
            }

            /**
             * usageLimitPeriod.
             */
            public Builder usageLimitPeriod(Long usageLimitPeriod) {
                this.usageLimitPeriod = usageLimitPeriod;
                return this;
            }

            public WorkspaceLimits build() {
                return new WorkspaceLimits(this);
            } 

        } 

    }
}
