// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateStorageGatewayResponseBody} extends {@link TeaModel}
 *
 * <p>CreateStorageGatewayResponseBody</p>
 */
public class CreateStorageGatewayResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AllocationId")
    private java.util.List < AllocationId> allocationId;

    @com.aliyun.core.annotation.NameInMap("BizStatusCode")
    private String bizStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UnAllocationId")
    private java.util.List < UnAllocationId> unAllocationId;

    private CreateStorageGatewayResponseBody(Builder builder) {
        this.allocationId = builder.allocationId;
        this.bizStatusCode = builder.bizStatusCode;
        this.requestId = builder.requestId;
        this.unAllocationId = builder.unAllocationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateStorageGatewayResponseBody create() {
        return builder().build();
    }

    /**
     * @return allocationId
     */
    public java.util.List < AllocationId> getAllocationId() {
        return this.allocationId;
    }

    /**
     * @return bizStatusCode
     */
    public String getBizStatusCode() {
        return this.bizStatusCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return unAllocationId
     */
    public java.util.List < UnAllocationId> getUnAllocationId() {
        return this.unAllocationId;
    }

    public static final class Builder {
        private java.util.List < AllocationId> allocationId; 
        private String bizStatusCode; 
        private String requestId; 
        private java.util.List < UnAllocationId> unAllocationId; 

        /**
         * The list of created nodes.
         */
        public Builder allocationId(java.util.List < AllocationId> allocationId) {
            this.allocationId = allocationId;
            return this;
        }

        /**
         * The success status code.
         * <p>
         * 
         * *   **PartSuccess**: partially succeeded.
         * *   **AllSuccess**: all succeeded.
         */
        public Builder bizStatusCode(String bizStatusCode) {
            this.bizStatusCode = bizStatusCode;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The list of nodes that are not created.
         */
        public Builder unAllocationId(java.util.List < UnAllocationId> unAllocationId) {
            this.unAllocationId = unAllocationId;
            return this;
        }

        public CreateStorageGatewayResponseBody build() {
            return new CreateStorageGatewayResponseBody(this);
        } 

    } 

    public static class AllocationId extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnsRegionId")
        private String ensRegionId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        private AllocationId(Builder builder) {
            this.ensRegionId = builder.ensRegionId;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AllocationId create() {
            return builder().build();
        }

        /**
         * @return ensRegionId
         */
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private String ensRegionId; 
            private String instanceId; 

            /**
             * The ID of the node.
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public AllocationId build() {
                return new AllocationId(this);
            } 

        } 

    }
    public static class UnAllocationId extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnsRegionId")
        private String ensRegionId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        private UnAllocationId(Builder builder) {
            this.ensRegionId = builder.ensRegionId;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UnAllocationId create() {
            return builder().build();
        }

        /**
         * @return ensRegionId
         */
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private String ensRegionId; 
            private String instanceId; 

            /**
             * The ID of the node.
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public UnAllocationId build() {
                return new UnAllocationId(this);
            } 

        } 

    }
}
