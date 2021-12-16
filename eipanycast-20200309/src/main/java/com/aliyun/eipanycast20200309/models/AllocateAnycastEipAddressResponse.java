// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link AllocateAnycastEipAddressResponse} extends {@link TeaModel}
 *
 * <p>AllocateAnycastEipAddressResponse</p>
 */
public class AllocateAnycastEipAddressResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AllocateAnycastEipAddressResponseBody body;


    private AllocateAnycastEipAddressResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AllocateAnycastEipAddressResponse create() {
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
    public AllocateAnycastEipAddressResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private AllocateAnycastEipAddressResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(AllocateAnycastEipAddressResponse response) {
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
        public Builder body(AllocateAnycastEipAddressResponseBody body) {
            this.body = body;
            return this;
        }

        public AllocateAnycastEipAddressResponse build() {
            return new AllocateAnycastEipAddressResponse(this);
        } 

    } 

}
