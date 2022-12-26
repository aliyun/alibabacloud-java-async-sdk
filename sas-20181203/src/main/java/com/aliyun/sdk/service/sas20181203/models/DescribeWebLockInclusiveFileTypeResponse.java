// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWebLockInclusiveFileTypeResponse} extends {@link TeaModel}
 *
 * <p>DescribeWebLockInclusiveFileTypeResponse</p>
 */
public class DescribeWebLockInclusiveFileTypeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeWebLockInclusiveFileTypeResponseBody body;

    private DescribeWebLockInclusiveFileTypeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeWebLockInclusiveFileTypeResponse create() {
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
    public DescribeWebLockInclusiveFileTypeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeWebLockInclusiveFileTypeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeWebLockInclusiveFileTypeResponseBody body);

        @Override
        DescribeWebLockInclusiveFileTypeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeWebLockInclusiveFileTypeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeWebLockInclusiveFileTypeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeWebLockInclusiveFileTypeResponse response) {
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
        public Builder body(DescribeWebLockInclusiveFileTypeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeWebLockInclusiveFileTypeResponse build() {
            return new DescribeWebLockInclusiveFileTypeResponse(this);
        } 

    } 

}
