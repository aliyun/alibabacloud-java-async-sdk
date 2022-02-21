// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InspectProxyAccessSecretResponse} extends {@link TeaModel}
 *
 * <p>InspectProxyAccessSecretResponse</p>
 */
public class InspectProxyAccessSecretResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private InspectProxyAccessSecretResponseBody body;

    private InspectProxyAccessSecretResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static InspectProxyAccessSecretResponse create() {
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
    public InspectProxyAccessSecretResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<InspectProxyAccessSecretResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(InspectProxyAccessSecretResponseBody body);

        @Override
        InspectProxyAccessSecretResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<InspectProxyAccessSecretResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private InspectProxyAccessSecretResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(InspectProxyAccessSecretResponse response) {
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
        public Builder body(InspectProxyAccessSecretResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public InspectProxyAccessSecretResponse build() {
            return new InspectProxyAccessSecretResponse(this);
        } 

    } 

}
