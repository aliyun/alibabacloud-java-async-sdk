// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteWebCCRuleResponse} extends {@link TeaModel}
 *
 * <p>DeleteWebCCRuleResponse</p>
 */
public class DeleteWebCCRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteWebCCRuleResponseBody body;

    private DeleteWebCCRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteWebCCRuleResponse create() {
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
    public DeleteWebCCRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteWebCCRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteWebCCRuleResponseBody body);

        @Override
        DeleteWebCCRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteWebCCRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteWebCCRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteWebCCRuleResponse response) {
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
        public Builder body(DeleteWebCCRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteWebCCRuleResponse build() {
            return new DeleteWebCCRuleResponse(this);
        } 

    } 

}
