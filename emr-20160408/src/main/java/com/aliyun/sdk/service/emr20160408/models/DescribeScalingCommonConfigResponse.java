// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScalingCommonConfigResponse} extends {@link TeaModel}
 *
 * <p>DescribeScalingCommonConfigResponse</p>
 */
public class DescribeScalingCommonConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeScalingCommonConfigResponseBody body;

    private DescribeScalingCommonConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeScalingCommonConfigResponse create() {
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
    public DescribeScalingCommonConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeScalingCommonConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeScalingCommonConfigResponseBody body);

        @Override
        DescribeScalingCommonConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeScalingCommonConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeScalingCommonConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeScalingCommonConfigResponse response) {
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
        public Builder body(DescribeScalingCommonConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeScalingCommonConfigResponse build() {
            return new DescribeScalingCommonConfigResponse(this);
        } 

    } 

}
