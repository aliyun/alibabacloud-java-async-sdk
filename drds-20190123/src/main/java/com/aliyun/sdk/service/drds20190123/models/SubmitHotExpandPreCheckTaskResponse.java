// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitHotExpandPreCheckTaskResponse} extends {@link TeaModel}
 *
 * <p>SubmitHotExpandPreCheckTaskResponse</p>
 */
public class SubmitHotExpandPreCheckTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SubmitHotExpandPreCheckTaskResponseBody body;

    private SubmitHotExpandPreCheckTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SubmitHotExpandPreCheckTaskResponse create() {
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
    public SubmitHotExpandPreCheckTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitHotExpandPreCheckTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SubmitHotExpandPreCheckTaskResponseBody body);

        @Override
        SubmitHotExpandPreCheckTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitHotExpandPreCheckTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SubmitHotExpandPreCheckTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitHotExpandPreCheckTaskResponse response) {
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
        public Builder body(SubmitHotExpandPreCheckTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitHotExpandPreCheckTaskResponse build() {
            return new SubmitHotExpandPreCheckTaskResponse(this);
        } 

    } 

}
