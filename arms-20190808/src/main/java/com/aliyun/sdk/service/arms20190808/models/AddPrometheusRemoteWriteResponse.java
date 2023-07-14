// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddPrometheusRemoteWriteResponse} extends {@link TeaModel}
 *
 * <p>AddPrometheusRemoteWriteResponse</p>
 */
public class AddPrometheusRemoteWriteResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddPrometheusRemoteWriteResponseBody body;

    private AddPrometheusRemoteWriteResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddPrometheusRemoteWriteResponse create() {
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
    public AddPrometheusRemoteWriteResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddPrometheusRemoteWriteResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddPrometheusRemoteWriteResponseBody body);

        @Override
        AddPrometheusRemoteWriteResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddPrometheusRemoteWriteResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddPrometheusRemoteWriteResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddPrometheusRemoteWriteResponse response) {
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
        public Builder body(AddPrometheusRemoteWriteResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddPrometheusRemoteWriteResponse build() {
            return new AddPrometheusRemoteWriteResponse(this);
        } 

    } 

}
