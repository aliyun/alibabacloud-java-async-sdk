// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteWebPreciseAccessRuleResponse} extends {@link TeaModel}
 *
 * <p>DeleteWebPreciseAccessRuleResponse</p>
 */
public class DeleteWebPreciseAccessRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteWebPreciseAccessRuleResponseBody body;

    private DeleteWebPreciseAccessRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteWebPreciseAccessRuleResponse create() {
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
    public DeleteWebPreciseAccessRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteWebPreciseAccessRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteWebPreciseAccessRuleResponseBody body);

        @Override
        DeleteWebPreciseAccessRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteWebPreciseAccessRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteWebPreciseAccessRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteWebPreciseAccessRuleResponse response) {
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
        public Builder body(DeleteWebPreciseAccessRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteWebPreciseAccessRuleResponse build() {
            return new DeleteWebPreciseAccessRuleResponse(this);
        } 

    } 

}
