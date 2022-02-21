// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApmResponse} extends {@link TeaModel}
 *
 * <p>DescribeApmResponse</p>
 */
public class DescribeApmResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeApmResponseBody body;

    private DescribeApmResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeApmResponse create() {
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
    public DescribeApmResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeApmResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeApmResponseBody body);

        @Override
        DescribeApmResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeApmResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeApmResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeApmResponse response) {
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
        public Builder body(DescribeApmResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeApmResponse build() {
            return new DescribeApmResponse(this);
        } 

    } 

}
