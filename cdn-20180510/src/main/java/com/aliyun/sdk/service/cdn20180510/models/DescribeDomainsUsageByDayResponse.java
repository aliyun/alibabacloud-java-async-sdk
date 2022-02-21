// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainsUsageByDayResponse} extends {@link TeaModel}
 *
 * <p>DescribeDomainsUsageByDayResponse</p>
 */
public class DescribeDomainsUsageByDayResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDomainsUsageByDayResponseBody body;

    private DescribeDomainsUsageByDayResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDomainsUsageByDayResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
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
    public DescribeDomainsUsageByDayResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDomainsUsageByDayResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDomainsUsageByDayResponseBody body);

        @Override
        DescribeDomainsUsageByDayResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDomainsUsageByDayResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDomainsUsageByDayResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDomainsUsageByDayResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(DescribeDomainsUsageByDayResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDomainsUsageByDayResponse build() {
            return new DescribeDomainsUsageByDayResponse(this);
        } 

    } 

}
