// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetAppCodeRequest} extends {@link RequestModel}
 *
 * <p>ResetAppCodeRequest</p>
 */
public class ResetAppCodeRequest extends Request {
    @Query
    @NameInMap("AppCode")
    @Validation(required = true)
    private String appCode;

    @Query
    @NameInMap("NewAppCode")
    private String newAppCode;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private ResetAppCodeRequest(Builder builder) {
        super(builder);
        this.appCode = builder.appCode;
        this.newAppCode = builder.newAppCode;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetAppCodeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appCode
     */
    public String getAppCode() {
        return this.appCode;
    }

    /**
     * @return newAppCode
     */
    public String getNewAppCode() {
        return this.newAppCode;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<ResetAppCodeRequest, Builder> {
        private String appCode; 
        private String newAppCode; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(ResetAppCodeRequest request) {
            super(request);
            this.appCode = request.appCode;
            this.newAppCode = request.newAppCode;
            this.securityToken = request.securityToken;
        } 

        /**
         * The current AppCode of the application.
         */
        public Builder appCode(String appCode) {
            this.putQueryParameter("AppCode", appCode);
            this.appCode = appCode;
            return this;
        }

        /**
         * The new AppCode of the application.
         */
        public Builder newAppCode(String newAppCode) {
            this.putQueryParameter("NewAppCode", newAppCode);
            this.newAppCode = newAppCode;
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
        public ResetAppCodeRequest build() {
            return new ResetAppCodeRequest(this);
        } 

    } 

}
