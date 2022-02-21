// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EncodeBlindWatermarkResponse} extends {@link TeaModel}
 *
 * <p>EncodeBlindWatermarkResponse</p>
 */
public class EncodeBlindWatermarkResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EncodeBlindWatermarkResponseBody body;

    private EncodeBlindWatermarkResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EncodeBlindWatermarkResponse create() {
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
    public EncodeBlindWatermarkResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EncodeBlindWatermarkResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EncodeBlindWatermarkResponseBody body);

        @Override
        EncodeBlindWatermarkResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EncodeBlindWatermarkResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EncodeBlindWatermarkResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EncodeBlindWatermarkResponse response) {
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
        public Builder body(EncodeBlindWatermarkResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EncodeBlindWatermarkResponse build() {
            return new EncodeBlindWatermarkResponse(this);
        } 

    } 

}
