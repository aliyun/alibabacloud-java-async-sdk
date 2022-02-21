// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDataFlowResponse} extends {@link TeaModel}
 *
 * <p>DeleteDataFlowResponse</p>
 */
public class DeleteDataFlowResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDataFlowResponseBody body;

    private DeleteDataFlowResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDataFlowResponse create() {
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
    public DeleteDataFlowResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDataFlowResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDataFlowResponseBody body);

        @Override
        DeleteDataFlowResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDataFlowResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDataFlowResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDataFlowResponse response) {
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
        public Builder body(DeleteDataFlowResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDataFlowResponse build() {
            return new DeleteDataFlowResponse(this);
        } 

    } 

}
