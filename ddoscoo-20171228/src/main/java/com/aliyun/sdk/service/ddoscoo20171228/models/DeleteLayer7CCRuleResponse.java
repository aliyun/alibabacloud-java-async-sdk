// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteLayer7CCRuleResponse} extends {@link TeaModel}
 *
 * <p>DeleteLayer7CCRuleResponse</p>
 */
public class DeleteLayer7CCRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteLayer7CCRuleResponseBody body;

    private DeleteLayer7CCRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteLayer7CCRuleResponse create() {
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
    public DeleteLayer7CCRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteLayer7CCRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteLayer7CCRuleResponseBody body);

        @Override
        DeleteLayer7CCRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteLayer7CCRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteLayer7CCRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteLayer7CCRuleResponse response) {
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
        public Builder body(DeleteLayer7CCRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteLayer7CCRuleResponse build() {
            return new DeleteLayer7CCRuleResponse(this);
        } 

    } 

}
