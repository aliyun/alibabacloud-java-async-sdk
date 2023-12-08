// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tag20180828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePolicyResponse} extends {@link TeaModel}
 *
 * <p>DeletePolicyResponse</p>
 */
public class DeletePolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeletePolicyResponseBody body;

    private DeletePolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeletePolicyResponse create() {
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
    public DeletePolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeletePolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeletePolicyResponseBody body);

        @Override
        DeletePolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeletePolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeletePolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeletePolicyResponse response) {
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
        public Builder body(DeletePolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeletePolicyResponse build() {
            return new DeletePolicyResponse(this);
        } 

    } 

}
