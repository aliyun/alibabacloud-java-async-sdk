// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRoleResponse} extends {@link TeaModel}
 *
 * <p>DeleteRoleResponse</p>
 */
public class DeleteRoleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteRoleResponseBody body;

    private DeleteRoleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteRoleResponse create() {
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
    public DeleteRoleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteRoleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteRoleResponseBody body);

        @Override
        DeleteRoleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteRoleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteRoleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteRoleResponse response) {
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
        public Builder body(DeleteRoleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteRoleResponse build() {
            return new DeleteRoleResponse(this);
        } 

    } 

}
