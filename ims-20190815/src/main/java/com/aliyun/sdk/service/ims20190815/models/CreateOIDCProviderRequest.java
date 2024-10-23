// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateOIDCProviderRequest} extends {@link RequestModel}
 *
 * <p>CreateOIDCProviderRequest</p>
 */
public class CreateOIDCProviderRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientIds")
    private String clientIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Fingerprints")
    private String fingerprints;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IssuanceLimitTime")
    private Long issuanceLimitTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IssuerUrl")
    private String issuerUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OIDCProviderName")
    private String OIDCProviderName;

    private CreateOIDCProviderRequest(Builder builder) {
        super(builder);
        this.clientIds = builder.clientIds;
        this.description = builder.description;
        this.fingerprints = builder.fingerprints;
        this.issuanceLimitTime = builder.issuanceLimitTime;
        this.issuerUrl = builder.issuerUrl;
        this.OIDCProviderName = builder.OIDCProviderName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOIDCProviderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientIds
     */
    public String getClientIds() {
        return this.clientIds;
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

    public static final class Builder extends Request.Builder<CreateOIDCProviderRequest, Builder> {
        private String clientIds; 
        private String description; 
        private String fingerprints; 
        private Long issuanceLimitTime; 
        private String issuerUrl; 
        private String OIDCProviderName; 

        private Builder() {
            super();
        } 

        private Builder(CreateOIDCProviderRequest request) {
            super(request);
            this.clientIds = request.clientIds;
            this.description = request.description;
            this.fingerprints = request.fingerprints;
            this.issuanceLimitTime = request.issuanceLimitTime;
            this.issuerUrl = request.issuerUrl;
            this.OIDCProviderName = request.OIDCProviderName;
        } 

        /**
         * <p>The ID of the client, which is provided by the external IdP Okta. If you want to specify multiple client IDs, separate the client IDs with commas (,).</p>
         * <p>The client ID can contain letters, digits, and special characters and cannot start with the special characters. The special characters are <code>periods, (.), hyphens (-), underscores (_), colons (:), and forward slashes (/)</code>.``</p>
         * <p>The client ID can be up to 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>498469743454717****</p>
         */
        public Builder clientIds(String clientIds) {
            this.putQueryParameter("ClientIds", clientIds);
            this.clientIds = clientIds;
            return this;
        }

        /**
         * <p>The description of the OIDC IdP.</p>
         * <p>The description can be up to 256 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>This is an OIDC Provider.</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The fingerprint of the HTTPS certificate, which is provided by the external IdP Okta. If you want to specify multiple fingerprints, separate the fingerprints with commas (,).</p>
         * <p>The fingerprint can contain letters and digits.</p>
         * <p>The fingerprint can be up to 40 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>902ef2deeb3c5b13ea4c3d5193629309e231****</p>
         */
        public Builder fingerprints(String fingerprints) {
            this.putQueryParameter("Fingerprints", fingerprints);
            this.fingerprints = fingerprints;
            return this;
        }

        /**
         * <p>The earliest time when an external IdP can issue an ID token. If the value of the iat field in the ID token is later than the current time, the request is rejected. Unit: hours. Valid values: 1 to 168.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder issuanceLimitTime(Long issuanceLimitTime) {
            this.putQueryParameter("IssuanceLimitTime", issuanceLimitTime);
            this.issuanceLimitTime = issuanceLimitTime;
            return this;
        }

        /**
         * <p>The URL of the issuer, which is provided by the external IdP. The URL of the issuer must be unique within an Alibaba Cloud account.</p>
         * <p>The URL of the issuer must start with <code>https</code> and be in the valid URL format. The URL cannot contain query parameters that follow a question mark (<code>?</code>) or logon information that is identified by at signs (<code>@</code>). The URL cannot be a fragment URL that contains number signs (<code>#</code>).</p>
         * <p>The URL can be up to 255 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://dev-xxxxxx.okta.com">https://dev-xxxxxx.okta.com</a></p>
         */
        public Builder issuerUrl(String issuerUrl) {
            this.putQueryParameter("IssuerUrl", issuerUrl);
            this.issuerUrl = issuerUrl;
            return this;
        }

        /**
         * <p>The name of the OIDC IdP.</p>
         * <p>The name can contain letters, digits, and special characters and cannot start or end with the special characters. The special characters are <code>periods, (.), hyphens (-), and underscores (_)</code>.``</p>
         * <p>The name can be up to 128 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>TestOIDCProvider</p>
         */
        public Builder OIDCProviderName(String OIDCProviderName) {
            this.putQueryParameter("OIDCProviderName", OIDCProviderName);
            this.OIDCProviderName = OIDCProviderName;
            return this;
        }

        @Override
        public CreateOIDCProviderRequest build() {
            return new CreateOIDCProviderRequest(this);
        } 

    } 

}
