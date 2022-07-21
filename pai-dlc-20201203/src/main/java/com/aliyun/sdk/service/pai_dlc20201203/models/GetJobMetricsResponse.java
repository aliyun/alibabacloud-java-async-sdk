// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetJobMetricsResponse} extends {@link TeaModel}
 *
 * <p>GetJobMetricsResponse</p>
 */
public class GetJobMetricsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetJobMetricsResponseBody body;

    private GetJobMetricsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetJobMetricsResponse create() {
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
    public GetJobMetricsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetJobMetricsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetJobMetricsResponseBody body);

        @Override
        GetJobMetricsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetJobMetricsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetJobMetricsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetJobMetricsResponse response) {
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
        public Builder body(GetJobMetricsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetJobMetricsResponse build() {
            return new GetJobMetricsResponse(this);
        } 

    } 

}
