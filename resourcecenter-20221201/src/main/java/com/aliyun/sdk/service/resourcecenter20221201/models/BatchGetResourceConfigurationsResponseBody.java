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
 * {@link BatchGetResourceConfigurationsResponseBody} extends {@link TeaModel}
 *
 * <p>BatchGetResourceConfigurationsResponseBody</p>
 */
public class BatchGetResourceConfigurationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Resources")
    private java.util.List<Resources> resources;

    private BatchGetResourceConfigurationsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resources = builder.resources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchGetResourceConfigurationsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder {
        private String requestId; 
        private java.util.List<Resources> resources; 

        private Builder() {
        } 

        private Builder(BatchGetResourceConfigurationsResponseBody model) {
            this.requestId = model.requestId;
            this.resources = model.resources;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Resources.
         */
        public Builder resources(java.util.List<Resources> resources) {
            this.resources = resources;
            return this;
        }

        public BatchGetResourceConfigurationsResponseBody build() {
            return new BatchGetResourceConfigurationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BatchGetResourceConfigurationsResponseBody} extends {@link TeaModel}
     *
     * <p>BatchGetResourceConfigurationsResponseBody</p>
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

            private Builder() {
            } 

            private Builder(IpAddressAttributes model) {
                this.ipAddress = model.ipAddress;
                this.networkType = model.networkType;
                this.version = model.version;
            } 

            /**
             * IpAddress.
             */
            public Builder ipAddress(String ipAddress) {
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
    /**
     * 
     * {@link BatchGetResourceConfigurationsResponseBody} extends {@link TeaModel}
     *
     * <p>BatchGetResourceConfigurationsResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

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

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchGetResourceConfigurationsResponseBody} extends {@link TeaModel}
     *
     * <p>BatchGetResourceConfigurationsResponseBody</p>
     */
    public static class Resources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("Configuration")
        private java.util.Map<String, ?> configuration;

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
            this.configuration = builder.configuration;
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
         * @return configuration
         */
        public java.util.Map<String, ?> getConfiguration() {
            return this.configuration;
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
            private java.util.Map<String, ?> configuration; 
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

            private Builder() {
            } 

            private Builder(Resources model) {
                this.accountId = model.accountId;
                this.configuration = model.configuration;
                this.createTime = model.createTime;
                this.expireTime = model.expireTime;
                this.ipAddressAttributes = model.ipAddressAttributes;
                this.ipAddresses = model.ipAddresses;
                this.regionId = model.regionId;
                this.resourceGroupId = model.resourceGroupId;
                this.resourceId = model.resourceId;
                this.resourceName = model.resourceName;
                this.resourceType = model.resourceType;
                this.tags = model.tags;
                this.zoneId = model.zoneId;
            } 

            /**
             * AccountId.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * Configuration.
             */
            public Builder configuration(java.util.Map<String, ?> configuration) {
                this.configuration = configuration;
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
             * ExpireTime.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * IpAddressAttributes.
             */
            public Builder ipAddressAttributes(java.util.List<IpAddressAttributes> ipAddressAttributes) {
                this.ipAddressAttributes = ipAddressAttributes;
                return this;
            }

            /**
             * IpAddresses.
             */
            public Builder ipAddresses(java.util.List<String> ipAddresses) {
                this.ipAddresses = ipAddresses;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
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
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * ResourceName.
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * ZoneId.
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
