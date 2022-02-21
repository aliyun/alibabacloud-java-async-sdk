// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApisByIpControlResponse} extends {@link TeaModel}
 *
 * <p>DescribeApisByIpControlResponse</p>
 */
public class DescribeApisByIpControlResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeApisByIpControlResponseBody body;

    private DescribeApisByIpControlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeApisByIpControlResponse create() {
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
    public DescribeApisByIpControlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeApisByIpControlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeApisByIpControlResponseBody body);

        @Override
        DescribeApisByIpControlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeApisByIpControlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeApisByIpControlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeApisByIpControlResponse response) {
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
        public Builder body(DescribeApisByIpControlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeApisByIpControlResponse build() {
            return new DescribeApisByIpControlResponse(this);
        } 

    } 

}
