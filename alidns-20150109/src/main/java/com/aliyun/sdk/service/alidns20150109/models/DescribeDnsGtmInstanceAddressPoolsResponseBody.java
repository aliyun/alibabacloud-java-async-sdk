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
         * AddrPools.
         */
        public Builder addrPools(AddrPools addrPools) {
            this.addrPools = addrPools;
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
         * TotalItems.
         */
        public Builder totalItems(Integer totalItems) {
            this.totalItems = totalItems;
            return this;
        }

        /**
         * TotalPages.
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
             * AddrCount.
             */
            public Builder addrCount(Integer addrCount) {
                this.addrCount = addrCount;
                return this;
            }

            /**
             * AddrPoolId.
             */
            public Builder addrPoolId(String addrPoolId) {
                this.addrPoolId = addrPoolId;
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
             * CreateTimestamp.
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * LbaStrategy.
             */
            public Builder lbaStrategy(String lbaStrategy) {
                this.lbaStrategy = lbaStrategy;
                return this;
            }

            /**
             * MonitorConfigId.
             */
            public Builder monitorConfigId(String monitorConfigId) {
                this.monitorConfigId = monitorConfigId;
                return this;
            }

            /**
             * MonitorStatus.
             */
            public Builder monitorStatus(String monitorStatus) {
                this.monitorStatus = monitorStatus;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
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
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * UpdateTimestamp.
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
