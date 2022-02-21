// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLogBackupFilesResponse} extends {@link TeaModel}
 *
 * <p>DescribeLogBackupFilesResponse</p>
 */
public class DescribeLogBackupFilesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeLogBackupFilesResponseBody body;

    private DescribeLogBackupFilesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeLogBackupFilesResponse create() {
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
    public DescribeLogBackupFilesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeLogBackupFilesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeLogBackupFilesResponseBody body);

        @Override
        DescribeLogBackupFilesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeLogBackupFilesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeLogBackupFilesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeLogBackupFilesResponse response) {
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
        public Builder body(DescribeLogBackupFilesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeLogBackupFilesResponse build() {
            return new DescribeLogBackupFilesResponse(this);
        } 

    } 

}
