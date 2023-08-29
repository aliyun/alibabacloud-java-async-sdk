// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDcdnWafRuleResponse} extends {@link TeaModel}
 *
 * <p>ModifyDcdnWafRuleResponse</p>
 */
public class ModifyDcdnWafRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyDcdnWafRuleResponseBody body;

    private ModifyDcdnWafRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyDcdnWafRuleResponse create() {
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
    public ModifyDcdnWafRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyDcdnWafRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyDcdnWafRuleResponseBody body);

        @Override
        ModifyDcdnWafRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyDcdnWafRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyDcdnWafRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyDcdnWafRuleResponse response) {
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
        public Builder body(ModifyDcdnWafRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyDcdnWafRuleResponse build() {
            return new ModifyDcdnWafRuleResponse(this);
        } 

    } 

}
