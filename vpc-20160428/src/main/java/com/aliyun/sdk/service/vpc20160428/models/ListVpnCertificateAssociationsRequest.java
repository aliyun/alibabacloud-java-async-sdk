// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVpnCertificateAssociationsRequest} extends {@link RequestModel}
 *
 * <p>ListVpnCertificateAssociationsRequest</p>
 */
public class ListVpnCertificateAssociationsRequest extends Request {
    @Query
    @NameInMap("CertificateId")
    @Validation(maxLength = 128)
    private java.util.List < String > certificateId;

    @Query
    @NameInMap("CertificateType")
    private String certificateType;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("VpnGatewayId")
    @Validation(maxLength = 128)
    private java.util.List < String > vpnGatewayId;

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
    public java.util.List < String > getCertificateId() {
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
    public java.util.List < String > getVpnGatewayId() {
        return this.vpnGatewayId;
    }

    public static final class Builder extends Request.Builder<ListVpnCertificateAssociationsRequest, Builder> {
        private java.util.List < String > certificateId; 
        private String certificateType; 
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 
        private java.util.List < String > vpnGatewayId; 

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
         * CertificateId.
         */
        public Builder certificateId(java.util.List < String > certificateId) {
            this.putQueryParameter("CertificateId", certificateId);
            this.certificateId = certificateId;
            return this;
        }

        /**
         * CertificateType.
         */
        public Builder certificateType(String certificateType) {
            this.putQueryParameter("CertificateType", certificateType);
            this.certificateType = certificateType;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
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
        public Builder vpnGatewayId(java.util.List < String > vpnGatewayId) {
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
