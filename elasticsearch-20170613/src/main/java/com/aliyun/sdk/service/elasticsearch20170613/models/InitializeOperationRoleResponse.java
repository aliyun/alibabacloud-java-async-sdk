// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InitializeOperationRoleResponse} extends {@link TeaModel}
 *
 * <p>InitializeOperationRoleResponse</p>
 */
public class InitializeOperationRoleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private InitializeOperationRoleResponseBody body;

    private InitializeOperationRoleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static InitializeOperationRoleResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return body
     */
    public InitializeOperationRoleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<InitializeOperationRoleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(InitializeOperationRoleResponseBody body);

        @Override
        InitializeOperationRoleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<InitializeOperationRoleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private InitializeOperationRoleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(InitializeOperationRoleResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(InitializeOperationRoleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public InitializeOperationRoleResponse build() {
            return new InitializeOperationRoleResponse(this);
        } 

    } 

}
