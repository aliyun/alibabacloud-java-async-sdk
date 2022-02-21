// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateWebSocketSignResponse} extends {@link TeaModel}
 *
 * <p>GenerateWebSocketSignResponse</p>
 */
public class GenerateWebSocketSignResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GenerateWebSocketSignResponseBody body;

    private GenerateWebSocketSignResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GenerateWebSocketSignResponse create() {
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
    public GenerateWebSocketSignResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GenerateWebSocketSignResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GenerateWebSocketSignResponseBody body);

        @Override
        GenerateWebSocketSignResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GenerateWebSocketSignResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GenerateWebSocketSignResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GenerateWebSocketSignResponse response) {
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
        public Builder body(GenerateWebSocketSignResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GenerateWebSocketSignResponse build() {
            return new GenerateWebSocketSignResponse(this);
        } 

    } 

}
