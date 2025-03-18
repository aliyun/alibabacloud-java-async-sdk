// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
 * {@link ResetAppCodeRequest} extends {@link RequestModel}
 *
 * <p>ResetAppCodeRequest</p>
 */
public class ResetAppCodeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewAppCode")
    private String newAppCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
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
         * <p>The AppCode of the app.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3aaf905a0a1f4f0eabc6d891dfa08afc</p>
         */
        public Builder appCode(String appCode) {
            this.putQueryParameter("AppCode", appCode);
            this.appCode = appCode;
            return this;
        }

        /**
         * <p>The new AppCode of the app.</p>
         * 
         * <strong>example:</strong>
         * <p>6f0e7ab2aa5f4b8fb18421e6edf4fb6c2</p>
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
