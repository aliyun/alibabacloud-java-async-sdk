// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeGraph4InvestigationOnlineResponse} extends {@link TeaModel}
 *
 * <p>DescribeGraph4InvestigationOnlineResponse</p>
 */
public class DescribeGraph4InvestigationOnlineResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeGraph4InvestigationOnlineResponseBody body;


    private DescribeGraph4InvestigationOnlineResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGraph4InvestigationOnlineResponse create() {
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
    public DescribeGraph4InvestigationOnlineResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private DescribeGraph4InvestigationOnlineResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(DescribeGraph4InvestigationOnlineResponse response) {
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
        public Builder body(DescribeGraph4InvestigationOnlineResponseBody body) {
            this.body = body;
            return this;
        }

        public DescribeGraph4InvestigationOnlineResponse build() {
            return new DescribeGraph4InvestigationOnlineResponse(this);
        } 

    } 

}
