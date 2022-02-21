// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteFlowTagResponse} extends {@link TeaModel}
 *
 * <p>DeleteFlowTagResponse</p>
 */
public class DeleteFlowTagResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteFlowTagResponseBody body;

    private DeleteFlowTagResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteFlowTagResponse create() {
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
    public DeleteFlowTagResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteFlowTagResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteFlowTagResponseBody body);

        @Override
        DeleteFlowTagResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteFlowTagResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteFlowTagResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteFlowTagResponse response) {
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
        public Builder body(DeleteFlowTagResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteFlowTagResponse build() {
            return new DeleteFlowTagResponse(this);
        } 

    } 

}
