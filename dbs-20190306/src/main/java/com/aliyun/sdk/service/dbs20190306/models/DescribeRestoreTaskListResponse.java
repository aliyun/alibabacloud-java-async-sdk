// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRestoreTaskListResponse} extends {@link TeaModel}
 *
 * <p>DescribeRestoreTaskListResponse</p>
 */
public class DescribeRestoreTaskListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeRestoreTaskListResponseBody body;

    private DescribeRestoreTaskListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeRestoreTaskListResponse create() {
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
    public DescribeRestoreTaskListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRestoreTaskListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeRestoreTaskListResponseBody body);

        @Override
        DescribeRestoreTaskListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRestoreTaskListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeRestoreTaskListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRestoreTaskListResponse response) {
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
        public Builder body(DescribeRestoreTaskListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeRestoreTaskListResponse build() {
            return new DescribeRestoreTaskListResponse(this);
        } 

    } 

}
