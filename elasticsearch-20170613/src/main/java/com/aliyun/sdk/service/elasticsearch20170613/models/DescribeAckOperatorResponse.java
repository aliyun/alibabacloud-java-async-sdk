// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAckOperatorResponse} extends {@link TeaModel}
 *
 * <p>DescribeAckOperatorResponse</p>
 */
public class DescribeAckOperatorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAckOperatorResponseBody body;

    private DescribeAckOperatorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAckOperatorResponse create() {
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
    public DescribeAckOperatorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAckOperatorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAckOperatorResponseBody body);

        @Override
        DescribeAckOperatorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAckOperatorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAckOperatorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAckOperatorResponse response) {
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
        public Builder body(DescribeAckOperatorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAckOperatorResponse build() {
            return new DescribeAckOperatorResponse(this);
        } 

    } 

}
