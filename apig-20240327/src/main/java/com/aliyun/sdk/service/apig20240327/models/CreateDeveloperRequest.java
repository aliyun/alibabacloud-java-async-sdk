// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link CreateDeveloperRequest} extends {@link RequestModel}
 *
 * <p>CreateDeveloperRequest</p>
 */
public class CreateDeveloperRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("password")
    @com.aliyun.core.annotation.Validation(maxLength = 32, minLength = 6)
    private String password;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("username")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String username;

    private CreateDeveloperRequest(Builder builder) {
        super(builder);
        this.password = builder.password;
        this.username = builder.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDeveloperRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    public static final class Builder extends Request.Builder<CreateDeveloperRequest, Builder> {
        private String password; 
        private String username; 

        private Builder() {
            super();
        } 

        private Builder(CreateDeveloperRequest request) {
            super(request);
            this.password = request.password;
            this.username = request.username;
        } 

        /**
         * <p>The password of the developer account. The length must be 6 to 32 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>abcd1234</p>
         */
        public Builder password(String password) {
            this.putBodyParameter("password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>The logon username of the developer. The length must not exceed 64 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>developer-demo</p>
         */
        public Builder username(String username) {
            this.putBodyParameter("username", username);
            this.username = username;
            return this;
        }

        @Override
        public CreateDeveloperRequest build() {
            return new CreateDeveloperRequest(this);
        } 

    } 

}
