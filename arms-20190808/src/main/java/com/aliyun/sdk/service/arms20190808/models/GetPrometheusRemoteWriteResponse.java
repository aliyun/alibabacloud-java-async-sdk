// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPrometheusRemoteWriteResponse} extends {@link TeaModel}
 *
 * <p>GetPrometheusRemoteWriteResponse</p>
 */
public class GetPrometheusRemoteWriteResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetPrometheusRemoteWriteResponseBody body;

    private GetPrometheusRemoteWriteResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetPrometheusRemoteWriteResponse create() {
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
    public GetPrometheusRemoteWriteResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetPrometheusRemoteWriteResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetPrometheusRemoteWriteResponseBody body);

        @Override
        GetPrometheusRemoteWriteResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetPrometheusRemoteWriteResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetPrometheusRemoteWriteResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetPrometheusRemoteWriteResponse response) {
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
        public Builder body(GetPrometheusRemoteWriteResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetPrometheusRemoteWriteResponse build() {
            return new GetPrometheusRemoteWriteResponse(this);
        } 

    } 

}
