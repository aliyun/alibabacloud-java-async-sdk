// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20190620.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstancesForDmsResponse} extends {@link TeaModel}
 *
 * <p>DescribeDBInstancesForDmsResponse</p>
 */
public class DescribeDBInstancesForDmsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDBInstancesForDmsResponseBody body;

    private DescribeDBInstancesForDmsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDBInstancesForDmsResponse create() {
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
    public DescribeDBInstancesForDmsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDBInstancesForDmsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDBInstancesForDmsResponseBody body);

        @Override
        DescribeDBInstancesForDmsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDBInstancesForDmsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDBInstancesForDmsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDBInstancesForDmsResponse response) {
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
        public Builder body(DescribeDBInstancesForDmsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDBInstancesForDmsResponse build() {
            return new DescribeDBInstancesForDmsResponse(this);
        } 

    } 

}
