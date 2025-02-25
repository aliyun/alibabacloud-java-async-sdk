// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baasdis20200509.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link IssueNormalVerifiableVCRequest} extends {@link RequestModel}
 *
 * <p>IssueNormalVerifiableVCRequest</p>
 */
public class IssueNormalVerifiableVCRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BareClaimStructBody")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < BareClaimStructBody> bareClaimStructBody;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Expiration")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long expiration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Issuer")
    @com.aliyun.core.annotation.Validation(required = true)
    private String issuer;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Subject")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subject;

    private IssueNormalVerifiableVCRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bareClaimStructBody = builder.bareClaimStructBody;
        this.clientToken = builder.clientToken;
        this.expiration = builder.expiration;
        this.issuer = builder.issuer;
        this.subject = builder.subject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IssueNormalVerifiableVCRequest create() {
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
     * @return bareClaimStructBody
     */
    public java.util.List < BareClaimStructBody> getBareClaimStructBody() {
        return this.bareClaimStructBody;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return expiration
     */
    public Long getExpiration() {
        return this.expiration;
    }

    /**
     * @return issuer
     */
    public String getIssuer() {
        return this.issuer;
    }

    /**
     * @return subject
     */
    public String getSubject() {
        return this.subject;
    }

    public static final class Builder extends Request.Builder<IssueNormalVerifiableVCRequest, Builder> {
        private String regionId; 
        private java.util.List < BareClaimStructBody> bareClaimStructBody; 
        private String clientToken; 
        private Long expiration; 
        private String issuer; 
        private String subject; 

        private Builder() {
            super();
        } 

        private Builder(IssueNormalVerifiableVCRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bareClaimStructBody = request.bareClaimStructBody;
            this.clientToken = request.clientToken;
            this.expiration = request.expiration;
            this.issuer = request.issuer;
            this.subject = request.subject;
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
         * BareClaimStructBody.
         */
        public Builder bareClaimStructBody(java.util.List < BareClaimStructBody> bareClaimStructBody) {
            this.putBodyParameter("BareClaimStructBody", bareClaimStructBody);
            this.bareClaimStructBody = bareClaimStructBody;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Expiration.
         */
        public Builder expiration(Long expiration) {
            this.putBodyParameter("Expiration", expiration);
            this.expiration = expiration;
            return this;
        }

        /**
         * Issuer.
         */
        public Builder issuer(String issuer) {
            this.putBodyParameter("Issuer", issuer);
            this.issuer = issuer;
            return this;
        }

        /**
         * Subject.
         */
        public Builder subject(String subject) {
            this.putBodyParameter("Subject", subject);
            this.subject = subject;
            return this;
        }

        @Override
        public IssueNormalVerifiableVCRequest build() {
            return new IssueNormalVerifiableVCRequest(this);
        } 

    } 

    public static class BareClaimStructBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Claim")
        @com.aliyun.core.annotation.Validation(required = true)
        private String claim;

        @com.aliyun.core.annotation.NameInMap("ClaimType")
        private String claimType;

        private BareClaimStructBody(Builder builder) {
            this.claim = builder.claim;
            this.claimType = builder.claimType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BareClaimStructBody create() {
            return builder().build();
        }

        /**
         * @return claim
         */
        public String getClaim() {
            return this.claim;
        }

        /**
         * @return claimType
         */
        public String getClaimType() {
            return this.claimType;
        }

        public static final class Builder {
            private String claim; 
            private String claimType; 

            /**
             * Claim.
             */
            public Builder claim(String claim) {
                this.claim = claim;
                return this;
            }

            /**
             * ClaimType.
             */
            public Builder claimType(String claimType) {
                this.claimType = claimType;
                return this;
            }

            public BareClaimStructBody build() {
                return new BareClaimStructBody(this);
            } 

        } 

    }
}
