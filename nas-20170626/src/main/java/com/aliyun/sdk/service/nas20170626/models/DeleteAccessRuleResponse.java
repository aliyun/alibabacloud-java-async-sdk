// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAccessRuleResponse} extends {@link TeaModel}
 *
 * <p>DeleteAccessRuleResponse</p>
 */
public class DeleteAccessRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteAccessRuleResponseBody body;

    private DeleteAccessRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteAccessRuleResponse create() {
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
    public DeleteAccessRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteAccessRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteAccessRuleResponseBody body);

        @Override
        DeleteAccessRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteAccessRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteAccessRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteAccessRuleResponse response) {
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
        public Builder body(DeleteAccessRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteAccessRuleResponse build() {
            return new DeleteAccessRuleResponse(this);
        } 

    } 

}
