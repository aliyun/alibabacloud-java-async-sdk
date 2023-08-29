// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trusted_server20200613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ProduceAikcertResponse} extends {@link TeaModel}
 *
 * <p>ProduceAikcertResponse</p>
 */
public class ProduceAikcertResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ProduceAikcertResponseBody body;

    private ProduceAikcertResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ProduceAikcertResponse create() {
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
    public ProduceAikcertResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ProduceAikcertResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ProduceAikcertResponseBody body);

        @Override
        ProduceAikcertResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ProduceAikcertResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ProduceAikcertResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ProduceAikcertResponse response) {
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
        public Builder body(ProduceAikcertResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ProduceAikcertResponse build() {
            return new ProduceAikcertResponse(this);
        } 

    } 

}
