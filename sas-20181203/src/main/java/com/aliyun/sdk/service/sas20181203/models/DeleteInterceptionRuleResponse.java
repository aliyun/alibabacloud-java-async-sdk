// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteInterceptionRuleResponse} extends {@link TeaModel}
 *
 * <p>DeleteInterceptionRuleResponse</p>
 */
public class DeleteInterceptionRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteInterceptionRuleResponseBody body;

    private DeleteInterceptionRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteInterceptionRuleResponse create() {
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
    public DeleteInterceptionRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteInterceptionRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteInterceptionRuleResponseBody body);

        @Override
        DeleteInterceptionRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteInterceptionRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteInterceptionRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteInterceptionRuleResponse response) {
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
        public Builder body(DeleteInterceptionRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteInterceptionRuleResponse build() {
            return new DeleteInterceptionRuleResponse(this);
        } 

    } 

}
