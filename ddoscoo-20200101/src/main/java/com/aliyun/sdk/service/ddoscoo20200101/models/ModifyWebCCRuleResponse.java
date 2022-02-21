// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyWebCCRuleResponse} extends {@link TeaModel}
 *
 * <p>ModifyWebCCRuleResponse</p>
 */
public class ModifyWebCCRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyWebCCRuleResponseBody body;

    private ModifyWebCCRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyWebCCRuleResponse create() {
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
    public ModifyWebCCRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyWebCCRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyWebCCRuleResponseBody body);

        @Override
        ModifyWebCCRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyWebCCRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyWebCCRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyWebCCRuleResponse response) {
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
        public Builder body(ModifyWebCCRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyWebCCRuleResponse build() {
            return new ModifyWebCCRuleResponse(this);
        } 

    } 

}
