// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIpcsResponse} extends {@link TeaModel}
 *
 * <p>DescribeIpcsResponse</p>
 */
public class DescribeIpcsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeIpcsResponseBody body;

    private DescribeIpcsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeIpcsResponse create() {
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
    public DescribeIpcsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeIpcsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeIpcsResponseBody body);

        @Override
        DescribeIpcsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeIpcsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeIpcsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeIpcsResponse response) {
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
        public Builder body(DescribeIpcsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeIpcsResponse build() {
            return new DescribeIpcsResponse(this);
        } 

    } 

}
