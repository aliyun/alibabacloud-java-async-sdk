// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceMetricsResponse} extends {@link TeaModel}
 *
 * <p>GetInstanceMetricsResponse</p>
 */
public class GetInstanceMetricsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetInstanceMetricsResponseBody body;

    private GetInstanceMetricsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetInstanceMetricsResponse create() {
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
    public GetInstanceMetricsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetInstanceMetricsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetInstanceMetricsResponseBody body);

        @Override
        GetInstanceMetricsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetInstanceMetricsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetInstanceMetricsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetInstanceMetricsResponse response) {
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
        public Builder body(GetInstanceMetricsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetInstanceMetricsResponse build() {
            return new GetInstanceMetricsResponse(this);
        } 

    } 

}
