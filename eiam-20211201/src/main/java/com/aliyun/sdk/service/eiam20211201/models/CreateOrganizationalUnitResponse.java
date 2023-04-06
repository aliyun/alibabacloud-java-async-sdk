// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOrganizationalUnitResponse} extends {@link TeaModel}
 *
 * <p>CreateOrganizationalUnitResponse</p>
 */
public class CreateOrganizationalUnitResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateOrganizationalUnitResponseBody body;

    private CreateOrganizationalUnitResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateOrganizationalUnitResponse create() {
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
    public CreateOrganizationalUnitResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateOrganizationalUnitResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateOrganizationalUnitResponseBody body);

        @Override
        CreateOrganizationalUnitResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateOrganizationalUnitResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateOrganizationalUnitResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateOrganizationalUnitResponse response) {
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
        public Builder body(CreateOrganizationalUnitResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateOrganizationalUnitResponse build() {
            return new CreateOrganizationalUnitResponse(this);
        } 

    } 

}
