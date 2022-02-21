// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTenantReadOnlyConnectionResponse} extends {@link TeaModel}
 *
 * <p>CreateTenantReadOnlyConnectionResponse</p>
 */
public class CreateTenantReadOnlyConnectionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateTenantReadOnlyConnectionResponseBody body;

    private CreateTenantReadOnlyConnectionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateTenantReadOnlyConnectionResponse create() {
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
    public CreateTenantReadOnlyConnectionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateTenantReadOnlyConnectionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateTenantReadOnlyConnectionResponseBody body);

        @Override
        CreateTenantReadOnlyConnectionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateTenantReadOnlyConnectionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateTenantReadOnlyConnectionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateTenantReadOnlyConnectionResponse response) {
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
        public Builder body(CreateTenantReadOnlyConnectionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateTenantReadOnlyConnectionResponse build() {
            return new CreateTenantReadOnlyConnectionResponse(this);
        } 

    } 

}
