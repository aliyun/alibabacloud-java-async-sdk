// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScalingActivityDetailResponse} extends {@link TeaModel}
 *
 * <p>DescribeScalingActivityDetailResponse</p>
 */
public class DescribeScalingActivityDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeScalingActivityDetailResponseBody body;

    private DescribeScalingActivityDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeScalingActivityDetailResponse create() {
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
    public DescribeScalingActivityDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeScalingActivityDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeScalingActivityDetailResponseBody body);

        @Override
        DescribeScalingActivityDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeScalingActivityDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeScalingActivityDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeScalingActivityDetailResponse response) {
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
        public Builder body(DescribeScalingActivityDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeScalingActivityDetailResponse build() {
            return new DescribeScalingActivityDetailResponse(this);
        } 

    } 

}
