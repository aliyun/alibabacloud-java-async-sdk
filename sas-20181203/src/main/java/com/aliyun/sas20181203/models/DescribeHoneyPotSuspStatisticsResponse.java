// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeHoneyPotSuspStatisticsResponse} extends {@link TeaModel}
 *
 * <p>DescribeHoneyPotSuspStatisticsResponse</p>
 */
public class DescribeHoneyPotSuspStatisticsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeHoneyPotSuspStatisticsResponseBody body;


    private DescribeHoneyPotSuspStatisticsResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHoneyPotSuspStatisticsResponse create() {
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
    public DescribeHoneyPotSuspStatisticsResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private DescribeHoneyPotSuspStatisticsResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(DescribeHoneyPotSuspStatisticsResponse response) {
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
        public Builder body(DescribeHoneyPotSuspStatisticsResponseBody body) {
            this.body = body;
            return this;
        }

        public DescribeHoneyPotSuspStatisticsResponse build() {
            return new DescribeHoneyPotSuspStatisticsResponse(this);
        } 

    } 

}
