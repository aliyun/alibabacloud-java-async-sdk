// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

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
 * {@link AddClientIdToOIDCProviderResponseBody} extends {@link TeaModel}
 *
 * <p>AddClientIdToOIDCProviderResponseBody</p>
 */
public class AddClientIdToOIDCProviderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OIDCProvider")
    private OIDCProvider OIDCProvider;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AddClientIdToOIDCProviderResponseBody(Builder builder) {
        this.OIDCProvider = builder.OIDCProvider;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddClientIdToOIDCProviderResponseBody create() {
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
         * <p>The information about the OIDC IdP.</p>
         */
        public Builder OIDCProvider(OIDCProvider OIDCProvider) {
            this.OIDCProvider = OIDCProvider;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B49B8FA7-87FC-5308-AE75-5EC9E36C360A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddClientIdToOIDCProviderResponseBody build() {
            return new AddClientIdToOIDCProviderResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AddClientIdToOIDCProviderResponseBody} extends {@link TeaModel}
     *
     * <p>AddClientIdToOIDCProviderResponseBody</p>
     */
    public static class OIDCProvider extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Arn")
        private String arn;

        @com.aliyun.core.annotation.NameInMap("ClientIds")
        private String clientIds;

        @com.aliyun.core.annotation.NameInMap("CreateDate")
        private String createDate;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Fingerprints")
        private String fingerprints;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("IssuanceLimitTime")
        private Long issuanceLimitTime;

        @com.aliyun.core.annotation.NameInMap("IssuerUrl")
        private String issuerUrl;

        @com.aliyun.core.annotation.NameInMap("OIDCProviderName")
        private String OIDCProviderName;

        @com.aliyun.core.annotation.NameInMap("UpdateDate")
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
             * <p>The Alibaba Cloud Resource Name (ARN) of the OIDC IdP.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ram::177242285274****:oidc-provider/TestOIDCProvider</p>
             */
            public Builder arn(String arn) {
                this.arn = arn;
                return this;
            }

            /**
             * <p>The ID of the client. If multiple client IDs are returned, the client IDs are separated by commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>498469743454717****,598469743454717****</p>
             */
            public Builder clientIds(String clientIds) {
                this.clientIds = clientIds;
                return this;
            }

            /**
             * <p>The time when the OIDC IdP was created. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-11-11T06:56:03Z</p>
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * <p>The description of the OIDC IdP.</p>
             * 
             * <strong>example:</strong>
             * <p>This is a new OIDC Provider.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The fingerprint of the HTTPS certificate. If multiple fingerprints are returned, the fingerprints are separated by commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>902ef2deeb3c5b13ea4c3d5193629309e231****</p>
             */
            public Builder fingerprints(String fingerprints) {
                this.fingerprints = fingerprints;
                return this;
            }

            /**
             * <p>The timestamp when the OIDC IdP was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1636613763000</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The timestamp when the OIDC IdP was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>1636706309000</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The earliest time when an external IdP can issue an ID token. If the value of the iat field in the ID token is later than the current time, the request is rejected. Unit: hours. Valid values: 1 to 168.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder issuanceLimitTime(Long issuanceLimitTime) {
                this.issuanceLimitTime = issuanceLimitTime;
                return this;
            }

            /**
             * <p>The URL of the issuer.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://dev-xxxxxx.okta.com">https://dev-xxxxxx.okta.com</a></p>
             */
            public Builder issuerUrl(String issuerUrl) {
                this.issuerUrl = issuerUrl;
                return this;
            }

            /**
             * <p>The name of the OIDC IdP.</p>
             * 
             * <strong>example:</strong>
             * <p>TestOIDCProvider</p>
             */
            public Builder OIDCProviderName(String OIDCProviderName) {
                this.OIDCProviderName = OIDCProviderName;
                return this;
            }

            /**
             * <p>The time when the OIDC IdP was modified. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-11-12T08:38:29Z</p>
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
