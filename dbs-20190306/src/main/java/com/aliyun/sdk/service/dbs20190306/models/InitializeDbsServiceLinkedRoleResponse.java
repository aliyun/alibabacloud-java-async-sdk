// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InitializeDbsServiceLinkedRoleResponse} extends {@link TeaModel}
 *
 * <p>InitializeDbsServiceLinkedRoleResponse</p>
 */
public class InitializeDbsServiceLinkedRoleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private InitializeDbsServiceLinkedRoleResponseBody body;

    private InitializeDbsServiceLinkedRoleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static InitializeDbsServiceLinkedRoleResponse create() {
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
    public InitializeDbsServiceLinkedRoleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<InitializeDbsServiceLinkedRoleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(InitializeDbsServiceLinkedRoleResponseBody body);

        @Override
        InitializeDbsServiceLinkedRoleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<InitializeDbsServiceLinkedRoleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private InitializeDbsServiceLinkedRoleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(InitializeDbsServiceLinkedRoleResponse response) {
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
        public Builder body(InitializeDbsServiceLinkedRoleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public InitializeDbsServiceLinkedRoleResponse build() {
            return new InitializeDbsServiceLinkedRoleResponse(this);
        } 

    } 

}
