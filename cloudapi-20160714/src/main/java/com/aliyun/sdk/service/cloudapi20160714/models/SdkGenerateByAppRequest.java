// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SdkGenerateByAppRequest} extends {@link RequestModel}
 *
 * <p>SdkGenerateByAppRequest</p>
 */
public class SdkGenerateByAppRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private Long appId;

    @Query
    @NameInMap("Language")
    @Validation(required = true)
    private String language;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private SdkGenerateByAppRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.language = builder.language;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SdkGenerateByAppRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public Long getAppId() {
        return this.appId;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<SdkGenerateByAppRequest, Builder> {
        private Long appId; 
        private String language; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(SdkGenerateByAppRequest request) {
            super(request);
            this.appId = request.appId;
            this.language = request.language;
            this.securityToken = request.securityToken;
        } 

        /**
         * AppId.
         */
        public Builder appId(Long appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * Language.
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
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
        public SdkGenerateByAppRequest build() {
            return new SdkGenerateByAppRequest(this);
        } 

    } 

}
