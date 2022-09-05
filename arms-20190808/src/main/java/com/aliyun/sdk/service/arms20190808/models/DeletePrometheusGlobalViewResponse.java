// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePrometheusGlobalViewResponse} extends {@link TeaModel}
 *
 * <p>DeletePrometheusGlobalViewResponse</p>
 */
public class DeletePrometheusGlobalViewResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeletePrometheusGlobalViewResponseBody body;

    private DeletePrometheusGlobalViewResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeletePrometheusGlobalViewResponse create() {
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
    public DeletePrometheusGlobalViewResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeletePrometheusGlobalViewResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeletePrometheusGlobalViewResponseBody body);

        @Override
        DeletePrometheusGlobalViewResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeletePrometheusGlobalViewResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeletePrometheusGlobalViewResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeletePrometheusGlobalViewResponse response) {
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
        public Builder body(DeletePrometheusGlobalViewResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeletePrometheusGlobalViewResponse build() {
            return new DeletePrometheusGlobalViewResponse(this);
        } 

    } 

}
