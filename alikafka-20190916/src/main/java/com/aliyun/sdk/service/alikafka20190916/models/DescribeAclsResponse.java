// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAclsResponse} extends {@link TeaModel}
 *
 * <p>DescribeAclsResponse</p>
 */
public class DescribeAclsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAclsResponseBody body;

    private DescribeAclsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAclsResponse create() {
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
    public DescribeAclsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAclsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAclsResponseBody body);

        @Override
        DescribeAclsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAclsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAclsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAclsResponse response) {
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
        public Builder body(DescribeAclsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAclsResponse build() {
            return new DescribeAclsResponse(this);
        } 

    } 

}
