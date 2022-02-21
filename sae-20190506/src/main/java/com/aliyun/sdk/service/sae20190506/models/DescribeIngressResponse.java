// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIngressResponse} extends {@link TeaModel}
 *
 * <p>DescribeIngressResponse</p>
 */
public class DescribeIngressResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeIngressResponseBody body;

    private DescribeIngressResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeIngressResponse create() {
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
    public DescribeIngressResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeIngressResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeIngressResponseBody body);

        @Override
        DescribeIngressResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeIngressResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeIngressResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeIngressResponse response) {
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
        public Builder body(DescribeIngressResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeIngressResponse build() {
            return new DescribeIngressResponse(this);
        } 

    } 

}
