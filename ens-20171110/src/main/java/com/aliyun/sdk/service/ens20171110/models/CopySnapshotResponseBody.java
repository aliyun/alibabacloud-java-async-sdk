// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link CopySnapshotResponseBody} extends {@link TeaModel}
 *
 * <p>CopySnapshotResponseBody</p>
 */
public class CopySnapshotResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AllocationId")
    private java.util.List<AllocationId> allocationId;

    @com.aliyun.core.annotation.NameInMap("BizStatusCode")
    private String bizStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UnAllocationId")
    private java.util.List<UnAllocationId> unAllocationId;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allocationId
     */
    public java.util.List<AllocationId> getAllocationId() {
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
    public java.util.List<UnAllocationId> getUnAllocationId() {
        return this.unAllocationId;
    }

    public static final class Builder {
        private java.util.List<AllocationId> allocationId; 
        private String bizStatusCode; 
        private String requestId; 
        private java.util.List<UnAllocationId> unAllocationId; 

        private Builder() {
        } 

        private Builder(CopySnapshotResponseBody model) {
            this.allocationId = model.allocationId;
            this.bizStatusCode = model.bizStatusCode;
            this.requestId = model.requestId;
            this.unAllocationId = model.unAllocationId;
        } 

        /**
         * <p>The list of created snapshots.</p>
         */
        public Builder allocationId(java.util.List<AllocationId> allocationId) {
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
        public Builder unAllocationId(java.util.List<UnAllocationId> unAllocationId) {
            this.unAllocationId = unAllocationId;
            return this;
        }

        public CopySnapshotResponseBody build() {
            return new CopySnapshotResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CopySnapshotResponseBody} extends {@link TeaModel}
     *
     * <p>CopySnapshotResponseBody</p>
     */
    public static class AllocationId extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnsRegionId")
        private String ensRegionId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private java.util.List<String> instanceId;

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
        public java.util.List<String> getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private String ensRegionId; 
            private java.util.List<String> instanceId; 

            private Builder() {
            } 

            private Builder(AllocationId model) {
                this.ensRegionId = model.ensRegionId;
                this.instanceId = model.instanceId;
            } 

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
             * <p>The IDs of the instances.</p>
             */
            public Builder instanceId(java.util.List<String> instanceId) {
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
     * {@link CopySnapshotResponseBody} extends {@link TeaModel}
     *
     * <p>CopySnapshotResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(UnAllocationId model) {
                this.ensRegionId = model.ensRegionId;
            } 

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

            public UnAllocationId build() {
                return new UnAllocationId(this);
            } 

        } 

    }
}
