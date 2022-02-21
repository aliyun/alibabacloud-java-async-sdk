// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UninstallPluginResponse} extends {@link TeaModel}
 *
 * <p>UninstallPluginResponse</p>
 */
public class UninstallPluginResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UninstallPluginResponseBody body;

    private UninstallPluginResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UninstallPluginResponse create() {
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
    public UninstallPluginResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UninstallPluginResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UninstallPluginResponseBody body);

        @Override
        UninstallPluginResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UninstallPluginResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UninstallPluginResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UninstallPluginResponse response) {
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
        public Builder body(UninstallPluginResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UninstallPluginResponse build() {
            return new UninstallPluginResponse(this);
        } 

    } 

}
