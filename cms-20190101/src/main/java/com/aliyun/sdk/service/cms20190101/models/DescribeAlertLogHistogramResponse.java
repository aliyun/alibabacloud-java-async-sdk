// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAlertLogHistogramResponse} extends {@link TeaModel}
 *
 * <p>DescribeAlertLogHistogramResponse</p>
 */
public class DescribeAlertLogHistogramResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAlertLogHistogramResponseBody body;

    private DescribeAlertLogHistogramResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAlertLogHistogramResponse create() {
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
    public DescribeAlertLogHistogramResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAlertLogHistogramResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAlertLogHistogramResponseBody body);

        @Override
        DescribeAlertLogHistogramResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAlertLogHistogramResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAlertLogHistogramResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAlertLogHistogramResponse response) {
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
        public Builder body(DescribeAlertLogHistogramResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAlertLogHistogramResponse build() {
            return new DescribeAlertLogHistogramResponse(this);
        } 

    } 

}
