// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.epg20260715.models;

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
 * {@link GetEgressProxyIpPoolAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>GetEgressProxyIpPoolAttributeResponseBody</p>
 */
public class GetEgressProxyIpPoolAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AddressType")
    private String addressType;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("EgressProxyGatewayId")
    private String egressProxyGatewayId;

    @com.aliyun.core.annotation.NameInMap("EgressProxyIpPoolId")
    private String egressProxyIpPoolId;

    @com.aliyun.core.annotation.NameInMap("EgressProxyIpPoolName")
    private String egressProxyIpPoolName;

    @com.aliyun.core.annotation.NameInMap("HashFactor")
    private String hashFactor;

    @com.aliyun.core.annotation.NameInMap("HashHeaderName")
    private String hashHeaderName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Scheduler")
    private String scheduler;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.NameInMap("ZoneMappings")
    private java.util.List<ZoneMappings> zoneMappings;

    private GetEgressProxyIpPoolAttributeResponseBody(Builder builder) {
        this.addressType = builder.addressType;
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.egressProxyGatewayId = builder.egressProxyGatewayId;
        this.egressProxyIpPoolId = builder.egressProxyIpPoolId;
        this.egressProxyIpPoolName = builder.egressProxyIpPoolName;
        this.hashFactor = builder.hashFactor;
        this.hashHeaderName = builder.hashHeaderName;
        this.requestId = builder.requestId;
        this.scheduler = builder.scheduler;
        this.status = builder.status;
        this.tags = builder.tags;
        this.zoneMappings = builder.zoneMappings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEgressProxyIpPoolAttributeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addressType
     */
    public String getAddressType() {
        return this.addressType;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return egressProxyGatewayId
     */
    public String getEgressProxyGatewayId() {
        return this.egressProxyGatewayId;
    }

    /**
     * @return egressProxyIpPoolId
     */
    public String getEgressProxyIpPoolId() {
        return this.egressProxyIpPoolId;
    }

    /**
     * @return egressProxyIpPoolName
     */
    public String getEgressProxyIpPoolName() {
        return this.egressProxyIpPoolName;
    }

    /**
     * @return hashFactor
     */
    public String getHashFactor() {
        return this.hashFactor;
    }

    /**
     * @return hashHeaderName
     */
    public String getHashHeaderName() {
        return this.hashHeaderName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scheduler
     */
    public String getScheduler() {
        return this.scheduler;
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
     * @return zoneMappings
     */
    public java.util.List<ZoneMappings> getZoneMappings() {
        return this.zoneMappings;
    }

    public static final class Builder {
        private String addressType; 
        private String createTime; 
        private String description; 
        private String egressProxyGatewayId; 
        private String egressProxyIpPoolId; 
        private String egressProxyIpPoolName; 
        private String hashFactor; 
        private String hashHeaderName; 
        private String requestId; 
        private String scheduler; 
        private String status; 
        private java.util.List<Tags> tags; 
        private java.util.List<ZoneMappings> zoneMappings; 

        private Builder() {
        } 

        private Builder(GetEgressProxyIpPoolAttributeResponseBody model) {
            this.addressType = model.addressType;
            this.createTime = model.createTime;
            this.description = model.description;
            this.egressProxyGatewayId = model.egressProxyGatewayId;
            this.egressProxyIpPoolId = model.egressProxyIpPoolId;
            this.egressProxyIpPoolName = model.egressProxyIpPoolName;
            this.hashFactor = model.hashFactor;
            this.hashHeaderName = model.hashHeaderName;
            this.requestId = model.requestId;
            this.scheduler = model.scheduler;
            this.status = model.status;
            this.tags = model.tags;
            this.zoneMappings = model.zoneMappings;
        } 

        /**
         * AddressType.
         */
        public Builder addressType(String addressType) {
            this.addressType = addressType;
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
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * EgressProxyGatewayId.
         */
        public Builder egressProxyGatewayId(String egressProxyGatewayId) {
            this.egressProxyGatewayId = egressProxyGatewayId;
            return this;
        }

        /**
         * EgressProxyIpPoolId.
         */
        public Builder egressProxyIpPoolId(String egressProxyIpPoolId) {
            this.egressProxyIpPoolId = egressProxyIpPoolId;
            return this;
        }

        /**
         * EgressProxyIpPoolName.
         */
        public Builder egressProxyIpPoolName(String egressProxyIpPoolName) {
            this.egressProxyIpPoolName = egressProxyIpPoolName;
            return this;
        }

        /**
         * HashFactor.
         */
        public Builder hashFactor(String hashFactor) {
            this.hashFactor = hashFactor;
            return this;
        }

        /**
         * HashHeaderName.
         */
        public Builder hashHeaderName(String hashHeaderName) {
            this.hashHeaderName = hashHeaderName;
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
         * Scheduler.
         */
        public Builder scheduler(String scheduler) {
            this.scheduler = scheduler;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
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
         * ZoneMappings.
         */
        public Builder zoneMappings(java.util.List<ZoneMappings> zoneMappings) {
            this.zoneMappings = zoneMappings;
            return this;
        }

        public GetEgressProxyIpPoolAttributeResponseBody build() {
            return new GetEgressProxyIpPoolAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetEgressProxyIpPoolAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>GetEgressProxyIpPoolAttributeResponseBody</p>
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
     * {@link GetEgressProxyIpPoolAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>GetEgressProxyIpPoolAttributeResponseBody</p>
     */
    public static class IpAddresses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EipAllocationId")
        private String eipAllocationId;

        @com.aliyun.core.annotation.NameInMap("PrivateIpv4Address")
        private String privateIpv4Address;

        @com.aliyun.core.annotation.NameInMap("PublicIpv4Address")
        private String publicIpv4Address;

        private IpAddresses(Builder builder) {
            this.eipAllocationId = builder.eipAllocationId;
            this.privateIpv4Address = builder.privateIpv4Address;
            this.publicIpv4Address = builder.publicIpv4Address;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpAddresses create() {
            return builder().build();
        }

        /**
         * @return eipAllocationId
         */
        public String getEipAllocationId() {
            return this.eipAllocationId;
        }

        /**
         * @return privateIpv4Address
         */
        public String getPrivateIpv4Address() {
            return this.privateIpv4Address;
        }

        /**
         * @return publicIpv4Address
         */
        public String getPublicIpv4Address() {
            return this.publicIpv4Address;
        }

        public static final class Builder {
            private String eipAllocationId; 
            private String privateIpv4Address; 
            private String publicIpv4Address; 

            private Builder() {
            } 

            private Builder(IpAddresses model) {
                this.eipAllocationId = model.eipAllocationId;
                this.privateIpv4Address = model.privateIpv4Address;
                this.publicIpv4Address = model.publicIpv4Address;
            } 

            /**
             * EipAllocationId.
             */
            public Builder eipAllocationId(String eipAllocationId) {
                this.eipAllocationId = eipAllocationId;
                return this;
            }

            /**
             * PrivateIpv4Address.
             */
            public Builder privateIpv4Address(String privateIpv4Address) {
                this.privateIpv4Address = privateIpv4Address;
                return this;
            }

            /**
             * PublicIpv4Address.
             */
            public Builder publicIpv4Address(String publicIpv4Address) {
                this.publicIpv4Address = publicIpv4Address;
                return this;
            }

            public IpAddresses build() {
                return new IpAddresses(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEgressProxyIpPoolAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>GetEgressProxyIpPoolAttributeResponseBody</p>
     */
    public static class ZoneMappings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IpAddresses")
        private java.util.List<IpAddresses> ipAddresses;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private ZoneMappings(Builder builder) {
            this.ipAddresses = builder.ipAddresses;
            this.vSwitchId = builder.vSwitchId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ZoneMappings create() {
            return builder().build();
        }

        /**
         * @return ipAddresses
         */
        public java.util.List<IpAddresses> getIpAddresses() {
            return this.ipAddresses;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private java.util.List<IpAddresses> ipAddresses; 
            private String vSwitchId; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(ZoneMappings model) {
                this.ipAddresses = model.ipAddresses;
                this.vSwitchId = model.vSwitchId;
                this.zoneId = model.zoneId;
            } 

            /**
             * IpAddresses.
             */
            public Builder ipAddresses(java.util.List<IpAddresses> ipAddresses) {
                this.ipAddresses = ipAddresses;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public ZoneMappings build() {
                return new ZoneMappings(this);
            } 

        } 

    }
}
