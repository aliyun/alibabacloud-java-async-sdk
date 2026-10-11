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
 * {@link CreateEgressProxyIpPoolRequest} extends {@link RequestModel}
 *
 * <p>CreateEgressProxyIpPoolRequest</p>
 */
public class CreateEgressProxyIpPoolRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AddressType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String addressType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EgressProxyGatewayId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String egressProxyGatewayId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EgressProxyIpPoolName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String egressProxyIpPoolName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HashFactor")
    private String hashFactor;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("HashHeaderName")
    private String hashHeaderName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Scheduler")
    private String scheduler;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ZoneMappings")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<ZoneMappings> zoneMappings;

    private CreateEgressProxyIpPoolRequest(Builder builder) {
        super(builder);
        this.addressType = builder.addressType;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.dryRun = builder.dryRun;
        this.egressProxyGatewayId = builder.egressProxyGatewayId;
        this.egressProxyIpPoolName = builder.egressProxyIpPoolName;
        this.hashFactor = builder.hashFactor;
        this.hashHeaderName = builder.hashHeaderName;
        this.scheduler = builder.scheduler;
        this.tag = builder.tag;
        this.zoneMappings = builder.zoneMappings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEgressProxyIpPoolRequest create() {
        return builder().build();
    }

@Override
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return egressProxyGatewayId
     */
    public String getEgressProxyGatewayId() {
        return this.egressProxyGatewayId;
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
     * @return scheduler
     */
    public String getScheduler() {
        return this.scheduler;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return zoneMappings
     */
    public java.util.List<ZoneMappings> getZoneMappings() {
        return this.zoneMappings;
    }

    public static final class Builder extends Request.Builder<CreateEgressProxyIpPoolRequest, Builder> {
        private String addressType; 
        private String clientToken; 
        private String description; 
        private Boolean dryRun; 
        private String egressProxyGatewayId; 
        private String egressProxyIpPoolName; 
        private String hashFactor; 
        private String hashHeaderName; 
        private String scheduler; 
        private java.util.List<Tag> tag; 
        private java.util.List<ZoneMappings> zoneMappings; 

        private Builder() {
            super();
        } 

        private Builder(CreateEgressProxyIpPoolRequest request) {
            super(request);
            this.addressType = request.addressType;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.dryRun = request.dryRun;
            this.egressProxyGatewayId = request.egressProxyGatewayId;
            this.egressProxyIpPoolName = request.egressProxyIpPoolName;
            this.hashFactor = request.hashFactor;
            this.hashHeaderName = request.hashHeaderName;
            this.scheduler = request.scheduler;
            this.tag = request.tag;
            this.zoneMappings = request.zoneMappings;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Intranet</p>
         */
        public Builder addressType(String addressType) {
            this.putBodyParameter("AddressType", addressType);
            this.addressType = addressType;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>epg-gw80bb6a94f835db****</p>
         */
        public Builder egressProxyGatewayId(String egressProxyGatewayId) {
            this.putBodyParameter("EgressProxyGatewayId", egressProxyGatewayId);
            this.egressProxyGatewayId = egressProxyGatewayId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testIpPool</p>
         */
        public Builder egressProxyIpPoolName(String egressProxyIpPoolName) {
            this.putBodyParameter("EgressProxyIpPoolName", egressProxyIpPoolName);
            this.egressProxyIpPoolName = egressProxyIpPoolName;
            return this;
        }

        /**
         * HashFactor.
         */
        public Builder hashFactor(String hashFactor) {
            this.putBodyParameter("HashFactor", hashFactor);
            this.hashFactor = hashFactor;
            return this;
        }

        /**
         * HashHeaderName.
         */
        public Builder hashHeaderName(String hashHeaderName) {
            this.putBodyParameter("HashHeaderName", hashHeaderName);
            this.hashHeaderName = hashHeaderName;
            return this;
        }

        /**
         * Scheduler.
         */
        public Builder scheduler(String scheduler) {
            this.putBodyParameter("Scheduler", scheduler);
            this.scheduler = scheduler;
            return this;
        }

        /**
         * Tag.
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putBodyParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder zoneMappings(java.util.List<ZoneMappings> zoneMappings) {
            this.putBodyParameter("ZoneMappings", zoneMappings);
            this.zoneMappings = zoneMappings;
            return this;
        }

        @Override
        public CreateEgressProxyIpPoolRequest build() {
            return new CreateEgressProxyIpPoolRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateEgressProxyIpPoolRequest} extends {@link TeaModel}
     *
     * <p>CreateEgressProxyIpPoolRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(Tag model) {
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

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEgressProxyIpPoolRequest} extends {@link TeaModel}
     *
     * <p>CreateEgressProxyIpPoolRequest</p>
     */
    public static class IpAddresses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EipAllocationId")
        private String eipAllocationId;

        @com.aliyun.core.annotation.NameInMap("PrivateIpv4Address")
        private String privateIpv4Address;

        private IpAddresses(Builder builder) {
            this.eipAllocationId = builder.eipAllocationId;
            this.privateIpv4Address = builder.privateIpv4Address;
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

        public static final class Builder {
            private String eipAllocationId; 
            private String privateIpv4Address; 

            private Builder() {
            } 

            private Builder(IpAddresses model) {
                this.eipAllocationId = model.eipAllocationId;
                this.privateIpv4Address = model.privateIpv4Address;
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

            public IpAddresses build() {
                return new IpAddresses(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEgressProxyIpPoolRequest} extends {@link TeaModel}
     *
     * <p>CreateEgressProxyIpPoolRequest</p>
     */
    public static class ZoneMappings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IpAddresses")
        private java.util.List<IpAddresses> ipAddresses;

        @com.aliyun.core.annotation.NameInMap("IpCount")
        private Integer ipCount;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String zoneId;

        private ZoneMappings(Builder builder) {
            this.ipAddresses = builder.ipAddresses;
            this.ipCount = builder.ipCount;
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
         * @return ipCount
         */
        public Integer getIpCount() {
            return this.ipCount;
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
            private Integer ipCount; 
            private String vSwitchId; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(ZoneMappings model) {
                this.ipAddresses = model.ipAddresses;
                this.ipCount = model.ipCount;
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
             * IpCount.
             */
            public Builder ipCount(Integer ipCount) {
                this.ipCount = ipCount;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-0jl8x3ridfqbikax5o****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai-b</p>
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
