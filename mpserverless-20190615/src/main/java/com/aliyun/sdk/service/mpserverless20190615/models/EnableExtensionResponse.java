// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableExtensionResponse} extends {@link TeaModel}
 *
 * <p>EnableExtensionResponse</p>
 */
public class EnableExtensionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableExtensionResponseBody body;

    private EnableExtensionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableExtensionResponse create() {
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
    public EnableExtensionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableExtensionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableExtensionResponseBody body);

        @Override
        EnableExtensionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableExtensionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableExtensionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableExtensionResponse response) {
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
        public Builder body(EnableExtensionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableExtensionResponse build() {
            return new EnableExtensionResponse(this);
        } 

    } 

}
