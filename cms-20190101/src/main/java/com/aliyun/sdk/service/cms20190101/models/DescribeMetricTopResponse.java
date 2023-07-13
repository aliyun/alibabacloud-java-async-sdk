// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMetricTopResponse} extends {@link TeaModel}
 *
 * <p>DescribeMetricTopResponse</p>
 */
public class DescribeMetricTopResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeMetricTopResponseBody body;

    private DescribeMetricTopResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeMetricTopResponse create() {
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
    public DescribeMetricTopResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeMetricTopResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeMetricTopResponseBody body);

        @Override
        DescribeMetricTopResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeMetricTopResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeMetricTopResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeMetricTopResponse response) {
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
        public Builder body(DescribeMetricTopResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeMetricTopResponse build() {
            return new DescribeMetricTopResponse(this);
        } 

    } 

}
