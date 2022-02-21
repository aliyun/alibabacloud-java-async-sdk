// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMetricsOfResourceResponse} extends {@link TeaModel}
 *
 * <p>GetMetricsOfResourceResponse</p>
 */
public class GetMetricsOfResourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetMetricsOfResourceResponseBody body;

    private GetMetricsOfResourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetMetricsOfResourceResponse create() {
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
    public GetMetricsOfResourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetMetricsOfResourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetMetricsOfResourceResponseBody body);

        @Override
        GetMetricsOfResourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetMetricsOfResourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetMetricsOfResourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetMetricsOfResourceResponse response) {
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
        public Builder body(GetMetricsOfResourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetMetricsOfResourceResponse build() {
            return new GetMetricsOfResourceResponse(this);
        } 

    } 

}
