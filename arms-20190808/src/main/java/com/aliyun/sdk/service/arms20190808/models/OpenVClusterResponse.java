// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenVClusterResponse} extends {@link TeaModel}
 *
 * <p>OpenVClusterResponse</p>
 */
public class OpenVClusterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OpenVClusterResponseBody body;

    private OpenVClusterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OpenVClusterResponse create() {
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
    public OpenVClusterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OpenVClusterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OpenVClusterResponseBody body);

        @Override
        OpenVClusterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OpenVClusterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OpenVClusterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OpenVClusterResponse response) {
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
        public Builder body(OpenVClusterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OpenVClusterResponse build() {
            return new OpenVClusterResponse(this);
        } 

    } 

}
