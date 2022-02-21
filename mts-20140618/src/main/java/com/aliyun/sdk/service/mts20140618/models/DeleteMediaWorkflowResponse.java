// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMediaWorkflowResponse} extends {@link TeaModel}
 *
 * <p>DeleteMediaWorkflowResponse</p>
 */
public class DeleteMediaWorkflowResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteMediaWorkflowResponseBody body;

    private DeleteMediaWorkflowResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteMediaWorkflowResponse create() {
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
    public DeleteMediaWorkflowResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteMediaWorkflowResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteMediaWorkflowResponseBody body);

        @Override
        DeleteMediaWorkflowResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteMediaWorkflowResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteMediaWorkflowResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteMediaWorkflowResponse response) {
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
        public Builder body(DeleteMediaWorkflowResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteMediaWorkflowResponse build() {
            return new DeleteMediaWorkflowResponse(this);
        } 

    } 

}
