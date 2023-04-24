// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.documentautoml20221229.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PredictPreTrainModelResponse} extends {@link TeaModel}
 *
 * <p>PredictPreTrainModelResponse</p>
 */
public class PredictPreTrainModelResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PredictPreTrainModelResponseBody body;

    private PredictPreTrainModelResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PredictPreTrainModelResponse create() {
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
    public PredictPreTrainModelResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PredictPreTrainModelResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PredictPreTrainModelResponseBody body);

        @Override
        PredictPreTrainModelResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PredictPreTrainModelResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PredictPreTrainModelResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PredictPreTrainModelResponse response) {
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
        public Builder body(PredictPreTrainModelResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PredictPreTrainModelResponse build() {
            return new PredictPreTrainModelResponse(this);
        } 

    } 

}
