// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImagePermissionResponse} extends {@link TeaModel}
 *
 * <p>DescribeImagePermissionResponse</p>
 */
public class DescribeImagePermissionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeImagePermissionResponseBody body;

    private DescribeImagePermissionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeImagePermissionResponse create() {
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
    public DescribeImagePermissionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeImagePermissionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeImagePermissionResponseBody body);

        @Override
        DescribeImagePermissionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeImagePermissionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeImagePermissionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeImagePermissionResponse response) {
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
        public Builder body(DescribeImagePermissionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeImagePermissionResponse build() {
            return new DescribeImagePermissionResponse(this);
        } 

    } 

}
