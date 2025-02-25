// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAppForBackendRequest} extends {@link RequestModel}
 *
 * <p>CreateAppForBackendRequest</p>
 */
public class CreateAppForBackendRequest extends Request {
    @Query
    @NameInMap("AliUid")
    @Validation(required = true)
    private Long aliUid;

    @Query
    @NameInMap("AppName")
    @Validation(required = true)
    private String appName;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("Source")
    private String source;

    private CreateAppForBackendRequest(Builder builder) {
        super(builder);
        this.aliUid = builder.aliUid;
        this.appName = builder.appName;
        this.description = builder.description;
        this.securityToken = builder.securityToken;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppForBackendRequest create() {
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

    public static final class Builder extends Request.Builder<CreateAppForBackendRequest, Builder> {
        private Long aliUid; 
        private String appName; 
        private String description; 
        private String securityToken; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(CreateAppForBackendRequest request) {
            super(request);
            this.aliUid = request.aliUid;
            this.appName = request.appName;
            this.description = request.description;
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
        public CreateAppForBackendRequest build() {
            return new CreateAppForBackendRequest(this);
        } 

    } 

}
