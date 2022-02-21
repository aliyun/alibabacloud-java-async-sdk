// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RevokeKubeconfigResponse} extends {@link TeaModel}
 *
 * <p>RevokeKubeconfigResponse</p>
 */
public class RevokeKubeconfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RevokeKubeconfigResponseBody body;

    private RevokeKubeconfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RevokeKubeconfigResponse create() {
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
    public RevokeKubeconfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RevokeKubeconfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RevokeKubeconfigResponseBody body);

        @Override
        RevokeKubeconfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RevokeKubeconfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RevokeKubeconfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RevokeKubeconfigResponse response) {
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
        public Builder body(RevokeKubeconfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RevokeKubeconfigResponse build() {
            return new RevokeKubeconfigResponse(this);
        } 

    } 

}
