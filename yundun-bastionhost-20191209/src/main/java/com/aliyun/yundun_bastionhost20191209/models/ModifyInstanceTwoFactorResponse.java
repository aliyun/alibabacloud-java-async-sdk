// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ModifyInstanceTwoFactorResponse} extends {@link TeaModel}
 *
 * <p>ModifyInstanceTwoFactorResponse</p>
 */
public class ModifyInstanceTwoFactorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyInstanceTwoFactorResponseBody body;


    private ModifyInstanceTwoFactorResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceTwoFactorResponse create() {
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
    public ModifyInstanceTwoFactorResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private ModifyInstanceTwoFactorResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceTwoFactorResponse response) {
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
        public Builder body(ModifyInstanceTwoFactorResponseBody body) {
            this.body = body;
            return this;
        }

        public ModifyInstanceTwoFactorResponse build() {
            return new ModifyInstanceTwoFactorResponse(this);
        } 

    } 

}
