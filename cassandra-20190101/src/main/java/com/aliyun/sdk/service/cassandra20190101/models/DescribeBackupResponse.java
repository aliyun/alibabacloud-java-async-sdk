// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cassandra20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupResponse} extends {@link TeaModel}
 *
 * <p>DescribeBackupResponse</p>
 */
public class DescribeBackupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeBackupResponseBody body;

    private DescribeBackupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeBackupResponse create() {
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
    public DescribeBackupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeBackupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeBackupResponseBody body);

        @Override
        DescribeBackupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeBackupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeBackupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeBackupResponse response) {
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
        public Builder body(DescribeBackupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeBackupResponse build() {
            return new DescribeBackupResponse(this);
        } 

    } 

}
