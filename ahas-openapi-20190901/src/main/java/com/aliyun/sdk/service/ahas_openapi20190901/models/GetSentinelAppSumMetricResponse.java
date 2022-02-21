// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSentinelAppSumMetricResponse} extends {@link TeaModel}
 *
 * <p>GetSentinelAppSumMetricResponse</p>
 */
public class GetSentinelAppSumMetricResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSentinelAppSumMetricResponseBody body;

    private GetSentinelAppSumMetricResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSentinelAppSumMetricResponse create() {
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
    public GetSentinelAppSumMetricResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSentinelAppSumMetricResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSentinelAppSumMetricResponseBody body);

        @Override
        GetSentinelAppSumMetricResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSentinelAppSumMetricResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSentinelAppSumMetricResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSentinelAppSumMetricResponse response) {
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
        public Builder body(GetSentinelAppSumMetricResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSentinelAppSumMetricResponse build() {
            return new GetSentinelAppSumMetricResponse(this);
        } 

    } 

}
