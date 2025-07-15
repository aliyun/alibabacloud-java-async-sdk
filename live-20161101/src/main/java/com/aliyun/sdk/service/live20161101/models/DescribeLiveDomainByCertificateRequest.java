// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DescribeLiveDomainByCertificateRequest} extends {@link RequestModel}
 *
 * <p>DescribeLiveDomainByCertificateRequest</p>
 */
public class DescribeLiveDomainByCertificateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SSLPub")
    @com.aliyun.core.annotation.Validation(required = true)
    private String SSLPub;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SSLStatus")
    private Boolean SSLStatus;

    private DescribeLiveDomainByCertificateRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.SSLPub = builder.SSLPub;
        this.SSLStatus = builder.SSLStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveDomainByCertificateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return SSLPub
     */
    public String getSSLPub() {
        return this.SSLPub;
    }

    /**
     * @return SSLStatus
     */
    public Boolean getSSLStatus() {
        return this.SSLStatus;
    }

    public static final class Builder extends Request.Builder<DescribeLiveDomainByCertificateRequest, Builder> {
        private Long ownerId; 
        private String regionId; 
        private String SSLPub; 
        private Boolean SSLStatus; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLiveDomainByCertificateRequest request) {
            super(request);
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.SSLPub = request.SSLPub;
            this.SSLStatus = request.SSLStatus;
        } 

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
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
         * <p>The public key of the SSL certificate. You must Base64-encode the public key before you invoke the encodeURIComponent function to encode a URI component. The public key must be in the PEM format.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder SSLPub(String SSLPub) {
            this.putQueryParameter("SSLPub", SSLPub);
            this.SSLPub = SSLPub;
            return this;
        }

        /**
         * <p>Specifies whether to return only domain names with HTTPS enabled or disabled.</p>
         * <ul>
         * <li><strong>true</strong>: returns only domain names with HTTPS enabled.</li>
         * <li><strong>false</strong>: The rule is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder SSLStatus(Boolean SSLStatus) {
            this.putQueryParameter("SSLStatus", SSLStatus);
            this.SSLStatus = SSLStatus;
            return this;
        }

        @Override
        public DescribeLiveDomainByCertificateRequest build() {
            return new DescribeLiveDomainByCertificateRequest(this);
        } 

    } 

}
