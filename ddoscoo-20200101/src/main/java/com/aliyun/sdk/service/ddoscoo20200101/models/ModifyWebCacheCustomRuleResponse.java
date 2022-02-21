// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyWebCacheCustomRuleResponse} extends {@link TeaModel}
 *
 * <p>ModifyWebCacheCustomRuleResponse</p>
 */
public class ModifyWebCacheCustomRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyWebCacheCustomRuleResponseBody body;

    private ModifyWebCacheCustomRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyWebCacheCustomRuleResponse create() {
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
    public ModifyWebCacheCustomRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyWebCacheCustomRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyWebCacheCustomRuleResponseBody body);

        @Override
        ModifyWebCacheCustomRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyWebCacheCustomRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyWebCacheCustomRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyWebCacheCustomRuleResponse response) {
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
        public Builder body(ModifyWebCacheCustomRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyWebCacheCustomRuleResponse build() {
            return new ModifyWebCacheCustomRuleResponse(this);
        } 

    } 

}
