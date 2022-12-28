// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.es_serverless20220822.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDataStreamResponse} extends {@link TeaModel}
 *
 * <p>CreateDataStreamResponse</p>
 */
public class CreateDataStreamResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDataStreamResponseBody body;

    private CreateDataStreamResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDataStreamResponse create() {
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
    public CreateDataStreamResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDataStreamResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDataStreamResponseBody body);

        @Override
        CreateDataStreamResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDataStreamResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDataStreamResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDataStreamResponse response) {
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
        public Builder body(CreateDataStreamResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDataStreamResponse build() {
            return new CreateDataStreamResponse(this);
        } 

    } 

}
