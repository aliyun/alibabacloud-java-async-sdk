// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

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
 * {@link SearchMultiAccountResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>SearchMultiAccountResourcesResponseBody</p>
 */
public class SearchMultiAccountResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Filters")
    private java.util.List<Filters> filters;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Resources")
    private java.util.List<Resources> resources;

    @com.aliyun.core.annotation.NameInMap("Scope")
    private String scope;

    private SearchMultiAccountResourcesResponseBody(Builder builder) {
        this.filters = builder.filters;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.resources = builder.resources;
        this.scope = builder.scope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchMultiAccountResourcesResponseBody create() {
        return builder().build();
    }

    /**
     * @return filters
     */
    public java.util.List<Filters> getFilters() {
        return this.filters;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resources
     */
    public java.util.List<Resources> getResources() {
        return this.resources;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    public static final class Builder {
        private java.util.List<Filters> filters; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List<Resources> resources; 
        private String scope; 

        /**
         * <p>The filter conditions.</p>
         */
        public Builder filters(java.util.List<Filters> filters) {
            this.filters = filters;
            return this;
        }

        /**
         * <p>The maximum number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>EFA806B9-7F36-55AB-8B7A-D680C2C5EE57</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the resources.</p>
         */
        public Builder resources(java.util.List<Resources> resources) {
            this.resources = resources;
            return this;
        }

        /**
         * <p>The search scope.</p>
         * <ul>
         * <li>ID of a resource directory: Resources within the management account and all members of the resource directory are searched.</li>
         * <li>ID of the Root folder: Resources within all members in the Root folder and the subfolders of the Root folder are searched.</li>
         * <li>ID of a folder: Resources within all members in the folder are searched.</li>
         * <li>ID of a member: Resources within the member are searched.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>rd-r4****</p>
         */
        public Builder scope(String scope) {
            this.scope = scope;
            return this;
        }

        public SearchMultiAccountResourcesResponseBody build() {
            return new SearchMultiAccountResourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SearchMultiAccountResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>SearchMultiAccountResourcesResponseBody</p>
     */
    public static class Filters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("MatchType")
        private String matchType;

        @com.aliyun.core.annotation.NameInMap("Values")
        private java.util.List<String> values;

        private Filters(Builder builder) {
            this.key = builder.key;
            this.matchType = builder.matchType;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filters create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return matchType
         */
        public String getMatchType() {
            return this.matchType;
        }

        /**
         * @return values
         */
        public java.util.List<String> getValues() {
            return this.values;
        }

        public static final class Builder {
            private String key; 
            private String matchType; 
            private java.util.List<String> values; 

            /**
             * <p>The key of the filter condition.</p>
             * 
             * <strong>example:</strong>
             * <p>RegionId</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The matching mode.</p>
             * 
             * <strong>example:</strong>
             * <p>Equals</p>
             */
            public Builder matchType(String matchType) {
                this.matchType = matchType;
                return this;
            }

            /**
             * <p>The values of the filter condition.</p>
             */
            public Builder values(java.util.List<String> values) {
                this.values = values;
                return this;
            }

            public Filters build() {
                return new Filters(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchMultiAccountResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>SearchMultiAccountResourcesResponseBody</p>
     */
    public static class IpAddressAttributes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IpAddress")
        private String ipAddress;

        @com.aliyun.core.annotation.NameInMap("NetworkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private IpAddressAttributes(Builder builder) {
            this.ipAddress = builder.ipAddress;
            this.networkType = builder.networkType;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpAddressAttributes create() {
            return builder().build();
        }

        /**
         * @return ipAddress
         */
        public String getIpAddress() {
            return this.ipAddress;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String ipAddress; 
            private String networkType; 
            private String version; 

            /**
             * <p>The IP address.</p>
             */
            public Builder ipAddress(String ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * <p>The network type. Valid values:</p>
             * <ul>
             * <li><strong>Public</strong>: the Internet</li>
             * <li><strong>Private</strong>: internal network</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Public</p>
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * <p>The version.</p>
             * 
             * <strong>example:</strong>
             * <p>Ipv4</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public IpAddressAttributes build() {
                return new IpAddressAttributes(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchMultiAccountResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>SearchMultiAccountResourcesResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
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
             * <p>The key of tag N.</p>
             * 
             * <strong>example:</strong>
             * <p>test_key</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of tag N.</p>
             * 
             * <strong>example:</strong>
             * <p>test_value</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchMultiAccountResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>SearchMultiAccountResourcesResponseBody</p>
     */
    public static class Resources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("IpAddressAttributes")
        private java.util.List<IpAddressAttributes> ipAddressAttributes;

        @com.aliyun.core.annotation.NameInMap("IpAddresses")
        private java.util.List<String> ipAddresses;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceName")
        private String resourceName;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private Resources(Builder builder) {
            this.accountId = builder.accountId;
            this.createTime = builder.createTime;
            this.expireTime = builder.expireTime;
            this.ipAddressAttributes = builder.ipAddressAttributes;
            this.ipAddresses = builder.ipAddresses;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.resourceId = builder.resourceId;
            this.resourceName = builder.resourceName;
            this.resourceType = builder.resourceType;
            this.tags = builder.tags;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resources create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return ipAddressAttributes
         */
        public java.util.List<IpAddressAttributes> getIpAddressAttributes() {
            return this.ipAddressAttributes;
        }

        /**
         * @return ipAddresses
         */
        public java.util.List<String> getIpAddresses() {
            return this.ipAddresses;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceName
         */
        public String getResourceName() {
            return this.resourceName;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String accountId; 
            private String createTime; 
            private String expireTime; 
            private java.util.List<IpAddressAttributes> ipAddressAttributes; 
            private java.util.List<String> ipAddresses; 
            private String regionId; 
            private String resourceGroupId; 
            private String resourceId; 
            private String resourceName; 
            private String resourceType; 
            private java.util.List<Tags> tags; 
            private String zoneId; 

            /**
             * <p>The ID of the management account or member of the resource directory.</p>
             * 
             * <strong>example:</strong>
             * <p>151266687691****</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The time when the resource was created.</p>
             * <blockquote>
             * <p> Whether this parameter is returned is determined by the Alibaba Cloud service to which the resource belongs.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2021-06-30T09:20:08Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The time when the resource expires.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-06-14T14:35:45Z</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The attributes of the IP address.</p>
             */
            public Builder ipAddressAttributes(java.util.List<IpAddressAttributes> ipAddressAttributes) {
                this.ipAddressAttributes = ipAddressAttributes;
                return this;
            }

            /**
             * <p>The IP addresses.</p>
             * <blockquote>
             * <p> Whether this parameter is returned is determined by the Alibaba Cloud service to which the resource belongs.</p>
             * </blockquote>
             */
            public Builder ipAddresses(java.util.List<String> ipAddresses) {
                this.ipAddresses = ipAddresses;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmzawhxxc****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The resource ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vtb-bp11lbh452fr8940s****</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The resource name.</p>
             * 
             * <strong>example:</strong>
             * <p>group1</p>
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>ACS::VPC::RouteTable</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The tags.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * <blockquote>
             * <p> Whether this parameter is returned is determined by the Alibaba Cloud service to which the resource belongs.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-k</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Resources build() {
                return new Resources(this);
            } 

        } 

    }
}
