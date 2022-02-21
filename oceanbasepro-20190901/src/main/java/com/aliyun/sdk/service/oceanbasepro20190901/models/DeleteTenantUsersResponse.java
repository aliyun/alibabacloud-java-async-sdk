// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTenantUsersResponse} extends {@link TeaModel}
 *
 * <p>DeleteTenantUsersResponse</p>
 */
public class DeleteTenantUsersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteTenantUsersResponseBody body;

    private DeleteTenantUsersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteTenantUsersResponse create() {
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
    public DeleteTenantUsersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteTenantUsersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteTenantUsersResponseBody body);

        @Override
        DeleteTenantUsersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteTenantUsersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteTenantUsersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteTenantUsersResponse response) {
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
        public Builder body(DeleteTenantUsersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteTenantUsersResponse build() {
            return new DeleteTenantUsersResponse(this);
        } 

    } 

}
