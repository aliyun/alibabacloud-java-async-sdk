// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20210728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitTraceExtractResponse} extends {@link TeaModel}
 *
 * <p>SubmitTraceExtractResponse</p>
 */
public class SubmitTraceExtractResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SubmitTraceExtractResponseBody body;

    private SubmitTraceExtractResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SubmitTraceExtractResponse create() {
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
    public SubmitTraceExtractResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitTraceExtractResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SubmitTraceExtractResponseBody body);

        @Override
        SubmitTraceExtractResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitTraceExtractResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SubmitTraceExtractResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitTraceExtractResponse response) {
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
        public Builder body(SubmitTraceExtractResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitTraceExtractResponse build() {
            return new SubmitTraceExtractResponse(this);
        } 

    } 

}
