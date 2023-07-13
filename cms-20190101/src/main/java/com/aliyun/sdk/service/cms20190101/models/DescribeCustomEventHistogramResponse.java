// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCustomEventHistogramResponse} extends {@link TeaModel}
 *
 * <p>DescribeCustomEventHistogramResponse</p>
 */
public class DescribeCustomEventHistogramResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCustomEventHistogramResponseBody body;

    private DescribeCustomEventHistogramResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCustomEventHistogramResponse create() {
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
    public DescribeCustomEventHistogramResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCustomEventHistogramResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCustomEventHistogramResponseBody body);

        @Override
        DescribeCustomEventHistogramResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCustomEventHistogramResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCustomEventHistogramResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCustomEventHistogramResponse response) {
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
        public Builder body(DescribeCustomEventHistogramResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCustomEventHistogramResponse build() {
            return new DescribeCustomEventHistogramResponse(this);
        } 

    } 

}
