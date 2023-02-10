// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.documentautoml20221229.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PredictClassifierModelResponse} extends {@link TeaModel}
 *
 * <p>PredictClassifierModelResponse</p>
 */
public class PredictClassifierModelResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PredictClassifierModelResponseBody body;

    private PredictClassifierModelResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PredictClassifierModelResponse create() {
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
    public PredictClassifierModelResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PredictClassifierModelResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PredictClassifierModelResponseBody body);

        @Override
        PredictClassifierModelResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PredictClassifierModelResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PredictClassifierModelResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PredictClassifierModelResponse response) {
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
        public Builder body(PredictClassifierModelResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PredictClassifierModelResponse build() {
            return new PredictClassifierModelResponse(this);
        } 

    } 

}
