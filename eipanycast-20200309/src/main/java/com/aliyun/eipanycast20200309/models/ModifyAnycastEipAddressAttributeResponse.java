// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ModifyAnycastEipAddressAttributeResponse} extends {@link TeaModel}
 *
 * <p>ModifyAnycastEipAddressAttributeResponse</p>
 */
public class ModifyAnycastEipAddressAttributeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyAnycastEipAddressAttributeResponseBody body;


    private ModifyAnycastEipAddressAttributeResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAnycastEipAddressAttributeResponse create() {
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
    public ModifyAnycastEipAddressAttributeResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private ModifyAnycastEipAddressAttributeResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAnycastEipAddressAttributeResponse response) {
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
        public Builder body(ModifyAnycastEipAddressAttributeResponseBody body) {
            this.body = body;
            return this;
        }

        public ModifyAnycastEipAddressAttributeResponse build() {
            return new ModifyAnycastEipAddressAttributeResponse(this);
        } 

    } 

}
