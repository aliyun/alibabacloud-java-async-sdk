// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageBaselineStrategyResponse} extends {@link TeaModel}
 *
 * <p>DescribeImageBaselineStrategyResponse</p>
 */
public class DescribeImageBaselineStrategyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeImageBaselineStrategyResponseBody body;

    private DescribeImageBaselineStrategyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeImageBaselineStrategyResponse create() {
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
    public DescribeImageBaselineStrategyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeImageBaselineStrategyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeImageBaselineStrategyResponseBody body);

        @Override
        DescribeImageBaselineStrategyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeImageBaselineStrategyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeImageBaselineStrategyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeImageBaselineStrategyResponse response) {
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
        public Builder body(DescribeImageBaselineStrategyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeImageBaselineStrategyResponse build() {
            return new DescribeImageBaselineStrategyResponse(this);
        } 

    } 

}
