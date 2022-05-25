// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eiam.dev.models.*;

/**
 * {@link DeleteOrganizationalUnitResponse} extends {@link TeaModel}
 *
 * <p>DeleteOrganizationalUnitResponse</p>
 */
public class DeleteOrganizationalUnitResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    private DeleteOrganizationalUnitResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
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

    public interface Builder extends Response.Builder<DeleteOrganizationalUnitResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        @Override
        DeleteOrganizationalUnitResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteOrganizationalUnitResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteOrganizationalUnitResponse response) {
            super(response);
            this.headers = response.headers;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        @Override
        public DeleteOrganizationalUnitResponse build() {
            return new DeleteOrganizationalUnitResponse(this);
        } 

    } 

}
