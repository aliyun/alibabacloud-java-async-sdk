// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDispatchRuleResponse} extends {@link TeaModel}
 *
 * <p>DeleteDispatchRuleResponse</p>
 */
public class DeleteDispatchRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDispatchRuleResponseBody body;

    private DeleteDispatchRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDispatchRuleResponse create() {
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
    public DeleteDispatchRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDispatchRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDispatchRuleResponseBody body);

        @Override
        DeleteDispatchRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDispatchRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDispatchRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDispatchRuleResponse response) {
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
        public Builder body(DeleteDispatchRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDispatchRuleResponse build() {
            return new DeleteDispatchRuleResponse(this);
        } 

    } 

}
