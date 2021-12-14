// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeWafSourceIpSegmentResponse} extends {@link TeaModel}
 *
 * <p>DescribeWafSourceIpSegmentResponse</p>
 */
public class DescribeWafSourceIpSegmentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeWafSourceIpSegmentResponseBody body;


    private DescribeWafSourceIpSegmentResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWafSourceIpSegmentResponse create() {
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
    public DescribeWafSourceIpSegmentResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private DescribeWafSourceIpSegmentResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(DescribeWafSourceIpSegmentResponse response) {
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
        public Builder body(DescribeWafSourceIpSegmentResponseBody body) {
            this.body = body;
            return this;
        }

        public DescribeWafSourceIpSegmentResponse build() {
            return new DescribeWafSourceIpSegmentResponse(this);
        } 

    } 

}
