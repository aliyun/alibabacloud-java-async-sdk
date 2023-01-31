// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PublishScriptForDebugResponse} extends {@link TeaModel}
 *
 * <p>PublishScriptForDebugResponse</p>
 */
public class PublishScriptForDebugResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PublishScriptForDebugResponseBody body;

    private PublishScriptForDebugResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PublishScriptForDebugResponse create() {
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
    public PublishScriptForDebugResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PublishScriptForDebugResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PublishScriptForDebugResponseBody body);

        @Override
        PublishScriptForDebugResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PublishScriptForDebugResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PublishScriptForDebugResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PublishScriptForDebugResponse response) {
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
        public Builder body(PublishScriptForDebugResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PublishScriptForDebugResponse build() {
            return new PublishScriptForDebugResponse(this);
        } 

    } 

}
