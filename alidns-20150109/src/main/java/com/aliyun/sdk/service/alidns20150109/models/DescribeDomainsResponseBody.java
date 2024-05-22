// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainsResponseBody</p>
 */
public class DescribeDomainsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Domains")
    private Domains domains;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeDomainsResponseBody(Builder builder) {
        this.domains = builder.domains;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainsResponseBody create() {
        return builder().build();
    }

    /**
     * @return domains
     */
    public Domains getDomains() {
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
        private Domains domains; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * The domain names.
         */
        public Builder domains(Domains domains) {
            this.domains = domains;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Long pageSize) {
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
         * The total number of domain names.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDomainsResponseBody build() {
            return new DescribeDomainsResponseBody(this);
        } 

    } 

    public static class DnsServers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DnsServer")
        private java.util.List < String > dnsServer;

        private DnsServers(Builder builder) {
            this.dnsServer = builder.dnsServer;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DnsServers create() {
            return builder().build();
        }

        /**
         * @return dnsServer
         */
        public java.util.List < String > getDnsServer() {
            return this.dnsServer;
        }

        public static final class Builder {
            private java.util.List < String > dnsServer; 

            /**
             * DnsServer.
             */
            public Builder dnsServer(java.util.List < String > dnsServer) {
                this.dnsServer = dnsServer;
                return this;
            }

            public DnsServers build() {
                return new DnsServers(this);
            } 

        } 

    }
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The key of the tag added to the resource.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the tag added to the resource.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List < Tag> tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List < Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List < Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class Domain extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliDomain")
        private Boolean aliDomain;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @com.aliyun.core.annotation.NameInMap("DnsServers")
        private DnsServers dnsServers;

        @com.aliyun.core.annotation.NameInMap("DomainId")
        private String domainId;

        @com.aliyun.core.annotation.NameInMap("DomainLoggingSwitchStatus")
        private String domainLoggingSwitchStatus;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("InstanceEndTime")
        private String instanceEndTime;

        @com.aliyun.core.annotation.NameInMap("InstanceExpired")
        private Boolean instanceExpired;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("PunyCode")
        private String punyCode;

        @com.aliyun.core.annotation.NameInMap("RecordCount")
        private Long recordCount;

        @com.aliyun.core.annotation.NameInMap("RegistrantEmail")
        private String registrantEmail;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Starmark")
        private Boolean starmark;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("VersionCode")
        private String versionCode;

        @com.aliyun.core.annotation.NameInMap("VersionName")
        private String versionName;

        private Domain(Builder builder) {
            this.aliDomain = builder.aliDomain;
            this.createTime = builder.createTime;
            this.createTimestamp = builder.createTimestamp;
            this.dnsServers = builder.dnsServers;
            this.domainId = builder.domainId;
            this.domainLoggingSwitchStatus = builder.domainLoggingSwitchStatus;
            this.domainName = builder.domainName;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.instanceEndTime = builder.instanceEndTime;
            this.instanceExpired = builder.instanceExpired;
            this.instanceId = builder.instanceId;
            this.punyCode = builder.punyCode;
            this.recordCount = builder.recordCount;
            this.registrantEmail = builder.registrantEmail;
            this.remark = builder.remark;
            this.resourceGroupId = builder.resourceGroupId;
            this.starmark = builder.starmark;
            this.tags = builder.tags;
            this.versionCode = builder.versionCode;
            this.versionName = builder.versionName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Domain create() {
            return builder().build();
        }

        /**
         * @return aliDomain
         */
        public Boolean getAliDomain() {
            return this.aliDomain;
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
         * @return dnsServers
         */
        public DnsServers getDnsServers() {
            return this.dnsServers;
        }

        /**
         * @return domainId
         */
        public String getDomainId() {
            return this.domainId;
        }

        /**
         * @return domainLoggingSwitchStatus
         */
        public String getDomainLoggingSwitchStatus() {
            return this.domainLoggingSwitchStatus;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return instanceEndTime
         */
        public String getInstanceEndTime() {
            return this.instanceEndTime;
        }

        /**
         * @return instanceExpired
         */
        public Boolean getInstanceExpired() {
            return this.instanceExpired;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return punyCode
         */
        public String getPunyCode() {
            return this.punyCode;
        }

        /**
         * @return recordCount
         */
        public Long getRecordCount() {
            return this.recordCount;
        }

        /**
         * @return registrantEmail
         */
        public String getRegistrantEmail() {
            return this.registrantEmail;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return starmark
         */
        public Boolean getStarmark() {
            return this.starmark;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return versionCode
         */
        public String getVersionCode() {
            return this.versionCode;
        }

        /**
         * @return versionName
         */
        public String getVersionName() {
            return this.versionName;
        }

        public static final class Builder {
            private Boolean aliDomain; 
            private String createTime; 
            private Long createTimestamp; 
            private DnsServers dnsServers; 
            private String domainId; 
            private String domainLoggingSwitchStatus; 
            private String domainName; 
            private String groupId; 
            private String groupName; 
            private String instanceEndTime; 
            private Boolean instanceExpired; 
            private String instanceId; 
            private String punyCode; 
            private Long recordCount; 
            private String registrantEmail; 
            private String remark; 
            private String resourceGroupId; 
            private Boolean starmark; 
            private Tags tags; 
            private String versionCode; 
            private String versionName; 

            /**
             * Indicates whether the domain name was registered in Alibaba Cloud.
             */
            public Builder aliDomain(Boolean aliDomain) {
                this.aliDomain = aliDomain;
                return this;
            }

            /**
             * The time when the domain name was added.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The time when the domain name was added. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * The names of the DNS servers configured for the domain name.
             */
            public Builder dnsServers(DnsServers dnsServers) {
                this.dnsServers = dnsServers;
                return this;
            }

            /**
             * The ID of the domain name.
             */
            public Builder domainId(String domainId) {
                this.domainId = domainId;
                return this;
            }

            /**
             * DomainLoggingSwitchStatus.
             */
            public Builder domainLoggingSwitchStatus(String domainLoggingSwitchStatus) {
                this.domainLoggingSwitchStatus = domainLoggingSwitchStatus;
                return this;
            }

            /**
             * The domain name.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * The ID of the domain name group.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The name of the domain name group.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * The time when the Alibaba Cloud DNS instance expires.
             */
            public Builder instanceEndTime(String instanceEndTime) {
                this.instanceEndTime = instanceEndTime;
                return this;
            }

            /**
             * Indicates whether the Alibaba Cloud DNS instance expires.
             */
            public Builder instanceExpired(Boolean instanceExpired) {
                this.instanceExpired = instanceExpired;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud DNS instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The Punycode for the domain name. This parameter is returned only for Chinese domain names.
             */
            public Builder punyCode(String punyCode) {
                this.punyCode = punyCode;
                return this;
            }

            /**
             * The number of Domain Name System (DNS) records added for the domain name.
             */
            public Builder recordCount(Long recordCount) {
                this.recordCount = recordCount;
                return this;
            }

            /**
             * The email address of the registrant.
             */
            public Builder registrantEmail(String registrantEmail) {
                this.registrantEmail = registrantEmail;
                return this;
            }

            /**
             * The description of the domain name.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * The ID of the resource group to which the domain name belongs.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * Indicates whether the domain name was added to favorites.
             */
            public Builder starmark(Boolean starmark) {
                this.starmark = starmark;
                return this;
            }

            /**
             * The tags added to the resource.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The edition code of Alibaba Cloud DNS.
             */
            public Builder versionCode(String versionCode) {
                this.versionCode = versionCode;
                return this;
            }

            /**
             * The edition of Alibaba Cloud DNS.
             */
            public Builder versionName(String versionName) {
                this.versionName = versionName;
                return this;
            }

            public Domain build() {
                return new Domain(this);
            } 

        } 

    }
    public static class Domains extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Domain")
        private java.util.List < Domain> domain;

        private Domains(Builder builder) {
            this.domain = builder.domain;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Domains create() {
            return builder().build();
        }

        /**
         * @return domain
         */
        public java.util.List < Domain> getDomain() {
            return this.domain;
        }

        public static final class Builder {
            private java.util.List < Domain> domain; 

            /**
             * Domain.
             */
            public Builder domain(java.util.List < Domain> domain) {
                this.domain = domain;
                return this;
            }

            public Domains build() {
                return new Domains(this);
            } 

        } 

    }
}
