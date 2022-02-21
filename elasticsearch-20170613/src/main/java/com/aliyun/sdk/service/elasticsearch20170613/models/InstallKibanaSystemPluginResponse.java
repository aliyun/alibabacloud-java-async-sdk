// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InstallKibanaSystemPluginResponse} extends {@link TeaModel}
 *
 * <p>InstallKibanaSystemPluginResponse</p>
 */
public class InstallKibanaSystemPluginResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private InstallKibanaSystemPluginResponseBody body;

    private InstallKibanaSystemPluginResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static InstallKibanaSystemPluginResponse create() {
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
    public InstallKibanaSystemPluginResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<InstallKibanaSystemPluginResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(InstallKibanaSystemPluginResponseBody body);

        @Override
        InstallKibanaSystemPluginResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<InstallKibanaSystemPluginResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private InstallKibanaSystemPluginResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(InstallKibanaSystemPluginResponse response) {
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
        public Builder body(InstallKibanaSystemPluginResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public InstallKibanaSystemPluginResponse build() {
            return new InstallKibanaSystemPluginResponse(this);
        } 

    } 

}
