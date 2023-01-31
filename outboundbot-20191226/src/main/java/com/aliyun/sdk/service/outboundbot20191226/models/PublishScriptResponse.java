// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PublishScriptResponse} extends {@link TeaModel}
 *
 * <p>PublishScriptResponse</p>
 */
public class PublishScriptResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PublishScriptResponseBody body;

    private PublishScriptResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PublishScriptResponse create() {
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
    public PublishScriptResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PublishScriptResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PublishScriptResponseBody body);

        @Override
        PublishScriptResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PublishScriptResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PublishScriptResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PublishScriptResponse response) {
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
        public Builder body(PublishScriptResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PublishScriptResponse build() {
            return new PublishScriptResponse(this);
        } 

    } 

}
