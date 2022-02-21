// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGuestClusterPodsResponse} extends {@link TeaModel}
 *
 * <p>DescribeGuestClusterPodsResponse</p>
 */
public class DescribeGuestClusterPodsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeGuestClusterPodsResponseBody body;

    private DescribeGuestClusterPodsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeGuestClusterPodsResponse create() {
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
    public DescribeGuestClusterPodsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeGuestClusterPodsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeGuestClusterPodsResponseBody body);

        @Override
        DescribeGuestClusterPodsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeGuestClusterPodsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeGuestClusterPodsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeGuestClusterPodsResponse response) {
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
        public Builder body(DescribeGuestClusterPodsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeGuestClusterPodsResponse build() {
            return new DescribeGuestClusterPodsResponse(this);
        } 

    } 

}
