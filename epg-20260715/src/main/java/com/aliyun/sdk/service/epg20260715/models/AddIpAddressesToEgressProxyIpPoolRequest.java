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
 * {@link AddIpAddressesToEgressProxyIpPoolRequest} extends {@link RequestModel}
 *
 * <p>AddIpAddressesToEgressProxyIpPoolRequest</p>
 */
public class AddIpAddressesToEgressProxyIpPoolRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EgressProxyIpPoolId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String egressProxyIpPoolId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ZoneMappings")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<ZoneMappings> zoneMappings;

    private AddIpAddressesToEgressProxyIpPoolRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.egressProxyIpPoolId = builder.egressProxyIpPoolId;
        this.zoneMappings = builder.zoneMappings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddIpAddressesToEgressProxyIpPoolRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return egressProxyIpPoolId
     */
    public String getEgressProxyIpPoolId() {
        return this.egressProxyIpPoolId;
    }

    /**
     * @return zoneMappings
     */
    public java.util.List<ZoneMappings> getZoneMappings() {
        return this.zoneMappings;
    }

    public static final class Builder extends Request.Builder<AddIpAddressesToEgressProxyIpPoolRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String egressProxyIpPoolId; 
        private java.util.List<ZoneMappings> zoneMappings; 

        private Builder() {
            super();
        } 

        private Builder(AddIpAddressesToEgressProxyIpPoolRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.egressProxyIpPoolId = request.egressProxyIpPoolId;
            this.zoneMappings = request.zoneMappings;
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
         * <p>eppool-gw80606a59ecc10****</p>
         */
        public Builder egressProxyIpPoolId(String egressProxyIpPoolId) {
            this.putBodyParameter("EgressProxyIpPoolId", egressProxyIpPoolId);
            this.egressProxyIpPoolId = egressProxyIpPoolId;
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
        public AddIpAddressesToEgressProxyIpPoolRequest build() {
            return new AddIpAddressesToEgressProxyIpPoolRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddIpAddressesToEgressProxyIpPoolRequest} extends {@link TeaModel}
     *
     * <p>AddIpAddressesToEgressProxyIpPoolRequest</p>
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
     * {@link AddIpAddressesToEgressProxyIpPoolRequest} extends {@link TeaModel}
     *
     * <p>AddIpAddressesToEgressProxyIpPoolRequest</p>
     */
    public static class ZoneMappings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IpAddresses")
        private java.util.List<IpAddresses> ipAddresses;

        @com.aliyun.core.annotation.NameInMap("IpCount")
        private Integer ipCount;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String zoneId;

        private ZoneMappings(Builder builder) {
            this.ipAddresses = builder.ipAddresses;
            this.ipCount = builder.ipCount;
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
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private java.util.List<IpAddresses> ipAddresses; 
            private Integer ipCount; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(ZoneMappings model) {
                this.ipAddresses = model.ipAddresses;
                this.ipCount = model.ipCount;
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
             * <p>cn-hangzhou-g</p>
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
