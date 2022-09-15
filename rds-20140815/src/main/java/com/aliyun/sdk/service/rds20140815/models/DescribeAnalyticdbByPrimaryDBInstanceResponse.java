// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAnalyticdbByPrimaryDBInstanceResponse} extends {@link TeaModel}
 *
 * <p>DescribeAnalyticdbByPrimaryDBInstanceResponse</p>
 */
public class DescribeAnalyticdbByPrimaryDBInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAnalyticdbByPrimaryDBInstanceResponseBody body;

    private DescribeAnalyticdbByPrimaryDBInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAnalyticdbByPrimaryDBInstanceResponse create() {
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
    public DescribeAnalyticdbByPrimaryDBInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAnalyticdbByPrimaryDBInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAnalyticdbByPrimaryDBInstanceResponseBody body);

        @Override
        DescribeAnalyticdbByPrimaryDBInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAnalyticdbByPrimaryDBInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAnalyticdbByPrimaryDBInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAnalyticdbByPrimaryDBInstanceResponse response) {
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
        public Builder body(DescribeAnalyticdbByPrimaryDBInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAnalyticdbByPrimaryDBInstanceResponse build() {
            return new DescribeAnalyticdbByPrimaryDBInstanceResponse(this);
        } 

    } 

}
