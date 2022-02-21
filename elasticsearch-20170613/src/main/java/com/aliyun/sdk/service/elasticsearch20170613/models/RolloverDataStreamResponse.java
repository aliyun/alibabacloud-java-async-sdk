// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RolloverDataStreamResponse} extends {@link TeaModel}
 *
 * <p>RolloverDataStreamResponse</p>
 */
public class RolloverDataStreamResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RolloverDataStreamResponseBody body;

    private RolloverDataStreamResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RolloverDataStreamResponse create() {
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
    public RolloverDataStreamResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RolloverDataStreamResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RolloverDataStreamResponseBody body);

        @Override
        RolloverDataStreamResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RolloverDataStreamResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RolloverDataStreamResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RolloverDataStreamResponse response) {
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
        public Builder body(RolloverDataStreamResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RolloverDataStreamResponse build() {
            return new RolloverDataStreamResponse(this);
        } 

    } 

}
