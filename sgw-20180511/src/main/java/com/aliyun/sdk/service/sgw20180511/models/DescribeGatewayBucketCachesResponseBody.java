// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGatewayBucketCachesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGatewayBucketCachesResponseBody</p>
 */
public class DescribeGatewayBucketCachesResponseBody extends TeaModel {
    @NameInMap("BucketCaches")
    private BucketCaches bucketCaches;

    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeGatewayBucketCachesResponseBody(Builder builder) {
        this.bucketCaches = builder.bucketCaches;
        this.code = builder.code;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGatewayBucketCachesResponseBody create() {
        return builder().build();
    }

    /**
     * @return bucketCaches
     */
    public BucketCaches getBucketCaches() {
        return this.bucketCaches;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private BucketCaches bucketCaches; 
        private String code; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        /**
         * BucketCaches.
         */
        public Builder bucketCaches(BucketCaches bucketCaches) {
            this.bucketCaches = bucketCaches;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeGatewayBucketCachesResponseBody build() {
            return new DescribeGatewayBucketCachesResponseBody(this);
        } 

    } 

    public static class BucketCache extends TeaModel {
        @NameInMap("BucketName")
        private String bucketName;

        @NameInMap("CacheMode")
        private String cacheMode;

        @NameInMap("CacheStats")
        private String cacheStats;

        @NameInMap("Category")
        private String category;

        @NameInMap("GatewayId")
        private String gatewayId;

        @NameInMap("GatewayName")
        private String gatewayName;

        @NameInMap("Location")
        private String location;

        @NameInMap("MountPoint")
        private String mountPoint;

        @NameInMap("Protocol")
        private String protocol;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ShareName")
        private String shareName;

        @NameInMap("Type")
        private String type;

        @NameInMap("VpcCidr")
        private String vpcCidr;

        @NameInMap("VpcId")
        private String vpcId;

        private BucketCache(Builder builder) {
            this.bucketName = builder.bucketName;
            this.cacheMode = builder.cacheMode;
            this.cacheStats = builder.cacheStats;
            this.category = builder.category;
            this.gatewayId = builder.gatewayId;
            this.gatewayName = builder.gatewayName;
            this.location = builder.location;
            this.mountPoint = builder.mountPoint;
            this.protocol = builder.protocol;
            this.regionId = builder.regionId;
            this.shareName = builder.shareName;
            this.type = builder.type;
            this.vpcCidr = builder.vpcCidr;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BucketCache create() {
            return builder().build();
        }

        /**
         * @return bucketName
         */
        public String getBucketName() {
            return this.bucketName;
        }

        /**
         * @return cacheMode
         */
        public String getCacheMode() {
            return this.cacheMode;
        }

        /**
         * @return cacheStats
         */
        public String getCacheStats() {
            return this.cacheStats;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return gatewayId
         */
        public String getGatewayId() {
            return this.gatewayId;
        }

        /**
         * @return gatewayName
         */
        public String getGatewayName() {
            return this.gatewayName;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return mountPoint
         */
        public String getMountPoint() {
            return this.mountPoint;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return shareName
         */
        public String getShareName() {
            return this.shareName;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return vpcCidr
         */
        public String getVpcCidr() {
            return this.vpcCidr;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String bucketName; 
            private String cacheMode; 
            private String cacheStats; 
            private String category; 
            private String gatewayId; 
            private String gatewayName; 
            private String location; 
            private String mountPoint; 
            private String protocol; 
            private String regionId; 
            private String shareName; 
            private String type; 
            private String vpcCidr; 
            private String vpcId; 

            /**
             * BucketName.
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * CacheMode.
             */
            public Builder cacheMode(String cacheMode) {
                this.cacheMode = cacheMode;
                return this;
            }

            /**
             * CacheStats.
             */
            public Builder cacheStats(String cacheStats) {
                this.cacheStats = cacheStats;
                return this;
            }

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * GatewayId.
             */
            public Builder gatewayId(String gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * GatewayName.
             */
            public Builder gatewayName(String gatewayName) {
                this.gatewayName = gatewayName;
                return this;
            }

            /**
             * Location.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * MountPoint.
             */
            public Builder mountPoint(String mountPoint) {
                this.mountPoint = mountPoint;
                return this;
            }

            /**
             * Protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * ShareName.
             */
            public Builder shareName(String shareName) {
                this.shareName = shareName;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * VpcCidr.
             */
            public Builder vpcCidr(String vpcCidr) {
                this.vpcCidr = vpcCidr;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public BucketCache build() {
                return new BucketCache(this);
            } 

        } 

    }
    public static class BucketCaches extends TeaModel {
        @NameInMap("BucketCache")
        private java.util.List < BucketCache> bucketCache;

        private BucketCaches(Builder builder) {
            this.bucketCache = builder.bucketCache;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BucketCaches create() {
            return builder().build();
        }

        /**
         * @return bucketCache
         */
        public java.util.List < BucketCache> getBucketCache() {
            return this.bucketCache;
        }

        public static final class Builder {
            private java.util.List < BucketCache> bucketCache; 

            /**
             * BucketCache.
             */
            public Builder bucketCache(java.util.List < BucketCache> bucketCache) {
                this.bucketCache = bucketCache;
                return this;
            }

            public BucketCaches build() {
                return new BucketCaches(this);
            } 

        } 

    }
}
