// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cassandra20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupPlansResponse} extends {@link TeaModel}
 *
 * <p>DescribeBackupPlansResponse</p>
 */
public class DescribeBackupPlansResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeBackupPlansResponseBody body;

    private DescribeBackupPlansResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeBackupPlansResponse create() {
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
    public DescribeBackupPlansResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeBackupPlansResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeBackupPlansResponseBody body);

        @Override
        DescribeBackupPlansResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeBackupPlansResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeBackupPlansResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeBackupPlansResponse response) {
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
        public Builder body(DescribeBackupPlansResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeBackupPlansResponse build() {
            return new DescribeBackupPlansResponse(this);
        } 

    } 

}
