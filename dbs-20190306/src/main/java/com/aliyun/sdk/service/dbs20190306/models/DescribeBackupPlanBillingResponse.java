// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupPlanBillingResponse} extends {@link TeaModel}
 *
 * <p>DescribeBackupPlanBillingResponse</p>
 */
public class DescribeBackupPlanBillingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeBackupPlanBillingResponseBody body;

    private DescribeBackupPlanBillingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeBackupPlanBillingResponse create() {
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
    public DescribeBackupPlanBillingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeBackupPlanBillingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeBackupPlanBillingResponseBody body);

        @Override
        DescribeBackupPlanBillingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeBackupPlanBillingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeBackupPlanBillingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeBackupPlanBillingResponse response) {
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
        public Builder body(DescribeBackupPlanBillingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeBackupPlanBillingResponse build() {
            return new DescribeBackupPlanBillingResponse(this);
        } 

    } 

}
