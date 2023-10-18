// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVpnGatewayDiagnoseResultRequest} extends {@link RequestModel}
 *
 * <p>GetVpnGatewayDiagnoseResultRequest</p>
 */
public class GetVpnGatewayDiagnoseResultRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DiagnoseId")
    private String diagnoseId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("VpnGatewayId")
    private String vpnGatewayId;

    private GetVpnGatewayDiagnoseResultRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.diagnoseId = builder.diagnoseId;
        this.regionId = builder.regionId;
        this.vpnGatewayId = builder.vpnGatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVpnGatewayDiagnoseResultRequest create() {
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
     * @return diagnoseId
     */
    public String getDiagnoseId() {
        return this.diagnoseId;
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

    public static final class Builder extends Request.Builder<GetVpnGatewayDiagnoseResultRequest, Builder> {
        private String clientToken; 
        private String diagnoseId; 
        private String regionId; 
        private String vpnGatewayId; 

        private Builder() {
            super();
        } 

        private Builder(GetVpnGatewayDiagnoseResultRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.diagnoseId = request.diagnoseId;
            this.regionId = request.regionId;
            this.vpnGatewayId = request.vpnGatewayId;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.
         * 
         * **
         * 
         * **Description** If you do not specify this parameter, the system automatically uses the request ID as the client token. The request ID may be different for each request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The ID of the diagnostic operation.
         * <p>
         * 
         * When you call the [DiagnoseVpnGateway](~~469751~~) operation, the system returns a corresponding ID.
         */
        public Builder diagnoseId(String diagnoseId) {
            this.putQueryParameter("DiagnoseId", diagnoseId);
            this.diagnoseId = diagnoseId;
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
         * The ID of the VPN gateway.
         */
        public Builder vpnGatewayId(String vpnGatewayId) {
            this.putQueryParameter("VpnGatewayId", vpnGatewayId);
            this.vpnGatewayId = vpnGatewayId;
            return this;
        }

        @Override
        public GetVpnGatewayDiagnoseResultRequest build() {
            return new GetVpnGatewayDiagnoseResultRequest(this);
        } 

    } 

}
