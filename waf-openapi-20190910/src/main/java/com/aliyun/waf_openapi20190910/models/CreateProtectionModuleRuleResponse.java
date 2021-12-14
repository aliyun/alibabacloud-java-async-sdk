// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link CreateProtectionModuleRuleResponse} extends {@link TeaModel}
 *
 * <p>CreateProtectionModuleRuleResponse</p>
 */
public class CreateProtectionModuleRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateProtectionModuleRuleResponseBody body;


    private CreateProtectionModuleRuleResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProtectionModuleRuleResponse create() {
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
    public CreateProtectionModuleRuleResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private CreateProtectionModuleRuleResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(CreateProtectionModuleRuleResponse response) {
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
        public Builder body(CreateProtectionModuleRuleResponseBody body) {
            this.body = body;
            return this;
        }

        public CreateProtectionModuleRuleResponse build() {
            return new CreateProtectionModuleRuleResponse(this);
        } 

    } 

}
