// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMultiAccountResourceConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>GetMultiAccountResourceConfigurationResponseBody</p>
 */
public class GetMultiAccountResourceConfigurationResponseBody extends TeaModel {
    @NameInMap("AccountId")
    private String accountId;

    @NameInMap("Configuration")
    private java.util.Map < String, ? > configuration;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("IpAddresses")
    private java.util.List < String > ipAddresses;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

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

    private GetMultiAccountResourceConfigurationResponseBody(Builder builder) {
        this.accountId = builder.accountId;
        this.configuration = builder.configuration;
        this.createTime = builder.createTime;
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
    public java.util.Map < String, ? > getConfiguration() {
        return this.configuration;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
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
        private java.util.Map < String, ? > configuration; 
        private String createTime; 
        private java.util.List < String > ipAddresses; 
        private String regionId; 
        private String requestId; 
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
         * The configurations of the resource.
         */
        public Builder configuration(java.util.Map < String, ? > configuration) {
            this.configuration = configuration;
            return this;
        }

        /**
         * The time when the resource was created.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        public GetMultiAccountResourceConfigurationResponseBody build() {
            return new GetMultiAccountResourceConfigurationResponseBody(this);
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
}
