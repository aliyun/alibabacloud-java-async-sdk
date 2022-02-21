// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGatherLogResultResponse} extends {@link TeaModel}
 *
 * <p>DescribeGatherLogResultResponse</p>
 */
public class DescribeGatherLogResultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeGatherLogResultResponseBody body;

    private DescribeGatherLogResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeGatherLogResultResponse create() {
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
    public DescribeGatherLogResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeGatherLogResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeGatherLogResultResponseBody body);

        @Override
        DescribeGatherLogResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeGatherLogResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeGatherLogResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeGatherLogResultResponse response) {
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
        public Builder body(DescribeGatherLogResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeGatherLogResultResponse build() {
            return new DescribeGatherLogResultResponse(this);
        } 

    } 

}
