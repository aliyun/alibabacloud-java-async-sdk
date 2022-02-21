// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGreyTagRouteResponse} extends {@link TeaModel}
 *
 * <p>DescribeGreyTagRouteResponse</p>
 */
public class DescribeGreyTagRouteResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeGreyTagRouteResponseBody body;

    private DescribeGreyTagRouteResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeGreyTagRouteResponse create() {
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
    public DescribeGreyTagRouteResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeGreyTagRouteResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeGreyTagRouteResponseBody body);

        @Override
        DescribeGreyTagRouteResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeGreyTagRouteResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeGreyTagRouteResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeGreyTagRouteResponse response) {
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
        public Builder body(DescribeGreyTagRouteResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeGreyTagRouteResponse build() {
            return new DescribeGreyTagRouteResponse(this);
        } 

    } 

}
