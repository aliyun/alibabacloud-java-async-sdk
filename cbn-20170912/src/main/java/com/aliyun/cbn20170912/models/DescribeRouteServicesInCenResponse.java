// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeRouteServicesInCenResponse} extends {@link TeaModel}
 *
 * <p>DescribeRouteServicesInCenResponse</p>
 */
public class DescribeRouteServicesInCenResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeRouteServicesInCenResponseBody body;


    private DescribeRouteServicesInCenResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRouteServicesInCenResponse create() {
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
    public DescribeRouteServicesInCenResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private DescribeRouteServicesInCenResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRouteServicesInCenResponse response) {
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
        public Builder body(DescribeRouteServicesInCenResponseBody body) {
            this.body = body;
            return this;
        }

        public DescribeRouteServicesInCenResponse build() {
            return new DescribeRouteServicesInCenResponse(this);
        } 

    } 

}
