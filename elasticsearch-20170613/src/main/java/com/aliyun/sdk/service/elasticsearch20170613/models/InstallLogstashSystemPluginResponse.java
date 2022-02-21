// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InstallLogstashSystemPluginResponse} extends {@link TeaModel}
 *
 * <p>InstallLogstashSystemPluginResponse</p>
 */
public class InstallLogstashSystemPluginResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private InstallLogstashSystemPluginResponseBody body;

    private InstallLogstashSystemPluginResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static InstallLogstashSystemPluginResponse create() {
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
    public InstallLogstashSystemPluginResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<InstallLogstashSystemPluginResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(InstallLogstashSystemPluginResponseBody body);

        @Override
        InstallLogstashSystemPluginResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<InstallLogstashSystemPluginResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private InstallLogstashSystemPluginResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(InstallLogstashSystemPluginResponse response) {
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
        public Builder body(InstallLogstashSystemPluginResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public InstallLogstashSystemPluginResponse build() {
            return new InstallLogstashSystemPluginResponse(this);
        } 

    } 

}
