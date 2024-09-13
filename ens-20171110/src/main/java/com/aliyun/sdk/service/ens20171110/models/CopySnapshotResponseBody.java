// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CopySnapshotResponseBody} extends {@link TeaModel}
 *
 * <p>CopySnapshotResponseBody</p>
 */
public class CopySnapshotResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AllocationId")
    private java.util.List < AllocationId> allocationId;

    @com.aliyun.core.annotation.NameInMap("BizStatusCode")
    private String bizStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UnAllocationId")
    private java.util.List < UnAllocationId> unAllocationId;

    private CopySnapshotResponseBody(Builder builder) {
        this.allocationId = builder.allocationId;
        this.bizStatusCode = builder.bizStatusCode;
        this.requestId = builder.requestId;
        this.unAllocationId = builder.unAllocationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CopySnapshotResponseBody create() {
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
         * The list of created snapshots.
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

        public CopySnapshotResponseBody build() {
            return new CopySnapshotResponseBody(this);
        } 

    } 

    public static class AllocationId extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnsRegionId")
        private String ensRegionId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private java.util.List < String > instanceId;

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
        public java.util.List < String > getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private String ensRegionId; 
            private java.util.List < String > instanceId; 

            /**
             * The ID of the node.
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            /**
             * The IDs of the instances.
             */
            public Builder instanceId(java.util.List < String > instanceId) {
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

        private UnAllocationId(Builder builder) {
            this.ensRegionId = builder.ensRegionId;
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

        public static final class Builder {
            private String ensRegionId; 

            /**
             * The ID of the node.
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            public UnAllocationId build() {
                return new UnAllocationId(this);
            } 

        } 

    }
}
