// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUniBackupDatabaseResponse} extends {@link TeaModel}
 *
 * <p>DescribeUniBackupDatabaseResponse</p>
 */
public class DescribeUniBackupDatabaseResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeUniBackupDatabaseResponseBody body;

    private DescribeUniBackupDatabaseResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeUniBackupDatabaseResponse create() {
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
    public DescribeUniBackupDatabaseResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeUniBackupDatabaseResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeUniBackupDatabaseResponseBody body);

        @Override
        DescribeUniBackupDatabaseResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeUniBackupDatabaseResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeUniBackupDatabaseResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeUniBackupDatabaseResponse response) {
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
        public Builder body(DescribeUniBackupDatabaseResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeUniBackupDatabaseResponse build() {
            return new DescribeUniBackupDatabaseResponse(this);
        } 

    } 

}
