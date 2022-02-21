// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSystemRuleResponse} extends {@link TeaModel}
 *
 * <p>DeleteSystemRuleResponse</p>
 */
public class DeleteSystemRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteSystemRuleResponseBody body;

    private DeleteSystemRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteSystemRuleResponse create() {
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
    public DeleteSystemRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteSystemRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteSystemRuleResponseBody body);

        @Override
        DeleteSystemRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteSystemRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteSystemRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteSystemRuleResponse response) {
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
        public Builder body(DeleteSystemRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteSystemRuleResponse build() {
            return new DeleteSystemRuleResponse(this);
        } 

    } 

}
