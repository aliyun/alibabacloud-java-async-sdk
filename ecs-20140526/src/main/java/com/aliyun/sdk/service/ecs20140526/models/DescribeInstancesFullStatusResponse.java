// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstancesFullStatusResponse} extends {@link TeaModel}
 *
 * <p>DescribeInstancesFullStatusResponse</p>
 */
public class DescribeInstancesFullStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeInstancesFullStatusResponseBody body;

    private DescribeInstancesFullStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeInstancesFullStatusResponse create() {
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
    public DescribeInstancesFullStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeInstancesFullStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeInstancesFullStatusResponseBody body);

        @Override
        DescribeInstancesFullStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeInstancesFullStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeInstancesFullStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeInstancesFullStatusResponse response) {
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
        public Builder body(DescribeInstancesFullStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeInstancesFullStatusResponse build() {
            return new DescribeInstancesFullStatusResponse(this);
        } 

    } 

}
