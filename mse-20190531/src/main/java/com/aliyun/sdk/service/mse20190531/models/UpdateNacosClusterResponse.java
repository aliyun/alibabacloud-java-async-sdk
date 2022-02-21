// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateNacosClusterResponse} extends {@link TeaModel}
 *
 * <p>UpdateNacosClusterResponse</p>
 */
public class UpdateNacosClusterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateNacosClusterResponseBody body;

    private UpdateNacosClusterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateNacosClusterResponse create() {
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
    public UpdateNacosClusterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateNacosClusterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateNacosClusterResponseBody body);

        @Override
        UpdateNacosClusterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateNacosClusterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateNacosClusterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateNacosClusterResponse response) {
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
        public Builder body(UpdateNacosClusterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateNacosClusterResponse build() {
            return new UpdateNacosClusterResponse(this);
        } 

    } 

}
