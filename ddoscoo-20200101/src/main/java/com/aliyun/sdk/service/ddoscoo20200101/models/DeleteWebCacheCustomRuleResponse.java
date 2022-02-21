// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteWebCacheCustomRuleResponse} extends {@link TeaModel}
 *
 * <p>DeleteWebCacheCustomRuleResponse</p>
 */
public class DeleteWebCacheCustomRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteWebCacheCustomRuleResponseBody body;

    private DeleteWebCacheCustomRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteWebCacheCustomRuleResponse create() {
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
    public DeleteWebCacheCustomRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteWebCacheCustomRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteWebCacheCustomRuleResponseBody body);

        @Override
        DeleteWebCacheCustomRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteWebCacheCustomRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteWebCacheCustomRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteWebCacheCustomRuleResponse response) {
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
        public Builder body(DeleteWebCacheCustomRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteWebCacheCustomRuleResponse build() {
            return new DeleteWebCacheCustomRuleResponse(this);
        } 

    } 

}
