// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteFlowRuleResponse} extends {@link TeaModel}
 *
 * <p>DeleteFlowRuleResponse</p>
 */
public class DeleteFlowRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteFlowRuleResponseBody body;

    private DeleteFlowRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteFlowRuleResponse create() {
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
    public DeleteFlowRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteFlowRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteFlowRuleResponseBody body);

        @Override
        DeleteFlowRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteFlowRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteFlowRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteFlowRuleResponse response) {
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
        public Builder body(DeleteFlowRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteFlowRuleResponse build() {
            return new DeleteFlowRuleResponse(this);
        } 

    } 

}
