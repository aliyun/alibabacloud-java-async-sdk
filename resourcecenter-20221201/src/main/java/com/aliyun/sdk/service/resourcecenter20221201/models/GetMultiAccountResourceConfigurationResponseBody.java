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
 * {@link GetMultiAccountResourceConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>GetMultiAccountResourceConfigurationResponseBody</p>
 */
public class GetMultiAccountResourceConfigurationResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

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

    private GetMultiAccountResourceConfigurationResponseBody(Builder builder) {
        this.accountId = builder.accountId;
        this.configuration = builder.configuration;
        this.createTime = builder.createTime;
        this.expireTime = builder.expireTime;
        this.ipAddressAttributes = builder.ipAddressAttributes;
        this.ipAddresses = builder.ipAddresses;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
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

    public static GetMultiAccountResourceConfigurationResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private String requestId; 
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
         * <p>1619302****</p>
         */
        public Builder accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * <p>The configurations of the resource.</p>
         */
        public Builder configuration(java.util.Map<String, ?> configuration) {
            this.configuration = configuration;
            return this;
        }

        /**
         * <p>The time when the resource was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-02-14T03:12:11Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The time when the resource expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-09-18T07:04:21Z</p>
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
         * <p>Whether this parameter is returned is determined by the Alibaba Cloud service to which the resource belongs.</p>
         * </blockquote>
         */
        public Builder ipAddresses(java.util.List<String> ipAddresses) {
            this.ipAddresses = ipAddresses;
            return this;
        }

        /**
         * <p>The region ID of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>B2DCC08B-C12A-5705-879C-5A1450016156</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the resource belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzy6d****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The ID of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>m-eb3hji****</p>
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>The name of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>test_resource</p>
         */
        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }

        /**
         * <p>The type of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS::VPC::RouteTable</p>
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The tags of the resource.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * <p>The zone ID of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai-a</p>
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        public GetMultiAccountResourceConfigurationResponseBody build() {
            return new GetMultiAccountResourceConfigurationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMultiAccountResourceConfigurationResponseBody} extends {@link TeaModel}
     *
     * <p>GetMultiAccountResourceConfigurationResponseBody</p>
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
             * 
             * <strong>example:</strong>
             * <p>172.27.199.42</p>
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
     * {@link GetMultiAccountResourceConfigurationResponseBody} extends {@link TeaModel}
     *
     * <p>GetMultiAccountResourceConfigurationResponseBody</p>
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
             * <p>tag-key</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of tag N.</p>
             * 
             * <strong>example:</strong>
             * <p>tag-value</p>
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
}
