// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResourceUsageTotalResponse} extends {@link TeaModel}
 *
 * <p>DescribeResourceUsageTotalResponse</p>
 */
public class DescribeResourceUsageTotalResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeResourceUsageTotalResponseBody body;

    private DescribeResourceUsageTotalResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeResourceUsageTotalResponse create() {
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
    public DescribeResourceUsageTotalResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeResourceUsageTotalResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeResourceUsageTotalResponseBody body);

        @Override
        DescribeResourceUsageTotalResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeResourceUsageTotalResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeResourceUsageTotalResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeResourceUsageTotalResponse response) {
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
        public Builder body(DescribeResourceUsageTotalResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeResourceUsageTotalResponse build() {
            return new DescribeResourceUsageTotalResponse(this);
        } 

    } 

}
