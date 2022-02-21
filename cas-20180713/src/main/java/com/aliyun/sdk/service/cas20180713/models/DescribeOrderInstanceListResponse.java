// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20180713.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOrderInstanceListResponse} extends {@link TeaModel}
 *
 * <p>DescribeOrderInstanceListResponse</p>
 */
public class DescribeOrderInstanceListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeOrderInstanceListResponseBody body;

    private DescribeOrderInstanceListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeOrderInstanceListResponse create() {
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
    public DescribeOrderInstanceListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeOrderInstanceListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeOrderInstanceListResponseBody body);

        @Override
        DescribeOrderInstanceListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeOrderInstanceListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeOrderInstanceListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeOrderInstanceListResponse response) {
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
        public Builder body(DescribeOrderInstanceListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeOrderInstanceListResponse build() {
            return new DescribeOrderInstanceListResponse(this);
        } 

    } 

}
