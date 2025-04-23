// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link DescribeDnsCacheDomainsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDnsCacheDomainsResponseBody</p>
 */
public class DescribeDnsCacheDomainsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Domains")
    private java.util.List<Domains> domains;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeDnsCacheDomainsResponseBody(Builder builder) {
        this.domains = builder.domains;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDnsCacheDomainsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domains
     */
    public java.util.List<Domains> getDomains() {
        return this.domains;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Domains> domains; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeDnsCacheDomainsResponseBody model) {
            this.domains = model.domains;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The domain names.</p>
         */
        public Builder domains(java.util.List<Domains> domains) {
            this.domains = domains;
            return this;
        }

        /**
         * <p>The page number. Pages start from page <strong>1</strong>. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 100. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>57121A9C-CDCF-541F-AD39-275D89099420</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDnsCacheDomainsResponseBody build() {
            return new DescribeDnsCacheDomainsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDnsCacheDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDnsCacheDomainsResponseBody</p>
     */
    public static class SourceDnsServers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        private SourceDnsServers(Builder builder) {
            this.host = builder.host;
            this.port = builder.port;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceDnsServers create() {
            return builder().build();
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        public static final class Builder {
            private String host; 
            private String port; 

            private Builder() {
            } 

            private Builder(SourceDnsServers model) {
                this.host = model.host;
                this.port = model.port;
            } 

            /**
             * <p>The domain name or IP address of the origin DNS server.</p>
             * 
             * <strong>example:</strong>
             * <p>ns8.alidns.com</p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * <p>The port of the origin DNS server.</p>
             * 
             * <strong>example:</strong>
             * <p>53</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            public SourceDnsServers build() {
                return new SourceDnsServers(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDnsCacheDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDnsCacheDomainsResponseBody</p>
     */
    public static class Domains extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CacheTtlMax")
        private Integer cacheTtlMax;

        @com.aliyun.core.annotation.NameInMap("CacheTtlMin")
        private Integer cacheTtlMin;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @com.aliyun.core.annotation.NameInMap("DomainId")
        private String domainId;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("ExpireTimestamp")
        private Long expireTimestamp;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("SourceDnsServers")
        private java.util.List<SourceDnsServers> sourceDnsServers;

        @com.aliyun.core.annotation.NameInMap("SourceEdns")
        private String sourceEdns;

        @com.aliyun.core.annotation.NameInMap("SourceProtocol")
        private String sourceProtocol;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("UpdateTimestamp")
        private Long updateTimestamp;

        @com.aliyun.core.annotation.NameInMap("VersionCode")
        private String versionCode;

        private Domains(Builder builder) {
            this.cacheTtlMax = builder.cacheTtlMax;
            this.cacheTtlMin = builder.cacheTtlMin;
            this.createTime = builder.createTime;
            this.createTimestamp = builder.createTimestamp;
            this.domainId = builder.domainId;
            this.domainName = builder.domainName;
            this.expireTime = builder.expireTime;
            this.expireTimestamp = builder.expireTimestamp;
            this.instanceId = builder.instanceId;
            this.remark = builder.remark;
            this.sourceDnsServers = builder.sourceDnsServers;
            this.sourceEdns = builder.sourceEdns;
            this.sourceProtocol = builder.sourceProtocol;
            this.updateTime = builder.updateTime;
            this.updateTimestamp = builder.updateTimestamp;
            this.versionCode = builder.versionCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Domains create() {
            return builder().build();
        }

        /**
         * @return cacheTtlMax
         */
        public Integer getCacheTtlMax() {
            return this.cacheTtlMax;
        }

        /**
         * @return cacheTtlMin
         */
        public Integer getCacheTtlMin() {
            return this.cacheTtlMin;
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
         * @return domainId
         */
        public String getDomainId() {
            return this.domainId;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return expireTimestamp
         */
        public Long getExpireTimestamp() {
            return this.expireTimestamp;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return sourceDnsServers
         */
        public java.util.List<SourceDnsServers> getSourceDnsServers() {
            return this.sourceDnsServers;
        }

        /**
         * @return sourceEdns
         */
        public String getSourceEdns() {
            return this.sourceEdns;
        }

        /**
         * @return sourceProtocol
         */
        public String getSourceProtocol() {
            return this.sourceProtocol;
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

        /**
         * @return versionCode
         */
        public String getVersionCode() {
            return this.versionCode;
        }

        public static final class Builder {
            private Integer cacheTtlMax; 
            private Integer cacheTtlMin; 
            private String createTime; 
            private Long createTimestamp; 
            private String domainId; 
            private String domainName; 
            private String expireTime; 
            private Long expireTimestamp; 
            private String instanceId; 
            private String remark; 
            private java.util.List<SourceDnsServers> sourceDnsServers; 
            private String sourceEdns; 
            private String sourceProtocol; 
            private String updateTime; 
            private Long updateTimestamp; 
            private String versionCode; 

            private Builder() {
            } 

            private Builder(Domains model) {
                this.cacheTtlMax = model.cacheTtlMax;
                this.cacheTtlMin = model.cacheTtlMin;
                this.createTime = model.createTime;
                this.createTimestamp = model.createTimestamp;
                this.domainId = model.domainId;
                this.domainName = model.domainName;
                this.expireTime = model.expireTime;
                this.expireTimestamp = model.expireTimestamp;
                this.instanceId = model.instanceId;
                this.remark = model.remark;
                this.sourceDnsServers = model.sourceDnsServers;
                this.sourceEdns = model.sourceEdns;
                this.sourceProtocol = model.sourceProtocol;
                this.updateTime = model.updateTime;
                this.updateTimestamp = model.updateTimestamp;
                this.versionCode = model.versionCode;
            } 

            /**
             * <p>The maximum time-to-live (TTL) period of the cached data retrieved from the origin DNS server. Unit: seconds. Valid values: 30 to 86400.</p>
             * 
             * <strong>example:</strong>
             * <p>86400</p>
             */
            public Builder cacheTtlMax(Integer cacheTtlMax) {
                this.cacheTtlMax = cacheTtlMax;
                return this;
            }

            /**
             * <p>The minimum TTL period of the cached data retrieved from the origin DNS server. Unit: seconds. Valid values: 30 to 86400.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder cacheTtlMin(Integer cacheTtlMin) {
                this.cacheTtlMin = cacheTtlMin;
                return this;
            }

            /**
             * <p>The time when the domain name was added. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-10-17T06:13Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The time when the domain name was added. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1660546144000</p>
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * <p>The ID of the cache-accelerated domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>00efd71a-770e-4255-b54e-6fe5659baffe</p>
             */
            public Builder domainId(String domainId) {
                this.domainId = domainId;
                return this;
            }

            /**
             * <p>The cache-accelerated domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>dns-example.top</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The time when the instance expires. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-12-02T16:00Z</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The time when the instance expires. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1692374400000</p>
             */
            public Builder expireTimestamp(Long expireTimestamp) {
                this.expireTimestamp = expireTimestamp;
                return this;
            }

            /**
             * <p>The instance ID of the cache-accelerated domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>i-7bg</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The description of the domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>remark</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>The origin DNS servers.</p>
             */
            public Builder sourceDnsServers(java.util.List<SourceDnsServers> sourceDnsServers) {
                this.sourceDnsServers = sourceDnsServers;
                return this;
            }

            /**
             * <p>Specifies whether the origin Domain Name System (DNS) server supports Extension Mechanisms for DNS (EDNS). Valid values: NOT_SUPPORT and SUPPORT.</p>
             * 
             * <strong>example:</strong>
             * <p>SUPPORT</p>
             */
            public Builder sourceEdns(String sourceEdns) {
                this.sourceEdns = sourceEdns;
                return this;
            }

            /**
             * <p>The origin protocol policy. Valid values: TCP and UDP. Default value: UDP.</p>
             * 
             * <strong>example:</strong>
             * <p>UDP</p>
             */
            public Builder sourceProtocol(String sourceProtocol) {
                this.sourceProtocol = sourceProtocol;
                return this;
            }

            /**
             * <p>The time when the configurations of the domain name were updated. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-05-22T03:40Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The time when the configurations of the domain name were updated. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1671690491000</p>
             */
            public Builder updateTimestamp(Long updateTimestamp) {
                this.updateTimestamp = updateTimestamp;
                return this;
            }

            /**
             * <p>The edition code of Alibaba Cloud DNS.</p>
             * 
             * <strong>example:</strong>
             * <p>ultimate</p>
             */
            public Builder versionCode(String versionCode) {
                this.versionCode = versionCode;
                return this;
            }

            public Domains build() {
                return new Domains(this);
            } 

        } 

    }
}
