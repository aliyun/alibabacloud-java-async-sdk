// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteOrganizationalUnitResponse} extends {@link TeaModel}
 *
 * <p>DeleteOrganizationalUnitResponse</p>
 */
public class DeleteOrganizationalUnitResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteOrganizationalUnitResponseBody body;

    private DeleteOrganizationalUnitResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteOrganizationalUnitResponse create() {
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
    public DeleteOrganizationalUnitResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteOrganizationalUnitResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteOrganizationalUnitResponseBody body);

        @Override
        DeleteOrganizationalUnitResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteOrganizationalUnitResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteOrganizationalUnitResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteOrganizationalUnitResponse response) {
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
        public Builder body(DeleteOrganizationalUnitResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteOrganizationalUnitResponse build() {
            return new DeleteOrganizationalUnitResponse(this);
        } 

    } 

}
