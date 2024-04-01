// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAppForInnerRequest} extends {@link RequestModel}
 *
 * <p>CreateAppForInnerRequest</p>
 */
public class CreateAppForInnerRequest extends Request {
    @Query
    @NameInMap("AliUid")
    @Validation(required = true)
    private Long aliUid;

    @Query
    @NameInMap("AppCode")
    private String appCode;

    @Query
    @NameInMap("AppKey")
    private String appKey;

    @Query
    @NameInMap("AppName")
    @Validation(required = true)
    private String appName;

    @Query
    @NameInMap("AppSecret")
    private String appSecret;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("Extend")
    private String extend;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("Source")
    private String source;

    private CreateAppForInnerRequest(Builder builder) {
        super(builder);
        this.aliUid = builder.aliUid;
        this.appCode = builder.appCode;
        this.appKey = builder.appKey;
        this.appName = builder.appName;
        this.appSecret = builder.appSecret;
        this.description = builder.description;
        this.extend = builder.extend;
        this.securityToken = builder.securityToken;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppForInnerRequest create() {
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
     * @return appCode
     */
    public String getAppCode() {
        return this.appCode;
    }

    /**
     * @return appKey
     */
    public String getAppKey() {
        return this.appKey;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return appSecret
     */
    public String getAppSecret() {
        return this.appSecret;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return extend
     */
    public String getExtend() {
        return this.extend;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder extends Request.Builder<CreateAppForInnerRequest, Builder> {
        private Long aliUid; 
        private String appCode; 
        private String appKey; 
        private String appName; 
        private String appSecret; 
        private String description; 
        private String extend; 
        private String securityToken; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(CreateAppForInnerRequest request) {
            super(request);
            this.aliUid = request.aliUid;
            this.appCode = request.appCode;
            this.appKey = request.appKey;
            this.appName = request.appName;
            this.appSecret = request.appSecret;
            this.description = request.description;
            this.extend = request.extend;
            this.securityToken = request.securityToken;
            this.source = request.source;
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
         * AppCode.
         */
        public Builder appCode(String appCode) {
            this.putQueryParameter("AppCode", appCode);
            this.appCode = appCode;
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
         * AppName.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * AppSecret.
         */
        public Builder appSecret(String appSecret) {
            this.putQueryParameter("AppSecret", appSecret);
            this.appSecret = appSecret;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Extend.
         */
        public Builder extend(String extend) {
            this.putQueryParameter("Extend", extend);
            this.extend = extend;
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

        /**
         * Source.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        @Override
        public CreateAppForInnerRequest build() {
            return new CreateAppForInnerRequest(this);
        } 

    } 

}
