// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The list of created nodes.</p>
         */
        public Builder allocationId(java.util.List < AllocationId> allocationId) {
            this.allocationId = allocationId;
            return this;
        }

        /**
         * <p>The success status code.</p>
         * <ul>
         * <li><strong>PartSuccess</strong>: partially succeeded.</li>
         * <li><strong>AllSuccess</strong>: all succeeded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AllSuccess</p>
         */
        public Builder bizStatusCode(String bizStatusCode) {
            this.bizStatusCode = bizStatusCode;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EA3758E0-8899-17D3-9526-5F62CF33A586</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of nodes that are not created.</p>
         */
        public Builder unAllocationId(java.util.List < UnAllocationId> unAllocationId) {
            this.unAllocationId = unAllocationId;
            return this;
        }

        public CreateStorageGatewayResponseBody build() {
            return new CreateStorageGatewayResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateStorageGatewayResponseBody} extends {@link TeaModel}
     *
     * <p>CreateStorageGatewayResponseBody</p>
     */
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
             * <p>The ID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-chengdu-telecom-4</p>
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>e426409223</p>
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
    /**
     * 
     * {@link CreateStorageGatewayResponseBody} extends {@link TeaModel}
     *
     * <p>CreateStorageGatewayResponseBody</p>
     */
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
             * <p>The ID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-chengdu-26</p>
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>e426409258</p>
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
