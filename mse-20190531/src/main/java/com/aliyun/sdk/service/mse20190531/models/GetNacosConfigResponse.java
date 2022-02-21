// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetNacosConfigResponse} extends {@link TeaModel}
 *
 * <p>GetNacosConfigResponse</p>
 */
public class GetNacosConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetNacosConfigResponseBody body;

    private GetNacosConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetNacosConfigResponse create() {
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
    public GetNacosConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetNacosConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetNacosConfigResponseBody body);

        @Override
        GetNacosConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetNacosConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetNacosConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetNacosConfigResponse response) {
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
        public Builder body(GetNacosConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetNacosConfigResponse build() {
            return new GetNacosConfigResponse(this);
        } 

    } 

}
