// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteServiceLinkedRoleResponse} extends {@link TeaModel}
 *
 * <p>DeleteServiceLinkedRoleResponse</p>
 */
public class DeleteServiceLinkedRoleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteServiceLinkedRoleResponseBody body;

    private DeleteServiceLinkedRoleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteServiceLinkedRoleResponse create() {
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
    public DeleteServiceLinkedRoleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteServiceLinkedRoleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteServiceLinkedRoleResponseBody body);

        @Override
        DeleteServiceLinkedRoleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteServiceLinkedRoleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteServiceLinkedRoleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteServiceLinkedRoleResponse response) {
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
        public Builder body(DeleteServiceLinkedRoleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteServiceLinkedRoleResponse build() {
            return new DeleteServiceLinkedRoleResponse(this);
        } 

    } 

}
