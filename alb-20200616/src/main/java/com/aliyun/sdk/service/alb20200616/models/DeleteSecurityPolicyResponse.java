// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSecurityPolicyResponse} extends {@link TeaModel}
 *
 * <p>DeleteSecurityPolicyResponse</p>
 */
public class DeleteSecurityPolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteSecurityPolicyResponseBody body;

    private DeleteSecurityPolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteSecurityPolicyResponse create() {
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
    public DeleteSecurityPolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteSecurityPolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteSecurityPolicyResponseBody body);

        @Override
        DeleteSecurityPolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteSecurityPolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteSecurityPolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteSecurityPolicyResponse response) {
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
        public Builder body(DeleteSecurityPolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteSecurityPolicyResponse build() {
            return new DeleteSecurityPolicyResponse(this);
        } 

    } 

}
