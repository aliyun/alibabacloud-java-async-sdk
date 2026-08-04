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
 * {@link ChangeAgSecurityEmailRequest} extends {@link RequestModel}
 *
 * <p>ChangeAgSecurityEmailRequest</p>
 */
public class ChangeAgSecurityEmailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mpk")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mpk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Pk")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityEmail")
    @com.aliyun.core.annotation.Validation(required = true)
    private String securityEmail;

    private ChangeAgSecurityEmailRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.mpk = builder.mpk;
        this.pk = builder.pk;
        this.securityEmail = builder.securityEmail;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeAgSecurityEmailRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return mpk
     */
    public String getMpk() {
        return this.mpk;
    }

    /**
     * @return pk
     */
    public String getPk() {
        return this.pk;
    }

    /**
     * @return securityEmail
     */
    public String getSecurityEmail() {
        return this.securityEmail;
    }

    public static final class Builder extends Request.Builder<ChangeAgSecurityEmailRequest, Builder> {
        private String appName; 
        private String mpk; 
        private String pk; 
        private String securityEmail; 

        private Builder() {
            super();
        } 

        private Builder(ChangeAgSecurityEmailRequest request) {
            super(request);
            this.appName = request.appName;
            this.mpk = request.mpk;
            this.pk = request.pk;
            this.securityEmail = request.securityEmail;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
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

        /**
         * <p>This parameter is required.</p>
         */
        public Builder pk(String pk) {
            this.putQueryParameter("Pk", pk);
            this.pk = pk;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder securityEmail(String securityEmail) {
            this.putQueryParameter("SecurityEmail", securityEmail);
            this.securityEmail = securityEmail;
            return this;
        }

        @Override
        public ChangeAgSecurityEmailRequest build() {
            return new ChangeAgSecurityEmailRequest(this);
        } 

    } 

}
