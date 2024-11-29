// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetVpnGatewayDiagnoseResultRequest} extends {@link RequestModel}
 *
 * <p>GetVpnGatewayDiagnoseResultRequest</p>
 */
public class GetVpnGatewayDiagnoseResultRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiagnoseId")
    private String diagnoseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpnGatewayId")
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
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
         * <p>**</p>
         * <p><strong>Description</strong> If you do not specify this parameter, the system automatically uses the request ID as the client token. The request ID may be different for each request.</p>
         * 
         * <strong>example:</strong>
         * <p>02fb3da4-130e-11e9-8e44-001****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The ID of the diagnostic operation.</p>
         * <p>When you call the <a href="https://help.aliyun.com/document_detail/469751.html">DiagnoseVpnGateway</a> operation, the system returns a corresponding ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpndgn-uf6kuxbe3iv028k3s****</p>
         */
        public Builder diagnoseId(String diagnoseId) {
            this.putQueryParameter("DiagnoseId", diagnoseId);
            this.diagnoseId = diagnoseId;
            return this;
        }

        /**
         * <p>The region ID of the VPN gateway.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-qingdao</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the VPN gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>vpn-uf6fzwp0ck3frwtbk****</p>
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
