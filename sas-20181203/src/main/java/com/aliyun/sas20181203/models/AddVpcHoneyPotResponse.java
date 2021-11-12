// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link AddVpcHoneyPotResponse} extends {@link TeaModel}
 *
 * <p>AddVpcHoneyPotResponse</p>
 */
public class AddVpcHoneyPotResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddVpcHoneyPotResponseBody body;


    private AddVpcHoneyPotResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddVpcHoneyPotResponse create() {
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
    public AddVpcHoneyPotResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private AddVpcHoneyPotResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(AddVpcHoneyPotResponse response) {
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
        public Builder body(AddVpcHoneyPotResponseBody body) {
            this.body = body;
            return this;
        }

        public AddVpcHoneyPotResponse build() {
            return new AddVpcHoneyPotResponse(this);
        } 

    } 

}
