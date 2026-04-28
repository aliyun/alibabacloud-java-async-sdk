// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link UpdateWorkspaceRequest} extends {@link RequestModel}
 *
 * <p>UpdateWorkspaceRequest</p>
 */
public class UpdateWorkspaceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cu")
    private Integer cu;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("gpu")
    private Integer gpu;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("gpuSpec")
    private java.util.List<String> gpuSpec;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("subscription")
    private Subscription subscription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("workspaceName")
    private String workspaceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    private UpdateWorkspaceRequest(Builder builder) {
        super(builder);
        this.cu = builder.cu;
        this.gpu = builder.gpu;
        this.gpuSpec = builder.gpuSpec;
        this.resourceGroupId = builder.resourceGroupId;
        this.subscription = builder.subscription;
        this.workspaceId = builder.workspaceId;
        this.workspaceName = builder.workspaceName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWorkspaceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cu
     */
    public Integer getCu() {
        return this.cu;
    }

    /**
     * @return gpu
     */
    public Integer getGpu() {
        return this.gpu;
    }

    /**
     * @return gpuSpec
     */
    public java.util.List<String> getGpuSpec() {
        return this.gpuSpec;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return subscription
     */
    public Subscription getSubscription() {
        return this.subscription;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return workspaceName
     */
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateWorkspaceRequest, Builder> {
        private Integer cu; 
        private Integer gpu; 
        private java.util.List<String> gpuSpec; 
        private String resourceGroupId; 
        private Subscription subscription; 
        private String workspaceId; 
        private String workspaceName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateWorkspaceRequest request) {
            super(request);
            this.cu = request.cu;
            this.gpu = request.gpu;
            this.gpuSpec = request.gpuSpec;
            this.resourceGroupId = request.resourceGroupId;
            this.subscription = request.subscription;
            this.workspaceId = request.workspaceId;
            this.workspaceName = request.workspaceName;
            this.regionId = request.regionId;
        } 

        /**
         * cu.
         */
        public Builder cu(Integer cu) {
            this.putBodyParameter("cu", cu);
            this.cu = cu;
            return this;
        }

        /**
         * gpu.
         */
        public Builder gpu(Integer gpu) {
            this.putBodyParameter("gpu", gpu);
            this.gpu = gpu;
            return this;
        }

        /**
         * gpuSpec.
         */
        public Builder gpuSpec(java.util.List<String> gpuSpec) {
            this.putBodyParameter("gpuSpec", gpuSpec);
            this.gpuSpec = gpuSpec;
            return this;
        }

        /**
         * resourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("resourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * subscription.
         */
        public Builder subscription(Subscription subscription) {
            this.putBodyParameter("subscription", subscription);
            this.subscription = subscription;
            return this;
        }

        /**
         * workspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * workspaceName.
         */
        public Builder workspaceName(String workspaceName) {
            this.putBodyParameter("workspaceName", workspaceName);
            this.workspaceName = workspaceName;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public UpdateWorkspaceRequest build() {
            return new UpdateWorkspaceRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateWorkspaceRequest} extends {@link TeaModel}
     *
     * <p>UpdateWorkspaceRequest</p>
     */
    public static class Subscription extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("autoRenew")
        private String autoRenew;

        @com.aliyun.core.annotation.NameInMap("autoRenewPeriod")
        private String autoRenewPeriod;

        @com.aliyun.core.annotation.NameInMap("autoRenewPeriodUnit")
        private String autoRenewPeriodUnit;

        @com.aliyun.core.annotation.NameInMap("clientToken")
        private String clientToken;

        @com.aliyun.core.annotation.NameInMap("duration")
        private String duration;

        @com.aliyun.core.annotation.NameInMap("paymentDurationUnit")
        private String paymentDurationUnit;

        @com.aliyun.core.annotation.NameInMap("queue")
        private java.util.List<String> queue;

        private Subscription(Builder builder) {
            this.autoRenew = builder.autoRenew;
            this.autoRenewPeriod = builder.autoRenewPeriod;
            this.autoRenewPeriodUnit = builder.autoRenewPeriodUnit;
            this.clientToken = builder.clientToken;
            this.duration = builder.duration;
            this.paymentDurationUnit = builder.paymentDurationUnit;
            this.queue = builder.queue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Subscription create() {
            return builder().build();
        }

        /**
         * @return autoRenew
         */
        public String getAutoRenew() {
            return this.autoRenew;
        }

        /**
         * @return autoRenewPeriod
         */
        public String getAutoRenewPeriod() {
            return this.autoRenewPeriod;
        }

        /**
         * @return autoRenewPeriodUnit
         */
        public String getAutoRenewPeriodUnit() {
            return this.autoRenewPeriodUnit;
        }

        /**
         * @return clientToken
         */
        public String getClientToken() {
            return this.clientToken;
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return paymentDurationUnit
         */
        public String getPaymentDurationUnit() {
            return this.paymentDurationUnit;
        }

        /**
         * @return queue
         */
        public java.util.List<String> getQueue() {
            return this.queue;
        }

        public static final class Builder {
            private String autoRenew; 
            private String autoRenewPeriod; 
            private String autoRenewPeriodUnit; 
            private String clientToken; 
            private String duration; 
            private String paymentDurationUnit; 
            private java.util.List<String> queue; 

            private Builder() {
            } 

            private Builder(Subscription model) {
                this.autoRenew = model.autoRenew;
                this.autoRenewPeriod = model.autoRenewPeriod;
                this.autoRenewPeriodUnit = model.autoRenewPeriodUnit;
                this.clientToken = model.clientToken;
                this.duration = model.duration;
                this.paymentDurationUnit = model.paymentDurationUnit;
                this.queue = model.queue;
            } 

            /**
             * autoRenew.
             */
            public Builder autoRenew(String autoRenew) {
                this.autoRenew = autoRenew;
                return this;
            }

            /**
             * autoRenewPeriod.
             */
            public Builder autoRenewPeriod(String autoRenewPeriod) {
                this.autoRenewPeriod = autoRenewPeriod;
                return this;
            }

            /**
             * autoRenewPeriodUnit.
             */
            public Builder autoRenewPeriodUnit(String autoRenewPeriodUnit) {
                this.autoRenewPeriodUnit = autoRenewPeriodUnit;
                return this;
            }

            /**
             * clientToken.
             */
            public Builder clientToken(String clientToken) {
                this.clientToken = clientToken;
                return this;
            }

            /**
             * duration.
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * paymentDurationUnit.
             */
            public Builder paymentDurationUnit(String paymentDurationUnit) {
                this.paymentDurationUnit = paymentDurationUnit;
                return this;
            }

            /**
             * queue.
             */
            public Builder queue(java.util.List<String> queue) {
                this.queue = queue;
                return this;
            }

            public Subscription build() {
                return new Subscription(this);
            } 

        } 

    }
}
