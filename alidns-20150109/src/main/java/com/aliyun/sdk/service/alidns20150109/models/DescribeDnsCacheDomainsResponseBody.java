// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDnsCacheDomainsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDnsCacheDomainsResponseBody</p>
 */
public class DescribeDnsCacheDomainsResponseBody extends TeaModel {
    @NameInMap("Domains")
    private java.util.List < Domains> domains;

    @NameInMap("PageNumber")
    private Long pageNumber;

    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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

    /**
     * @return domains
     */
    public java.util.List < Domains> getDomains() {
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
        private java.util.List < Domains> domains; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * Domains.
         */
        public Builder domains(java.util.List < Domains> domains) {
            this.domains = domains;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
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
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDnsCacheDomainsResponseBody build() {
            return new DescribeDnsCacheDomainsResponseBody(this);
        } 

    } 

    public static class SourceDnsServers extends TeaModel {
        @NameInMap("Host")
        private String host;

        @NameInMap("Port")
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

            /**
             * Host.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * Port.
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
    public static class Domains extends TeaModel {
        @NameInMap("CacheTtlMax")
        private Integer cacheTtlMax;

        @NameInMap("CacheTtlMin")
        private Integer cacheTtlMin;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @NameInMap("DomainId")
        private String domainId;

        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("ExpireTime")
        private String expireTime;

        @NameInMap("ExpireTimestamp")
        private Long expireTimestamp;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Remark")
        private String remark;

        @NameInMap("SourceDnsServers")
        private java.util.List < SourceDnsServers> sourceDnsServers;

        @NameInMap("SourceEdns")
        private String sourceEdns;

        @NameInMap("SourceProtocol")
        private String sourceProtocol;

        @NameInMap("UpdateTime")
        private String updateTime;

        @NameInMap("UpdateTimestamp")
        private Long updateTimestamp;

        @NameInMap("VersionCode")
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
        public java.util.List < SourceDnsServers> getSourceDnsServers() {
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
            private java.util.List < SourceDnsServers> sourceDnsServers; 
            private String sourceEdns; 
            private String sourceProtocol; 
            private String updateTime; 
            private Long updateTimestamp; 
            private String versionCode; 

            /**
             * CacheTtlMax.
             */
            public Builder cacheTtlMax(Integer cacheTtlMax) {
                this.cacheTtlMax = cacheTtlMax;
                return this;
            }

            /**
             * CacheTtlMin.
             */
            public Builder cacheTtlMin(Integer cacheTtlMin) {
                this.cacheTtlMin = cacheTtlMin;
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
             * DomainId.
             */
            public Builder domainId(String domainId) {
                this.domainId = domainId;
                return this;
            }

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
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
             * ExpireTimestamp.
             */
            public Builder expireTimestamp(Long expireTimestamp) {
                this.expireTimestamp = expireTimestamp;
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
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * SourceDnsServers.
             */
            public Builder sourceDnsServers(java.util.List < SourceDnsServers> sourceDnsServers) {
                this.sourceDnsServers = sourceDnsServers;
                return this;
            }

            /**
             * SourceEdns.
             */
            public Builder sourceEdns(String sourceEdns) {
                this.sourceEdns = sourceEdns;
                return this;
            }

            /**
             * SourceProtocol.
             */
            public Builder sourceProtocol(String sourceProtocol) {
                this.sourceProtocol = sourceProtocol;
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

            /**
             * VersionCode.
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
