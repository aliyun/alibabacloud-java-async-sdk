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
 * {@link CreateFileSystemResponseBody} extends {@link TeaModel}
 *
 * <p>CreateFileSystemResponseBody</p>
 */
public class CreateFileSystemResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AllocationId")
    private java.util.List<String> allocationId;

    @com.aliyun.core.annotation.NameInMap("AllocationIds")
    private java.util.List<AllocationIds> allocationIds;

    @com.aliyun.core.annotation.NameInMap("BizStatusCode")
    private String bizStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UnAllocationId")
    private java.util.List<String> unAllocationId;

    private CreateFileSystemResponseBody(Builder builder) {
        this.allocationId = builder.allocationId;
        this.allocationIds = builder.allocationIds;
        this.bizStatusCode = builder.bizStatusCode;
        this.requestId = builder.requestId;
        this.unAllocationId = builder.unAllocationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFileSystemResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allocationId
     */
    public java.util.List<String> getAllocationId() {
        return this.allocationId;
    }

    /**
     * @return allocationIds
     */
    public java.util.List<AllocationIds> getAllocationIds() {
        return this.allocationIds;
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
    public java.util.List<String> getUnAllocationId() {
        return this.unAllocationId;
    }

    public static final class Builder {
        private java.util.List<String> allocationId; 
        private java.util.List<AllocationIds> allocationIds; 
        private String bizStatusCode; 
        private String requestId; 
        private java.util.List<String> unAllocationId; 

        private Builder() {
        } 

        private Builder(CreateFileSystemResponseBody model) {
            this.allocationId = model.allocationId;
            this.allocationIds = model.allocationIds;
            this.bizStatusCode = model.bizStatusCode;
            this.requestId = model.requestId;
            this.unAllocationId = model.unAllocationId;
        } 

        /**
         * <p>The file systems that are created.</p>
         */
        public Builder allocationId(java.util.List<String> allocationId) {
            this.allocationId = allocationId;
            return this;
        }

        /**
         * <p>The list of instance allocation information for the file system across ENS edge zones.</p>
         */
        public Builder allocationIds(java.util.List<AllocationIds> allocationIds) {
            this.allocationIds = allocationIds;
            return this;
        }

        /**
         * <p>The status code that indicates the result. Valid values:  </p>
         * <ul>
         * <li>PartSuccess: partially successful.</li>
         * <li>AllSuccess: all successful.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PartSuccess</p>
         */
        public Builder bizStatusCode(String bizStatusCode) {
            this.bizStatusCode = bizStatusCode;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4EC47282-1B74-4534-BD0E-403F3EE64CAF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The file systems that failed to be created.</p>
         */
        public Builder unAllocationId(java.util.List<String> unAllocationId) {
            this.unAllocationId = unAllocationId;
            return this;
        }

        public CreateFileSystemResponseBody build() {
            return new CreateFileSystemResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateFileSystemResponseBody} extends {@link TeaModel}
     *
     * <p>CreateFileSystemResponseBody</p>
     */
    public static class AllocationIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnsRegionId")
        private String ensRegionId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        private AllocationIds(Builder builder) {
            this.ensRegionId = builder.ensRegionId;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AllocationIds create() {
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

            private Builder() {
            } 

            private Builder(AllocationIds model) {
                this.ensRegionId = model.ensRegionId;
                this.instanceId = model.instanceId;
            } 

            /**
             * <p>The ENS edge zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-cm</p>
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>i-5s7xxxxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public AllocationIds build() {
                return new AllocationIds(this);
            } 

        } 

    }
}
