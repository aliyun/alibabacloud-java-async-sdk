// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateInstanceResponseBody</p>
 */
public class CreateInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateInstanceResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateInstanceResponseBody build() {
            return new CreateInstanceResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DryRunResult")
        private Boolean dryRunResult;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("OrderId")
        private String orderId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        private Data(Builder builder) {
            this.dryRunResult = builder.dryRunResult;
            this.instanceId = builder.instanceId;
            this.orderId = builder.orderId;
            this.resourceGroupId = builder.resourceGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dryRunResult
         */
        public Boolean getDryRunResult() {
            return this.dryRunResult;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public static final class Builder {
            private Boolean dryRunResult; 
            private String instanceId; 
            private String orderId; 
            private String resourceGroupId; 

            /**
             * The result of the dry-run request.
             * <p>
             * 
             * If the DryRun parameter is set to true and the dry run succeeds, the DryRunResult parameter returns true. Otherwise, an error code is returned.
             * If the DryRun parameter is set to false, no dry run is performed and the DryRunResult parameter returns false.
             */
            public Builder dryRunResult(Boolean dryRunResult) {
                this.dryRunResult = dryRunResult;
                return this;
            }

            /**
             * Instance ID.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Order ID. The ID of the order that you have placed.
             * <p>
             * This parameter returns a value after you create a pre-paid or post-paid cluster.
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * Resource group ID.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
