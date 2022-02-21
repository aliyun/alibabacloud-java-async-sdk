// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIncrementBackupListResponse} extends {@link TeaModel}
 *
 * <p>DescribeIncrementBackupListResponse</p>
 */
public class DescribeIncrementBackupListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeIncrementBackupListResponseBody body;

    private DescribeIncrementBackupListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeIncrementBackupListResponse create() {
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
    public DescribeIncrementBackupListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeIncrementBackupListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeIncrementBackupListResponseBody body);

        @Override
        DescribeIncrementBackupListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeIncrementBackupListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeIncrementBackupListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeIncrementBackupListResponse response) {
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
        public Builder body(DescribeIncrementBackupListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeIncrementBackupListResponse build() {
            return new DescribeIncrementBackupListResponse(this);
        } 

    } 

}
