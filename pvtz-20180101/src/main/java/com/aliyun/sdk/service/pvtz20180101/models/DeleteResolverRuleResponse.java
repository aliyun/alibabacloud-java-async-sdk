// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteResolverRuleResponse} extends {@link TeaModel}
 *
 * <p>DeleteResolverRuleResponse</p>
 */
public class DeleteResolverRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteResolverRuleResponseBody body;

    private DeleteResolverRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteResolverRuleResponse create() {
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
    public DeleteResolverRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteResolverRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteResolverRuleResponseBody body);

        @Override
        DeleteResolverRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteResolverRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteResolverRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteResolverRuleResponse response) {
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
        public Builder body(DeleteResolverRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteResolverRuleResponse build() {
            return new DeleteResolverRuleResponse(this);
        } 

    } 

}
