// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIpStatusResponse} extends {@link TeaModel}
 *
 * <p>DescribeIpStatusResponse</p>
 */
public class DescribeIpStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeIpStatusResponseBody body;

    private DescribeIpStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeIpStatusResponse create() {
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
    public DescribeIpStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeIpStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeIpStatusResponseBody body);

        @Override
        DescribeIpStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeIpStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeIpStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeIpStatusResponse response) {
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
        public Builder body(DescribeIpStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeIpStatusResponse build() {
            return new DescribeIpStatusResponse(this);
        } 

    } 

}
