// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteFlowLogResponse} extends {@link TeaModel}
 *
 * <p>DeleteFlowLogResponse</p>
 */
public class DeleteFlowLogResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteFlowLogResponseBody body;

    private DeleteFlowLogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteFlowLogResponse create() {
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
    public DeleteFlowLogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteFlowLogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteFlowLogResponseBody body);

        @Override
        DeleteFlowLogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteFlowLogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteFlowLogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteFlowLogResponse response) {
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
        public Builder body(DeleteFlowLogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteFlowLogResponse build() {
            return new DeleteFlowLogResponse(this);
        } 

    } 

}
