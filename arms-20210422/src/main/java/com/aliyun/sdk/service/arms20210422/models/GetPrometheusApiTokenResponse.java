// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPrometheusApiTokenResponse} extends {@link TeaModel}
 *
 * <p>GetPrometheusApiTokenResponse</p>
 */
public class GetPrometheusApiTokenResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetPrometheusApiTokenResponseBody body;

    private GetPrometheusApiTokenResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetPrometheusApiTokenResponse create() {
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
    public GetPrometheusApiTokenResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetPrometheusApiTokenResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetPrometheusApiTokenResponseBody body);

        @Override
        GetPrometheusApiTokenResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetPrometheusApiTokenResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetPrometheusApiTokenResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetPrometheusApiTokenResponse response) {
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
        public Builder body(GetPrometheusApiTokenResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetPrometheusApiTokenResponse build() {
            return new GetPrometheusApiTokenResponse(this);
        } 

    } 

}
