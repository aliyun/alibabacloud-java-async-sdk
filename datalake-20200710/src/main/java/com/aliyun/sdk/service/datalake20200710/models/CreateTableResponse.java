// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTableResponse} extends {@link TeaModel}
 *
 * <p>CreateTableResponse</p>
 */
public class CreateTableResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateTableResponseBody body;

    private CreateTableResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateTableResponse create() {
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
    public CreateTableResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateTableResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateTableResponseBody body);

        @Override
        CreateTableResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateTableResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateTableResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateTableResponse response) {
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
        public Builder body(CreateTableResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateTableResponse build() {
            return new CreateTableResponse(this);
        } 

    } 

}
