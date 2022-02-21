// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFullBackupListResponse} extends {@link TeaModel}
 *
 * <p>DescribeFullBackupListResponse</p>
 */
public class DescribeFullBackupListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeFullBackupListResponseBody body;

    private DescribeFullBackupListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeFullBackupListResponse create() {
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
    public DescribeFullBackupListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeFullBackupListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeFullBackupListResponseBody body);

        @Override
        DescribeFullBackupListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeFullBackupListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeFullBackupListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeFullBackupListResponse response) {
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
        public Builder body(DescribeFullBackupListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeFullBackupListResponse build() {
            return new DescribeFullBackupListResponse(this);
        } 

    } 

}
