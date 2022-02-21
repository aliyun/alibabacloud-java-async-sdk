// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTpcdsDatabaseResponse} extends {@link TeaModel}
 *
 * <p>CreateTpcdsDatabaseResponse</p>
 */
public class CreateTpcdsDatabaseResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateTpcdsDatabaseResponseBody body;

    private CreateTpcdsDatabaseResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateTpcdsDatabaseResponse create() {
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
    public CreateTpcdsDatabaseResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateTpcdsDatabaseResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateTpcdsDatabaseResponseBody body);

        @Override
        CreateTpcdsDatabaseResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateTpcdsDatabaseResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateTpcdsDatabaseResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateTpcdsDatabaseResponse response) {
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
        public Builder body(CreateTpcdsDatabaseResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateTpcdsDatabaseResponse build() {
            return new CreateTpcdsDatabaseResponse(this);
        } 

    } 

}
