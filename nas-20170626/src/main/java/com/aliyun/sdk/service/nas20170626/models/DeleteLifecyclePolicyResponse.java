// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteLifecyclePolicyResponse} extends {@link TeaModel}
 *
 * <p>DeleteLifecyclePolicyResponse</p>
 */
public class DeleteLifecyclePolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteLifecyclePolicyResponseBody body;

    private DeleteLifecyclePolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteLifecyclePolicyResponse create() {
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
    public DeleteLifecyclePolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteLifecyclePolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteLifecyclePolicyResponseBody body);

        @Override
        DeleteLifecyclePolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteLifecyclePolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteLifecyclePolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteLifecyclePolicyResponse response) {
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
        public Builder body(DeleteLifecyclePolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteLifecyclePolicyResponse build() {
            return new DeleteLifecyclePolicyResponse(this);
        } 

    } 

}
