// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNetworkAclAttributesResponse} extends {@link TeaModel}
 *
 * <p>DescribeNetworkAclAttributesResponse</p>
 */
public class DescribeNetworkAclAttributesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeNetworkAclAttributesResponseBody body;

    private DescribeNetworkAclAttributesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeNetworkAclAttributesResponse create() {
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
    public DescribeNetworkAclAttributesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeNetworkAclAttributesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeNetworkAclAttributesResponseBody body);

        @Override
        DescribeNetworkAclAttributesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeNetworkAclAttributesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeNetworkAclAttributesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeNetworkAclAttributesResponse response) {
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
        public Builder body(DescribeNetworkAclAttributesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeNetworkAclAttributesResponse build() {
            return new DescribeNetworkAclAttributesResponse(this);
        } 

    } 

}
