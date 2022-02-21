// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UninstallKibanaPluginResponse} extends {@link TeaModel}
 *
 * <p>UninstallKibanaPluginResponse</p>
 */
public class UninstallKibanaPluginResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UninstallKibanaPluginResponseBody body;

    private UninstallKibanaPluginResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UninstallKibanaPluginResponse create() {
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
    public UninstallKibanaPluginResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UninstallKibanaPluginResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UninstallKibanaPluginResponseBody body);

        @Override
        UninstallKibanaPluginResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UninstallKibanaPluginResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UninstallKibanaPluginResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UninstallKibanaPluginResponse response) {
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
        public Builder body(UninstallKibanaPluginResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UninstallKibanaPluginResponse build() {
            return new UninstallKibanaPluginResponse(this);
        } 

    } 

}
