// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ModifyProtectionRuleCacheStatusResponse} extends {@link TeaModel}
 *
 * <p>ModifyProtectionRuleCacheStatusResponse</p>
 */
public class ModifyProtectionRuleCacheStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyProtectionRuleCacheStatusResponseBody body;


    private ModifyProtectionRuleCacheStatusResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyProtectionRuleCacheStatusResponse create() {
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
    public ModifyProtectionRuleCacheStatusResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private ModifyProtectionRuleCacheStatusResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(ModifyProtectionRuleCacheStatusResponse response) {
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
        public Builder body(ModifyProtectionRuleCacheStatusResponseBody body) {
            this.body = body;
            return this;
        }

        public ModifyProtectionRuleCacheStatusResponse build() {
            return new ModifyProtectionRuleCacheStatusResponse(this);
        } 

    } 

}
