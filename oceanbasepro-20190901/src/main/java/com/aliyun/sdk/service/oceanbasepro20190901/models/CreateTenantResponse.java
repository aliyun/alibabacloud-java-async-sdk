// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTenantResponse} extends {@link TeaModel}
 *
 * <p>CreateTenantResponse</p>
 */
public class CreateTenantResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateTenantResponseBody body;

    private CreateTenantResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateTenantResponse create() {
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
    public CreateTenantResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateTenantResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateTenantResponseBody body);

        @Override
        CreateTenantResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateTenantResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateTenantResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateTenantResponse response) {
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
        public Builder body(CreateTenantResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateTenantResponse build() {
            return new CreateTenantResponse(this);
        } 

    } 

}
