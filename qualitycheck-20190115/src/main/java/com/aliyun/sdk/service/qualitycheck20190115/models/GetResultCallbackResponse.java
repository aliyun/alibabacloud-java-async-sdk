// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResultCallbackResponse} extends {@link TeaModel}
 *
 * <p>GetResultCallbackResponse</p>
 */
public class GetResultCallbackResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetResultCallbackResponseBody body;

    private GetResultCallbackResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetResultCallbackResponse create() {
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
    public GetResultCallbackResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetResultCallbackResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetResultCallbackResponseBody body);

        @Override
        GetResultCallbackResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetResultCallbackResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetResultCallbackResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetResultCallbackResponse response) {
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
        public Builder body(GetResultCallbackResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetResultCallbackResponse build() {
            return new GetResultCallbackResponse(this);
        } 

    } 

}
