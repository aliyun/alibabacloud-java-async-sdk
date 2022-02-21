// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScaleOutMigrateTaskListResponse} extends {@link TeaModel}
 *
 * <p>DescribeScaleOutMigrateTaskListResponse</p>
 */
public class DescribeScaleOutMigrateTaskListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeScaleOutMigrateTaskListResponseBody body;

    private DescribeScaleOutMigrateTaskListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeScaleOutMigrateTaskListResponse create() {
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
    public DescribeScaleOutMigrateTaskListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeScaleOutMigrateTaskListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeScaleOutMigrateTaskListResponseBody body);

        @Override
        DescribeScaleOutMigrateTaskListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeScaleOutMigrateTaskListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeScaleOutMigrateTaskListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeScaleOutMigrateTaskListResponse response) {
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
        public Builder body(DescribeScaleOutMigrateTaskListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeScaleOutMigrateTaskListResponse build() {
            return new DescribeScaleOutMigrateTaskListResponse(this);
        } 

    } 

}
