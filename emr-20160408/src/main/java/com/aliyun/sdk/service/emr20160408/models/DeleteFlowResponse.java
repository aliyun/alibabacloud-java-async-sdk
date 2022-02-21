// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteFlowResponse} extends {@link TeaModel}
 *
 * <p>DeleteFlowResponse</p>
 */
public class DeleteFlowResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteFlowResponseBody body;

    private DeleteFlowResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteFlowResponse create() {
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
    public DeleteFlowResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteFlowResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteFlowResponseBody body);

        @Override
        DeleteFlowResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteFlowResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteFlowResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteFlowResponse response) {
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
        public Builder body(DeleteFlowResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteFlowResponse build() {
            return new DeleteFlowResponse(this);
        } 

    } 

}
