// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUdpReflectResponse} extends {@link TeaModel}
 *
 * <p>DescribeUdpReflectResponse</p>
 */
public class DescribeUdpReflectResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeUdpReflectResponseBody body;

    private DescribeUdpReflectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeUdpReflectResponse create() {
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
    public DescribeUdpReflectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeUdpReflectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeUdpReflectResponseBody body);

        @Override
        DescribeUdpReflectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeUdpReflectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeUdpReflectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeUdpReflectResponse response) {
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
        public Builder body(DescribeUdpReflectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeUdpReflectResponse build() {
            return new DescribeUdpReflectResponse(this);
        } 

    } 

}
