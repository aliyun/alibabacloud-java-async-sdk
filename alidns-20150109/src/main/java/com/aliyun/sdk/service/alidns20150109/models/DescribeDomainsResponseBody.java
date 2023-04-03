// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainsResponseBody</p>
 */
public class DescribeDomainsResponseBody extends TeaModel {
    @NameInMap("Domains")
    private Domains domains;

    @NameInMap("PageNumber")
    private Long pageNumber;

    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
         * The list of domain names queried by this operation.
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
        @NameInMap("DnsServer")
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
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
        @NameInMap("Tag")
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
        @NameInMap("AliDomain")
        private Boolean aliDomain;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @NameInMap("DnsServers")
        private DnsServers dnsServers;

        @NameInMap("DomainId")
        private String domainId;

        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("InstanceEndTime")
        private String instanceEndTime;

        @NameInMap("InstanceExpired")
        private Boolean instanceExpired;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("PunyCode")
        private String punyCode;

        @NameInMap("RecordCount")
        private Long recordCount;

        @NameInMap("RegistrantEmail")
        private String registrantEmail;

        @NameInMap("Remark")
        private String remark;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("Starmark")
        private Boolean starmark;

        @NameInMap("Tags")
        private Tags tags;

        @NameInMap("VersionCode")
        private String versionCode;

        @NameInMap("VersionName")
        private String versionName;

        private Domain(Builder builder) {
            this.aliDomain = builder.aliDomain;
            this.createTime = builder.createTime;
            this.createTimestamp = builder.createTimestamp;
            this.dnsServers = builder.dnsServers;
            this.domainId = builder.domainId;
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
             * Indicates whether the domain name is an Alibaba Cloud HiChina domain name.
             */
            public Builder aliDomain(Boolean aliDomain) {
                this.aliDomain = aliDomain;
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
             * The list of DNS servers of the domain name in the DNS system.
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
             * The expiration time of the instance.
             */
            public Builder instanceEndTime(String instanceEndTime) {
                this.instanceEndTime = instanceEndTime;
                return this;
            }

            /**
             * Indicates whether the instance expired.
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
             * The punycode is returned for Chinese domain names and is left blank for English domain names.
             */
            public Builder punyCode(String punyCode) {
                this.punyCode = punyCode;
                return this;
            }

            /**
             * The number of DNS records of the domain name.
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
             * The description.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * Indicates whether to query the starmark of the domain name.
             */
            public Builder starmark(Boolean starmark) {
                this.starmark = starmark;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The version code of the Alibaba Cloud DNS instance.
             */
            public Builder versionCode(String versionCode) {
                this.versionCode = versionCode;
                return this;
            }

            /**
             * The version name of the Alibaba Cloud DNS instance.
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
        @NameInMap("Domain")
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
