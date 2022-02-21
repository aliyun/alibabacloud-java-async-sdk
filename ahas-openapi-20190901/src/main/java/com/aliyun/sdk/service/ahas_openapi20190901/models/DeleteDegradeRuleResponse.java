// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDegradeRuleResponse} extends {@link TeaModel}
 *
 * <p>DeleteDegradeRuleResponse</p>
 */
public class DeleteDegradeRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDegradeRuleResponseBody body;

    private DeleteDegradeRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDegradeRuleResponse create() {
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
    public DeleteDegradeRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDegradeRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDegradeRuleResponseBody body);

        @Override
        DeleteDegradeRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDegradeRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDegradeRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDegradeRuleResponse response) {
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
        public Builder body(DeleteDegradeRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDegradeRuleResponse build() {
            return new DeleteDegradeRuleResponse(this);
        } 

    } 

}
