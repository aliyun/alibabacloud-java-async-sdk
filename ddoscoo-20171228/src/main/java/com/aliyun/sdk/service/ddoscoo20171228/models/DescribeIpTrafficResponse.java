// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIpTrafficResponse} extends {@link TeaModel}
 *
 * <p>DescribeIpTrafficResponse</p>
 */
public class DescribeIpTrafficResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeIpTrafficResponseBody body;

    private DescribeIpTrafficResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeIpTrafficResponse create() {
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
    public DescribeIpTrafficResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeIpTrafficResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeIpTrafficResponseBody body);

        @Override
        DescribeIpTrafficResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeIpTrafficResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeIpTrafficResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeIpTrafficResponse response) {
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
        public Builder body(DescribeIpTrafficResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeIpTrafficResponse build() {
            return new DescribeIpTrafficResponse(this);
        } 

    } 

}
