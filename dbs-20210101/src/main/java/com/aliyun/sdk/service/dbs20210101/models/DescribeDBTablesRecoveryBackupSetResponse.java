// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20210101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBTablesRecoveryBackupSetResponse} extends {@link TeaModel}
 *
 * <p>DescribeDBTablesRecoveryBackupSetResponse</p>
 */
public class DescribeDBTablesRecoveryBackupSetResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDBTablesRecoveryBackupSetResponseBody body;

    private DescribeDBTablesRecoveryBackupSetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDBTablesRecoveryBackupSetResponse create() {
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
    public DescribeDBTablesRecoveryBackupSetResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDBTablesRecoveryBackupSetResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDBTablesRecoveryBackupSetResponseBody body);

        @Override
        DescribeDBTablesRecoveryBackupSetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDBTablesRecoveryBackupSetResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDBTablesRecoveryBackupSetResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDBTablesRecoveryBackupSetResponse response) {
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
        public Builder body(DescribeDBTablesRecoveryBackupSetResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDBTablesRecoveryBackupSetResponse build() {
            return new DescribeDBTablesRecoveryBackupSetResponse(this);
        } 

    } 

}
