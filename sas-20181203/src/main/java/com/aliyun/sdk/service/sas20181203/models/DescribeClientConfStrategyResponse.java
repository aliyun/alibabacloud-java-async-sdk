// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClientConfStrategyResponse} extends {@link TeaModel}
 *
 * <p>DescribeClientConfStrategyResponse</p>
 */
public class DescribeClientConfStrategyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeClientConfStrategyResponseBody body;

    private DescribeClientConfStrategyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeClientConfStrategyResponse create() {
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
    public DescribeClientConfStrategyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeClientConfStrategyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeClientConfStrategyResponseBody body);

        @Override
        DescribeClientConfStrategyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeClientConfStrategyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeClientConfStrategyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeClientConfStrategyResponse response) {
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
        public Builder body(DescribeClientConfStrategyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeClientConfStrategyResponse build() {
            return new DescribeClientConfStrategyResponse(this);
        } 

    } 

}
