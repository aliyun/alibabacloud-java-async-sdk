// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePrometheusRemoteWriteResponse} extends {@link TeaModel}
 *
 * <p>DeletePrometheusRemoteWriteResponse</p>
 */
public class DeletePrometheusRemoteWriteResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeletePrometheusRemoteWriteResponseBody body;

    private DeletePrometheusRemoteWriteResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeletePrometheusRemoteWriteResponse create() {
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
    public DeletePrometheusRemoteWriteResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeletePrometheusRemoteWriteResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeletePrometheusRemoteWriteResponseBody body);

        @Override
        DeletePrometheusRemoteWriteResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeletePrometheusRemoteWriteResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeletePrometheusRemoteWriteResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeletePrometheusRemoteWriteResponse response) {
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
        public Builder body(DeletePrometheusRemoteWriteResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeletePrometheusRemoteWriteResponse build() {
            return new DeletePrometheusRemoteWriteResponse(this);
        } 

    } 

}
