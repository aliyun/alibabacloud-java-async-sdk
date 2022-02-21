// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstanceOnECSAttributeResponse} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceOnECSAttributeResponse</p>
 */
public class DescribeDBInstanceOnECSAttributeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDBInstanceOnECSAttributeResponseBody body;

    private DescribeDBInstanceOnECSAttributeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDBInstanceOnECSAttributeResponse create() {
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
    public DescribeDBInstanceOnECSAttributeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDBInstanceOnECSAttributeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDBInstanceOnECSAttributeResponseBody body);

        @Override
        DescribeDBInstanceOnECSAttributeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDBInstanceOnECSAttributeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDBInstanceOnECSAttributeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDBInstanceOnECSAttributeResponse response) {
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
        public Builder body(DescribeDBInstanceOnECSAttributeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDBInstanceOnECSAttributeResponse build() {
            return new DescribeDBInstanceOnECSAttributeResponse(this);
        } 

    } 

}
