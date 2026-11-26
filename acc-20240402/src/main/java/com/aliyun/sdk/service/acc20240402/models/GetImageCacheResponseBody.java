// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.acc20240402.models;

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
 * {@link GetImageCacheResponseBody} extends {@link TeaModel}
 *
 * <p>GetImageCacheResponseBody</p>
 */
public class GetImageCacheResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("Events")
    private java.util.List<Events> events;

    @com.aliyun.core.annotation.NameInMap("ImageCacheId")
    private String imageCacheId;

    @com.aliyun.core.annotation.NameInMap("ImageCacheName")
    private String imageCacheName;

    @com.aliyun.core.annotation.NameInMap("Images")
    private java.util.List<String> images;

    @com.aliyun.core.annotation.NameInMap("NetworkConfig")
    private NetworkConfig networkConfig;

    @com.aliyun.core.annotation.NameInMap("PaymentType")
    private String paymentType;

    @com.aliyun.core.annotation.NameInMap("Platform")
    private String platform;

    @com.aliyun.core.annotation.NameInMap("ReadyTime")
    private String readyTime;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("Size")
    private Integer size;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private GetImageCacheResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.events = builder.events;
        this.imageCacheId = builder.imageCacheId;
        this.imageCacheName = builder.imageCacheName;
        this.images = builder.images;
        this.networkConfig = builder.networkConfig;
        this.paymentType = builder.paymentType;
        this.platform = builder.platform;
        this.readyTime = builder.readyTime;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.size = builder.size;
        this.status = builder.status;
        this.tags = builder.tags;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetImageCacheResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return events
     */
    public java.util.List<Events> getEvents() {
        return this.events;
    }

    /**
     * @return imageCacheId
     */
    public String getImageCacheId() {
        return this.imageCacheId;
    }

    /**
     * @return imageCacheName
     */
    public String getImageCacheName() {
        return this.imageCacheName;
    }

    /**
     * @return images
     */
    public java.util.List<String> getImages() {
        return this.images;
    }

    /**
     * @return networkConfig
     */
    public NetworkConfig getNetworkConfig() {
        return this.networkConfig;
    }

    /**
     * @return paymentType
     */
    public String getPaymentType() {
        return this.paymentType;
    }

    /**
     * @return platform
     */
    public String getPlatform() {
        return this.platform;
    }

    /**
     * @return readyTime
     */
    public String getReadyTime() {
        return this.readyTime;
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
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String createTime; 
        private java.util.List<Events> events; 
        private String imageCacheId; 
        private String imageCacheName; 
        private java.util.List<String> images; 
        private NetworkConfig networkConfig; 
        private String paymentType; 
        private String platform; 
        private String readyTime; 
        private String regionId; 
        private String requestId; 
        private String resourceGroupId; 
        private Integer size; 
        private String status; 
        private java.util.List<Tags> tags; 
        private String type; 

        private Builder() {
        } 

        private Builder(GetImageCacheResponseBody model) {
            this.createTime = model.createTime;
            this.events = model.events;
            this.imageCacheId = model.imageCacheId;
            this.imageCacheName = model.imageCacheName;
            this.images = model.images;
            this.networkConfig = model.networkConfig;
            this.paymentType = model.paymentType;
            this.platform = model.platform;
            this.readyTime = model.readyTime;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.resourceGroupId = model.resourceGroupId;
            this.size = model.size;
            this.status = model.status;
            this.tags = model.tags;
            this.type = model.type;
        } 

        /**
         * <p>The time when the image cache was created, in ISO 8601 format and UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-**-**T07:55:25Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The events of the image cache.</p>
         */
        public Builder events(java.util.List<Events> events) {
            this.events = events;
            return this;
        }

        /**
         * <p>The image cache ID.</p>
         * 
         * <strong>example:</strong>
         * <p>imc-bp1dj*****</p>
         */
        public Builder imageCacheId(String imageCacheId) {
            this.imageCacheId = imageCacheId;
            return this;
        }

        /**
         * <p>The name of the image cache.</p>
         * 
         * <strong>example:</strong>
         * <p>my-imc</p>
         */
        public Builder imageCacheName(String imageCacheName) {
            this.imageCacheName = imageCacheName;
            return this;
        }

        /**
         * <p>The names of the container images in the image cache.</p>
         */
        public Builder images(java.util.List<String> images) {
            this.images = images;
            return this;
        }

        /**
         * <p>The network configurations for pulling images when the image cache is created.</p>
         */
        public Builder networkConfig(NetworkConfig networkConfig) {
            this.networkConfig = networkConfig;
            return this;
        }

        /**
         * <p>The billing method.</p>
         * 
         * <strong>example:</strong>
         * <p>PayAsYouGo</p>
         */
        public Builder paymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        /**
         * <p>The platform type of the image cache. Valid values: linux/amd64 and windows/amd64.</p>
         * 
         * <strong>example:</strong>
         * <p>windows/amd64</p>
         */
        public Builder platform(String platform) {
            this.platform = platform;
            return this;
        }

        /**
         * <p>The time when the image cache becomes active, in ISO 8601 format and UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-**-**T07:58:25Z</p>
         */
        public Builder readyTime(String readyTime) {
            this.readyTime = readyTime;
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0E234675-3465-4CC3-9D0F-9A864BC*****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzh43v*****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The size of the image cache. Unit: GiB. Minimum value: 1 GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder size(Integer size) {
            this.size = size;
            return this;
        }

        /**
         * <p>The status of the image cache.</p>
         * 
         * <strong>example:</strong>
         * <p>Ready</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The tags of the image cache. Up to 20 tags are supported.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * <p>The image cache type. Valid values: <code>General</code>, <code>Base</code>, and <code>Derived</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>General</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public GetImageCacheResponseBody build() {
            return new GetImageCacheResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetImageCacheResponseBody} extends {@link TeaModel}
     *
     * <p>GetImageCacheResponseBody</p>
     */
    public static class Events extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("FirstTimestamp")
        private String firstTimestamp;

        @com.aliyun.core.annotation.NameInMap("LastTimestamp")
        private String lastTimestamp;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Events(Builder builder) {
            this.count = builder.count;
            this.firstTimestamp = builder.firstTimestamp;
            this.lastTimestamp = builder.lastTimestamp;
            this.message = builder.message;
            this.name = builder.name;
            this.reason = builder.reason;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Events create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return firstTimestamp
         */
        public String getFirstTimestamp() {
            return this.firstTimestamp;
        }

        /**
         * @return lastTimestamp
         */
        public String getLastTimestamp() {
            return this.lastTimestamp;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer count; 
            private String firstTimestamp; 
            private String lastTimestamp; 
            private String message; 
            private String name; 
            private String reason; 
            private String type; 

            private Builder() {
            } 

            private Builder(Events model) {
                this.count = model.count;
                this.firstTimestamp = model.firstTimestamp;
                this.lastTimestamp = model.lastTimestamp;
                this.message = model.message;
                this.name = model.name;
                this.reason = model.reason;
                this.type = model.type;
            } 

            /**
             * <p>The number of times the event was triggered.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The time when the event first occurred.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-**-**T02:24:48Z</p>
             */
            public Builder firstTimestamp(String firstTimestamp) {
                this.firstTimestamp = firstTimestamp;
                return this;
            }

            /**
             * <p>The time when the event last occurred.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-**-**T02:24:48Z</p>
             */
            public Builder lastTimestamp(String lastTimestamp) {
                this.lastTimestamp = lastTimestamp;
                return this;
            }

            /**
             * <p>The event message.</p>
             * 
             * <strong>example:</strong>
             * <p>Image cache [my-imc] has been created successfully</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The event name.</p>
             * 
             * <strong>example:</strong>
             * <p>imagetest.1661f31f851*****</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The cause of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>ImageCacheCreated</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>The event type.</p>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Events build() {
                return new Events(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetImageCacheResponseBody} extends {@link TeaModel}
     *
     * <p>GetImageCacheResponseBody</p>
     */
    public static class EipInstance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoCreate")
        private Boolean autoCreate;

        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private Integer bandwidth;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        private EipInstance(Builder builder) {
            this.autoCreate = builder.autoCreate;
            this.bandwidth = builder.bandwidth;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EipInstance create() {
            return builder().build();
        }

        /**
         * @return autoCreate
         */
        public Boolean getAutoCreate() {
            return this.autoCreate;
        }

        /**
         * @return bandwidth
         */
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private Boolean autoCreate; 
            private Integer bandwidth; 
            private String instanceId; 

            private Builder() {
            } 

            private Builder(EipInstance model) {
                this.autoCreate = model.autoCreate;
                this.bandwidth = model.bandwidth;
                this.instanceId = model.instanceId;
            } 

            /**
             * <p>Specifies whether to automatically create an EIP.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoCreate(Boolean autoCreate) {
                this.autoCreate = autoCreate;
                return this;
            }

            /**
             * <p>The bandwidth of the automatically created EIP. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>The elastic IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>eip-0jl0bx3fnpnjc9i4*****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public EipInstance build() {
                return new EipInstance(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetImageCacheResponseBody} extends {@link TeaModel}
     *
     * <p>GetImageCacheResponseBody</p>
     */
    public static class NetworkConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EipInstance")
        private EipInstance eipInstance;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("VSwitchIds")
        private java.util.List<String> vSwitchIds;

        private NetworkConfig(Builder builder) {
            this.eipInstance = builder.eipInstance;
            this.securityGroupId = builder.securityGroupId;
            this.vSwitchIds = builder.vSwitchIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkConfig create() {
            return builder().build();
        }

        /**
         * @return eipInstance
         */
        public EipInstance getEipInstance() {
            return this.eipInstance;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return vSwitchIds
         */
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public static final class Builder {
            private EipInstance eipInstance; 
            private String securityGroupId; 
            private java.util.List<String> vSwitchIds; 

            private Builder() {
            } 

            private Builder(NetworkConfig model) {
                this.eipInstance = model.eipInstance;
                this.securityGroupId = model.securityGroupId;
                this.vSwitchIds = model.vSwitchIds;
            } 

            /**
             * <p>The configurations of the elastic IP address (EIP) instance.</p>
             */
            public Builder eipInstance(EipInstance eipInstance) {
                this.eipInstance = eipInstance;
                return this;
            }

            /**
             * <p>The security group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-0jlgektkddwa42n*****</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The vSwitch IDs.</p>
             */
            public Builder vSwitchIds(java.util.List<String> vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            public NetworkConfig build() {
                return new NetworkConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetImageCacheResponseBody} extends {@link TeaModel}
     *
     * <p>GetImageCacheResponseBody</p>
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
             * <p>The tag key of the image cache.</p>
             * 
             * <strong>example:</strong>
             * <p>imc</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the image cache.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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
