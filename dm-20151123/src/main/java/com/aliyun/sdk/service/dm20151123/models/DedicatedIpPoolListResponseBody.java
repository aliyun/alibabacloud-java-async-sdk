// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

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
 * {@link DedicatedIpPoolListResponseBody} extends {@link TeaModel}
 *
 * <p>DedicatedIpPoolListResponseBody</p>
 */
public class DedicatedIpPoolListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private String currentPage;

    @com.aliyun.core.annotation.NameInMap("HasMore")
    private Boolean hasMore;

    @com.aliyun.core.annotation.NameInMap("IpPools")
    private java.util.List<IpPools> ipPools;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCounts")
    private Integer totalCounts;

    private DedicatedIpPoolListResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.hasMore = builder.hasMore;
        this.ipPools = builder.ipPools;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCounts = builder.totalCounts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DedicatedIpPoolListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public String getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return hasMore
     */
    public Boolean getHasMore() {
        return this.hasMore;
    }

    /**
     * @return ipPools
     */
    public java.util.List<IpPools> getIpPools() {
        return this.ipPools;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCounts
     */
    public Integer getTotalCounts() {
        return this.totalCounts;
    }

    public static final class Builder {
        private String currentPage; 
        private Boolean hasMore; 
        private java.util.List<IpPools> ipPools; 
        private String pageSize; 
        private String requestId; 
        private Integer totalCounts; 

        private Builder() {
        } 

        private Builder(DedicatedIpPoolListResponseBody model) {
            this.currentPage = model.currentPage;
            this.hasMore = model.hasMore;
            this.ipPools = model.ipPools;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCounts = model.totalCounts;
        } 

        /**
         * <p>Current page</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(String currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>Whether there is a next page</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder hasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }

        /**
         * <p>List of IP pools</p>
         */
        public Builder ipPools(java.util.List<IpPools> ipPools) {
            this.ipPools = ipPools;
            return this;
        }

        /**
         * <p>Page size</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Total number of data under the current request conditions</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder totalCounts(Integer totalCounts) {
            this.totalCounts = totalCounts;
            return this;
        }

        public DedicatedIpPoolListResponseBody build() {
            return new DedicatedIpPoolListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DedicatedIpPoolListResponseBody} extends {@link TeaModel}
     *
     * <p>DedicatedIpPoolListResponseBody</p>
     */
    public static class Ips extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private Ips(Builder builder) {
            this.id = builder.id;
            this.ip = builder.ip;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ips create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String id; 
            private String ip; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(Ips model) {
                this.id = model.id;
                this.ip = model.ip;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>Instance purchase ID</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>IP address</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Ips build() {
                return new Ips(this);
            } 

        } 

    }
    /**
     * 
     * {@link DedicatedIpPoolListResponseBody} extends {@link TeaModel}
     *
     * <p>DedicatedIpPoolListResponseBody</p>
     */
    public static class IpPools extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("IpCount")
        private Integer ipCount;

        @com.aliyun.core.annotation.NameInMap("Ips")
        private java.util.List<Ips> ips;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private IpPools(Builder builder) {
            this.createTime = builder.createTime;
            this.id = builder.id;
            this.ipCount = builder.ipCount;
            this.ips = builder.ips;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpPools create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return ipCount
         */
        public Integer getIpCount() {
            return this.ipCount;
        }

        /**
         * @return ips
         */
        public java.util.List<Ips> getIps() {
            return this.ips;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String createTime; 
            private String id; 
            private Integer ipCount; 
            private java.util.List<Ips> ips; 
            private String name; 

            private Builder() {
            } 

            private Builder(IpPools model) {
                this.createTime = model.createTime;
                this.id = model.id;
                this.ipCount = model.ipCount;
                this.ips = model.ips;
                this.name = model.name;
            } 

            /**
             * <p>Creation time</p>
             * 
             * <strong>example:</strong>
             * <p>2025-05-23T07:41:43Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>IP pool ID</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Number of source IP addresses</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder ipCount(Integer ipCount) {
                this.ipCount = ipCount;
                return this;
            }

            /**
             * <p>List of IPs</p>
             */
            public Builder ips(java.util.List<Ips> ips) {
                this.ips = ips;
                return this;
            }

            /**
             * <p>IP pool name</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public IpPools build() {
                return new IpPools(this);
            } 

        } 

    }
}
