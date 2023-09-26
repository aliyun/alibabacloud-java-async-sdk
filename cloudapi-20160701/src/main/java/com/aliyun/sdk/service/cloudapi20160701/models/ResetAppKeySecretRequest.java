// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetAppKeySecretRequest} extends {@link RequestModel}
 *
 * <p>ResetAppKeySecretRequest</p>
 */
public class ResetAppKeySecretRequest extends Request {
    @Query
    @NameInMap("AppKey")
    @Validation(required = true)
    private String appKey;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private ResetAppKeySecretRequest(Builder builder) {
        super(builder);
        this.appKey = builder.appKey;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetAppKeySecretRequest create() {
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

    public static final class Builder extends Request.Builder<ResetAppKeySecretRequest, Builder> {
        private String appKey; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(ResetAppKeySecretRequest request) {
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
        public ResetAppKeySecretRequest build() {
            return new ResetAppKeySecretRequest(this);
        } 

    } 

}
