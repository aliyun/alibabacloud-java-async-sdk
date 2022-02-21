// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cassandra20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupPlanResponse} extends {@link TeaModel}
 *
 * <p>DescribeBackupPlanResponse</p>
 */
public class DescribeBackupPlanResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeBackupPlanResponseBody body;

    private DescribeBackupPlanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeBackupPlanResponse create() {
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
    public DescribeBackupPlanResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeBackupPlanResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeBackupPlanResponseBody body);

        @Override
        DescribeBackupPlanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeBackupPlanResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeBackupPlanResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeBackupPlanResponse response) {
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
        public Builder body(DescribeBackupPlanResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeBackupPlanResponse build() {
            return new DescribeBackupPlanResponse(this);
        } 

    } 

}
