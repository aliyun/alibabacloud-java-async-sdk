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
 * {@link ChangeAgSecurityMobileRequest} extends {@link RequestModel}
 *
 * <p>ChangeAgSecurityMobileRequest</p>
 */
public class ChangeAgSecurityMobileRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("SecurityMobile")
    @com.aliyun.core.annotation.Validation(required = true)
    private String securityMobile;

    private ChangeAgSecurityMobileRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.mpk = builder.mpk;
        this.pk = builder.pk;
        this.securityMobile = builder.securityMobile;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeAgSecurityMobileRequest create() {
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
     * @return securityMobile
     */
    public String getSecurityMobile() {
        return this.securityMobile;
    }

    public static final class Builder extends Request.Builder<ChangeAgSecurityMobileRequest, Builder> {
        private String appName; 
        private String mpk; 
        private String pk; 
        private String securityMobile; 

        private Builder() {
            super();
        } 

        private Builder(ChangeAgSecurityMobileRequest request) {
            super(request);
            this.appName = request.appName;
            this.mpk = request.mpk;
            this.pk = request.pk;
            this.securityMobile = request.securityMobile;
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
        public Builder securityMobile(String securityMobile) {
            this.putQueryParameter("SecurityMobile", securityMobile);
            this.securityMobile = securityMobile;
            return this;
        }

        @Override
        public ChangeAgSecurityMobileRequest build() {
            return new ChangeAgSecurityMobileRequest(this);
        } 

    } 

}
