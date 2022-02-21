// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DecodeBlindWatermarkResponse} extends {@link TeaModel}
 *
 * <p>DecodeBlindWatermarkResponse</p>
 */
public class DecodeBlindWatermarkResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DecodeBlindWatermarkResponseBody body;

    private DecodeBlindWatermarkResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DecodeBlindWatermarkResponse create() {
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
    public DecodeBlindWatermarkResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DecodeBlindWatermarkResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DecodeBlindWatermarkResponseBody body);

        @Override
        DecodeBlindWatermarkResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DecodeBlindWatermarkResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DecodeBlindWatermarkResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DecodeBlindWatermarkResponse response) {
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
        public Builder body(DecodeBlindWatermarkResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DecodeBlindWatermarkResponse build() {
            return new DecodeBlindWatermarkResponse(this);
        } 

    } 

}
