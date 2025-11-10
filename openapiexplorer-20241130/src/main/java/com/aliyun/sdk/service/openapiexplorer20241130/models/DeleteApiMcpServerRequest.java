// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openapiexplorer20241130.models;

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
 * {@link DeleteApiMcpServerRequest} extends {@link RequestModel}
 *
 * <p>DeleteApiMcpServerRequest</p>
 */
public class DeleteApiMcpServerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    private DeleteApiMcpServerRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteApiMcpServerRequest create() {
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
     * @return id
     */
    public String getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<DeleteApiMcpServerRequest, Builder> {
        private String clientToken; 
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(DeleteApiMcpServerRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.id = request.id;
        } 

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>v6ZZ7ftCzEILW***</p>
         */
        public Builder id(String id) {
            this.putQueryParameter("id", id);
            this.id = id;
            return this;
        }

        @Override
        public DeleteApiMcpServerRequest build() {
            return new DeleteApiMcpServerRequest(this);
        } 

    } 

}
