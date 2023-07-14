// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPrometheusInstanceResponse} extends {@link TeaModel}
 *
 * <p>GetPrometheusInstanceResponse</p>
 */
public class GetPrometheusInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetPrometheusInstanceResponseBody body;

    private GetPrometheusInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetPrometheusInstanceResponse create() {
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
    public GetPrometheusInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetPrometheusInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetPrometheusInstanceResponseBody body);

        @Override
        GetPrometheusInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetPrometheusInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetPrometheusInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetPrometheusInstanceResponse response) {
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
        public Builder body(GetPrometheusInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetPrometheusInstanceResponse build() {
            return new GetPrometheusInstanceResponse(this);
        } 

    } 

}
