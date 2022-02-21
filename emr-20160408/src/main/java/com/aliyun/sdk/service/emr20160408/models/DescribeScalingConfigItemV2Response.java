// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScalingConfigItemV2Response} extends {@link TeaModel}
 *
 * <p>DescribeScalingConfigItemV2Response</p>
 */
public class DescribeScalingConfigItemV2Response extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeScalingConfigItemV2ResponseBody body;

    private DescribeScalingConfigItemV2Response(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeScalingConfigItemV2Response create() {
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
    public DescribeScalingConfigItemV2ResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeScalingConfigItemV2Response, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeScalingConfigItemV2ResponseBody body);

        @Override
        DescribeScalingConfigItemV2Response build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeScalingConfigItemV2Response, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeScalingConfigItemV2ResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeScalingConfigItemV2Response response) {
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
        public Builder body(DescribeScalingConfigItemV2ResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeScalingConfigItemV2Response build() {
            return new DescribeScalingConfigItemV2Response(this);
        } 

    } 

}
