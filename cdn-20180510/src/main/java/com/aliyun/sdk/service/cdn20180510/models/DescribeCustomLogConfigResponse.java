// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCustomLogConfigResponse} extends {@link TeaModel}
 *
 * <p>DescribeCustomLogConfigResponse</p>
 */
public class DescribeCustomLogConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCustomLogConfigResponseBody body;

    private DescribeCustomLogConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCustomLogConfigResponse create() {
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
    public DescribeCustomLogConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCustomLogConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCustomLogConfigResponseBody body);

        @Override
        DescribeCustomLogConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCustomLogConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCustomLogConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCustomLogConfigResponse response) {
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
        public Builder body(DescribeCustomLogConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCustomLogConfigResponse build() {
            return new DescribeCustomLogConfigResponse(this);
        } 

    } 

}
