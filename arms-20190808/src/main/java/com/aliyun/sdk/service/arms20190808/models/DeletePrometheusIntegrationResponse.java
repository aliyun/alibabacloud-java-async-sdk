// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePrometheusIntegrationResponse} extends {@link TeaModel}
 *
 * <p>DeletePrometheusIntegrationResponse</p>
 */
public class DeletePrometheusIntegrationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeletePrometheusIntegrationResponseBody body;

    private DeletePrometheusIntegrationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeletePrometheusIntegrationResponse create() {
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
    public DeletePrometheusIntegrationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeletePrometheusIntegrationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeletePrometheusIntegrationResponseBody body);

        @Override
        DeletePrometheusIntegrationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeletePrometheusIntegrationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeletePrometheusIntegrationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeletePrometheusIntegrationResponse response) {
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
        public Builder body(DeletePrometheusIntegrationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeletePrometheusIntegrationResponse build() {
            return new DeletePrometheusIntegrationResponse(this);
        } 

    } 

}
