// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InitializeAutoShowListTaskResponse} extends {@link TeaModel}
 *
 * <p>InitializeAutoShowListTaskResponse</p>
 */
public class InitializeAutoShowListTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private InitializeAutoShowListTaskResponseBody body;

    private InitializeAutoShowListTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static InitializeAutoShowListTaskResponse create() {
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
    public InitializeAutoShowListTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<InitializeAutoShowListTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(InitializeAutoShowListTaskResponseBody body);

        @Override
        InitializeAutoShowListTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<InitializeAutoShowListTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private InitializeAutoShowListTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(InitializeAutoShowListTaskResponse response) {
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
        public Builder body(InitializeAutoShowListTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public InitializeAutoShowListTaskResponse build() {
            return new InitializeAutoShowListTaskResponse(this);
        } 

    } 

}
