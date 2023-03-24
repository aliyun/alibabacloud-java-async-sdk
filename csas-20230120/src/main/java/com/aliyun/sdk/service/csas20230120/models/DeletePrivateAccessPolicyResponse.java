// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePrivateAccessPolicyResponse} extends {@link TeaModel}
 *
 * <p>DeletePrivateAccessPolicyResponse</p>
 */
public class DeletePrivateAccessPolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeletePrivateAccessPolicyResponseBody body;

    private DeletePrivateAccessPolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeletePrivateAccessPolicyResponse create() {
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
    public DeletePrivateAccessPolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeletePrivateAccessPolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeletePrivateAccessPolicyResponseBody body);

        @Override
        DeletePrivateAccessPolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeletePrivateAccessPolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeletePrivateAccessPolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeletePrivateAccessPolicyResponse response) {
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
        public Builder body(DeletePrivateAccessPolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeletePrivateAccessPolicyResponse build() {
            return new DeletePrivateAccessPolicyResponse(this);
        } 

    } 

}
