// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAccessControlListsResponse} extends {@link TeaModel}
 *
 * <p>DescribeAccessControlListsResponse</p>
 */
public class DescribeAccessControlListsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAccessControlListsResponseBody body;

    private DescribeAccessControlListsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAccessControlListsResponse create() {
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
    public DescribeAccessControlListsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAccessControlListsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAccessControlListsResponseBody body);

        @Override
        DescribeAccessControlListsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAccessControlListsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAccessControlListsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAccessControlListsResponse response) {
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
        public Builder body(DescribeAccessControlListsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAccessControlListsResponse build() {
            return new DescribeAccessControlListsResponse(this);
        } 

    } 

}
