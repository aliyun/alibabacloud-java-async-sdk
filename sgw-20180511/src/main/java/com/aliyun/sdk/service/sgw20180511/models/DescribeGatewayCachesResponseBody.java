// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGatewayCachesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGatewayCachesResponseBody</p>
 */
public class DescribeGatewayCachesResponseBody extends TeaModel {
    @NameInMap("Caches")
    private Caches caches;

    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeGatewayCachesResponseBody(Builder builder) {
        this.caches = builder.caches;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGatewayCachesResponseBody create() {
        return builder().build();
    }

    /**
     * @return caches
     */
    public Caches getCaches() {
        return this.caches;
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

    public static final class Builder {
        private Caches caches; 
        private String code; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Caches.
         */
        public Builder caches(Caches caches) {
            this.caches = caches;
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

        public DescribeGatewayCachesResponseBody build() {
            return new DescribeGatewayCachesResponseBody(this);
        } 

    } 

    public static class Cache extends TeaModel {
        @NameInMap("BuyURL")
        private String buyURL;

        @NameInMap("CacheId")
        private String cacheId;

        @NameInMap("CacheType")
        private String cacheType;

        @NameInMap("ExpireStatus")
        private Integer expireStatus;

        @NameInMap("ExpiredTime")
        private Long expiredTime;

        @NameInMap("Iops")
        private Long iops;

        @NameInMap("IsDirectExpand")
        private String isDirectExpand;

        @NameInMap("IsNoPartition")
        private Boolean isNoPartition;

        @NameInMap("IsUsed")
        private Boolean isUsed;

        @NameInMap("LocalFilePath")
        private String localFilePath;

        @NameInMap("PerformanceLevel")
        private String performanceLevel;

        @NameInMap("RenewURL")
        private String renewURL;

        @NameInMap("SizeInGB")
        private Long sizeInGB;

        @NameInMap("SubscriptionInstanceId")
        private String subscriptionInstanceId;

        private Cache(Builder builder) {
            this.buyURL = builder.buyURL;
            this.cacheId = builder.cacheId;
            this.cacheType = builder.cacheType;
            this.expireStatus = builder.expireStatus;
            this.expiredTime = builder.expiredTime;
            this.iops = builder.iops;
            this.isDirectExpand = builder.isDirectExpand;
            this.isNoPartition = builder.isNoPartition;
            this.isUsed = builder.isUsed;
            this.localFilePath = builder.localFilePath;
            this.performanceLevel = builder.performanceLevel;
            this.renewURL = builder.renewURL;
            this.sizeInGB = builder.sizeInGB;
            this.subscriptionInstanceId = builder.subscriptionInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cache create() {
            return builder().build();
        }

        /**
         * @return buyURL
         */
        public String getBuyURL() {
            return this.buyURL;
        }

        /**
         * @return cacheId
         */
        public String getCacheId() {
            return this.cacheId;
        }

        /**
         * @return cacheType
         */
        public String getCacheType() {
            return this.cacheType;
        }

        /**
         * @return expireStatus
         */
        public Integer getExpireStatus() {
            return this.expireStatus;
        }

        /**
         * @return expiredTime
         */
        public Long getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return iops
         */
        public Long getIops() {
            return this.iops;
        }

        /**
         * @return isDirectExpand
         */
        public String getIsDirectExpand() {
            return this.isDirectExpand;
        }

        /**
         * @return isNoPartition
         */
        public Boolean getIsNoPartition() {
            return this.isNoPartition;
        }

        /**
         * @return isUsed
         */
        public Boolean getIsUsed() {
            return this.isUsed;
        }

        /**
         * @return localFilePath
         */
        public String getLocalFilePath() {
            return this.localFilePath;
        }

        /**
         * @return performanceLevel
         */
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        /**
         * @return renewURL
         */
        public String getRenewURL() {
            return this.renewURL;
        }

        /**
         * @return sizeInGB
         */
        public Long getSizeInGB() {
            return this.sizeInGB;
        }

        /**
         * @return subscriptionInstanceId
         */
        public String getSubscriptionInstanceId() {
            return this.subscriptionInstanceId;
        }

        public static final class Builder {
            private String buyURL; 
            private String cacheId; 
            private String cacheType; 
            private Integer expireStatus; 
            private Long expiredTime; 
            private Long iops; 
            private String isDirectExpand; 
            private Boolean isNoPartition; 
            private Boolean isUsed; 
            private String localFilePath; 
            private String performanceLevel; 
            private String renewURL; 
            private Long sizeInGB; 
            private String subscriptionInstanceId; 

            /**
             * BuyURL.
             */
            public Builder buyURL(String buyURL) {
                this.buyURL = buyURL;
                return this;
            }

            /**
             * CacheId.
             */
            public Builder cacheId(String cacheId) {
                this.cacheId = cacheId;
                return this;
            }

            /**
             * CacheType.
             */
            public Builder cacheType(String cacheType) {
                this.cacheType = cacheType;
                return this;
            }

            /**
             * ExpireStatus.
             */
            public Builder expireStatus(Integer expireStatus) {
                this.expireStatus = expireStatus;
                return this;
            }

            /**
             * ExpiredTime.
             */
            public Builder expiredTime(Long expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * IOPS。
             */
            public Builder iops(Long iops) {
                this.iops = iops;
                return this;
            }

            /**
             * IsDirectExpand.
             */
            public Builder isDirectExpand(String isDirectExpand) {
                this.isDirectExpand = isDirectExpand;
                return this;
            }

            /**
             * IsNoPartition.
             */
            public Builder isNoPartition(Boolean isNoPartition) {
                this.isNoPartition = isNoPartition;
                return this;
            }

            /**
             * IsUsed.
             */
            public Builder isUsed(Boolean isUsed) {
                this.isUsed = isUsed;
                return this;
            }

            /**
             * LocalFilePath.
             */
            public Builder localFilePath(String localFilePath) {
                this.localFilePath = localFilePath;
                return this;
            }

            /**
             * PerformanceLevel.
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * RenewURL.
             */
            public Builder renewURL(String renewURL) {
                this.renewURL = renewURL;
                return this;
            }

            /**
             * SizeInGB.
             */
            public Builder sizeInGB(Long sizeInGB) {
                this.sizeInGB = sizeInGB;
                return this;
            }

            /**
             * SubscriptionInstanceId.
             */
            public Builder subscriptionInstanceId(String subscriptionInstanceId) {
                this.subscriptionInstanceId = subscriptionInstanceId;
                return this;
            }

            public Cache build() {
                return new Cache(this);
            } 

        } 

    }
    public static class Caches extends TeaModel {
        @NameInMap("Cache")
        private java.util.List < Cache> cache;

        private Caches(Builder builder) {
            this.cache = builder.cache;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Caches create() {
            return builder().build();
        }

        /**
         * @return cache
         */
        public java.util.List < Cache> getCache() {
            return this.cache;
        }

        public static final class Builder {
            private java.util.List < Cache> cache; 

            /**
             * Cache.
             */
            public Builder cache(java.util.List < Cache> cache) {
                this.cache = cache;
                return this;
            }

            public Caches build() {
                return new Caches(this);
            } 

        } 

    }
}
