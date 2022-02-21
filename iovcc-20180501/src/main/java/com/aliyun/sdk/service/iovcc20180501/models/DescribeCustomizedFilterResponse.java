// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCustomizedFilterResponse} extends {@link TeaModel}
 *
 * <p>DescribeCustomizedFilterResponse</p>
 */
public class DescribeCustomizedFilterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCustomizedFilterResponseBody body;

    private DescribeCustomizedFilterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCustomizedFilterResponse create() {
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
    public DescribeCustomizedFilterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCustomizedFilterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCustomizedFilterResponseBody body);

        @Override
        DescribeCustomizedFilterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCustomizedFilterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCustomizedFilterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCustomizedFilterResponse response) {
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
        public Builder body(DescribeCustomizedFilterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCustomizedFilterResponse build() {
            return new DescribeCustomizedFilterResponse(this);
        } 

    } 

}
