// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageSupportInstanceTypesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageSupportInstanceTypesResponseBody</p>
 */
public class DescribeImageSupportInstanceTypesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.NameInMap("InstanceTypes")
    private InstanceTypes instanceTypes;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeImageSupportInstanceTypesResponseBody(Builder builder) {
        this.imageId = builder.imageId;
        this.instanceTypes = builder.instanceTypes;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageSupportInstanceTypesResponseBody create() {
        return builder().build();
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return instanceTypes
     */
    public InstanceTypes getInstanceTypes() {
        return this.instanceTypes;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String imageId; 
        private InstanceTypes instanceTypes; 
        private String regionId; 
        private String requestId; 

        /**
         * The key of filter N. Only the image ID can be used to filter instance types. Valid values:
         * <p>
         * 
         * *   imagId: image ID
         * *   filter: image ID
         */
        public Builder imageId(String imageId) {
            this.imageId = imageId;
            return this;
        }

        /**
         * {
         * <p>
         *     "RequestId": "CF661E2D-4AFE-4BCD-959A-A65E14416B44",
         *     "RegionId": "cn-hangzhou",
         *     "ImageId": "ubuntu_16_0402_64_20G_alibase_20180409.vhd",
         *     "InstanceTypes": {
         *         "InstanceType": [{
         *             "InstanceTypeId": "ecs.t1.xsmall",
         *             "CpuCoreCount": 1,
         *             "MemorySize": 0.5,
         *             "InstanceTypeFamily": "ecs.t1"
         *         },
         *         {
         *             "InstanceTypeId": "ecs.t1.small",
         *             "CpuCoreCount": 1,
         *             "MemorySize": 1,
         *             "InstanceTypeFamily": "ecs.t1"
         *         }]
         *     }
         * }
         */
        public Builder instanceTypes(InstanceTypes instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }

        /**
         * {
         * <p>
         *     "RequestId": "CF661E2D-4AFE-4BCD-959A-A65E14416B44",
         *     "RegionId": "cn-hangzhou",
         *     "ImageId": "ubuntu_16_0402_64_20G_alibase_20180409.vhd",
         *     "InstanceTypes": {
         *         "InstanceType": [{
         *             "InstanceTypeId": "ecs.t1.xsmall",
         *             "CpuCoreCount": 1,
         *             "MemorySize": 0.5,
         *             "InstanceTypeFamily": "ecs.t1"
         *         },
         *         {
         *             "InstanceTypeId": "ecs.t1.small",
         *             "CpuCoreCount": 1,
         *             "MemorySize": 1,
         *             "InstanceTypeFamily": "ecs.t1"
         *         }]
         *     }
         * }
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeImageSupportInstanceTypesResponseBody build() {
            return new DescribeImageSupportInstanceTypesResponseBody(this);
        } 

    } 

    public static class InstanceType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CpuCoreCount")
        private Integer cpuCoreCount;

        @com.aliyun.core.annotation.NameInMap("InstanceTypeFamily")
        private String instanceTypeFamily;

        @com.aliyun.core.annotation.NameInMap("InstanceTypeId")
        private String instanceTypeId;

        @com.aliyun.core.annotation.NameInMap("MemorySize")
        private Float memorySize;

        private InstanceType(Builder builder) {
            this.cpuCoreCount = builder.cpuCoreCount;
            this.instanceTypeFamily = builder.instanceTypeFamily;
            this.instanceTypeId = builder.instanceTypeId;
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
         * @return memorySize
         */
        public Float getMemorySize() {
            return this.memorySize;
        }

        public static final class Builder {
            private Integer cpuCoreCount; 
            private String instanceTypeFamily; 
            private String instanceTypeId; 
            private Float memorySize; 

            /**
             * The number of vCPUs of the instance type.
             */
            public Builder cpuCoreCount(Integer cpuCoreCount) {
                this.cpuCoreCount = cpuCoreCount;
                return this;
            }

            /**
             * DescribeImageSupportInstanceTypes
             */
            public Builder instanceTypeFamily(String instanceTypeFamily) {
                this.instanceTypeFamily = instanceTypeFamily;
                return this;
            }

            /**
             * Queries the instance types supported by an image.
             */
            public Builder instanceTypeId(String instanceTypeId) {
                this.instanceTypeId = instanceTypeId;
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
        @com.aliyun.core.annotation.NameInMap("InstanceType")
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
