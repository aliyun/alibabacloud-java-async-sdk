// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEipSegmentResponse} extends {@link TeaModel}
 *
 * <p>DescribeEipSegmentResponse</p>
 */
public class DescribeEipSegmentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeEipSegmentResponseBody body;

    private DescribeEipSegmentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeEipSegmentResponse create() {
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
    public DescribeEipSegmentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeEipSegmentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeEipSegmentResponseBody body);

        @Override
        DescribeEipSegmentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeEipSegmentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeEipSegmentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeEipSegmentResponse response) {
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
        public Builder body(DescribeEipSegmentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeEipSegmentResponse build() {
            return new DescribeEipSegmentResponse(this);
        } 

    } 

}
