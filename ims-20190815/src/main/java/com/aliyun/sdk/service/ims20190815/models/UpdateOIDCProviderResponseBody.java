// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateOIDCProviderResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateOIDCProviderResponseBody</p>
 */
public class UpdateOIDCProviderResponseBody extends TeaModel {
    @NameInMap("OIDCProvider")
    private OIDCProvider OIDCProvider;

    @NameInMap("RequestId")
    private String requestId;

    private UpdateOIDCProviderResponseBody(Builder builder) {
        this.OIDCProvider = builder.OIDCProvider;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateOIDCProviderResponseBody create() {
        return builder().build();
    }

    /**
     * @return OIDCProvider
     */
    public OIDCProvider getOIDCProvider() {
        return this.OIDCProvider;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private OIDCProvider OIDCProvider; 
        private String requestId; 

        /**
         * The information about the OIDC IdP.
         */
        public Builder OIDCProvider(OIDCProvider OIDCProvider) {
            this.OIDCProvider = OIDCProvider;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateOIDCProviderResponseBody build() {
            return new UpdateOIDCProviderResponseBody(this);
        } 

    } 

    public static class OIDCProvider extends TeaModel {
        @NameInMap("Arn")
        private String arn;

        @NameInMap("ClientIds")
        private String clientIds;

        @NameInMap("CreateDate")
        private String createDate;

        @NameInMap("Description")
        private String description;

        @NameInMap("Fingerprints")
        private String fingerprints;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("IssuanceLimitTime")
        private Long issuanceLimitTime;

        @NameInMap("IssuerUrl")
        private String issuerUrl;

        @NameInMap("OIDCProviderName")
        private String OIDCProviderName;

        @NameInMap("UpdateDate")
        private String updateDate;

        private OIDCProvider(Builder builder) {
            this.arn = builder.arn;
            this.clientIds = builder.clientIds;
            this.createDate = builder.createDate;
            this.description = builder.description;
            this.fingerprints = builder.fingerprints;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.issuanceLimitTime = builder.issuanceLimitTime;
            this.issuerUrl = builder.issuerUrl;
            this.OIDCProviderName = builder.OIDCProviderName;
            this.updateDate = builder.updateDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OIDCProvider create() {
            return builder().build();
        }

        /**
         * @return arn
         */
        public String getArn() {
            return this.arn;
        }

        /**
         * @return clientIds
         */
        public String getClientIds() {
            return this.clientIds;
        }

        /**
         * @return createDate
         */
        public String getCreateDate() {
            return this.createDate;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return fingerprints
         */
        public String getFingerprints() {
            return this.fingerprints;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return issuanceLimitTime
         */
        public Long getIssuanceLimitTime() {
            return this.issuanceLimitTime;
        }

        /**
         * @return issuerUrl
         */
        public String getIssuerUrl() {
            return this.issuerUrl;
        }

        /**
         * @return OIDCProviderName
         */
        public String getOIDCProviderName() {
            return this.OIDCProviderName;
        }

        /**
         * @return updateDate
         */
        public String getUpdateDate() {
            return this.updateDate;
        }

        public static final class Builder {
            private String arn; 
            private String clientIds; 
            private String createDate; 
            private String description; 
            private String fingerprints; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long issuanceLimitTime; 
            private String issuerUrl; 
            private String OIDCProviderName; 
            private String updateDate; 

            /**
             * The Alibaba Cloud Resource Name (ARN) of the OIDC IdP.
             */
            public Builder arn(String arn) {
                this.arn = arn;
                return this;
            }

            /**
             * The ID of the client. If multiple client IDs are returned, the client IDs are separated by commas (,).
             */
            public Builder clientIds(String clientIds) {
                this.clientIds = clientIds;
                return this;
            }

            /**
             * The time when the OIDC IdP was created. The time is displayed in UTC.
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * The description of the OIDC IdP.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The fingerprint of the HTTPS certificate. If multiple fingerprints are returned, the fingerprints are separated by commas (,).
             */
            public Builder fingerprints(String fingerprints) {
                this.fingerprints = fingerprints;
                return this;
            }

            /**
             * The timestamp when the OIDC IdP was created.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The timestamp when the OIDC IdP was modified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The earliest time when an external IdP can issue an ID token. If the value of the iat field in the ID token is later than the current time, the request is rejected. Unit: hours. Valid values: 1 to 168.
             */
            public Builder issuanceLimitTime(Long issuanceLimitTime) {
                this.issuanceLimitTime = issuanceLimitTime;
                return this;
            }

            /**
             * The URL of the issuer.
             */
            public Builder issuerUrl(String issuerUrl) {
                this.issuerUrl = issuerUrl;
                return this;
            }

            /**
             * The name of the OIDC IdP.
             */
            public Builder OIDCProviderName(String OIDCProviderName) {
                this.OIDCProviderName = OIDCProviderName;
                return this;
            }

            /**
             * The time when the OIDC IdP was modified. The time is displayed in UTC.
             */
            public Builder updateDate(String updateDate) {
                this.updateDate = updateDate;
                return this;
            }

            public OIDCProvider build() {
                return new OIDCProvider(this);
            } 

        } 

    }
}
