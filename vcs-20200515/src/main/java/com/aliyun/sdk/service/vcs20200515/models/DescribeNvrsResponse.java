// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNvrsResponse} extends {@link TeaModel}
 *
 * <p>DescribeNvrsResponse</p>
 */
public class DescribeNvrsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeNvrsResponseBody body;

    private DescribeNvrsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeNvrsResponse create() {
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
    public DescribeNvrsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeNvrsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeNvrsResponseBody body);

        @Override
        DescribeNvrsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeNvrsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeNvrsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeNvrsResponse response) {
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
        public Builder body(DescribeNvrsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeNvrsResponse build() {
            return new DescribeNvrsResponse(this);
        } 

    } 

}
