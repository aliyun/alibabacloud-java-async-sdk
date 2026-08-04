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
 * {@link AsyncModifyAgLoginEmailRequest} extends {@link RequestModel}
 *
 * <p>AsyncModifyAgLoginEmailRequest</p>
 */
public class AsyncModifyAgLoginEmailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mpk")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mpk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewLoginEmail")
    @com.aliyun.core.annotation.Validation(required = true)
    private String newLoginEmail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Pk")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pk;

    private AsyncModifyAgLoginEmailRequest(Builder builder) {
        super(builder);
        this.mpk = builder.mpk;
        this.newLoginEmail = builder.newLoginEmail;
        this.pk = builder.pk;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AsyncModifyAgLoginEmailRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mpk
     */
    public String getMpk() {
        return this.mpk;
    }

    /**
     * @return newLoginEmail
     */
    public String getNewLoginEmail() {
        return this.newLoginEmail;
    }

    /**
     * @return pk
     */
    public String getPk() {
        return this.pk;
    }

    public static final class Builder extends Request.Builder<AsyncModifyAgLoginEmailRequest, Builder> {
        private String mpk; 
        private String newLoginEmail; 
        private String pk; 

        private Builder() {
            super();
        } 

        private Builder(AsyncModifyAgLoginEmailRequest request) {
            super(request);
            this.mpk = request.mpk;
            this.newLoginEmail = request.newLoginEmail;
            this.pk = request.pk;
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
        public Builder newLoginEmail(String newLoginEmail) {
            this.putQueryParameter("NewLoginEmail", newLoginEmail);
            this.newLoginEmail = newLoginEmail;
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

        @Override
        public AsyncModifyAgLoginEmailRequest build() {
            return new AsyncModifyAgLoginEmailRequest(this);
        } 

    } 

}
