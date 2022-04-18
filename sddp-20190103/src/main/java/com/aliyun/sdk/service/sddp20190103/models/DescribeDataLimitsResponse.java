// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDataLimitsResponse} extends {@link TeaModel}
 *
 * <p>DescribeDataLimitsResponse</p>
 */
public class DescribeDataLimitsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDataLimitsResponseBody body;

    private DescribeDataLimitsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDataLimitsResponse create() {
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
    public DescribeDataLimitsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDataLimitsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDataLimitsResponseBody body);

        @Override
        DescribeDataLimitsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDataLimitsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDataLimitsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDataLimitsResponse response) {
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
        public Builder body(DescribeDataLimitsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDataLimitsResponse build() {
            return new DescribeDataLimitsResponse(this);
        } 

    } 

}
