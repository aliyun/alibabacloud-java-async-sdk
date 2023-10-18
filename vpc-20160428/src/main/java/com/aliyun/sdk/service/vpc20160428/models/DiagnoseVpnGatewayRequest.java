// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DiagnoseVpnGatewayRequest} extends {@link RequestModel}
 *
 * <p>DiagnoseVpnGatewayRequest</p>
 */
public class DiagnoseVpnGatewayRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("IPsecExtendInfo")
    private String iPsecExtendInfo;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceId")
    @Validation(required = true)
    private String resourceId;

    @Query
    @NameInMap("ResourceType")
    @Validation(required = true)
    private String resourceType;

    @Query
    @NameInMap("VpnGatewayId")
    @Validation(required = true)
    private String vpnGatewayId;

    private DiagnoseVpnGatewayRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.iPsecExtendInfo = builder.iPsecExtendInfo;
        this.regionId = builder.regionId;
        this.resourceId = builder.resourceId;
        this.resourceType = builder.resourceType;
        this.vpnGatewayId = builder.vpnGatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DiagnoseVpnGatewayRequest create() {
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
     * @return iPsecExtendInfo
     */
    public String getIPsecExtendInfo() {
        return this.iPsecExtendInfo;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return vpnGatewayId
     */
    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

    public static final class Builder extends Request.Builder<DiagnoseVpnGatewayRequest, Builder> {
        private String clientToken; 
        private String iPsecExtendInfo; 
        private String regionId; 
        private String resourceId; 
        private String resourceType; 
        private String vpnGatewayId; 

        private Builder() {
            super();
        } 

        private Builder(DiagnoseVpnGatewayRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.iPsecExtendInfo = request.iPsecExtendInfo;
            this.regionId = request.regionId;
            this.resourceId = request.resourceId;
            this.resourceType = request.resourceType;
            this.vpnGatewayId = request.vpnGatewayId;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.
         * 
         * >  If you do not specify this parameter, the system automatically uses the request ID as the client token. The request ID may be different for each request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The configuration when you check the connectivity of the IPsec-VPN connection. Valid values:
         * <p>
         * 
         * *   **PrivateSourceIp**: the source IP address used when you check the connectivity of the IPsec-VPN connection. The source IP address must be on the VPC side.
         * *   **PrivateDestinationIp**: the destination IP address used when you check the connectivity of the IPsec-VPN connection. The destination IP address must be on the data center side.
         */
        public Builder iPsecExtendInfo(String iPsecExtendInfo) {
            this.putQueryParameter("IPsecExtendInfo", iPsecExtendInfo);
            this.iPsecExtendInfo = iPsecExtendInfo;
            return this;
        }

        /**
         * The region ID of the VPN gateway.
         * <p>
         * 
         * You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource to be diagnosed.
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * The type of the resource.
         * <p>
         * 
         * Set the value to **Ipsec**, which specifies an IPsec-VPN connection.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * The ID of the VPN gateway.
         */
        public Builder vpnGatewayId(String vpnGatewayId) {
            this.putQueryParameter("VpnGatewayId", vpnGatewayId);
            this.vpnGatewayId = vpnGatewayId;
            return this;
        }

        @Override
        public DiagnoseVpnGatewayRequest build() {
            return new DiagnoseVpnGatewayRequest(this);
        } 

    } 

}
