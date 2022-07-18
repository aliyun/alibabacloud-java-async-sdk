// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResourceDLinkResponse} extends {@link TeaModel}
 *
 * <p>DescribeResourceDLinkResponse</p>
 */
public class DescribeResourceDLinkResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeResourceDLinkResponseBody body;

    private DescribeResourceDLinkResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeResourceDLinkResponse create() {
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
    public DescribeResourceDLinkResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeResourceDLinkResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeResourceDLinkResponseBody body);

        @Override
        DescribeResourceDLinkResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeResourceDLinkResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeResourceDLinkResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeResourceDLinkResponse response) {
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
        public Builder body(DescribeResourceDLinkResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeResourceDLinkResponse build() {
            return new DescribeResourceDLinkResponse(this);
        } 

    } 

}
