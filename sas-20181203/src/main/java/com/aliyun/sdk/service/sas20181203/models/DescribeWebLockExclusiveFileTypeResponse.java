// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWebLockExclusiveFileTypeResponse} extends {@link TeaModel}
 *
 * <p>DescribeWebLockExclusiveFileTypeResponse</p>
 */
public class DescribeWebLockExclusiveFileTypeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeWebLockExclusiveFileTypeResponseBody body;

    private DescribeWebLockExclusiveFileTypeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeWebLockExclusiveFileTypeResponse create() {
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
    public DescribeWebLockExclusiveFileTypeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeWebLockExclusiveFileTypeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeWebLockExclusiveFileTypeResponseBody body);

        @Override
        DescribeWebLockExclusiveFileTypeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeWebLockExclusiveFileTypeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeWebLockExclusiveFileTypeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeWebLockExclusiveFileTypeResponse response) {
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
        public Builder body(DescribeWebLockExclusiveFileTypeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeWebLockExclusiveFileTypeResponse build() {
            return new DescribeWebLockExclusiveFileTypeResponse(this);
        } 

    } 

}
