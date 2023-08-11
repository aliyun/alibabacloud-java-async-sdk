// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOIDCProvidersResponseBody} extends {@link TeaModel}
 *
 * <p>ListOIDCProvidersResponseBody</p>
 */
public class ListOIDCProvidersResponseBody extends TeaModel {
    @NameInMap("IsTruncated")
    private Boolean isTruncated;

    @NameInMap("Marker")
    private String marker;

    @NameInMap("OIDCProviders")
    private OIDCProviders OIDCProviders;

    @NameInMap("RequestId")
    private String requestId;

    private ListOIDCProvidersResponseBody(Builder builder) {
        this.isTruncated = builder.isTruncated;
        this.marker = builder.marker;
        this.OIDCProviders = builder.OIDCProviders;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOIDCProvidersResponseBody create() {
        return builder().build();
    }

    /**
     * @return isTruncated
     */
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    /**
     * @return marker
     */
    public String getMarker() {
        return this.marker;
    }

    /**
     * @return OIDCProviders
     */
    public OIDCProviders getOIDCProviders() {
        return this.OIDCProviders;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean isTruncated; 
        private String marker; 
        private OIDCProviders OIDCProviders; 
        private String requestId; 

        /**
         * Indicates whether the response is truncated. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder isTruncated(Boolean isTruncated) {
            this.isTruncated = isTruncated;
            return this;
        }

        /**
         * The `marker`. This parameter is returned only if the value of `IsTruncated` is `true`. If the parameter is returned, you can call this operation again and set this parameter to obtain the truncated part.``
         */
        public Builder marker(String marker) {
            this.marker = marker;
            return this;
        }

        /**
         * The timestamp when the OIDC IdP was modified.
         */
        public Builder OIDCProviders(OIDCProviders OIDCProviders) {
            this.OIDCProviders = OIDCProviders;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListOIDCProvidersResponseBody build() {
            return new ListOIDCProvidersResponseBody(this);
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
             * IssuanceLimitTime.
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
    public static class OIDCProviders extends TeaModel {
        @NameInMap("OIDCProvider")
        private java.util.List < OIDCProvider> OIDCProvider;

        private OIDCProviders(Builder builder) {
            this.OIDCProvider = builder.OIDCProvider;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OIDCProviders create() {
            return builder().build();
        }

        /**
         * @return OIDCProvider
         */
        public java.util.List < OIDCProvider> getOIDCProvider() {
            return this.OIDCProvider;
        }

        public static final class Builder {
            private java.util.List < OIDCProvider> OIDCProvider; 

            /**
             * OIDCProvider.
             */
            public Builder OIDCProvider(java.util.List < OIDCProvider> OIDCProvider) {
                this.OIDCProvider = OIDCProvider;
                return this;
            }

            public OIDCProviders build() {
                return new OIDCProviders(this);
            } 

        } 

    }
}
