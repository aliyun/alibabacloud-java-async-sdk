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
 * {@link UpdateOIDCProviderRequest} extends {@link RequestModel}
 *
 * <p>UpdateOIDCProviderRequest</p>
 */
public class UpdateOIDCProviderRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientIds")
    private String clientIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IssuanceLimitTime")
    private Long issuanceLimitTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewDescription")
    private String newDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OIDCProviderName")
    private String OIDCProviderName;

    private UpdateOIDCProviderRequest(Builder builder) {
        super(builder);
        this.clientIds = builder.clientIds;
        this.issuanceLimitTime = builder.issuanceLimitTime;
        this.newDescription = builder.newDescription;
        this.OIDCProviderName = builder.OIDCProviderName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateOIDCProviderRequest create() {
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
     * @return issuanceLimitTime
     */
    public Long getIssuanceLimitTime() {
        return this.issuanceLimitTime;
    }

    /**
     * @return newDescription
     */
    public String getNewDescription() {
        return this.newDescription;
    }

    /**
     * @return OIDCProviderName
     */
    public String getOIDCProviderName() {
        return this.OIDCProviderName;
    }

    public static final class Builder extends Request.Builder<UpdateOIDCProviderRequest, Builder> {
        private String clientIds; 
        private Long issuanceLimitTime; 
        private String newDescription; 
        private String OIDCProviderName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateOIDCProviderRequest request) {
            super(request);
            this.clientIds = request.clientIds;
            this.issuanceLimitTime = request.issuanceLimitTime;
            this.newDescription = request.newDescription;
            this.OIDCProviderName = request.OIDCProviderName;
        } 

        /**
         * <p>The ID of the client. If you want to specify multiple client IDs, separate the client IDs with commas (,).</p>
         * <p>The client ID can contain letters, digits, and special characters and cannot start with the special characters. The special characters are <code>periods, (.), hyphens (-), underscores (_), colons (:), and forward slashes (/)</code>.``</p>
         * <p>The client ID can be up to 64 characters in length.</p>
         * <blockquote>
         * <p>If you specify this parameter, all the client IDs of the OIDC IdP are replaced. If you need to only add or remove a client ID, call the AddClientIdToOIDCProvider or RemoveClientIdFromOIDCProvider operation. For more information, see <a href="https://help.aliyun.com/document_detail/332057.html">AddClientIdToOIDCProvider</a> or <a href="https://help.aliyun.com/document_detail/332058.html">RemoveClientIdFromOIDCProvider</a>.</p>
         * </blockquote>
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
         * <p>The description of the OIDC IdP.</p>
         * <p>The description can be up to 256 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a new OIDC Provider.</p>
         */
        public Builder newDescription(String newDescription) {
            this.putQueryParameter("NewDescription", newDescription);
            this.newDescription = newDescription;
            return this;
        }

        /**
         * <p>The name of the OIDC IdP.</p>
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
        public UpdateOIDCProviderRequest build() {
            return new UpdateOIDCProviderRequest(this);
        } 

    } 

}
