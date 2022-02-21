// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InitializeASMRoleResponse} extends {@link TeaModel}
 *
 * <p>InitializeASMRoleResponse</p>
 */
public class InitializeASMRoleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private InitializeASMRoleResponseBody body;

    private InitializeASMRoleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static InitializeASMRoleResponse create() {
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
    public InitializeASMRoleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<InitializeASMRoleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(InitializeASMRoleResponseBody body);

        @Override
        InitializeASMRoleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<InitializeASMRoleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private InitializeASMRoleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(InitializeASMRoleResponse response) {
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
        public Builder body(InitializeASMRoleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public InitializeASMRoleResponse build() {
            return new InitializeASMRoleResponse(this);
        } 

    } 

}
