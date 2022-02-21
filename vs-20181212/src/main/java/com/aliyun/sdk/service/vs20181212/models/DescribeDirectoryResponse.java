// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDirectoryResponse} extends {@link TeaModel}
 *
 * <p>DescribeDirectoryResponse</p>
 */
public class DescribeDirectoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDirectoryResponseBody body;

    private DescribeDirectoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDirectoryResponse create() {
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
    public DescribeDirectoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDirectoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDirectoryResponseBody body);

        @Override
        DescribeDirectoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDirectoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDirectoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDirectoryResponse response) {
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
        public Builder body(DescribeDirectoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDirectoryResponse build() {
            return new DescribeDirectoryResponse(this);
        } 

    } 

}
