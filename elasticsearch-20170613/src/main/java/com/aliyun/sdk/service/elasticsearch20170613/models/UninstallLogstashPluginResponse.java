// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UninstallLogstashPluginResponse} extends {@link TeaModel}
 *
 * <p>UninstallLogstashPluginResponse</p>
 */
public class UninstallLogstashPluginResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UninstallLogstashPluginResponseBody body;

    private UninstallLogstashPluginResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UninstallLogstashPluginResponse create() {
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
    public UninstallLogstashPluginResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UninstallLogstashPluginResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UninstallLogstashPluginResponseBody body);

        @Override
        UninstallLogstashPluginResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UninstallLogstashPluginResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UninstallLogstashPluginResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UninstallLogstashPluginResponse response) {
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
        public Builder body(UninstallLogstashPluginResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UninstallLogstashPluginResponse build() {
            return new UninstallLogstashPluginResponse(this);
        } 

    } 

}
