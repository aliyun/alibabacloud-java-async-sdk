// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TrainModelResponse} extends {@link TeaModel}
 *
 * <p>TrainModelResponse</p>
 */
public class TrainModelResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private TrainModelResponseBody body;

    private TrainModelResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TrainModelResponse create() {
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
    public TrainModelResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TrainModelResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(TrainModelResponseBody body);

        @Override
        TrainModelResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TrainModelResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private TrainModelResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TrainModelResponse response) {
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
        public Builder body(TrainModelResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TrainModelResponse build() {
            return new TrainModelResponse(this);
        } 

    } 

}
