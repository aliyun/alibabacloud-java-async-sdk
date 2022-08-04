// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenAITaskResponse} extends {@link TeaModel}
 *
 * <p>OpenAITaskResponse</p>
 */
public class OpenAITaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OpenAITaskResponseBody body;

    private OpenAITaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OpenAITaskResponse create() {
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
    public OpenAITaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OpenAITaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OpenAITaskResponseBody body);

        @Override
        OpenAITaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OpenAITaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OpenAITaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OpenAITaskResponse response) {
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
        public Builder body(OpenAITaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OpenAITaskResponse build() {
            return new OpenAITaskResponse(this);
        } 

    } 

}
