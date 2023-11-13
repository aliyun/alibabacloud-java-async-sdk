// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchMultiAccountResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>SearchMultiAccountResourcesResponseBody</p>
 */
public class SearchMultiAccountResourcesResponseBody extends TeaModel {
    @NameInMap("Filters")
    private java.util.List < Filters> filters;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Resources")
    private java.util.List < Resources> resources;

    @NameInMap("Scope")
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
    public java.util.List < Filters> getFilters() {
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
    public java.util.List < Resources> getResources() {
        return this.resources;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    public static final class Builder {
        private java.util.List < Filters> filters; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List < Resources> resources; 
        private String scope; 

        /**
         * The filter conditions.
         */
        public Builder filters(java.util.List < Filters> filters) {
            this.filters = filters;
            return this;
        }

        /**
         * The maximum number of entries returned per page.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The pagination token that is used in the next request to retrieve a new page of results.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * The information about the resources.
         */
        public Builder resources(java.util.List < Resources> resources) {
            this.resources = resources;
            return this;
        }

        /**
         * The search scope.
         * <p>
         * 
         * *   ID of a resource directory: Resources within the management account and all members of the resource directory are searched.
         * *   ID of the Root folder: Resources within all members in the Root folder and the subfolders of the Root folder are searched.
         * *   ID of a folder: Resources within all members in the folder are searched.
         * *   ID of a member: Resources within the member are searched.
         */
        public Builder scope(String scope) {
            this.scope = scope;
            return this;
        }

        public SearchMultiAccountResourcesResponseBody build() {
            return new SearchMultiAccountResourcesResponseBody(this);
        } 

    } 

    public static class Filters extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("MatchType")
        private String matchType;

        @NameInMap("Values")
        private java.util.List < String > values;

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
        public java.util.List < String > getValues() {
            return this.values;
        }

        public static final class Builder {
            private String key; 
            private String matchType; 
            private java.util.List < String > values; 

            /**
             * The key of the filter condition.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The matching mode.
             */
            public Builder matchType(String matchType) {
                this.matchType = matchType;
                return this;
            }

            /**
             * The values of the filter condition.
             */
            public Builder values(java.util.List < String > values) {
                this.values = values;
                return this;
            }

            public Filters build() {
                return new Filters(this);
            } 

        } 

    }
    public static class IpAddressAttributes extends TeaModel {
        @NameInMap("IpAddress")
        private java.util.List < String > ipAddress;

        @NameInMap("NetworkType")
        private String networkType;

        @NameInMap("Version")
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
        public java.util.List < String > getIpAddress() {
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
            private java.util.List < String > ipAddress; 
            private String networkType; 
            private String version; 

            /**
             * IpAddress.
             */
            public Builder ipAddress(java.util.List < String > ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * NetworkType.
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * Version.
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
    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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
             * The key of the tag.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the tag.
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
    public static class Resources extends TeaModel {
        @NameInMap("AccountId")
        private String accountId;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("ExpireTime")
        private String expireTime;

        @NameInMap("IpAddressAttributes")
        private java.util.List < IpAddressAttributes> ipAddressAttributes;

        @NameInMap("IpAddresses")
        private java.util.List < String > ipAddresses;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("ResourceId")
        private String resourceId;

        @NameInMap("ResourceName")
        private String resourceName;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        @NameInMap("ZoneId")
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
        public java.util.List < IpAddressAttributes> getIpAddressAttributes() {
            return this.ipAddressAttributes;
        }

        /**
         * @return ipAddresses
         */
        public java.util.List < String > getIpAddresses() {
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
        public java.util.List < Tags> getTags() {
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
            private java.util.List < IpAddressAttributes> ipAddressAttributes; 
            private java.util.List < String > ipAddresses; 
            private String regionId; 
            private String resourceGroupId; 
            private String resourceId; 
            private String resourceName; 
            private String resourceType; 
            private java.util.List < Tags> tags; 
            private String zoneId; 

            /**
             * The ID of the management account or member of the resource directory.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * The time when the resource was created.
             * <p>
             * 
             * > Whether this parameter is returned is determined by the Alibaba Cloud service to which the resource belongs.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
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
             * IpAddressAttributes.
             */
            public Builder ipAddressAttributes(java.util.List < IpAddressAttributes> ipAddressAttributes) {
                this.ipAddressAttributes = ipAddressAttributes;
                return this;
            }

            /**
             * The IP addresses.
             * <p>
             * 
             * > Whether this parameter is returned is determined by the Alibaba Cloud service to which the resource belongs.
             */
            public Builder ipAddresses(java.util.List < String > ipAddresses) {
                this.ipAddresses = ipAddresses;
                return this;
            }

            /**
             * The region ID of the resource.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the resource group to which the resource belongs.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The ID of the resource.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * The name of the resource.
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * The type of the resource.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * The tags of the resource.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The zone ID of the resource.
             * <p>
             * 
             * > Whether this parameter is returned is determined by the Alibaba Cloud service to which the resource belongs.
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
