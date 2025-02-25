// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetSecretByAppKeyForInnerRequest} extends {@link RequestModel}
 *
 * <p>ResetSecretByAppKeyForInnerRequest</p>
 */
public class ResetSecretByAppKeyForInnerRequest extends Request {
    @Query
    @NameInMap("AliUid")
    @Validation(required = true)
    private Long aliUid;

    @Query
    @NameInMap("AppKey")
    @Validation(required = true)
    private String appKey;

    @Query
    @NameInMap("NewAppKey")
    private String newAppKey;

    @Query
    @NameInMap("NewAppSecret")
    private String newAppSecret;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private ResetSecretByAppKeyForInnerRequest(Builder builder) {
        super(builder);
        this.aliUid = builder.aliUid;
        this.appKey = builder.appKey;
        this.newAppKey = builder.newAppKey;
        this.newAppSecret = builder.newAppSecret;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetSecretByAppKeyForInnerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliUid
     */
    public Long getAliUid() {
        return this.aliUid;
    }

    /**
     * @return appKey
     */
    public String getAppKey() {
        return this.appKey;
    }

    /**
     * @return newAppKey
     */
    public String getNewAppKey() {
        return this.newAppKey;
    }

    /**
     * @return newAppSecret
     */
    public String getNewAppSecret() {
        return this.newAppSecret;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<ResetSecretByAppKeyForInnerRequest, Builder> {
        private Long aliUid; 
        private String appKey; 
        private String newAppKey; 
        private String newAppSecret; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(ResetSecretByAppKeyForInnerRequest request) {
            super(request);
            this.aliUid = request.aliUid;
            this.appKey = request.appKey;
            this.newAppKey = request.newAppKey;
            this.newAppSecret = request.newAppSecret;
            this.securityToken = request.securityToken;
        } 

        /**
         * AliUid.
         */
        public Builder aliUid(Long aliUid) {
            this.putQueryParameter("AliUid", aliUid);
            this.aliUid = aliUid;
            return this;
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
         * NewAppKey.
         */
        public Builder newAppKey(String newAppKey) {
            this.putQueryParameter("NewAppKey", newAppKey);
            this.newAppKey = newAppKey;
            return this;
        }

        /**
         * NewAppSecret.
         */
        public Builder newAppSecret(String newAppSecret) {
            this.putQueryParameter("NewAppSecret", newAppSecret);
            this.newAppSecret = newAppSecret;
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
        public ResetSecretByAppKeyForInnerRequest build() {
            return new ResetSecretByAppKeyForInnerRequest(this);
        } 

    } 

}
