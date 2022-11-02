// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

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

    private DescribeWafSourceIpSegmentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeWafSourceIpSegmentResponse create() {
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
    public DescribeWafSourceIpSegmentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeWafSourceIpSegmentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeWafSourceIpSegmentResponseBody body);

        @Override
        DescribeWafSourceIpSegmentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeWafSourceIpSegmentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeWafSourceIpSegmentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeWafSourceIpSegmentResponse response) {
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
        public Builder body(DescribeWafSourceIpSegmentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeWafSourceIpSegmentResponse build() {
            return new DescribeWafSourceIpSegmentResponse(this);
        } 

    } 

}
