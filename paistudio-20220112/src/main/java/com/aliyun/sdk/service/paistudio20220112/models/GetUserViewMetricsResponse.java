// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserViewMetricsResponse} extends {@link TeaModel}
 *
 * <p>GetUserViewMetricsResponse</p>
 */
public class GetUserViewMetricsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetUserViewMetricsResponseBody body;

    private GetUserViewMetricsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetUserViewMetricsResponse create() {
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
    public GetUserViewMetricsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetUserViewMetricsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetUserViewMetricsResponseBody body);

        @Override
        GetUserViewMetricsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetUserViewMetricsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetUserViewMetricsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetUserViewMetricsResponse response) {
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
        public Builder body(GetUserViewMetricsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetUserViewMetricsResponse build() {
            return new GetUserViewMetricsResponse(this);
        } 

    } 

}
