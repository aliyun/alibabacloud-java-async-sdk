// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PredictionWallLineResponse} extends {@link TeaModel}
 *
 * <p>PredictionWallLineResponse</p>
 */
public class PredictionWallLineResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PredictionWallLineResponseBody body;

    private PredictionWallLineResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PredictionWallLineResponse create() {
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
    public PredictionWallLineResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PredictionWallLineResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PredictionWallLineResponseBody body);

        @Override
        PredictionWallLineResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PredictionWallLineResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PredictionWallLineResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PredictionWallLineResponse response) {
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
        public Builder body(PredictionWallLineResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PredictionWallLineResponse build() {
            return new PredictionWallLineResponse(this);
        } 

    } 

}
