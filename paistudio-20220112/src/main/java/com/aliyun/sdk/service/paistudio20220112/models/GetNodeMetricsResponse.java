// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetNodeMetricsResponse} extends {@link TeaModel}
 *
 * <p>GetNodeMetricsResponse</p>
 */
public class GetNodeMetricsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetNodeMetricsResponseBody body;

    private GetNodeMetricsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetNodeMetricsResponse create() {
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
    public GetNodeMetricsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetNodeMetricsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetNodeMetricsResponseBody body);

        @Override
        GetNodeMetricsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetNodeMetricsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetNodeMetricsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetNodeMetricsResponse response) {
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
        public Builder body(GetNodeMetricsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetNodeMetricsResponse build() {
            return new GetNodeMetricsResponse(this);
        } 

    } 

}
