// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cassandra20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIpWhitelistGroupsResponse} extends {@link TeaModel}
 *
 * <p>DescribeIpWhitelistGroupsResponse</p>
 */
public class DescribeIpWhitelistGroupsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeIpWhitelistGroupsResponseBody body;

    private DescribeIpWhitelistGroupsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeIpWhitelistGroupsResponse create() {
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
    public DescribeIpWhitelistGroupsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeIpWhitelistGroupsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeIpWhitelistGroupsResponseBody body);

        @Override
        DescribeIpWhitelistGroupsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeIpWhitelistGroupsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeIpWhitelistGroupsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeIpWhitelistGroupsResponse response) {
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
        public Builder body(DescribeIpWhitelistGroupsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeIpWhitelistGroupsResponse build() {
            return new DescribeIpWhitelistGroupsResponse(this);
        } 

    } 

}
