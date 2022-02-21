// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupRestoreCountResponse} extends {@link TeaModel}
 *
 * <p>DescribeBackupRestoreCountResponse</p>
 */
public class DescribeBackupRestoreCountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeBackupRestoreCountResponseBody body;

    private DescribeBackupRestoreCountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeBackupRestoreCountResponse create() {
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
    public DescribeBackupRestoreCountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeBackupRestoreCountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeBackupRestoreCountResponseBody body);

        @Override
        DescribeBackupRestoreCountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeBackupRestoreCountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeBackupRestoreCountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeBackupRestoreCountResponse response) {
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
        public Builder body(DescribeBackupRestoreCountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeBackupRestoreCountResponse build() {
            return new DescribeBackupRestoreCountResponse(this);
        } 

    } 

}
