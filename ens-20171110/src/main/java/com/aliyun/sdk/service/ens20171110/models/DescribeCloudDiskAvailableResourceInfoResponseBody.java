// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeCloudDiskAvailableResourceInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCloudDiskAvailableResourceInfoResponseBody</p>
 */
public class DescribeCloudDiskAvailableResourceInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SupportResources")
    private SupportResources supportResources;

    private DescribeCloudDiskAvailableResourceInfoResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.supportResources = builder.supportResources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudDiskAvailableResourceInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return supportResources
     */
    public SupportResources getSupportResources() {
        return this.supportResources;
    }

    public static final class Builder {
        private String requestId; 
        private SupportResources supportResources; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0AE4F26E-7527-569F-A987-E3CF269A3C11</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The specifications of resources that you can purchase.</p>
         */
        public Builder supportResources(SupportResources supportResources) {
            this.supportResources = supportResources;
            return this;
        }

        public DescribeCloudDiskAvailableResourceInfoResponseBody build() {
            return new DescribeCloudDiskAvailableResourceInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCloudDiskAvailableResourceInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudDiskAvailableResourceInfoResponseBody</p>
     */
    public static class SupportResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CanBuyCount")
        private Long canBuyCount;

        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("DefaultDiskSize")
        private Long defaultDiskSize;

        @com.aliyun.core.annotation.NameInMap("DiskMaxSize")
        private Long diskMaxSize;

        @com.aliyun.core.annotation.NameInMap("DiskMinSize")
        private Long diskMinSize;

        @com.aliyun.core.annotation.NameInMap("EnsRegionId")
        private String ensRegionId;

        @com.aliyun.core.annotation.NameInMap("EnsRegionName")
        private String ensRegionName;

        private SupportResource(Builder builder) {
            this.canBuyCount = builder.canBuyCount;
            this.category = builder.category;
            this.defaultDiskSize = builder.defaultDiskSize;
            this.diskMaxSize = builder.diskMaxSize;
            this.diskMinSize = builder.diskMinSize;
            this.ensRegionId = builder.ensRegionId;
            this.ensRegionName = builder.ensRegionName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportResource create() {
            return builder().build();
        }

        /**
         * @return canBuyCount
         */
        public Long getCanBuyCount() {
            return this.canBuyCount;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return defaultDiskSize
         */
        public Long getDefaultDiskSize() {
            return this.defaultDiskSize;
        }

        /**
         * @return diskMaxSize
         */
        public Long getDiskMaxSize() {
            return this.diskMaxSize;
        }

        /**
         * @return diskMinSize
         */
        public Long getDiskMinSize() {
            return this.diskMinSize;
        }

        /**
         * @return ensRegionId
         */
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        /**
         * @return ensRegionName
         */
        public String getEnsRegionName() {
            return this.ensRegionName;
        }

        public static final class Builder {
            private Long canBuyCount; 
            private String category; 
            private Long defaultDiskSize; 
            private Long diskMaxSize; 
            private Long diskMinSize; 
            private String ensRegionId; 
            private String ensRegionName; 

            /**
             * <p>The number of disks that you can purchase.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder canBuyCount(Long canBuyCount) {
                this.canBuyCount = canBuyCount;
                return this;
            }

            /**
             * <p>The type of the disk.</p>
             * <ul>
             * <li>cloud_efficiency: ultra disk.</li>
             * <li>cloud_ssd: all-flash disk.</li>
             * <li>local_hdd: local HDD.</li>
             * <li>local_ssd: local SSD.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cloud_ssd</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The default size of the disk. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder defaultDiskSize(Long defaultDiskSize) {
                this.defaultDiskSize = defaultDiskSize;
                return this;
            }

            /**
             * <p>The maximum size of the disk. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder diskMaxSize(Long diskMaxSize) {
                this.diskMaxSize = diskMaxSize;
                return this;
            }

            /**
             * <p>The minimum size of the disk size. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder diskMinSize(Long diskMinSize) {
                this.diskMinSize = diskMinSize;
                return this;
            }

            /**
             * <p>The ID of the edge node.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing-cmcc</p>
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            /**
             * <p>The name of the task node.</p>
             * 
             * <strong>example:</strong>
             * <p>Beijing Mobile</p>
             */
            public Builder ensRegionName(String ensRegionName) {
                this.ensRegionName = ensRegionName;
                return this;
            }

            public SupportResource build() {
                return new SupportResource(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCloudDiskAvailableResourceInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudDiskAvailableResourceInfoResponseBody</p>
     */
    public static class SupportResources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SupportResource")
        private java.util.List < SupportResource> supportResource;

        private SupportResources(Builder builder) {
            this.supportResource = builder.supportResource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportResources create() {
            return builder().build();
        }

        /**
         * @return supportResource
         */
        public java.util.List < SupportResource> getSupportResource() {
            return this.supportResource;
        }

        public static final class Builder {
            private java.util.List < SupportResource> supportResource; 

            /**
             * SupportResource.
             */
            public Builder supportResource(java.util.List < SupportResource> supportResource) {
                this.supportResource = supportResource;
                return this;
            }

            public SupportResources build() {
                return new SupportResources(this);
            } 

        } 

    }
}
