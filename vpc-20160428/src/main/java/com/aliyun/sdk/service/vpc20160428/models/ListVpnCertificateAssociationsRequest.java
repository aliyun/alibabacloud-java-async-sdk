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
 * {@link ListVpnCertificateAssociationsRequest} extends {@link RequestModel}
 *
 * <p>ListVpnCertificateAssociationsRequest</p>
 */
public class ListVpnCertificateAssociationsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertificateId")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private java.util.List<String> certificateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertificateType")
    private String certificateType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpnGatewayId")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private java.util.List<String> vpnGatewayId;

    private ListVpnCertificateAssociationsRequest(Builder builder) {
        super(builder);
        this.certificateId = builder.certificateId;
        this.certificateType = builder.certificateType;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.vpnGatewayId = builder.vpnGatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVpnCertificateAssociationsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certificateId
     */
    public java.util.List<String> getCertificateId() {
        return this.certificateId;
    }

    /**
     * @return certificateType
     */
    public String getCertificateType() {
        return this.certificateType;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
    public java.util.List<String> getVpnGatewayId() {
        return this.vpnGatewayId;
    }

    public static final class Builder extends Request.Builder<ListVpnCertificateAssociationsRequest, Builder> {
        private java.util.List<String> certificateId; 
        private String certificateType; 
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 
        private java.util.List<String> vpnGatewayId; 

        private Builder() {
            super();
        } 

        private Builder(ListVpnCertificateAssociationsRequest request) {
            super(request);
            this.certificateId = request.certificateId;
            this.certificateType = request.certificateType;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.vpnGatewayId = request.vpnGatewayId;
        } 

        /**
         * <p>The list of certificate IDs.</p>
         * <p>You can query the associations between up to 20 SSL certificates and VPN gateway instances at a time.</p>
         * 
         * <strong>example:</strong>
         * <p>6bfe4218-ea1d****</p>
         */
        public Builder certificateId(java.util.List<String> certificateId) {
            this.putQueryParameter("CertificateId", certificateId);
            this.certificateId = certificateId;
            return this;
        }

        /**
         * <p>The certificate type. Valid values:</p>
         * <ul>
         * <li><p><strong>Encryption</strong>: encryption certificate.</p>
         * </li>
         * <li><p><strong>Signature</strong>: signing certificate.</p>
         * </li>
         * </ul>
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
         * <p>The number of entries per page. Valid values: <strong>1</strong> to <strong>20</strong>. Default value: <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token. Valid values:</p>
         * <ul>
         * <li><p>If this is the first query or no subsequent query exists, leave this parameter empty.</p>
         * </li>
         * <li><p>If a subsequent query exists, set this parameter to the <strong>NextToken</strong> value returned by the previous API call.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be0****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The region ID of the VPN gateway.</p>
         * <p>You can call <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> to query the region ID.</p>
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
         * <p>The list of VPN gateway instance IDs.</p>
         * <p>You can query the associations between up to 20 VPN gateway instances and SSL certificates at a time.</p>
         * 
         * <strong>example:</strong>
         * <p>vpn-bp1q8bgx4xnkm****</p>
         */
        public Builder vpnGatewayId(java.util.List<String> vpnGatewayId) {
            this.putQueryParameter("VpnGatewayId", vpnGatewayId);
            this.vpnGatewayId = vpnGatewayId;
            return this;
        }

        @Override
        public ListVpnCertificateAssociationsRequest build() {
            return new ListVpnCertificateAssociationsRequest(this);
        } 

    } 

}
