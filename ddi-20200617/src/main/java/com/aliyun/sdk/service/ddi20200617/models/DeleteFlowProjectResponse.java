// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddi20200617.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteFlowProjectResponse} extends {@link TeaModel}
 *
 * <p>DeleteFlowProjectResponse</p>
 */
public class DeleteFlowProjectResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteFlowProjectResponseBody body;

    private DeleteFlowProjectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteFlowProjectResponse create() {
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
    public DeleteFlowProjectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteFlowProjectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteFlowProjectResponseBody body);

        @Override
        DeleteFlowProjectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteFlowProjectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteFlowProjectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteFlowProjectResponse response) {
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
        public Builder body(DeleteFlowProjectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteFlowProjectResponse build() {
            return new DeleteFlowProjectResponse(this);
        } 

    } 

}
