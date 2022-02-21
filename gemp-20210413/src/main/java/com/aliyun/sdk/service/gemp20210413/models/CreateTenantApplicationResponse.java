// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTenantApplicationResponse} extends {@link TeaModel}
 *
 * <p>CreateTenantApplicationResponse</p>
 */
public class CreateTenantApplicationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateTenantApplicationResponseBody body;

    private CreateTenantApplicationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateTenantApplicationResponse create() {
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
    public CreateTenantApplicationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateTenantApplicationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateTenantApplicationResponseBody body);

        @Override
        CreateTenantApplicationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateTenantApplicationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateTenantApplicationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateTenantApplicationResponse response) {
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
        public Builder body(CreateTenantApplicationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateTenantApplicationResponse build() {
            return new CreateTenantApplicationResponse(this);
        } 

    } 

}
