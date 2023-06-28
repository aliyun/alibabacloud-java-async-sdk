// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20171120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResourcePackUsageResponse} extends {@link TeaModel}
 *
 * <p>DescribeResourcePackUsageResponse</p>
 */
public class DescribeResourcePackUsageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeResourcePackUsageResponseBody body;

    private DescribeResourcePackUsageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeResourcePackUsageResponse create() {
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
    public DescribeResourcePackUsageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeResourcePackUsageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeResourcePackUsageResponseBody body);

        @Override
        DescribeResourcePackUsageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeResourcePackUsageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeResourcePackUsageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeResourcePackUsageResponse response) {
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
        public Builder body(DescribeResourcePackUsageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeResourcePackUsageResponse build() {
            return new DescribeResourcePackUsageResponse(this);
        } 

    } 

}
