// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEnsResourceUsageResponse} extends {@link TeaModel}
 *
 * <p>DescribeEnsResourceUsageResponse</p>
 */
public class DescribeEnsResourceUsageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeEnsResourceUsageResponseBody body;

    private DescribeEnsResourceUsageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeEnsResourceUsageResponse create() {
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
    public DescribeEnsResourceUsageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeEnsResourceUsageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeEnsResourceUsageResponseBody body);

        @Override
        DescribeEnsResourceUsageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeEnsResourceUsageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeEnsResourceUsageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeEnsResourceUsageResponse response) {
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
        public Builder body(DescribeEnsResourceUsageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeEnsResourceUsageResponse build() {
            return new DescribeEnsResourceUsageResponse(this);
        } 

    } 

}
