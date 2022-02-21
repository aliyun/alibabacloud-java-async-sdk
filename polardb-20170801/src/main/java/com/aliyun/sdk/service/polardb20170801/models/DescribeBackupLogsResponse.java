// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupLogsResponse} extends {@link TeaModel}
 *
 * <p>DescribeBackupLogsResponse</p>
 */
public class DescribeBackupLogsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeBackupLogsResponseBody body;

    private DescribeBackupLogsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeBackupLogsResponse create() {
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
    public DescribeBackupLogsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeBackupLogsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeBackupLogsResponseBody body);

        @Override
        DescribeBackupLogsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeBackupLogsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeBackupLogsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeBackupLogsResponse response) {
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
        public Builder body(DescribeBackupLogsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeBackupLogsResponse build() {
            return new DescribeBackupLogsResponse(this);
        } 

    } 

}
