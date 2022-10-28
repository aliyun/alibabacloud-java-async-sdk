// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTaskFlowResponse} extends {@link TeaModel}
 *
 * <p>DeleteTaskFlowResponse</p>
 */
public class DeleteTaskFlowResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteTaskFlowResponseBody body;

    private DeleteTaskFlowResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteTaskFlowResponse create() {
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
    public DeleteTaskFlowResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteTaskFlowResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteTaskFlowResponseBody body);

        @Override
        DeleteTaskFlowResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteTaskFlowResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteTaskFlowResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteTaskFlowResponse response) {
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
        public Builder body(DeleteTaskFlowResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteTaskFlowResponse build() {
            return new DeleteTaskFlowResponse(this);
        } 

    } 

}
