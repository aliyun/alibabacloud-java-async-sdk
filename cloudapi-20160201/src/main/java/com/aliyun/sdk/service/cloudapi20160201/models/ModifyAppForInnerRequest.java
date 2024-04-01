// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAppForInnerRequest} extends {@link RequestModel}
 *
 * <p>ModifyAppForInnerRequest</p>
 */
public class ModifyAppForInnerRequest extends Request {
    @Query
    @NameInMap("AliUid")
    @Validation(required = true)
    private Long aliUid;

    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private Long appId;

    @Query
    @NameInMap("AppName")
    @Validation(required = true)
    private String appName;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("Extend")
    private String extend;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private ModifyAppForInnerRequest(Builder builder) {
        super(builder);
        this.aliUid = builder.aliUid;
        this.appId = builder.appId;
        this.appName = builder.appName;
        this.description = builder.description;
        this.extend = builder.extend;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAppForInnerRequest create() {
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
     * @return appId
     */
    public Long getAppId() {
        return this.appId;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
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

    public static final class Builder extends Request.Builder<ModifyAppForInnerRequest, Builder> {
        private Long aliUid; 
        private Long appId; 
        private String appName; 
        private String description; 
        private String extend; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAppForInnerRequest request) {
            super(request);
            this.aliUid = request.aliUid;
            this.appId = request.appId;
            this.appName = request.appName;
            this.description = request.description;
            this.extend = request.extend;
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
         * AppId.
         */
        public Builder appId(Long appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
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

        @Override
        public ModifyAppForInnerRequest build() {
            return new ModifyAppForInnerRequest(this);
        } 

    } 

}
