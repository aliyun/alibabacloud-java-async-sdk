// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageSupportInstanceTypesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageSupportInstanceTypesResponseBody</p>
 */
public class DescribeImageSupportInstanceTypesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ImageId")
    private String imageId;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("InstanceTypes")
    private InstanceTypes instanceTypes;

    private DescribeImageSupportInstanceTypesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.imageId = builder.imageId;
        this.regionId = builder.regionId;
        this.instanceTypes = builder.instanceTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageSupportInstanceTypesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return instanceTypes
     */
    public InstanceTypes getInstanceTypes() {
        return this.instanceTypes;
    }

    public static final class Builder {
        private String requestId; 
        private String imageId; 
        private String regionId; 
        private InstanceTypes instanceTypes; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the queried image.
         */
        public Builder imageId(String imageId) {
            this.imageId = imageId;
            return this;
        }

        /**
         * The ID of the region to which the image belongs.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * A collection of instance types consisting of InstanceTypeItemType.
         */
        public Builder instanceTypes(InstanceTypes instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }

        public DescribeImageSupportInstanceTypesResponseBody build() {
            return new DescribeImageSupportInstanceTypesResponseBody(this);
        } 

    } 

    public static class InstanceType extends TeaModel {
        @NameInMap("InstanceTypeId")
        private String instanceTypeId;

        @NameInMap("InstanceTypeFamily")
        private String instanceTypeFamily;

        @NameInMap("CpuCoreCount")
        private Integer cpuCoreCount;

        @NameInMap("MemorySize")
        private Float memorySize;

        private InstanceType(Builder builder) {
            this.instanceTypeId = builder.instanceTypeId;
            this.instanceTypeFamily = builder.instanceTypeFamily;
            this.cpuCoreCount = builder.cpuCoreCount;
            this.memorySize = builder.memorySize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceType create() {
            return builder().build();
        }

        /**
         * @return instanceTypeId
         */
        public String getInstanceTypeId() {
            return this.instanceTypeId;
        }

        /**
         * @return instanceTypeFamily
         */
        public String getInstanceTypeFamily() {
            return this.instanceTypeFamily;
        }

        /**
         * @return cpuCoreCount
         */
        public Integer getCpuCoreCount() {
            return this.cpuCoreCount;
        }

        /**
         * @return memorySize
         */
        public Float getMemorySize() {
            return this.memorySize;
        }

        public static final class Builder {
            private String instanceTypeId; 
            private String instanceTypeFamily; 
            private Integer cpuCoreCount; 
            private Float memorySize; 

            /**
             * The ID of the instance type supported by the image.
             */
            public Builder instanceTypeId(String instanceTypeId) {
                this.instanceTypeId = instanceTypeId;
                return this;
            }

            /**
             * The instance type family.
             */
            public Builder instanceTypeFamily(String instanceTypeFamily) {
                this.instanceTypeFamily = instanceTypeFamily;
                return this;
            }

            /**
             * The number of vCPU cores of the instance type.
             */
            public Builder cpuCoreCount(Integer cpuCoreCount) {
                this.cpuCoreCount = cpuCoreCount;
                return this;
            }

            /**
             * The memory size of the instance type. Unit: GiB.
             */
            public Builder memorySize(Float memorySize) {
                this.memorySize = memorySize;
                return this;
            }

            public InstanceType build() {
                return new InstanceType(this);
            } 

        } 

    }
    public static class InstanceTypes extends TeaModel {
        @NameInMap("InstanceType")
        private java.util.List < InstanceType> instanceType;

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
        public java.util.List < InstanceType> getInstanceType() {
            return this.instanceType;
        }

        public static final class Builder {
            private java.util.List < InstanceType> instanceType; 

            /**
             * InstanceType.
             */
            public Builder instanceType(java.util.List < InstanceType> instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            public InstanceTypes build() {
                return new InstanceTypes(this);
            } 

        } 

    }
}
