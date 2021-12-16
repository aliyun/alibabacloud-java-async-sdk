// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeAnycastEipAddressResponse} extends {@link TeaModel}
 *
 * <p>DescribeAnycastEipAddressResponse</p>
 */
public class DescribeAnycastEipAddressResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAnycastEipAddressResponseBody body;


    private DescribeAnycastEipAddressResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAnycastEipAddressResponse create() {
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
    public DescribeAnycastEipAddressResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAnycastEipAddressResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAnycastEipAddressResponse response) {
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
        public Builder body(DescribeAnycastEipAddressResponseBody body) {
            this.body = body;
            return this;
        }

        public DescribeAnycastEipAddressResponse build() {
            return new DescribeAnycastEipAddressResponse(this);
        } 

    } 

}
