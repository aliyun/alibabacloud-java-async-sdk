// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServiceCronScalerResponse} extends {@link TeaModel}
 *
 * <p>DescribeServiceCronScalerResponse</p>
 */
public class DescribeServiceCronScalerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeServiceCronScalerResponseBody body;

    private DescribeServiceCronScalerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeServiceCronScalerResponse create() {
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
    public DescribeServiceCronScalerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeServiceCronScalerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeServiceCronScalerResponseBody body);

        @Override
        DescribeServiceCronScalerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeServiceCronScalerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeServiceCronScalerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeServiceCronScalerResponse response) {
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
        public Builder body(DescribeServiceCronScalerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeServiceCronScalerResponse build() {
            return new DescribeServiceCronScalerResponse(this);
        } 

    } 

}
