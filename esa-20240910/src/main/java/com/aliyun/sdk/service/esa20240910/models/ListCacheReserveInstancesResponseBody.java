// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListCacheReserveInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListCacheReserveInstancesResponseBody</p>
 */
public class ListCacheReserveInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceInfo")
    private java.util.List < InstanceInfo> instanceInfo;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("TotalPage")
    private Integer totalPage;

    private ListCacheReserveInstancesResponseBody(Builder builder) {
        this.instanceInfo = builder.instanceInfo;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCacheReserveInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceInfo
     */
    public java.util.List < InstanceInfo> getInstanceInfo() {
        return this.instanceInfo;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return totalPage
     */
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static final class Builder {
        private java.util.List < InstanceInfo> instanceInfo; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private Integer totalPage; 

        /**
         * InstanceInfo.
         */
        public Builder instanceInfo(java.util.List < InstanceInfo> instanceInfo) {
            this.instanceInfo = instanceInfo;
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
         * <p>Id of the request</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * TotalPage.
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public ListCacheReserveInstancesResponseBody build() {
            return new ListCacheReserveInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCacheReserveInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCacheReserveInstancesResponseBody</p>
     */
    public static class InstanceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CacheReserveCapacity")
        private String cacheReserveCapacity;

        @com.aliyun.core.annotation.NameInMap("CacheReserveRegion")
        private String cacheReserveRegion;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Integer duration;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private InstanceInfo(Builder builder) {
            this.cacheReserveCapacity = builder.cacheReserveCapacity;
            this.cacheReserveRegion = builder.cacheReserveRegion;
            this.createTime = builder.createTime;
            this.duration = builder.duration;
            this.expireTime = builder.expireTime;
            this.instanceId = builder.instanceId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceInfo create() {
            return builder().build();
        }

        /**
         * @return cacheReserveCapacity
         */
        public String getCacheReserveCapacity() {
            return this.cacheReserveCapacity;
        }

        /**
         * @return cacheReserveRegion
         */
        public String getCacheReserveRegion() {
            return this.cacheReserveRegion;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return duration
         */
        public Integer getDuration() {
            return this.duration;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String cacheReserveCapacity; 
            private String cacheReserveRegion; 
            private String createTime; 
            private Integer duration; 
            private String expireTime; 
            private String instanceId; 
            private String status; 

            /**
             * CacheReserveCapacity.
             */
            public Builder cacheReserveCapacity(String cacheReserveCapacity) {
                this.cacheReserveCapacity = cacheReserveCapacity;
                return this;
            }

            /**
             * CacheReserveRegion.
             */
            public Builder cacheReserveRegion(String cacheReserveRegion) {
                this.cacheReserveRegion = cacheReserveRegion;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public InstanceInfo build() {
                return new InstanceInfo(this);
            } 

        } 

    }
}
