// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVServerGroupsResponse} extends {@link TeaModel}
 *
 * <p>DescribeVServerGroupsResponse</p>
 */
public class DescribeVServerGroupsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeVServerGroupsResponseBody body;

    private DescribeVServerGroupsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeVServerGroupsResponse create() {
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
    public DescribeVServerGroupsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeVServerGroupsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeVServerGroupsResponseBody body);

        @Override
        DescribeVServerGroupsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeVServerGroupsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeVServerGroupsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeVServerGroupsResponse response) {
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
        public Builder body(DescribeVServerGroupsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeVServerGroupsResponse build() {
            return new DescribeVServerGroupsResponse(this);
        } 

    } 

}
