// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResultCallbackResponse} extends {@link TeaModel}
 *
 * <p>ResultCallbackResponse</p>
 */
public class ResultCallbackResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ResultCallbackResponseBody body;

    private ResultCallbackResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ResultCallbackResponse create() {
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
    public ResultCallbackResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ResultCallbackResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ResultCallbackResponseBody body);

        @Override
        ResultCallbackResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ResultCallbackResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ResultCallbackResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ResultCallbackResponse response) {
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
        public Builder body(ResultCallbackResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ResultCallbackResponse build() {
            return new ResultCallbackResponse(this);
        } 

    } 

}
