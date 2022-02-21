// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRuleResponse} extends {@link TeaModel}
 *
 * <p>DeleteRuleResponse</p>
 */
public class DeleteRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteRuleResponseBody body;

    private DeleteRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteRuleResponse create() {
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
    public DeleteRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteRuleResponseBody body);

        @Override
        DeleteRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteRuleResponse response) {
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
        public Builder body(DeleteRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteRuleResponse build() {
            return new DeleteRuleResponse(this);
        } 

    } 

}
