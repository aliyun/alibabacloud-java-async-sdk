// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterV2Response} extends {@link TeaModel}
 *
 * <p>DescribeClusterV2Response</p>
 */
public class DescribeClusterV2Response extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeClusterV2ResponseBody body;

    private DescribeClusterV2Response(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeClusterV2Response create() {
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
    public DescribeClusterV2ResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeClusterV2Response, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeClusterV2ResponseBody body);

        @Override
        DescribeClusterV2Response build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeClusterV2Response, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeClusterV2ResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeClusterV2Response response) {
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
        public Builder body(DescribeClusterV2ResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeClusterV2Response build() {
            return new DescribeClusterV2Response(this);
        } 

    } 

}
