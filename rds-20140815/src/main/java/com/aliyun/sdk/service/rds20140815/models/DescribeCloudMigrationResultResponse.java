// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCloudMigrationResultResponse} extends {@link TeaModel}
 *
 * <p>DescribeCloudMigrationResultResponse</p>
 */
public class DescribeCloudMigrationResultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCloudMigrationResultResponseBody body;

    private DescribeCloudMigrationResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCloudMigrationResultResponse create() {
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
    public DescribeCloudMigrationResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCloudMigrationResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCloudMigrationResultResponseBody body);

        @Override
        DescribeCloudMigrationResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCloudMigrationResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCloudMigrationResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCloudMigrationResultResponse response) {
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
        public Builder body(DescribeCloudMigrationResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCloudMigrationResultResponse build() {
            return new DescribeCloudMigrationResultResponse(this);
        } 

    } 

}
