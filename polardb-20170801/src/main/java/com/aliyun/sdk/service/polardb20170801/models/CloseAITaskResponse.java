// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CloseAITaskResponse} extends {@link TeaModel}
 *
 * <p>CloseAITaskResponse</p>
 */
public class CloseAITaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CloseAITaskResponseBody body;

    private CloseAITaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CloseAITaskResponse create() {
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
    public CloseAITaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CloseAITaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CloseAITaskResponseBody body);

        @Override
        CloseAITaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CloseAITaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CloseAITaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CloseAITaskResponse response) {
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
        public Builder body(CloseAITaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CloseAITaskResponse build() {
            return new CloseAITaskResponse(this);
        } 

    } 

}
