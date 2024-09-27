// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeGtmInstanceAddressPoolsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGtmInstanceAddressPoolsResponseBody</p>
 */
public class DescribeGtmInstanceAddressPoolsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AddrPools")
    private AddrPools addrPools;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalItems")
    private Integer totalItems;

    @com.aliyun.core.annotation.NameInMap("TotalPages")
    private Integer totalPages;

    private DescribeGtmInstanceAddressPoolsResponseBody(Builder builder) {
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

    public static DescribeGtmInstanceAddressPoolsResponseBody create() {
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
         * <p>The returned list of address pools of the GTM instance.</p>
         */
        public Builder addrPools(AddrPools addrPools) {
            this.addrPools = addrPools;
            return this;
        }

        /**
         * <p>The number of the page returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>6856BCF6-11D6-4D7E-AC53-FD579933522B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned on all pages.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalItems(Integer totalItems) {
            this.totalItems = totalItems;
            return this;
        }

        /**
         * <p>The total number of pages returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        public DescribeGtmInstanceAddressPoolsResponseBody build() {
            return new DescribeGtmInstanceAddressPoolsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeGtmInstanceAddressPoolsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGtmInstanceAddressPoolsResponseBody</p>
     */
    public static class AddrPool extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddrCount")
        private Integer addrCount;

        @com.aliyun.core.annotation.NameInMap("AddrPoolId")
        private String addrPoolId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @com.aliyun.core.annotation.NameInMap("MinAvailableAddrNum")
        private Integer minAvailableAddrNum;

        @com.aliyun.core.annotation.NameInMap("MonitorConfigId")
        private String monitorConfigId;

        @com.aliyun.core.annotation.NameInMap("MonitorStatus")
        private String monitorStatus;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("UpdateTimestamp")
        private Long updateTimestamp;

        private AddrPool(Builder builder) {
            this.addrCount = builder.addrCount;
            this.addrPoolId = builder.addrPoolId;
            this.createTime = builder.createTime;
            this.createTimestamp = builder.createTimestamp;
            this.minAvailableAddrNum = builder.minAvailableAddrNum;
            this.monitorConfigId = builder.monitorConfigId;
            this.monitorStatus = builder.monitorStatus;
            this.name = builder.name;
            this.status = builder.status;
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
         * @return minAvailableAddrNum
         */
        public Integer getMinAvailableAddrNum() {
            return this.minAvailableAddrNum;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
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
            private Integer minAvailableAddrNum; 
            private String monitorConfigId; 
            private String monitorStatus; 
            private String name; 
            private String status; 
            private String type; 
            private String updateTime; 
            private Long updateTimestamp; 

            /**
             * <p>The number of addresses in the address pool.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder addrCount(Integer addrCount) {
                this.addrCount = addrCount;
                return this;
            }

            /**
             * <p>The ID of the address pool.</p>
             * 
             * <strong>example:</strong>
             * <p>1234abc</p>
             */
            public Builder addrPoolId(String addrPoolId) {
                this.addrPoolId = addrPoolId;
                return this;
            }

            /**
             * <p>The time when this address pool was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-12-28T13:08Z</p>
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
             * <p>The minimum number of available addresses in the address pool.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder minAvailableAddrNum(Integer minAvailableAddrNum) {
                this.minAvailableAddrNum = minAvailableAddrNum;
                return this;
            }

            /**
             * <p>The health check ID of the address pool.</p>
             * 
             * <strong>example:</strong>
             * <p>100abc</p>
             */
            public Builder monitorConfigId(String monitorConfigId) {
                this.monitorConfigId = monitorConfigId;
                return this;
            }

            /**
             * <p>Indicates whether health check was enabled for the address pool. Valid values:</p>
             * <ul>
             * <li><strong>OPEN</strong>: Enabled</li>
             * <li><strong>CLOSE</strong>: Disabled</li>
             * <li><strong>UNCONFIGURED</strong>: Not configured</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OPEN</p>
             */
            public Builder monitorStatus(String monitorStatus) {
                this.monitorStatus = monitorStatus;
                return this;
            }

            /**
             * <p>The name of the address pool.</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The availability status of the address pool. Valid values:</p>
             * <ul>
             * <li><strong>AVAILABLE</strong>: Available</li>
             * <li><strong>NOT_AVAILABLE</strong>: Unavailable</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AVAILABLE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The type of the address pool. Valid values:</p>
             * <ul>
             * <li><strong>IP</strong>: IP address</li>
             * <li><strong>DOMAIN</strong>: Domain name</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>IP</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The last time when the address pool was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-12-28T13:08Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>A timestamp that indicates the last time the address pool was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>1527690629357</p>
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
    /**
     * 
     * {@link DescribeGtmInstanceAddressPoolsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGtmInstanceAddressPoolsResponseBody</p>
     */
    public static class AddrPools extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddrPool")
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
