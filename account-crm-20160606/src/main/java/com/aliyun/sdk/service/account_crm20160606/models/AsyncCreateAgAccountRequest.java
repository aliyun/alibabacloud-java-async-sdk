// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.account_crm20160606.models;

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
 * {@link AsyncCreateAgAccountRequest} extends {@link RequestModel}
 *
 * <p>AsyncCreateAgAccountRequest</p>
 */
public class AsyncCreateAgAccountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoginEmail")
    @com.aliyun.core.annotation.Validation(required = true)
    private String loginEmail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaserAccountInfo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String maserAccountInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mpk")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mpk;

    private AsyncCreateAgAccountRequest(Builder builder) {
        super(builder);
        this.loginEmail = builder.loginEmail;
        this.maserAccountInfo = builder.maserAccountInfo;
        this.mpk = builder.mpk;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AsyncCreateAgAccountRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return loginEmail
     */
    public String getLoginEmail() {
        return this.loginEmail;
    }

    /**
     * @return maserAccountInfo
     */
    public String getMaserAccountInfo() {
        return this.maserAccountInfo;
    }

    /**
     * @return mpk
     */
    public String getMpk() {
        return this.mpk;
    }

    public static final class Builder extends Request.Builder<AsyncCreateAgAccountRequest, Builder> {
        private String loginEmail; 
        private String maserAccountInfo; 
        private String mpk; 

        private Builder() {
            super();
        } 

        private Builder(AsyncCreateAgAccountRequest request) {
            super(request);
            this.loginEmail = request.loginEmail;
            this.maserAccountInfo = request.maserAccountInfo;
            this.mpk = request.mpk;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder loginEmail(String loginEmail) {
            this.putQueryParameter("LoginEmail", loginEmail);
            this.loginEmail = loginEmail;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder maserAccountInfo(String maserAccountInfo) {
            this.putQueryParameter("MaserAccountInfo", maserAccountInfo);
            this.maserAccountInfo = maserAccountInfo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder mpk(String mpk) {
            this.putQueryParameter("Mpk", mpk);
            this.mpk = mpk;
            return this;
        }

        @Override
        public AsyncCreateAgAccountRequest build() {
            return new AsyncCreateAgAccountRequest(this);
        } 

    } 

}
