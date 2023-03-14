// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteLayer7RuleResponse} extends {@link TeaModel}
 *
 * <p>DeleteLayer7RuleResponse</p>
 */
public class DeleteLayer7RuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteLayer7RuleResponseBody body;

    private DeleteLayer7RuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteLayer7RuleResponse create() {
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
    public DeleteLayer7RuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteLayer7RuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteLayer7RuleResponseBody body);

        @Override
        DeleteLayer7RuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteLayer7RuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteLayer7RuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteLayer7RuleResponse response) {
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
        public Builder body(DeleteLayer7RuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteLayer7RuleResponse build() {
            return new DeleteLayer7RuleResponse(this);
        } 

    } 

}
