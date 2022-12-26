// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIpTagsResponse} extends {@link TeaModel}
 *
 * <p>DescribeIpTagsResponse</p>
 */
public class DescribeIpTagsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeIpTagsResponseBody body;

    private DescribeIpTagsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeIpTagsResponse create() {
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
    public DescribeIpTagsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeIpTagsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeIpTagsResponseBody body);

        @Override
        DescribeIpTagsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeIpTagsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeIpTagsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeIpTagsResponse response) {
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
        public Builder body(DescribeIpTagsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeIpTagsResponse build() {
            return new DescribeIpTagsResponse(this);
        } 

    } 

}
