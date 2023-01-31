// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDialogueFlowResponse} extends {@link TeaModel}
 *
 * <p>DeleteDialogueFlowResponse</p>
 */
public class DeleteDialogueFlowResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDialogueFlowResponseBody body;

    private DeleteDialogueFlowResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDialogueFlowResponse create() {
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
    public DeleteDialogueFlowResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDialogueFlowResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDialogueFlowResponseBody body);

        @Override
        DeleteDialogueFlowResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDialogueFlowResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDialogueFlowResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDialogueFlowResponse response) {
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
        public Builder body(DeleteDialogueFlowResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDialogueFlowResponse build() {
            return new DeleteDialogueFlowResponse(this);
        } 

    } 

}
