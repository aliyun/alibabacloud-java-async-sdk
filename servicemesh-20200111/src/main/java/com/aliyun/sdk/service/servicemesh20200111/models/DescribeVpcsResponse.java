// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVpcsResponse} extends {@link TeaModel}
 *
 * <p>DescribeVpcsResponse</p>
 */
public class DescribeVpcsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeVpcsResponseBody body;

    private DescribeVpcsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeVpcsResponse create() {
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
    public DescribeVpcsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeVpcsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeVpcsResponseBody body);

        @Override
        DescribeVpcsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeVpcsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeVpcsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeVpcsResponse response) {
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
        public Builder body(DescribeVpcsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeVpcsResponse build() {
            return new DescribeVpcsResponse(this);
        } 

    } 

}
