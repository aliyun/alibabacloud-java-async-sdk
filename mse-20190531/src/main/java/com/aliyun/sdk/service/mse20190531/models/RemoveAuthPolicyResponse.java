// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveAuthPolicyResponse} extends {@link TeaModel}
 *
 * <p>RemoveAuthPolicyResponse</p>
 */
public class RemoveAuthPolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveAuthPolicyResponseBody body;

    private RemoveAuthPolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveAuthPolicyResponse create() {
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
    public RemoveAuthPolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveAuthPolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveAuthPolicyResponseBody body);

        @Override
        RemoveAuthPolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveAuthPolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveAuthPolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveAuthPolicyResponse response) {
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
        public Builder body(RemoveAuthPolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveAuthPolicyResponse build() {
            return new RemoveAuthPolicyResponse(this);
        } 

    } 

}
