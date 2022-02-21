// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRouterInterfacesResponse} extends {@link TeaModel}
 *
 * <p>DescribeRouterInterfacesResponse</p>
 */
public class DescribeRouterInterfacesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeRouterInterfacesResponseBody body;

    private DescribeRouterInterfacesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeRouterInterfacesResponse create() {
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
    public DescribeRouterInterfacesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRouterInterfacesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeRouterInterfacesResponseBody body);

        @Override
        DescribeRouterInterfacesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRouterInterfacesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeRouterInterfacesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRouterInterfacesResponse response) {
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
        public Builder body(DescribeRouterInterfacesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeRouterInterfacesResponse build() {
            return new DescribeRouterInterfacesResponse(this);
        } 

    } 

}
