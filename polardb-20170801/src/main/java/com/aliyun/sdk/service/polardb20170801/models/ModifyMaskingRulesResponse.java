// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyMaskingRulesResponse} extends {@link TeaModel}
 *
 * <p>ModifyMaskingRulesResponse</p>
 */
public class ModifyMaskingRulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyMaskingRulesResponseBody body;

    private ModifyMaskingRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyMaskingRulesResponse create() {
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
    public ModifyMaskingRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyMaskingRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyMaskingRulesResponseBody body);

        @Override
        ModifyMaskingRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyMaskingRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyMaskingRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyMaskingRulesResponse response) {
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
        public Builder body(ModifyMaskingRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyMaskingRulesResponse build() {
            return new ModifyMaskingRulesResponse(this);
        } 

    } 

}
