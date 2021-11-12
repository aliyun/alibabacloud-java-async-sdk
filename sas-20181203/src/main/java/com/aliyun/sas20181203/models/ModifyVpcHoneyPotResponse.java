// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ModifyVpcHoneyPotResponse} extends {@link TeaModel}
 *
 * <p>ModifyVpcHoneyPotResponse</p>
 */
public class ModifyVpcHoneyPotResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyVpcHoneyPotResponseBody body;


    private ModifyVpcHoneyPotResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyVpcHoneyPotResponse create() {
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
    public ModifyVpcHoneyPotResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private ModifyVpcHoneyPotResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(ModifyVpcHoneyPotResponse response) {
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
        public Builder body(ModifyVpcHoneyPotResponseBody body) {
            this.body = body;
            return this;
        }

        public ModifyVpcHoneyPotResponse build() {
            return new ModifyVpcHoneyPotResponse(this);
        } 

    } 

}
