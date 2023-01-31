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
         * system param
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * IPsecExtendInfo
         */
        public Builder iPsecExtendInfo(String iPsecExtendInfo) {
            this.putQueryParameter("IPsecExtendInfo", iPsecExtendInfo);
            this.iPsecExtendInfo = iPsecExtendInfo;
            return this;
        }

        /**
         * RegionId
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceId
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * ResourceType
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * VpnGatewayId
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
