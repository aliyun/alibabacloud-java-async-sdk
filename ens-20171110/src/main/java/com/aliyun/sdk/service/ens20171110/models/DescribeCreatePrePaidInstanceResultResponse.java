// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCreatePrePaidInstanceResultResponse} extends {@link TeaModel}
 *
 * <p>DescribeCreatePrePaidInstanceResultResponse</p>
 */
public class DescribeCreatePrePaidInstanceResultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCreatePrePaidInstanceResultResponseBody body;

    private DescribeCreatePrePaidInstanceResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCreatePrePaidInstanceResultResponse create() {
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
    public DescribeCreatePrePaidInstanceResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCreatePrePaidInstanceResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCreatePrePaidInstanceResultResponseBody body);

        @Override
        DescribeCreatePrePaidInstanceResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCreatePrePaidInstanceResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCreatePrePaidInstanceResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCreatePrePaidInstanceResultResponse response) {
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
        public Builder body(DescribeCreatePrePaidInstanceResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCreatePrePaidInstanceResultResponse build() {
            return new DescribeCreatePrePaidInstanceResultResponse(this);
        } 

    } 

}
