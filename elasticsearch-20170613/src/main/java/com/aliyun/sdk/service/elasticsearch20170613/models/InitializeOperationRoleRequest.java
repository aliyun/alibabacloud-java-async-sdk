// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InitializeOperationRoleRequest} extends {@link RequestModel}
 *
 * <p>InitializeOperationRoleRequest</p>
 */
public class InitializeOperationRoleRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Body
    @NameInMap("body")
    private String body;

    private InitializeOperationRoleRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InitializeOperationRoleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<InitializeOperationRoleRequest, Builder> {
        private String clientToken; 
        private String body; 

        private Builder() {
            super();
        } 

        private Builder(InitializeOperationRoleRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.body = request.body;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * body.
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public InitializeOperationRoleRequest build() {
            return new InitializeOperationRoleRequest(this);
        } 

    } 

}
