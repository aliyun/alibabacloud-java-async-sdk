// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliyunid_ag20180912.models;

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
 * {@link CreateAgAccountRequest} extends {@link RequestModel}
 *
 * <p>CreateAgAccountRequest</p>
 */
public class CreateAgAccountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoginEmail")
    @com.aliyun.core.annotation.Validation(required = true)
    private String loginEmail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private CreateAgAccountRequest(Builder builder) {
        super(builder);
        this.loginEmail = builder.loginEmail;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAgAccountRequest create() {
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateAgAccountRequest, Builder> {
        private String loginEmail; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateAgAccountRequest request) {
            super(request);
            this.loginEmail = request.loginEmail;
            this.type = request.type;
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
         * 
         * <strong>example:</strong>
         * <p>BID</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateAgAccountRequest build() {
            return new CreateAgAccountRequest(this);
        } 

    } 

}
