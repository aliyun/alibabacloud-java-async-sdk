// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link DeleteOtpConfigRequest} extends {@link RequestModel}
 *
 * <p>DeleteOtpConfigRequest</p>
 */
public class DeleteOtpConfigRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Username")
    private String username;

    private DeleteOtpConfigRequest(Builder builder) {
        super(builder);
        this.username = builder.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteOtpConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    public static final class Builder extends Request.Builder<DeleteOtpConfigRequest, Builder> {
        private String username; 

        private Builder() {
            super();
        } 

        private Builder(DeleteOtpConfigRequest request) {
            super(request);
            this.username = request.username;
        } 

        /**
         * Username.
         */
        public Builder username(String username) {
            this.putBodyParameter("Username", username);
            this.username = username;
            return this;
        }

        @Override
        public DeleteOtpConfigRequest build() {
            return new DeleteOtpConfigRequest(this);
        } 

    } 

}
