// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDbfsResponse} extends {@link TeaModel}
 *
 * <p>CreateDbfsResponse</p>
 */
public class CreateDbfsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDbfsResponseBody body;

    private CreateDbfsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDbfsResponse create() {
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
    public CreateDbfsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDbfsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDbfsResponseBody body);

        @Override
        CreateDbfsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDbfsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDbfsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDbfsResponse response) {
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
        public Builder body(CreateDbfsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDbfsResponse build() {
            return new CreateDbfsResponse(this);
        } 

    } 

}
