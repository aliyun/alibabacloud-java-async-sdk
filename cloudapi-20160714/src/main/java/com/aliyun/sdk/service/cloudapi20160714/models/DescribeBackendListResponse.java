// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackendListResponse} extends {@link TeaModel}
 *
 * <p>DescribeBackendListResponse</p>
 */
public class DescribeBackendListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeBackendListResponseBody body;

    private DescribeBackendListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeBackendListResponse create() {
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
    public DescribeBackendListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeBackendListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeBackendListResponseBody body);

        @Override
        DescribeBackendListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeBackendListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeBackendListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeBackendListResponse response) {
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
        public Builder body(DescribeBackendListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeBackendListResponse build() {
            return new DescribeBackendListResponse(this);
        } 

    } 

}
