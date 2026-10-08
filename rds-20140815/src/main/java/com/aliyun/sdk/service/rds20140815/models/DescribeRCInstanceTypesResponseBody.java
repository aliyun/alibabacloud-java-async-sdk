// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeRCInstanceTypesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRCInstanceTypesResponseBody</p>
 */
public class DescribeRCInstanceTypesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceTypes")
    private InstanceTypes instanceTypes;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeRCInstanceTypesResponseBody(Builder builder) {
        this.instanceTypes = builder.instanceTypes;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRCInstanceTypesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceTypes
     */
    public InstanceTypes getInstanceTypes() {
        return this.instanceTypes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private InstanceTypes instanceTypes; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeRCInstanceTypesResponseBody model) {
            this.instanceTypes = model.instanceTypes;
            this.requestId = model.requestId;
        } 

        /**
         * InstanceTypes.
         */
        public Builder instanceTypes(InstanceTypes instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRCInstanceTypesResponseBody build() {
            return new DescribeRCInstanceTypesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRCInstanceTypesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRCInstanceTypesResponseBody</p>
     */
    public static class InstanceType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CpuCoreCount")
        private Integer cpuCoreCount;

        @com.aliyun.core.annotation.NameInMap("DiskQuantity")
        private Long diskQuantity;

        @com.aliyun.core.annotation.NameInMap("InstanceTypeFamily")
        private String instanceTypeFamily;

        @com.aliyun.core.annotation.NameInMap("InstanceTypeId")
        private String instanceTypeId;

        @com.aliyun.core.annotation.NameInMap("JumboFrameSupport")
        private Boolean jumboFrameSupport;

        @com.aliyun.core.annotation.NameInMap("MemorySize")
        private Integer memorySize;

        private InstanceType(Builder builder) {
            this.cpuCoreCount = builder.cpuCoreCount;
            this.diskQuantity = builder.diskQuantity;
            this.instanceTypeFamily = builder.instanceTypeFamily;
            this.instanceTypeId = builder.instanceTypeId;
            this.jumboFrameSupport = builder.jumboFrameSupport;
            this.memorySize = builder.memorySize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceType create() {
            return builder().build();
        }

        /**
         * @return cpuCoreCount
         */
        public Integer getCpuCoreCount() {
            return this.cpuCoreCount;
        }

        /**
         * @return diskQuantity
         */
        public Long getDiskQuantity() {
            return this.diskQuantity;
        }

        /**
         * @return instanceTypeFamily
         */
        public String getInstanceTypeFamily() {
            return this.instanceTypeFamily;
        }

        /**
         * @return instanceTypeId
         */
        public String getInstanceTypeId() {
            return this.instanceTypeId;
        }

        /**
         * @return jumboFrameSupport
         */
        public Boolean getJumboFrameSupport() {
            return this.jumboFrameSupport;
        }

        /**
         * @return memorySize
         */
        public Integer getMemorySize() {
            return this.memorySize;
        }

        public static final class Builder {
            private Integer cpuCoreCount; 
            private Long diskQuantity; 
            private String instanceTypeFamily; 
            private String instanceTypeId; 
            private Boolean jumboFrameSupport; 
            private Integer memorySize; 

            private Builder() {
            } 

            private Builder(InstanceType model) {
                this.cpuCoreCount = model.cpuCoreCount;
                this.diskQuantity = model.diskQuantity;
                this.instanceTypeFamily = model.instanceTypeFamily;
                this.instanceTypeId = model.instanceTypeId;
                this.jumboFrameSupport = model.jumboFrameSupport;
                this.memorySize = model.memorySize;
            } 

            /**
             * CpuCoreCount.
             */
            public Builder cpuCoreCount(Integer cpuCoreCount) {
                this.cpuCoreCount = cpuCoreCount;
                return this;
            }

            /**
             * DiskQuantity.
             */
            public Builder diskQuantity(Long diskQuantity) {
                this.diskQuantity = diskQuantity;
                return this;
            }

            /**
             * InstanceTypeFamily.
             */
            public Builder instanceTypeFamily(String instanceTypeFamily) {
                this.instanceTypeFamily = instanceTypeFamily;
                return this;
            }

            /**
             * InstanceTypeId.
             */
            public Builder instanceTypeId(String instanceTypeId) {
                this.instanceTypeId = instanceTypeId;
                return this;
            }

            /**
             * JumboFrameSupport.
             */
            public Builder jumboFrameSupport(Boolean jumboFrameSupport) {
                this.jumboFrameSupport = jumboFrameSupport;
                return this;
            }

            /**
             * MemorySize.
             */
            public Builder memorySize(Integer memorySize) {
                this.memorySize = memorySize;
                return this;
            }

            public InstanceType build() {
                return new InstanceType(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRCInstanceTypesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRCInstanceTypesResponseBody</p>
     */
    public static class InstanceTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private java.util.List<InstanceType> instanceType;

        private InstanceTypes(Builder builder) {
            this.instanceType = builder.instanceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceTypes create() {
            return builder().build();
        }

        /**
         * @return instanceType
         */
        public java.util.List<InstanceType> getInstanceType() {
            return this.instanceType;
        }

        public static final class Builder {
            private java.util.List<InstanceType> instanceType; 

            private Builder() {
            } 

            private Builder(InstanceTypes model) {
                this.instanceType = model.instanceType;
            } 

            /**
             * InstanceType.
             */
            public Builder instanceType(java.util.List<InstanceType> instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            public InstanceTypes build() {
                return new InstanceTypes(this);
            } 

        } 

    }
}
