// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteFlowProjectUserResponse} extends {@link TeaModel}
 *
 * <p>DeleteFlowProjectUserResponse</p>
 */
public class DeleteFlowProjectUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteFlowProjectUserResponseBody body;

    private DeleteFlowProjectUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteFlowProjectUserResponse create() {
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
    public DeleteFlowProjectUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteFlowProjectUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteFlowProjectUserResponseBody body);

        @Override
        DeleteFlowProjectUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteFlowProjectUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteFlowProjectUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteFlowProjectUserResponse response) {
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
        public Builder body(DeleteFlowProjectUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteFlowProjectUserResponse build() {
            return new DeleteFlowProjectUserResponse(this);
        } 

    } 

}
