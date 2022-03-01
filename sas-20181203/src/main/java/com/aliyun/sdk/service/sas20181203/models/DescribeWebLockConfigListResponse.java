// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWebLockConfigListResponse} extends {@link TeaModel}
 *
 * <p>DescribeWebLockConfigListResponse</p>
 */
public class DescribeWebLockConfigListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeWebLockConfigListResponseBody body;

    private DescribeWebLockConfigListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeWebLockConfigListResponse create() {
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
    public DescribeWebLockConfigListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeWebLockConfigListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeWebLockConfigListResponseBody body);

        @Override
        DescribeWebLockConfigListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeWebLockConfigListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeWebLockConfigListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeWebLockConfigListResponse response) {
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
        public Builder body(DescribeWebLockConfigListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeWebLockConfigListResponse build() {
            return new DescribeWebLockConfigListResponse(this);
        } 

    } 

}
