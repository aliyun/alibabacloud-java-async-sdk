// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The key of filter N. Only the image ID can be used to filter instance types. Valid values:</p>
         * <ul>
         * <li>imagId: image ID</li>
         * <li>filter: image ID</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>m-o6w3gy99qf89rkga****</p>
         */
        public Builder imageId(String imageId) {
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>{
         *     &quot;RequestId&quot;: &quot;CF661E2D-4AFE-4BCD-959A-A65E14416B44&quot;,
         *     &quot;RegionId&quot;: &quot;cn-hangzhou&quot;,
         *     &quot;ImageId&quot;: &quot;ubuntu_16_0402_64_20G_alibase_20180409.vhd&quot;,
         *     &quot;InstanceTypes&quot;: {
         *         &quot;InstanceType&quot;: [{
         *             &quot;InstanceTypeId&quot;: &quot;ecs.t1.xsmall&quot;,
         *             &quot;CpuCoreCount&quot;: 1,
         *             &quot;MemorySize&quot;: 0.5,
         *             &quot;InstanceTypeFamily&quot;: &quot;ecs.t1&quot;
         *         },
         *         {
         *             &quot;InstanceTypeId&quot;: &quot;ecs.t1.small&quot;,
         *             &quot;CpuCoreCount&quot;: 1,
         *             &quot;MemorySize&quot;: 1,
         *             &quot;InstanceTypeFamily&quot;: &quot;ecs.t1&quot;
         *         }]
         *     }
         * }</p>
         */
        public Builder instanceTypes(InstanceTypes instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }

        /**
         * <p>{
         *     &quot;RequestId&quot;: &quot;CF661E2D-4AFE-4BCD-959A-A65E14416B44&quot;,
         *     &quot;RegionId&quot;: &quot;cn-hangzhou&quot;,
         *     &quot;ImageId&quot;: &quot;ubuntu_16_0402_64_20G_alibase_20180409.vhd&quot;,
         *     &quot;InstanceTypes&quot;: {
         *         &quot;InstanceType&quot;: [{
         *             &quot;InstanceTypeId&quot;: &quot;ecs.t1.xsmall&quot;,
         *             &quot;CpuCoreCount&quot;: 1,
         *             &quot;MemorySize&quot;: 0.5,
         *             &quot;InstanceTypeFamily&quot;: &quot;ecs.t1&quot;
         *         },
         *         {
         *             &quot;InstanceTypeId&quot;: &quot;ecs.t1.small&quot;,
         *             &quot;CpuCoreCount&quot;: 1,
         *             &quot;MemorySize&quot;: 1,
         *             &quot;InstanceTypeFamily&quot;: &quot;ecs.t1&quot;
         *         }]
         *     }
         * }</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeImageSupportInstanceTypesResponseBody build() {
            return new DescribeImageSupportInstanceTypesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeImageSupportInstanceTypesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImageSupportInstanceTypesResponseBody</p>
     */
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
             * <p>The number of vCPUs of the instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder cpuCoreCount(Integer cpuCoreCount) {
                this.cpuCoreCount = cpuCoreCount;
                return this;
            }

            /**
             * <p>DescribeImageSupportInstanceTypes</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.t1</p>
             */
            public Builder instanceTypeFamily(String instanceTypeFamily) {
                this.instanceTypeFamily = instanceTypeFamily;
                return this;
            }

            /**
             * <p>Queries the instance types supported by an image.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.t1.xsmall</p>
             */
            public Builder instanceTypeId(String instanceTypeId) {
                this.instanceTypeId = instanceTypeId;
                return this;
            }

            /**
             * <p>The memory size of the instance type. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
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
    /**
     * 
     * {@link DescribeImageSupportInstanceTypesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImageSupportInstanceTypesResponseBody</p>
     */
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
