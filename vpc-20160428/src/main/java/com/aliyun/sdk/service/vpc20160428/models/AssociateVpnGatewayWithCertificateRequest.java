// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link AssociateVpnGatewayWithCertificateRequest} extends {@link RequestModel}
 *
 * <p>AssociateVpnGatewayWithCertificateRequest</p>
 */
public class AssociateVpnGatewayWithCertificateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertificateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String certificateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertificateType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String certificateType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpnGatewayId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpnGatewayId;

    private AssociateVpnGatewayWithCertificateRequest(Builder builder) {
        super(builder);
        this.certificateId = builder.certificateId;
        this.certificateType = builder.certificateType;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.regionId = builder.regionId;
        this.vpnGatewayId = builder.vpnGatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssociateVpnGatewayWithCertificateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certificateId
     */
    public String getCertificateId() {
        return this.certificateId;
    }

    /**
     * @return certificateType
     */
    public String getCertificateType() {
        return this.certificateType;
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

    public static final class Builder extends Request.Builder<AssociateVpnGatewayWithCertificateRequest, Builder> {
        private String certificateId; 
        private String certificateType; 
        private String clientToken; 
        private Boolean dryRun; 
        private String regionId; 
        private String vpnGatewayId; 

        private Builder() {
            super();
        } 

        private Builder(AssociateVpnGatewayWithCertificateRequest request) {
            super(request);
            this.certificateId = request.certificateId;
            this.certificateType = request.certificateType;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.regionId = request.regionId;
            this.vpnGatewayId = request.vpnGatewayId;
        } 

        /**
         * <p>The certificate ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6bfe4218-ea1d****</p>
         */
        public Builder certificateId(String certificateId) {
            this.putQueryParameter("CertificateId", certificateId);
            this.certificateId = certificateId;
            return this;
        }

        /**
         * <p>The certificate type. Valid values:</p>
         * <ul>
         * <li><strong>Encryption</strong>: specifies the SSL certificate as the encryption certificate.</li>
         * <li><strong>Signature</strong>: specifies the SSL certificate as the signing certificate.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Signature</p>
         */
        public Builder certificateType(String certificateType) {
            this.putQueryParameter("CertificateType", certificateType);
            this.certificateType = certificateType;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The ClientToken value can contain only ASCII characters.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different for each API request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0c593ea1-3bea****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: performs a dry run without actually associating the certificate. The system checks the required parameters, request syntax, and instance status. If the check fails, the corresponding error is returned. If the check succeeds, the corresponding request ID is returned.</p>
         * </li>
         * <li><p><strong>false</strong> (default): sends the request. After the request passes the check, the VPN gateway is associated with the certificate.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The region ID of the VPN gateway.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The instance ID of the VPN gateway.</p>
         * <blockquote>
         * <p>Only ShangMi (SM) VPN gateways support attaching certificates.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpn-bp1q8bgx4xnkm2ogj****</p>
         */
        public Builder vpnGatewayId(String vpnGatewayId) {
            this.putQueryParameter("VpnGatewayId", vpnGatewayId);
            this.vpnGatewayId = vpnGatewayId;
            return this;
        }

        @Override
        public AssociateVpnGatewayWithCertificateRequest build() {
            return new AssociateVpnGatewayWithCertificateRequest(this);
        } 

    } 

}
