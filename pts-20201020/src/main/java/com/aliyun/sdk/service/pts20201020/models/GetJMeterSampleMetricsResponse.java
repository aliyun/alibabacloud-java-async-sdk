// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetJMeterSampleMetricsResponse} extends {@link TeaModel}
 *
 * <p>GetJMeterSampleMetricsResponse</p>
 */
public class GetJMeterSampleMetricsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetJMeterSampleMetricsResponseBody body;

    private GetJMeterSampleMetricsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetJMeterSampleMetricsResponse create() {
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
    public GetJMeterSampleMetricsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetJMeterSampleMetricsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetJMeterSampleMetricsResponseBody body);

        @Override
        GetJMeterSampleMetricsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetJMeterSampleMetricsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetJMeterSampleMetricsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetJMeterSampleMetricsResponse response) {
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
        public Builder body(GetJMeterSampleMetricsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetJMeterSampleMetricsResponse build() {
            return new GetJMeterSampleMetricsResponse(this);
        } 

    } 

}
