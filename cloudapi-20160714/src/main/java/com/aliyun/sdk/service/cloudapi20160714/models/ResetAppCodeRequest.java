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
    @NameInMap("SecurityToken")
    private String securityToken;

    private ResetAppCodeRequest(Builder builder) {
        super(builder);
        this.appCode = builder.appCode;
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
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<ResetAppCodeRequest, Builder> {
        private String appCode; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(ResetAppCodeRequest request) {
            super(request);
            this.appCode = request.appCode;
            this.securityToken = request.securityToken;
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
