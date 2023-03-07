// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>GetResourceConfigurationResponseBody</p>
 */
public class GetResourceConfigurationResponseBody extends TeaModel {
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

    private GetResourceConfigurationResponseBody(Builder builder) {
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

    public static GetResourceConfigurationResponseBody create() {
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
         * AccountId.
         */
        public Builder accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * Configuration.
         */
        public Builder configuration(java.util.Map < String, ? > configuration) {
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
         * IpAddresses.
         */
        public Builder ipAddresses(java.util.List < String > ipAddresses) {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
        public Builder tags(java.util.List < Tags> tags) {
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

        public GetResourceConfigurationResponseBody build() {
            return new GetResourceConfigurationResponseBody(this);
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
}
