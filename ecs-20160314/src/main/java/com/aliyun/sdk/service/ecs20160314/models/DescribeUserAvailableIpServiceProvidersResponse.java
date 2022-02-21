// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserAvailableIpServiceProvidersResponse} extends {@link TeaModel}
 *
 * <p>DescribeUserAvailableIpServiceProvidersResponse</p>
 */
public class DescribeUserAvailableIpServiceProvidersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeUserAvailableIpServiceProvidersResponseBody body;

    private DescribeUserAvailableIpServiceProvidersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeUserAvailableIpServiceProvidersResponse create() {
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
    public DescribeUserAvailableIpServiceProvidersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeUserAvailableIpServiceProvidersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeUserAvailableIpServiceProvidersResponseBody body);

        @Override
        DescribeUserAvailableIpServiceProvidersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeUserAvailableIpServiceProvidersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeUserAvailableIpServiceProvidersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeUserAvailableIpServiceProvidersResponse response) {
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
        public Builder body(DescribeUserAvailableIpServiceProvidersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeUserAvailableIpServiceProvidersResponse build() {
            return new DescribeUserAvailableIpServiceProvidersResponse(this);
        } 

    } 

}
