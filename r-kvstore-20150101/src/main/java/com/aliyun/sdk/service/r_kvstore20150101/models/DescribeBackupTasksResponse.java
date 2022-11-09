// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupTasksResponse} extends {@link TeaModel}
 *
 * <p>DescribeBackupTasksResponse</p>
 */
public class DescribeBackupTasksResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeBackupTasksResponseBody body;

    private DescribeBackupTasksResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeBackupTasksResponse create() {
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
    public DescribeBackupTasksResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeBackupTasksResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeBackupTasksResponseBody body);

        @Override
        DescribeBackupTasksResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeBackupTasksResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeBackupTasksResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeBackupTasksResponse response) {
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
        public Builder body(DescribeBackupTasksResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeBackupTasksResponse build() {
            return new DescribeBackupTasksResponse(this);
        } 

    } 

}
