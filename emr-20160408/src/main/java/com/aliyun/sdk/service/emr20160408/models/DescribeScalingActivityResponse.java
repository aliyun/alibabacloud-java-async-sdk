// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScalingActivityResponse} extends {@link TeaModel}
 *
 * <p>DescribeScalingActivityResponse</p>
 */
public class DescribeScalingActivityResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeScalingActivityResponseBody body;

    private DescribeScalingActivityResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeScalingActivityResponse create() {
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
    public DescribeScalingActivityResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeScalingActivityResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeScalingActivityResponseBody body);

        @Override
        DescribeScalingActivityResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeScalingActivityResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeScalingActivityResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeScalingActivityResponse response) {
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
        public Builder body(DescribeScalingActivityResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeScalingActivityResponse build() {
            return new DescribeScalingActivityResponse(this);
        } 

    } 

}
