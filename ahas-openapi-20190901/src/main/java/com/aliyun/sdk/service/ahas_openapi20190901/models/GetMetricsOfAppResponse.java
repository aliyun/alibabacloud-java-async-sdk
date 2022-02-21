// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMetricsOfAppResponse} extends {@link TeaModel}
 *
 * <p>GetMetricsOfAppResponse</p>
 */
public class GetMetricsOfAppResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetMetricsOfAppResponseBody body;

    private GetMetricsOfAppResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetMetricsOfAppResponse create() {
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
    public GetMetricsOfAppResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetMetricsOfAppResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetMetricsOfAppResponseBody body);

        @Override
        GetMetricsOfAppResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetMetricsOfAppResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetMetricsOfAppResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetMetricsOfAppResponse response) {
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
        public Builder body(GetMetricsOfAppResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetMetricsOfAppResponse build() {
            return new GetMetricsOfAppResponse(this);
        } 

    } 

}
