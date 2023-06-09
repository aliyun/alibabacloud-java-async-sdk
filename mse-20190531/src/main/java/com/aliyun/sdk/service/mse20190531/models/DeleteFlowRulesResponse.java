// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteFlowRulesResponse} extends {@link TeaModel}
 *
 * <p>DeleteFlowRulesResponse</p>
 */
public class DeleteFlowRulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteFlowRulesResponseBody body;

    private DeleteFlowRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteFlowRulesResponse create() {
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
    public DeleteFlowRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteFlowRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteFlowRulesResponseBody body);

        @Override
        DeleteFlowRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteFlowRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteFlowRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteFlowRulesResponse response) {
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
        public Builder body(DeleteFlowRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteFlowRulesResponse build() {
            return new DeleteFlowRulesResponse(this);
        } 

    } 

}
