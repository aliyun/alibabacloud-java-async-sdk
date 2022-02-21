// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQueryOptimizeDataStatsResponse} extends {@link TeaModel}
 *
 * <p>GetQueryOptimizeDataStatsResponse</p>
 */
public class GetQueryOptimizeDataStatsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetQueryOptimizeDataStatsResponseBody body;

    private GetQueryOptimizeDataStatsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetQueryOptimizeDataStatsResponse create() {
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
    public GetQueryOptimizeDataStatsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetQueryOptimizeDataStatsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetQueryOptimizeDataStatsResponseBody body);

        @Override
        GetQueryOptimizeDataStatsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetQueryOptimizeDataStatsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetQueryOptimizeDataStatsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetQueryOptimizeDataStatsResponse response) {
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
        public Builder body(GetQueryOptimizeDataStatsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetQueryOptimizeDataStatsResponse build() {
            return new GetQueryOptimizeDataStatsResponse(this);
        } 

    } 

}
