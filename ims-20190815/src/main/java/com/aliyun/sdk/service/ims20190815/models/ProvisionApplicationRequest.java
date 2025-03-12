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
 * {@link ProvisionApplicationRequest} extends {@link RequestModel}
 *
 * <p>ProvisionApplicationRequest</p>
 */
public class ProvisionApplicationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scopes")
    private String scopes;

    private ProvisionApplicationRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.scopes = builder.scopes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ProvisionApplicationRequest create() {
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

    public static final class Builder extends Request.Builder<ProvisionApplicationRequest, Builder> {
        private String appId; 
        private String scopes; 

        private Builder() {
            super();
        } 

        private Builder(ProvisionApplicationRequest request) {
            super(request);
            this.appId = request.appId;
            this.scopes = request.scopes;
        } 

        /**
         * <p>The ID of the application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>407426893752729****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The permissions that are granted to the application. Separate multiple permissions with a semicolon (;).</p>
         * <blockquote>
         * <p> For more information about the supported permissions, see <a href="https://help.aliyun.com/zh/ram/user-guide/overview-of-oauth-applications">Overview</a>.</p>
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
        public ProvisionApplicationRequest build() {
            return new ProvisionApplicationRequest(this);
        } 

    } 

}
