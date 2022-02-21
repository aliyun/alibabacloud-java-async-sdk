// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupPlanListResponse} extends {@link TeaModel}
 *
 * <p>DescribeBackupPlanListResponse</p>
 */
public class DescribeBackupPlanListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeBackupPlanListResponseBody body;

    private DescribeBackupPlanListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeBackupPlanListResponse create() {
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
    public DescribeBackupPlanListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeBackupPlanListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeBackupPlanListResponseBody body);

        @Override
        DescribeBackupPlanListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeBackupPlanListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeBackupPlanListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeBackupPlanListResponse response) {
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
        public Builder body(DescribeBackupPlanListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeBackupPlanListResponse build() {
            return new DescribeBackupPlanListResponse(this);
        } 

    } 

}
