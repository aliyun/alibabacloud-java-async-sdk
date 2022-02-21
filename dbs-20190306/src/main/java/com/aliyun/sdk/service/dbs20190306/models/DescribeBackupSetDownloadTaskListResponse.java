// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupSetDownloadTaskListResponse} extends {@link TeaModel}
 *
 * <p>DescribeBackupSetDownloadTaskListResponse</p>
 */
public class DescribeBackupSetDownloadTaskListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeBackupSetDownloadTaskListResponseBody body;

    private DescribeBackupSetDownloadTaskListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeBackupSetDownloadTaskListResponse create() {
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
    public DescribeBackupSetDownloadTaskListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeBackupSetDownloadTaskListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeBackupSetDownloadTaskListResponseBody body);

        @Override
        DescribeBackupSetDownloadTaskListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeBackupSetDownloadTaskListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeBackupSetDownloadTaskListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeBackupSetDownloadTaskListResponse response) {
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
        public Builder body(DescribeBackupSetDownloadTaskListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeBackupSetDownloadTaskListResponse build() {
            return new DescribeBackupSetDownloadTaskListResponse(this);
        } 

    } 

}
