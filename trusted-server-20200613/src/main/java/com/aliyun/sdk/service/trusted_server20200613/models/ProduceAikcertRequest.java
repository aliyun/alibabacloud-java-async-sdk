// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trusted_server20200613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ProduceAikcertRequest} extends {@link RequestModel}
 *
 * <p>ProduceAikcertRequest</p>
 */
public class ProduceAikcertRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("AikName")
    @Validation(required = true)
    private String aikName;

    @Query
    @NameInMap("CertRequest")
    @Validation(required = true)
    private String certRequest;

    @Query
    @NameInMap("EkCert")
    private String ekCert;

    @Query
    @NameInMap("EkPubKey")
    private String ekPubKey;

    @Query
    @NameInMap("IncludeCertChain")
    private Boolean includeCertChain;

    private ProduceAikcertRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.aikName = builder.aikName;
        this.certRequest = builder.certRequest;
        this.ekCert = builder.ekCert;
        this.ekPubKey = builder.ekPubKey;
        this.includeCertChain = builder.includeCertChain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ProduceAikcertRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return aikName
     */
    public String getAikName() {
        return this.aikName;
    }

    /**
     * @return certRequest
     */
    public String getCertRequest() {
        return this.certRequest;
    }

    /**
     * @return ekCert
     */
    public String getEkCert() {
        return this.ekCert;
    }

    /**
     * @return ekPubKey
     */
    public String getEkPubKey() {
        return this.ekPubKey;
    }

    /**
     * @return includeCertChain
     */
    public Boolean getIncludeCertChain() {
        return this.includeCertChain;
    }

    public static final class Builder extends Request.Builder<ProduceAikcertRequest, Builder> {
        private String regionId; 
        private String aikName; 
        private String certRequest; 
        private String ekCert; 
        private String ekPubKey; 
        private Boolean includeCertChain; 

        private Builder() {
            super();
        } 

        private Builder(ProduceAikcertRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.aikName = request.aikName;
            this.certRequest = request.certRequest;
            this.ekCert = request.ekCert;
            this.ekPubKey = request.ekPubKey;
            this.includeCertChain = request.includeCertChain;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * AikName.
         */
        public Builder aikName(String aikName) {
            this.putQueryParameter("AikName", aikName);
            this.aikName = aikName;
            return this;
        }

        /**
         * CertRequest.
         */
        public Builder certRequest(String certRequest) {
            this.putQueryParameter("CertRequest", certRequest);
            this.certRequest = certRequest;
            return this;
        }

        /**
         * EkCert.
         */
        public Builder ekCert(String ekCert) {
            this.putQueryParameter("EkCert", ekCert);
            this.ekCert = ekCert;
            return this;
        }

        /**
         * EkPubKey.
         */
        public Builder ekPubKey(String ekPubKey) {
            this.putQueryParameter("EkPubKey", ekPubKey);
            this.ekPubKey = ekPubKey;
            return this;
        }

        /**
         * IncludeCertChain.
         */
        public Builder includeCertChain(Boolean includeCertChain) {
            this.putQueryParameter("IncludeCertChain", includeCertChain);
            this.includeCertChain = includeCertChain;
            return this;
        }

        @Override
        public ProduceAikcertRequest build() {
            return new ProduceAikcertRequest(this);
        } 

    } 

}
