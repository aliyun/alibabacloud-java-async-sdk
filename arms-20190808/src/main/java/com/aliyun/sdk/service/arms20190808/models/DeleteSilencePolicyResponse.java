// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSilencePolicyResponse} extends {@link TeaModel}
 *
 * <p>DeleteSilencePolicyResponse</p>
 */
public class DeleteSilencePolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteSilencePolicyResponseBody body;

    private DeleteSilencePolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteSilencePolicyResponse create() {
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
    public DeleteSilencePolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteSilencePolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteSilencePolicyResponseBody body);

        @Override
        DeleteSilencePolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteSilencePolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteSilencePolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteSilencePolicyResponse response) {
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
        public Builder body(DeleteSilencePolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteSilencePolicyResponse build() {
            return new DeleteSilencePolicyResponse(this);
        } 

    } 

}
