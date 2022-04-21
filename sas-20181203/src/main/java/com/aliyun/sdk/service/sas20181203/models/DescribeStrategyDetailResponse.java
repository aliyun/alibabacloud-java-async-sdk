// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeStrategyDetailResponse} extends {@link TeaModel}
 *
 * <p>DescribeStrategyDetailResponse</p>
 */
public class DescribeStrategyDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeStrategyDetailResponseBody body;

    private DescribeStrategyDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeStrategyDetailResponse create() {
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
    public DescribeStrategyDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeStrategyDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeStrategyDetailResponseBody body);

        @Override
        DescribeStrategyDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeStrategyDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeStrategyDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeStrategyDetailResponse response) {
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
        public Builder body(DescribeStrategyDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeStrategyDetailResponse build() {
            return new DescribeStrategyDetailResponse(this);
        } 

    } 

}
