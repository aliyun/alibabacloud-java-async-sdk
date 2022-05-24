// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20210728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitTraceAbResponse} extends {@link TeaModel}
 *
 * <p>SubmitTraceAbResponse</p>
 */
public class SubmitTraceAbResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SubmitTraceAbResponseBody body;

    private SubmitTraceAbResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SubmitTraceAbResponse create() {
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
    public SubmitTraceAbResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitTraceAbResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SubmitTraceAbResponseBody body);

        @Override
        SubmitTraceAbResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitTraceAbResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SubmitTraceAbResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitTraceAbResponse response) {
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
        public Builder body(SubmitTraceAbResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitTraceAbResponse build() {
            return new SubmitTraceAbResponse(this);
        } 

    } 

}
