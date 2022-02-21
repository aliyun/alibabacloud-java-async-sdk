// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNodeDevicesInfoResponse} extends {@link TeaModel}
 *
 * <p>DescribeNodeDevicesInfoResponse</p>
 */
public class DescribeNodeDevicesInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeNodeDevicesInfoResponseBody body;

    private DescribeNodeDevicesInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeNodeDevicesInfoResponse create() {
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
    public DescribeNodeDevicesInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeNodeDevicesInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeNodeDevicesInfoResponseBody body);

        @Override
        DescribeNodeDevicesInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeNodeDevicesInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeNodeDevicesInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeNodeDevicesInfoResponse response) {
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
        public Builder body(DescribeNodeDevicesInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeNodeDevicesInfoResponse build() {
            return new DescribeNodeDevicesInfoResponse(this);
        } 

    } 

}
