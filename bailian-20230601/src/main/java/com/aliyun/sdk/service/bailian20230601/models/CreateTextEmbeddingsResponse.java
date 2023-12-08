// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTextEmbeddingsResponse} extends {@link TeaModel}
 *
 * <p>CreateTextEmbeddingsResponse</p>
 */
public class CreateTextEmbeddingsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateTextEmbeddingsResponseBody body;

    private CreateTextEmbeddingsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateTextEmbeddingsResponse create() {
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
    public CreateTextEmbeddingsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateTextEmbeddingsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateTextEmbeddingsResponseBody body);

        @Override
        CreateTextEmbeddingsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateTextEmbeddingsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateTextEmbeddingsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateTextEmbeddingsResponse response) {
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
        public Builder body(CreateTextEmbeddingsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateTextEmbeddingsResponse build() {
            return new CreateTextEmbeddingsResponse(this);
        } 

    } 

}
