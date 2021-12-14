// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ModifyProtectionModuleRuleResponse} extends {@link TeaModel}
 *
 * <p>ModifyProtectionModuleRuleResponse</p>
 */
public class ModifyProtectionModuleRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyProtectionModuleRuleResponseBody body;


    private ModifyProtectionModuleRuleResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyProtectionModuleRuleResponse create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public ModifyProtectionModuleRuleResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private ModifyProtectionModuleRuleResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(ModifyProtectionModuleRuleResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * <p>headers.</p>
         */
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * <p>body.</p>
         */
        public Builder body(ModifyProtectionModuleRuleResponseBody body) {
            this.body = body;
            return this;
        }

        public ModifyProtectionModuleRuleResponse build() {
            return new ModifyProtectionModuleRuleResponse(this);
        } 

    } 

}
