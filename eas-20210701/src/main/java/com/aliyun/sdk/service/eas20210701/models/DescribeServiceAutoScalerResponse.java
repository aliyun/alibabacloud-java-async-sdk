// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServiceAutoScalerResponse} extends {@link TeaModel}
 *
 * <p>DescribeServiceAutoScalerResponse</p>
 */
public class DescribeServiceAutoScalerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeServiceAutoScalerResponseBody body;

    private DescribeServiceAutoScalerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeServiceAutoScalerResponse create() {
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
    public DescribeServiceAutoScalerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeServiceAutoScalerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeServiceAutoScalerResponseBody body);

        @Override
        DescribeServiceAutoScalerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeServiceAutoScalerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeServiceAutoScalerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeServiceAutoScalerResponse response) {
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
        public Builder body(DescribeServiceAutoScalerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeServiceAutoScalerResponse build() {
            return new DescribeServiceAutoScalerResponse(this);
        } 

    } 

}
