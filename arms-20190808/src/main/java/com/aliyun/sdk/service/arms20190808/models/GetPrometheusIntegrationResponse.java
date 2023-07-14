// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPrometheusIntegrationResponse} extends {@link TeaModel}
 *
 * <p>GetPrometheusIntegrationResponse</p>
 */
public class GetPrometheusIntegrationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetPrometheusIntegrationResponseBody body;

    private GetPrometheusIntegrationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetPrometheusIntegrationResponse create() {
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
    public GetPrometheusIntegrationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetPrometheusIntegrationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetPrometheusIntegrationResponseBody body);

        @Override
        GetPrometheusIntegrationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetPrometheusIntegrationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetPrometheusIntegrationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetPrometheusIntegrationResponse response) {
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
        public Builder body(GetPrometheusIntegrationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetPrometheusIntegrationResponse build() {
            return new GetPrometheusIntegrationResponse(this);
        } 

    } 

}
