// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableSceneDefensePolicyResponse} extends {@link TeaModel}
 *
 * <p>EnableSceneDefensePolicyResponse</p>
 */
public class EnableSceneDefensePolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableSceneDefensePolicyResponseBody body;

    private EnableSceneDefensePolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableSceneDefensePolicyResponse create() {
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
    public EnableSceneDefensePolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableSceneDefensePolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableSceneDefensePolicyResponseBody body);

        @Override
        EnableSceneDefensePolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableSceneDefensePolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableSceneDefensePolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableSceneDefensePolicyResponse response) {
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
        public Builder body(EnableSceneDefensePolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableSceneDefensePolicyResponse build() {
            return new EnableSceneDefensePolicyResponse(this);
        } 

    } 

}
