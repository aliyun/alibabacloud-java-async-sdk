// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCloudMigrationPrecheckResultResponse} extends {@link TeaModel}
 *
 * <p>DescribeCloudMigrationPrecheckResultResponse</p>
 */
public class DescribeCloudMigrationPrecheckResultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCloudMigrationPrecheckResultResponseBody body;

    private DescribeCloudMigrationPrecheckResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCloudMigrationPrecheckResultResponse create() {
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
    public DescribeCloudMigrationPrecheckResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCloudMigrationPrecheckResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCloudMigrationPrecheckResultResponseBody body);

        @Override
        DescribeCloudMigrationPrecheckResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCloudMigrationPrecheckResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCloudMigrationPrecheckResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCloudMigrationPrecheckResultResponse response) {
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
        public Builder body(DescribeCloudMigrationPrecheckResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCloudMigrationPrecheckResultResponse build() {
            return new DescribeCloudMigrationPrecheckResultResponse(this);
        } 

    } 

}
