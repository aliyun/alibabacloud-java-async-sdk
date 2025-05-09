// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link ListCacheReserveInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListCacheReserveInstancesResponseBody</p>
 */
public class ListCacheReserveInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceInfo")
    private java.util.List<InstanceInfo> instanceInfo;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceInfo
     */
    public java.util.List<InstanceInfo> getInstanceInfo() {
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
        private java.util.List<InstanceInfo> instanceInfo; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private Integer totalPage; 

        private Builder() {
        } 

        private Builder(ListCacheReserveInstancesResponseBody model) {
            this.instanceInfo = model.instanceInfo;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.totalPage = model.totalPage;
        } 

        /**
         * <p>The cache reserve instances.</p>
         */
        public Builder instanceInfo(java.util.List<InstanceInfo> instanceInfo) {
            this.instanceInfo = instanceInfo;
            return this;
        }

        /**
         * <p>Page number. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>Page size, default <strong>500</strong>, range: <strong>1~500</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>65C66B7B-671A-8297-9187-2R5477247B76</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Total count.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>Total pages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
        private Long cacheReserveCapacity;

        @com.aliyun.core.annotation.NameInMap("CacheReserveRegion")
        private String cacheReserveRegion;

        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

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
            this.chargeType = builder.chargeType;
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
        public Long getCacheReserveCapacity() {
            return this.cacheReserveCapacity;
        }

        /**
         * @return cacheReserveRegion
         */
        public String getCacheReserveRegion() {
            return this.cacheReserveRegion;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
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
            private Long cacheReserveCapacity; 
            private String cacheReserveRegion; 
            private String chargeType; 
            private String createTime; 
            private Integer duration; 
            private String expireTime; 
            private String instanceId; 
            private String status; 

            private Builder() {
            } 

            private Builder(InstanceInfo model) {
                this.cacheReserveCapacity = model.cacheReserveCapacity;
                this.cacheReserveRegion = model.cacheReserveRegion;
                this.chargeType = model.chargeType;
                this.createTime = model.createTime;
                this.duration = model.duration;
                this.expireTime = model.expireTime;
                this.instanceId = model.instanceId;
                this.status = model.status;
            } 

            /**
             * <p>Cache reserve capacity. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>512000</p>
             */
            public Builder cacheReserveCapacity(Long cacheReserveCapacity) {
                this.cacheReserveCapacity = cacheReserveCapacity;
                return this;
            }

            /**
             * <p>Cache reserve usage region.</p>
             * 
             * <strong>example:</strong>
             * <p>HK</p>
             */
            public Builder cacheReserveRegion(String cacheReserveRegion) {
                this.cacheReserveRegion = cacheReserveRegion;
                return this;
            }

            /**
             * ChargeType.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>Instance purchase time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-04-12T05:41:51Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Duration of the instance purchase, unit: months.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>Instance expiration time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-10-05T16:00:00Z</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>Instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sp-xcdn-96wblslz****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The status of the cache reserve instance. Valid values:</p>
             * <ul>
             * <li><strong>online</strong>: The instance is in service.</li>
             * <li><strong>offline</strong>: The instance has expired within an allowable period. In this state, it is unavailable.</li>
             * <li><strong>disable</strong>: The instance has been released.</li>
             * <li><strong>overdue</strong>: The instance has been stopped due to overdue payments.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>online</p>
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
