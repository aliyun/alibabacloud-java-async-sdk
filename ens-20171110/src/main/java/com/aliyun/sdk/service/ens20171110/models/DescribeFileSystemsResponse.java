// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFileSystemsResponse} extends {@link TeaModel}
 *
 * <p>DescribeFileSystemsResponse</p>
 */
public class DescribeFileSystemsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeFileSystemsResponseBody body;

    private DescribeFileSystemsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeFileSystemsResponse create() {
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
    public DescribeFileSystemsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeFileSystemsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeFileSystemsResponseBody body);

        @Override
        DescribeFileSystemsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeFileSystemsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeFileSystemsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeFileSystemsResponse response) {
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
        public Builder body(DescribeFileSystemsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeFileSystemsResponse build() {
            return new DescribeFileSystemsResponse(this);
        } 

    } 

}
