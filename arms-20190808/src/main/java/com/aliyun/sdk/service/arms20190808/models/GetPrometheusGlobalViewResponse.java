// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPrometheusGlobalViewResponse} extends {@link TeaModel}
 *
 * <p>GetPrometheusGlobalViewResponse</p>
 */
public class GetPrometheusGlobalViewResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetPrometheusGlobalViewResponseBody body;

    private GetPrometheusGlobalViewResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetPrometheusGlobalViewResponse create() {
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
    public GetPrometheusGlobalViewResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetPrometheusGlobalViewResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetPrometheusGlobalViewResponseBody body);

        @Override
        GetPrometheusGlobalViewResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetPrometheusGlobalViewResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetPrometheusGlobalViewResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetPrometheusGlobalViewResponse response) {
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
        public Builder body(GetPrometheusGlobalViewResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetPrometheusGlobalViewResponse build() {
            return new GetPrometheusGlobalViewResponse(this);
        } 

    } 

}
