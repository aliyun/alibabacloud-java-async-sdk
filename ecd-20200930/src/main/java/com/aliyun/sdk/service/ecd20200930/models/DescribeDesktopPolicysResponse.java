// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDesktopPolicysResponse} extends {@link TeaModel}
 *
 * <p>DescribeDesktopPolicysResponse</p>
 */
public class DescribeDesktopPolicysResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDesktopPolicysResponseBody body;

    private DescribeDesktopPolicysResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDesktopPolicysResponse create() {
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
    public DescribeDesktopPolicysResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDesktopPolicysResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDesktopPolicysResponseBody body);

        @Override
        DescribeDesktopPolicysResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDesktopPolicysResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDesktopPolicysResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDesktopPolicysResponse response) {
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
        public Builder body(DescribeDesktopPolicysResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDesktopPolicysResponse build() {
            return new DescribeDesktopPolicysResponse(this);
        } 

    } 

}
