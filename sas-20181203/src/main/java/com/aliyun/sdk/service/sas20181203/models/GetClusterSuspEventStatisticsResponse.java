// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetClusterSuspEventStatisticsResponse} extends {@link TeaModel}
 *
 * <p>GetClusterSuspEventStatisticsResponse</p>
 */
public class GetClusterSuspEventStatisticsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetClusterSuspEventStatisticsResponseBody body;

    private GetClusterSuspEventStatisticsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetClusterSuspEventStatisticsResponse create() {
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
    public GetClusterSuspEventStatisticsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetClusterSuspEventStatisticsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetClusterSuspEventStatisticsResponseBody body);

        @Override
        GetClusterSuspEventStatisticsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetClusterSuspEventStatisticsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetClusterSuspEventStatisticsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetClusterSuspEventStatisticsResponse response) {
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
        public Builder body(GetClusterSuspEventStatisticsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetClusterSuspEventStatisticsResponse build() {
            return new GetClusterSuspEventStatisticsResponse(this);
        } 

    } 

}
