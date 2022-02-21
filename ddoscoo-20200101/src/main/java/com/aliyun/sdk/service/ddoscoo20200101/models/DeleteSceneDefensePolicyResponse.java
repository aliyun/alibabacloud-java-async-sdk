// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSceneDefensePolicyResponse} extends {@link TeaModel}
 *
 * <p>DeleteSceneDefensePolicyResponse</p>
 */
public class DeleteSceneDefensePolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteSceneDefensePolicyResponseBody body;

    private DeleteSceneDefensePolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteSceneDefensePolicyResponse create() {
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
    public DeleteSceneDefensePolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteSceneDefensePolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteSceneDefensePolicyResponseBody body);

        @Override
        DeleteSceneDefensePolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteSceneDefensePolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteSceneDefensePolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteSceneDefensePolicyResponse response) {
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
        public Builder body(DeleteSceneDefensePolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteSceneDefensePolicyResponse build() {
            return new DeleteSceneDefensePolicyResponse(this);
        } 

    } 

}
