// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CloneNacosConfigResponse} extends {@link TeaModel}
 *
 * <p>CloneNacosConfigResponse</p>
 */
public class CloneNacosConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CloneNacosConfigResponseBody body;

    private CloneNacosConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CloneNacosConfigResponse create() {
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
    public CloneNacosConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CloneNacosConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CloneNacosConfigResponseBody body);

        @Override
        CloneNacosConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CloneNacosConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CloneNacosConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CloneNacosConfigResponse response) {
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
        public Builder body(CloneNacosConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CloneNacosConfigResponse build() {
            return new CloneNacosConfigResponse(this);
        } 

    } 

}
