// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DiagnoseVpnGatewayRequest} extends {@link RequestModel}
 *
 * <p>DiagnoseVpnGatewayRequest</p>
 */
public class DiagnoseVpnGatewayRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IPsecExtendInfo")
    private String iPsecExtendInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpnGatewayId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
         * <blockquote>
         * <p> If you do not specify this parameter, the system automatically uses the request ID as the client token. The request ID may be different for each request.</p>
         * </blockquote>
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
         * <p>The configuration when you check the connectivity of the IPsec-VPN connection. Valid values:</p>
         * <ul>
         * <li><strong>PrivateSourceIp</strong>: the source IP address used when you check the connectivity of the IPsec-VPN connection. The source IP address must be on the VPC side.</li>
         * <li><strong>PrivateDestinationIp</strong>: the destination IP address used when you check the connectivity of the IPsec-VPN connection. The destination IP address must be on the data center side.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;PrivateSourceIp&quot;:&quot;192.168.1.1&quot;,&quot;PrivateDestinationIp&quot;:&quot;192.168.0.1&quot;}</p>
         */
        public Builder iPsecExtendInfo(String iPsecExtendInfo) {
            this.putQueryParameter("IPsecExtendInfo", iPsecExtendInfo);
            this.iPsecExtendInfo = iPsecExtendInfo;
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
         * <p>The ID of the resource to be diagnosed.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vco-uf66xniofskqtuoz1****</p>
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>The type of the resource.</p>
         * <p>Set the value to <strong>Ipsec</strong>, which specifies an IPsec-VPN connection.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>IPsec</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The ID of the VPN gateway.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpn-m5efhj0k1p47ctuhl****</p>
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
