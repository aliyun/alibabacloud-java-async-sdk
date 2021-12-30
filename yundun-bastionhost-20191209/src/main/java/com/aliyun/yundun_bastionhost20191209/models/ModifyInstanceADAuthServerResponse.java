// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ModifyInstanceADAuthServerResponse} extends {@link TeaModel}
 *
 * <p>ModifyInstanceADAuthServerResponse</p>
 */
public class ModifyInstanceADAuthServerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyInstanceADAuthServerResponseBody body;


    private ModifyInstanceADAuthServerResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceADAuthServerResponse create() {
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
    public ModifyInstanceADAuthServerResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private ModifyInstanceADAuthServerResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceADAuthServerResponse response) {
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
        public Builder body(ModifyInstanceADAuthServerResponseBody body) {
            this.body = body;
            return this;
        }

        public ModifyInstanceADAuthServerResponse build() {
            return new ModifyInstanceADAuthServerResponse(this);
        } 

    } 

}
