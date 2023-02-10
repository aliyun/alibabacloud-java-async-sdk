// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.documentautoml20221229.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PredictModelResponse} extends {@link TeaModel}
 *
 * <p>PredictModelResponse</p>
 */
public class PredictModelResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PredictModelResponseBody body;

    private PredictModelResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PredictModelResponse create() {
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
    public PredictModelResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PredictModelResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PredictModelResponseBody body);

        @Override
        PredictModelResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PredictModelResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PredictModelResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PredictModelResponse response) {
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
        public Builder body(PredictModelResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PredictModelResponse build() {
            return new PredictModelResponse(this);
        } 

    } 

}
