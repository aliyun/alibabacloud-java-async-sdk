// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateIpsecServerRequest} extends {@link RequestModel}
 *
 * <p>CreateIpsecServerRequest</p>
 */
public class CreateIpsecServerRequest extends Request {
    @Query
    @NameInMap("ClientIpPool")
    @Validation(required = true)
    private String clientIpPool;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private String dryRun;

    @Query
    @NameInMap("EffectImmediately")
    private Boolean effectImmediately;

    @Query
    @NameInMap("IkeConfig")
    private String ikeConfig;

    @Query
    @NameInMap("IpSecServerName")
    @Validation(maxLength = 100)
    private String ipSecServerName;

    @Query
    @NameInMap("IpsecConfig")
    private String ipsecConfig;

    @Query
    @NameInMap("LocalSubnet")
    @Validation(required = true)
    private String localSubnet;

    @Query
    @NameInMap("Psk")
    private String psk;

    @Query
    @NameInMap("PskEnabled")
    private Boolean pskEnabled;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("VpnGatewayId")
    @Validation(required = true)
    private String vpnGatewayId;

    private CreateIpsecServerRequest(Builder builder) {
        super(builder);
        this.clientIpPool = builder.clientIpPool;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.effectImmediately = builder.effectImmediately;
        this.ikeConfig = builder.ikeConfig;
        this.ipSecServerName = builder.ipSecServerName;
        this.ipsecConfig = builder.ipsecConfig;
        this.localSubnet = builder.localSubnet;
        this.psk = builder.psk;
        this.pskEnabled = builder.pskEnabled;
        this.regionId = builder.regionId;
        this.vpnGatewayId = builder.vpnGatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIpsecServerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientIpPool
     */
    public String getClientIpPool() {
        return this.clientIpPool;
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
    public String getDryRun() {
        return this.dryRun;
    }

    /**
     * @return effectImmediately
     */
    public Boolean getEffectImmediately() {
        return this.effectImmediately;
    }

    /**
     * @return ikeConfig
     */
    public String getIkeConfig() {
        return this.ikeConfig;
    }

    /**
     * @return ipSecServerName
     */
    public String getIpSecServerName() {
        return this.ipSecServerName;
    }

    /**
     * @return ipsecConfig
     */
    public String getIpsecConfig() {
        return this.ipsecConfig;
    }

    /**
     * @return localSubnet
     */
    public String getLocalSubnet() {
        return this.localSubnet;
    }

    /**
     * @return psk
     */
    public String getPsk() {
        return this.psk;
    }

    /**
     * @return pskEnabled
     */
    public Boolean getPskEnabled() {
        return this.pskEnabled;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return vpnGatewayId
     */
    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

    public static final class Builder extends Request.Builder<CreateIpsecServerRequest, Builder> {
        private String clientIpPool; 
        private String clientToken; 
        private String dryRun; 
        private Boolean effectImmediately; 
        private String ikeConfig; 
        private String ipSecServerName; 
        private String ipsecConfig; 
        private String localSubnet; 
        private String psk; 
        private Boolean pskEnabled; 
        private String regionId; 
        private String vpnGatewayId; 

        private Builder() {
            super();
        } 

        private Builder(CreateIpsecServerRequest request) {
            super(request);
            this.clientIpPool = request.clientIpPool;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.effectImmediately = request.effectImmediately;
            this.ikeConfig = request.ikeConfig;
            this.ipSecServerName = request.ipSecServerName;
            this.ipsecConfig = request.ipsecConfig;
            this.localSubnet = request.localSubnet;
            this.psk = request.psk;
            this.pskEnabled = request.pskEnabled;
            this.regionId = request.regionId;
            this.vpnGatewayId = request.vpnGatewayId;
        } 

        /**
         * ClientIpPool.
         */
        public Builder clientIpPool(String clientIpPool) {
            this.putQueryParameter("ClientIpPool", clientIpPool);
            this.clientIpPool = clientIpPool;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DryRun.
         */
        public Builder dryRun(String dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * EffectImmediately.
         */
        public Builder effectImmediately(Boolean effectImmediately) {
            this.putQueryParameter("EffectImmediately", effectImmediately);
            this.effectImmediately = effectImmediately;
            return this;
        }

        /**
         * IkeConfig.
         */
        public Builder ikeConfig(String ikeConfig) {
            this.putQueryParameter("IkeConfig", ikeConfig);
            this.ikeConfig = ikeConfig;
            return this;
        }

        /**
         * IpSecServerName.
         */
        public Builder ipSecServerName(String ipSecServerName) {
            this.putQueryParameter("IpSecServerName", ipSecServerName);
            this.ipSecServerName = ipSecServerName;
            return this;
        }

        /**
         * IpsecConfig.
         */
        public Builder ipsecConfig(String ipsecConfig) {
            this.putQueryParameter("IpsecConfig", ipsecConfig);
            this.ipsecConfig = ipsecConfig;
            return this;
        }

        /**
         * LocalSubnet.
         */
        public Builder localSubnet(String localSubnet) {
            this.putQueryParameter("LocalSubnet", localSubnet);
            this.localSubnet = localSubnet;
            return this;
        }

        /**
         * Psk.
         */
        public Builder psk(String psk) {
            this.putQueryParameter("Psk", psk);
            this.psk = psk;
            return this;
        }

        /**
         * PskEnabled.
         */
        public Builder pskEnabled(Boolean pskEnabled) {
            this.putQueryParameter("PskEnabled", pskEnabled);
            this.pskEnabled = pskEnabled;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * VpnGatewayId.
         */
        public Builder vpnGatewayId(String vpnGatewayId) {
            this.putQueryParameter("VpnGatewayId", vpnGatewayId);
            this.vpnGatewayId = vpnGatewayId;
            return this;
        }

        @Override
        public CreateIpsecServerRequest build() {
            return new CreateIpsecServerRequest(this);
        } 

    } 

}
