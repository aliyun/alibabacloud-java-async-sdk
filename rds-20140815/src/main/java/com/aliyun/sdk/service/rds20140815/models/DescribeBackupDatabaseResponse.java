// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupDatabaseResponse} extends {@link TeaModel}
 *
 * <p>DescribeBackupDatabaseResponse</p>
 */
public class DescribeBackupDatabaseResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeBackupDatabaseResponseBody body;

    private DescribeBackupDatabaseResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeBackupDatabaseResponse create() {
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
    public DescribeBackupDatabaseResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeBackupDatabaseResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeBackupDatabaseResponseBody body);

        @Override
        DescribeBackupDatabaseResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeBackupDatabaseResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeBackupDatabaseResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeBackupDatabaseResponse response) {
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
        public Builder body(DescribeBackupDatabaseResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeBackupDatabaseResponse build() {
            return new DescribeBackupDatabaseResponse(this);
        } 

    } 

}
