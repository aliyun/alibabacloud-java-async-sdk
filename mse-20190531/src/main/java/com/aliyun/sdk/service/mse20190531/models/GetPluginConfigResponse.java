// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPluginConfigResponse} extends {@link TeaModel}
 *
 * <p>GetPluginConfigResponse</p>
 */
public class GetPluginConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetPluginConfigResponseBody body;

    private GetPluginConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetPluginConfigResponse create() {
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
    public GetPluginConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetPluginConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetPluginConfigResponseBody body);

        @Override
        GetPluginConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetPluginConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetPluginConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetPluginConfigResponse response) {
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
        public Builder body(GetPluginConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetPluginConfigResponse build() {
            return new GetPluginConfigResponse(this);
        } 

    } 

}
