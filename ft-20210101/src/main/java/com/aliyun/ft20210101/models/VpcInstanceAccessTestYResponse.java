// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20210101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link VpcInstanceAccessTestYResponse} extends {@link TeaModel}
 *
 * <p>VpcInstanceAccessTestYResponse</p>
 */
public class VpcInstanceAccessTestYResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private VpcInstanceAccessTestYResponseBody body;


    private VpcInstanceAccessTestYResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VpcInstanceAccessTestYResponse create() {
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
    public VpcInstanceAccessTestYResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private VpcInstanceAccessTestYResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(VpcInstanceAccessTestYResponse response) {
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
        public Builder body(VpcInstanceAccessTestYResponseBody body) {
            this.body = body;
            return this;
        }

        public VpcInstanceAccessTestYResponse build() {
            return new VpcInstanceAccessTestYResponse(this);
        } 

    } 

}
