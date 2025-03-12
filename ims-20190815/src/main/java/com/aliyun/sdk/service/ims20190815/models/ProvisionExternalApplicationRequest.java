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
 * {@link ProvisionExternalApplicationRequest} extends {@link RequestModel}
 *
 * <p>ProvisionExternalApplicationRequest</p>
 */
public class ProvisionExternalApplicationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scopes")
    private String scopes;

    private ProvisionExternalApplicationRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.scopes = builder.scopes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ProvisionExternalApplicationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return scopes
     */
    public String getScopes() {
        return this.scopes;
    }

    public static final class Builder extends Request.Builder<ProvisionExternalApplicationRequest, Builder> {
        private String appId; 
        private String scopes; 

        private Builder() {
            super();
        } 

        private Builder(ProvisionExternalApplicationRequest request) {
            super(request);
            this.appId = request.appId;
            this.scopes = request.scopes;
        } 

        /**
         * <p>The ID of the application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>403550611646604****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The information about the scope of permissions granted to the application. You can enter multiple scopes and separate them with semicolons (;).</p>
         * <blockquote>
         * <p> For more information about the supported permission scopes, see the &quot;OAuth scope&quot; section in the <a href="https://help.aliyun.com/zh/ram/user-guide/overview-of-oauth-applications">Overview</a> topic.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>openid;aliuid</p>
         */
        public Builder scopes(String scopes) {
            this.putQueryParameter("Scopes", scopes);
            this.scopes = scopes;
            return this;
        }

        @Override
        public ProvisionExternalApplicationRequest build() {
            return new ProvisionExternalApplicationRequest(this);
        } 

    } 

}
