// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UninstallPromClusterResponse} extends {@link TeaModel}
 *
 * <p>UninstallPromClusterResponse</p>
 */
public class UninstallPromClusterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UninstallPromClusterResponseBody body;

    private UninstallPromClusterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UninstallPromClusterResponse create() {
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
    public UninstallPromClusterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UninstallPromClusterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UninstallPromClusterResponseBody body);

        @Override
        UninstallPromClusterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UninstallPromClusterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UninstallPromClusterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UninstallPromClusterResponse response) {
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
        public Builder body(UninstallPromClusterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UninstallPromClusterResponse build() {
            return new UninstallPromClusterResponse(this);
        } 

    } 

}
