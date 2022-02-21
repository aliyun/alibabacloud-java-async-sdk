// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResumeVsStreamResponse} extends {@link TeaModel}
 *
 * <p>ResumeVsStreamResponse</p>
 */
public class ResumeVsStreamResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ResumeVsStreamResponseBody body;

    private ResumeVsStreamResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ResumeVsStreamResponse create() {
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
    public ResumeVsStreamResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ResumeVsStreamResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ResumeVsStreamResponseBody body);

        @Override
        ResumeVsStreamResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ResumeVsStreamResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ResumeVsStreamResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ResumeVsStreamResponse response) {
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
        public Builder body(ResumeVsStreamResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ResumeVsStreamResponse build() {
            return new ResumeVsStreamResponse(this);
        } 

    } 

}
