// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TrainStationSearchResponse} extends {@link TeaModel}
 *
 * <p>TrainStationSearchResponse</p>
 */
public class TrainStationSearchResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private TrainStationSearchResponseBody body;

    private TrainStationSearchResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TrainStationSearchResponse create() {
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
    public TrainStationSearchResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TrainStationSearchResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(TrainStationSearchResponseBody body);

        @Override
        TrainStationSearchResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TrainStationSearchResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private TrainStationSearchResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TrainStationSearchResponse response) {
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
        public Builder body(TrainStationSearchResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TrainStationSearchResponse build() {
            return new TrainStationSearchResponse(this);
        } 

    } 

}
