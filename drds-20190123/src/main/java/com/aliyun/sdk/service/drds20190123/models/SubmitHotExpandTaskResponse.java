// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitHotExpandTaskResponse} extends {@link TeaModel}
 *
 * <p>SubmitHotExpandTaskResponse</p>
 */
public class SubmitHotExpandTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SubmitHotExpandTaskResponseBody body;

    private SubmitHotExpandTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SubmitHotExpandTaskResponse create() {
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
    public SubmitHotExpandTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitHotExpandTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SubmitHotExpandTaskResponseBody body);

        @Override
        SubmitHotExpandTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitHotExpandTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SubmitHotExpandTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitHotExpandTaskResponse response) {
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
        public Builder body(SubmitHotExpandTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitHotExpandTaskResponse build() {
            return new SubmitHotExpandTaskResponse(this);
        } 

    } 

}
