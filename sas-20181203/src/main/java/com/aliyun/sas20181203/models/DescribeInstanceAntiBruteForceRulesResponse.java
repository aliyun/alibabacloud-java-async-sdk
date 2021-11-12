// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeInstanceAntiBruteForceRulesResponse} extends {@link TeaModel}
 *
 * <p>DescribeInstanceAntiBruteForceRulesResponse</p>
 */
public class DescribeInstanceAntiBruteForceRulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeInstanceAntiBruteForceRulesResponseBody body;


    private DescribeInstanceAntiBruteForceRulesResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceAntiBruteForceRulesResponse create() {
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
    public DescribeInstanceAntiBruteForceRulesResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private DescribeInstanceAntiBruteForceRulesResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInstanceAntiBruteForceRulesResponse response) {
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
        public Builder body(DescribeInstanceAntiBruteForceRulesResponseBody body) {
            this.body = body;
            return this;
        }

        public DescribeInstanceAntiBruteForceRulesResponse build() {
            return new DescribeInstanceAntiBruteForceRulesResponse(this);
        } 

    } 

}
