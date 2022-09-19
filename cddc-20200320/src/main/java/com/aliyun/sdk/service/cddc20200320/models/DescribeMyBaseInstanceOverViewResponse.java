// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cddc20200320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMyBaseInstanceOverViewResponse} extends {@link TeaModel}
 *
 * <p>DescribeMyBaseInstanceOverViewResponse</p>
 */
public class DescribeMyBaseInstanceOverViewResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeMyBaseInstanceOverViewResponseBody body;

    private DescribeMyBaseInstanceOverViewResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeMyBaseInstanceOverViewResponse create() {
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
    public DescribeMyBaseInstanceOverViewResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeMyBaseInstanceOverViewResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeMyBaseInstanceOverViewResponseBody body);

        @Override
        DescribeMyBaseInstanceOverViewResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeMyBaseInstanceOverViewResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeMyBaseInstanceOverViewResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeMyBaseInstanceOverViewResponse response) {
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
        public Builder body(DescribeMyBaseInstanceOverViewResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeMyBaseInstanceOverViewResponse build() {
            return new DescribeMyBaseInstanceOverViewResponse(this);
        } 

    } 

}
