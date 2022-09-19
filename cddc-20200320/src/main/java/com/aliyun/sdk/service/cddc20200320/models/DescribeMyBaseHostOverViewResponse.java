// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cddc20200320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMyBaseHostOverViewResponse} extends {@link TeaModel}
 *
 * <p>DescribeMyBaseHostOverViewResponse</p>
 */
public class DescribeMyBaseHostOverViewResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeMyBaseHostOverViewResponseBody body;

    private DescribeMyBaseHostOverViewResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeMyBaseHostOverViewResponse create() {
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
    public DescribeMyBaseHostOverViewResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeMyBaseHostOverViewResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeMyBaseHostOverViewResponseBody body);

        @Override
        DescribeMyBaseHostOverViewResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeMyBaseHostOverViewResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeMyBaseHostOverViewResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeMyBaseHostOverViewResponse response) {
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
        public Builder body(DescribeMyBaseHostOverViewResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeMyBaseHostOverViewResponse build() {
            return new DescribeMyBaseHostOverViewResponse(this);
        } 

    } 

}
