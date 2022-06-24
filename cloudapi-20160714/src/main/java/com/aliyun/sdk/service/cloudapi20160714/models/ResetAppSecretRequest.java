// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetAppSecretRequest} extends {@link RequestModel}
 *
 * <p>ResetAppSecretRequest</p>
 */
public class ResetAppSecretRequest extends Request {
    @Query
    @NameInMap("AppKey")
    @Validation(required = true)
    private String appKey;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private ResetAppSecretRequest(Builder builder) {
        super(builder);
        this.appKey = builder.appKey;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetAppSecretRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appKey
     */
    public String getAppKey() {
        return this.appKey;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<ResetAppSecretRequest, Builder> {
        private String appKey; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(ResetAppSecretRequest request) {
            super(request);
            this.appKey = request.appKey;
            this.securityToken = request.securityToken;
        } 

        /**
         * AppKey.
         */
        public Builder appKey(String appKey) {
            this.putQueryParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public ResetAppSecretRequest build() {
            return new ResetAppSecretRequest(this);
        } 

    } 

}
