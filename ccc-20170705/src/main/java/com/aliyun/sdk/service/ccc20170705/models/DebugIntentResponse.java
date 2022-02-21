// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DebugIntentResponse} extends {@link TeaModel}
 *
 * <p>DebugIntentResponse</p>
 */
public class DebugIntentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DebugIntentResponseBody body;

    private DebugIntentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DebugIntentResponse create() {
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
    public DebugIntentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DebugIntentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DebugIntentResponseBody body);

        @Override
        DebugIntentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DebugIntentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DebugIntentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DebugIntentResponse response) {
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
        public Builder body(DebugIntentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DebugIntentResponse build() {
            return new DebugIntentResponse(this);
        } 

    } 

}
