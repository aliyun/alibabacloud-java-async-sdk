// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PubBroadcastResponse} extends {@link TeaModel}
 *
 * <p>PubBroadcastResponse</p>
 */
public class PubBroadcastResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PubBroadcastResponseBody body;

    private PubBroadcastResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PubBroadcastResponse create() {
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
    public PubBroadcastResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PubBroadcastResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PubBroadcastResponseBody body);

        @Override
        PubBroadcastResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PubBroadcastResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PubBroadcastResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PubBroadcastResponse response) {
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
        public Builder body(PubBroadcastResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PubBroadcastResponse build() {
            return new PubBroadcastResponse(this);
        } 

    } 

}
