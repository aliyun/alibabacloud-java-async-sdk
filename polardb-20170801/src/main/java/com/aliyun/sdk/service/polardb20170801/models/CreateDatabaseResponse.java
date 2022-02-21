// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDatabaseResponse} extends {@link TeaModel}
 *
 * <p>CreateDatabaseResponse</p>
 */
public class CreateDatabaseResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDatabaseResponseBody body;

    private CreateDatabaseResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDatabaseResponse create() {
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
    public CreateDatabaseResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDatabaseResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDatabaseResponseBody body);

        @Override
        CreateDatabaseResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDatabaseResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDatabaseResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDatabaseResponse response) {
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
        public Builder body(CreateDatabaseResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDatabaseResponse build() {
            return new CreateDatabaseResponse(this);
        } 

    } 

}
