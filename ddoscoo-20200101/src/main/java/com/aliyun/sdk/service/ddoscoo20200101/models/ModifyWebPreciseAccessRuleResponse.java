// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyWebPreciseAccessRuleResponse} extends {@link TeaModel}
 *
 * <p>ModifyWebPreciseAccessRuleResponse</p>
 */
public class ModifyWebPreciseAccessRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyWebPreciseAccessRuleResponseBody body;

    private ModifyWebPreciseAccessRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyWebPreciseAccessRuleResponse create() {
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
    public ModifyWebPreciseAccessRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyWebPreciseAccessRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyWebPreciseAccessRuleResponseBody body);

        @Override
        ModifyWebPreciseAccessRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyWebPreciseAccessRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyWebPreciseAccessRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyWebPreciseAccessRuleResponse response) {
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
        public Builder body(ModifyWebPreciseAccessRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyWebPreciseAccessRuleResponse build() {
            return new ModifyWebPreciseAccessRuleResponse(this);
        } 

    } 

}
