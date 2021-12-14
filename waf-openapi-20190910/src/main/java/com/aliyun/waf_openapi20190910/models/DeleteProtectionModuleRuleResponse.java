// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DeleteProtectionModuleRuleResponse} extends {@link TeaModel}
 *
 * <p>DeleteProtectionModuleRuleResponse</p>
 */
public class DeleteProtectionModuleRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteProtectionModuleRuleResponseBody body;


    private DeleteProtectionModuleRuleResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteProtectionModuleRuleResponse create() {
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
    public DeleteProtectionModuleRuleResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private DeleteProtectionModuleRuleResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(DeleteProtectionModuleRuleResponse response) {
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
        public Builder body(DeleteProtectionModuleRuleResponseBody body) {
            this.body = body;
            return this;
        }

        public DeleteProtectionModuleRuleResponse build() {
            return new DeleteProtectionModuleRuleResponse(this);
        } 

    } 

}
