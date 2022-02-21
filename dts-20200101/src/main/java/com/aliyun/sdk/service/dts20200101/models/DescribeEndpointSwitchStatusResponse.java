// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEndpointSwitchStatusResponse} extends {@link TeaModel}
 *
 * <p>DescribeEndpointSwitchStatusResponse</p>
 */
public class DescribeEndpointSwitchStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeEndpointSwitchStatusResponseBody body;

    private DescribeEndpointSwitchStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeEndpointSwitchStatusResponse create() {
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
    public DescribeEndpointSwitchStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeEndpointSwitchStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeEndpointSwitchStatusResponseBody body);

        @Override
        DescribeEndpointSwitchStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeEndpointSwitchStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeEndpointSwitchStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeEndpointSwitchStatusResponse response) {
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
        public Builder body(DescribeEndpointSwitchStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeEndpointSwitchStatusResponse build() {
            return new DescribeEndpointSwitchStatusResponse(this);
        } 

    } 

}
