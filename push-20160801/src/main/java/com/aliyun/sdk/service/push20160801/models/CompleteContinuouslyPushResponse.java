// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CompleteContinuouslyPushResponse} extends {@link TeaModel}
 *
 * <p>CompleteContinuouslyPushResponse</p>
 */
public class CompleteContinuouslyPushResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CompleteContinuouslyPushResponseBody body;

    private CompleteContinuouslyPushResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CompleteContinuouslyPushResponse create() {
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
    public CompleteContinuouslyPushResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CompleteContinuouslyPushResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CompleteContinuouslyPushResponseBody body);

        @Override
        CompleteContinuouslyPushResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CompleteContinuouslyPushResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CompleteContinuouslyPushResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CompleteContinuouslyPushResponse response) {
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
        public Builder body(CompleteContinuouslyPushResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CompleteContinuouslyPushResponse build() {
            return new CompleteContinuouslyPushResponse(this);
        } 

    } 

}
