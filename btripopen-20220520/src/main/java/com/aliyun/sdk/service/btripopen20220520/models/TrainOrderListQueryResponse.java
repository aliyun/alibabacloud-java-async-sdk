// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TrainOrderListQueryResponse} extends {@link TeaModel}
 *
 * <p>TrainOrderListQueryResponse</p>
 */
public class TrainOrderListQueryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private TrainOrderListQueryResponseBody body;

    private TrainOrderListQueryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TrainOrderListQueryResponse create() {
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
    public TrainOrderListQueryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TrainOrderListQueryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(TrainOrderListQueryResponseBody body);

        @Override
        TrainOrderListQueryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TrainOrderListQueryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private TrainOrderListQueryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TrainOrderListQueryResponse response) {
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
        public Builder body(TrainOrderListQueryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TrainOrderListQueryResponse build() {
            return new TrainOrderListQueryResponse(this);
        } 

    } 

}
