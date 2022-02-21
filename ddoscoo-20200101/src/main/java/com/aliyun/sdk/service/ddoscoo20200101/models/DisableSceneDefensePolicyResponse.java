// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableSceneDefensePolicyResponse} extends {@link TeaModel}
 *
 * <p>DisableSceneDefensePolicyResponse</p>
 */
public class DisableSceneDefensePolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableSceneDefensePolicyResponseBody body;

    private DisableSceneDefensePolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableSceneDefensePolicyResponse create() {
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
    public DisableSceneDefensePolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableSceneDefensePolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableSceneDefensePolicyResponseBody body);

        @Override
        DisableSceneDefensePolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableSceneDefensePolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableSceneDefensePolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableSceneDefensePolicyResponse response) {
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
        public Builder body(DisableSceneDefensePolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableSceneDefensePolicyResponse build() {
            return new DisableSceneDefensePolicyResponse(this);
        } 

    } 

}
