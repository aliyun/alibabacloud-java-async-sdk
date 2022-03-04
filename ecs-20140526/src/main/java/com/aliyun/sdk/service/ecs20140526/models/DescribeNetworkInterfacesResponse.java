// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNetworkInterfacesResponse} extends {@link TeaModel}
 *
 * <p>DescribeNetworkInterfacesResponse</p>
 */
public class DescribeNetworkInterfacesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeNetworkInterfacesResponseBody body;

    private DescribeNetworkInterfacesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeNetworkInterfacesResponse create() {
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
    public DescribeNetworkInterfacesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeNetworkInterfacesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeNetworkInterfacesResponseBody body);

        @Override
        DescribeNetworkInterfacesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeNetworkInterfacesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeNetworkInterfacesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeNetworkInterfacesResponse response) {
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
        public Builder body(DescribeNetworkInterfacesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeNetworkInterfacesResponse build() {
            return new DescribeNetworkInterfacesResponse(this);
        } 

    } 

}
