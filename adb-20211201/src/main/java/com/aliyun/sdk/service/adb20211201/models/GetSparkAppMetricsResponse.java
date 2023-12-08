// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSparkAppMetricsResponse} extends {@link TeaModel}
 *
 * <p>GetSparkAppMetricsResponse</p>
 */
public class GetSparkAppMetricsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSparkAppMetricsResponseBody body;

    private GetSparkAppMetricsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSparkAppMetricsResponse create() {
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
    public GetSparkAppMetricsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSparkAppMetricsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSparkAppMetricsResponseBody body);

        @Override
        GetSparkAppMetricsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSparkAppMetricsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSparkAppMetricsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSparkAppMetricsResponse response) {
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
        public Builder body(GetSparkAppMetricsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSparkAppMetricsResponse build() {
            return new GetSparkAppMetricsResponse(this);
        } 

    } 

}
