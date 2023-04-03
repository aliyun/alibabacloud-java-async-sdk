// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDnsGtmInstanceAddressPoolsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDnsGtmInstanceAddressPoolsResponseBody</p>
 */
public class DescribeDnsGtmInstanceAddressPoolsResponseBody extends TeaModel {
    @NameInMap("AddrPools")
    private AddrPools addrPools;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalItems")
    private Integer totalItems;

    @NameInMap("TotalPages")
    private Integer totalPages;

    private DescribeDnsGtmInstanceAddressPoolsResponseBody(Builder builder) {
        this.addrPools = builder.addrPools;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalItems = builder.totalItems;
        this.totalPages = builder.totalPages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDnsGtmInstanceAddressPoolsResponseBody create() {
        return builder().build();
    }

    /**
     * @return addrPools
     */
    public AddrPools getAddrPools() {
        return this.addrPools;
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
     * @return totalItems
     */
    public Integer getTotalItems() {
        return this.totalItems;
    }

    /**
     * @return totalPages
     */
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static final class Builder {
        private AddrPools addrPools; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalItems; 
        private Integer totalPages; 

        /**
         * The returned address pools.
         */
        public Builder addrPools(AddrPools addrPools) {
            this.addrPools = addrPools;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned on all pages.
         */
        public Builder totalItems(Integer totalItems) {
            this.totalItems = totalItems;
            return this;
        }

        /**
         * The total number of pages returned.
         */
        public Builder totalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        public DescribeDnsGtmInstanceAddressPoolsResponseBody build() {
            return new DescribeDnsGtmInstanceAddressPoolsResponseBody(this);
        } 

    } 

    public static class AddrPool extends TeaModel {
        @NameInMap("AddrCount")
        private Integer addrCount;

        @NameInMap("AddrPoolId")
        private String addrPoolId;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @NameInMap("LbaStrategy")
        private String lbaStrategy;

        @NameInMap("MonitorConfigId")
        private String monitorConfigId;

        @NameInMap("MonitorStatus")
        private String monitorStatus;

        @NameInMap("Name")
        private String name;

        @NameInMap("Type")
        private String type;

        @NameInMap("UpdateTime")
        private String updateTime;

        @NameInMap("UpdateTimestamp")
        private Long updateTimestamp;

        private AddrPool(Builder builder) {
            this.addrCount = builder.addrCount;
            this.addrPoolId = builder.addrPoolId;
            this.createTime = builder.createTime;
            this.createTimestamp = builder.createTimestamp;
            this.lbaStrategy = builder.lbaStrategy;
            this.monitorConfigId = builder.monitorConfigId;
            this.monitorStatus = builder.monitorStatus;
            this.name = builder.name;
            this.type = builder.type;
            this.updateTime = builder.updateTime;
            this.updateTimestamp = builder.updateTimestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddrPool create() {
            return builder().build();
        }

        /**
         * @return addrCount
         */
        public Integer getAddrCount() {
            return this.addrCount;
        }

        /**
         * @return addrPoolId
         */
        public String getAddrPoolId() {
            return this.addrPoolId;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createTimestamp
         */
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        /**
         * @return lbaStrategy
         */
        public String getLbaStrategy() {
            return this.lbaStrategy;
        }

        /**
         * @return monitorConfigId
         */
        public String getMonitorConfigId() {
            return this.monitorConfigId;
        }

        /**
         * @return monitorStatus
         */
        public String getMonitorStatus() {
            return this.monitorStatus;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return updateTimestamp
         */
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public static final class Builder {
            private Integer addrCount; 
            private String addrPoolId; 
            private String createTime; 
            private Long createTimestamp; 
            private String lbaStrategy; 
            private String monitorConfigId; 
            private String monitorStatus; 
            private String name; 
            private String type; 
            private String updateTime; 
            private Long updateTimestamp; 

            /**
             * The number of addresses in the address pool.
             */
            public Builder addrCount(Integer addrCount) {
                this.addrCount = addrCount;
                return this;
            }

            /**
             * The ID of the address pool.
             */
            public Builder addrPoolId(String addrPoolId) {
                this.addrPoolId = addrPoolId;
                return this;
            }

            /**
             * The time when the address pool was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The timestamp that indicates when the address pool was created.
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * The load balancing policy of the address pool. Valid values:
             * <p>
             * 
             * *   ALL_RR: returns all addresses.
             * *   RATIO: returns addresses by weight.
             */
            public Builder lbaStrategy(String lbaStrategy) {
                this.lbaStrategy = lbaStrategy;
                return this;
            }

            /**
             * The ID of the health check task.
             */
            public Builder monitorConfigId(String monitorConfigId) {
                this.monitorConfigId = monitorConfigId;
                return this;
            }

            /**
             * Indicates whether health checks are configured. Valid values:
             * <p>
             * 
             * *   OPEN: enabled
             * *   CLOSE: disabled
             * *   UNCONFIGURED: not configured
             */
            public Builder monitorStatus(String monitorStatus) {
                this.monitorStatus = monitorStatus;
                return this;
            }

            /**
             * The name of the address pool.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The type of the address pool. Valid values:
             * <p>
             * 
             * *   IPV4: IPv4 address
             * *   IPV6: IPv6 address
             * *   DOMAIN: domain name
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The time when the address pool was updated.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * The timestamp that indicates when the address pool was updated.
             */
            public Builder updateTimestamp(Long updateTimestamp) {
                this.updateTimestamp = updateTimestamp;
                return this;
            }

            public AddrPool build() {
                return new AddrPool(this);
            } 

        } 

    }
    public static class AddrPools extends TeaModel {
        @NameInMap("AddrPool")
        private java.util.List < AddrPool> addrPool;

        private AddrPools(Builder builder) {
            this.addrPool = builder.addrPool;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddrPools create() {
            return builder().build();
        }

        /**
         * @return addrPool
         */
        public java.util.List < AddrPool> getAddrPool() {
            return this.addrPool;
        }

        public static final class Builder {
            private java.util.List < AddrPool> addrPool; 

            /**
             * AddrPool.
             */
            public Builder addrPool(java.util.List < AddrPool> addrPool) {
                this.addrPool = addrPool;
                return this;
            }

            public AddrPools build() {
                return new AddrPools(this);
            } 

        } 

    }
}
