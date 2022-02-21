// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetNacosHistoryConfigResponse} extends {@link TeaModel}
 *
 * <p>GetNacosHistoryConfigResponse</p>
 */
public class GetNacosHistoryConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetNacosHistoryConfigResponseBody body;

    private GetNacosHistoryConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetNacosHistoryConfigResponse create() {
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
    public GetNacosHistoryConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetNacosHistoryConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetNacosHistoryConfigResponseBody body);

        @Override
        GetNacosHistoryConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetNacosHistoryConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetNacosHistoryConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetNacosHistoryConfigResponse response) {
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
        public Builder body(GetNacosHistoryConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetNacosHistoryConfigResponse build() {
            return new GetNacosHistoryConfigResponse(this);
        } 

    } 

}
