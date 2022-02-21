// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAccountListResponse} extends {@link TeaModel}
 *
 * <p>DescribeAccountListResponse</p>
 */
public class DescribeAccountListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAccountListResponseBody body;

    private DescribeAccountListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAccountListResponse create() {
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
    public DescribeAccountListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAccountListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAccountListResponseBody body);

        @Override
        DescribeAccountListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAccountListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAccountListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAccountListResponse response) {
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
        public Builder body(DescribeAccountListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAccountListResponse build() {
            return new DescribeAccountListResponse(this);
        } 

    } 

}
