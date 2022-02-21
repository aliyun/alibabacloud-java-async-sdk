// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQueryOptimizeExecErrorStatsResponse} extends {@link TeaModel}
 *
 * <p>GetQueryOptimizeExecErrorStatsResponse</p>
 */
public class GetQueryOptimizeExecErrorStatsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetQueryOptimizeExecErrorStatsResponseBody body;

    private GetQueryOptimizeExecErrorStatsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetQueryOptimizeExecErrorStatsResponse create() {
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
    public GetQueryOptimizeExecErrorStatsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetQueryOptimizeExecErrorStatsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetQueryOptimizeExecErrorStatsResponseBody body);

        @Override
        GetQueryOptimizeExecErrorStatsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetQueryOptimizeExecErrorStatsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetQueryOptimizeExecErrorStatsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetQueryOptimizeExecErrorStatsResponse response) {
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
        public Builder body(GetQueryOptimizeExecErrorStatsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetQueryOptimizeExecErrorStatsResponse build() {
            return new GetQueryOptimizeExecErrorStatsResponse(this);
        } 

    } 

}
