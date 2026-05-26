// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentidentity20250901.models;

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
 * {@link DeleteUserPoolRequest} extends {@link RequestModel}
 *
 * <p>DeleteUserPoolRequest</p>
 */
public class DeleteUserPoolRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserPoolName")
    private String userPoolName;

    private DeleteUserPoolRequest(Builder builder) {
        super(builder);
        this.userPoolName = builder.userPoolName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteUserPoolRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return userPoolName
     */
    public String getUserPoolName() {
        return this.userPoolName;
    }

    public static final class Builder extends Request.Builder<DeleteUserPoolRequest, Builder> {
        private String userPoolName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteUserPoolRequest request) {
            super(request);
            this.userPoolName = request.userPoolName;
        } 

        /**
         * UserPoolName.
         */
        public Builder userPoolName(String userPoolName) {
            this.putBodyParameter("UserPoolName", userPoolName);
            this.userPoolName = userPoolName;
            return this;
        }

        @Override
        public DeleteUserPoolRequest build() {
            return new DeleteUserPoolRequest(this);
        } 

    } 

}
