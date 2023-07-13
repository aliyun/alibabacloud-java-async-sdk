// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSystemEventHistogramResponse} extends {@link TeaModel}
 *
 * <p>DescribeSystemEventHistogramResponse</p>
 */
public class DescribeSystemEventHistogramResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSystemEventHistogramResponseBody body;

    private DescribeSystemEventHistogramResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSystemEventHistogramResponse create() {
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
    public DescribeSystemEventHistogramResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSystemEventHistogramResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSystemEventHistogramResponseBody body);

        @Override
        DescribeSystemEventHistogramResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSystemEventHistogramResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSystemEventHistogramResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSystemEventHistogramResponse response) {
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
        public Builder body(DescribeSystemEventHistogramResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSystemEventHistogramResponse build() {
            return new DescribeSystemEventHistogramResponse(this);
        } 

    } 

}
