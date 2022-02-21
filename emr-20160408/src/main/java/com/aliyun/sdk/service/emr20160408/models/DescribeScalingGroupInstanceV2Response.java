// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScalingGroupInstanceV2Response} extends {@link TeaModel}
 *
 * <p>DescribeScalingGroupInstanceV2Response</p>
 */
public class DescribeScalingGroupInstanceV2Response extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeScalingGroupInstanceV2ResponseBody body;

    private DescribeScalingGroupInstanceV2Response(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeScalingGroupInstanceV2Response create() {
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
    public DescribeScalingGroupInstanceV2ResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeScalingGroupInstanceV2Response, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeScalingGroupInstanceV2ResponseBody body);

        @Override
        DescribeScalingGroupInstanceV2Response build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeScalingGroupInstanceV2Response, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeScalingGroupInstanceV2ResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeScalingGroupInstanceV2Response response) {
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
        public Builder body(DescribeScalingGroupInstanceV2ResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeScalingGroupInstanceV2Response build() {
            return new DescribeScalingGroupInstanceV2Response(this);
        } 

    } 

}
