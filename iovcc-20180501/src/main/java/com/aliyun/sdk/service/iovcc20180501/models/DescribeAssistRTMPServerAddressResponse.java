// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAssistRTMPServerAddressResponse} extends {@link TeaModel}
 *
 * <p>DescribeAssistRTMPServerAddressResponse</p>
 */
public class DescribeAssistRTMPServerAddressResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAssistRTMPServerAddressResponseBody body;

    private DescribeAssistRTMPServerAddressResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAssistRTMPServerAddressResponse create() {
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
    public DescribeAssistRTMPServerAddressResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAssistRTMPServerAddressResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAssistRTMPServerAddressResponseBody body);

        @Override
        DescribeAssistRTMPServerAddressResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAssistRTMPServerAddressResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAssistRTMPServerAddressResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAssistRTMPServerAddressResponse response) {
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
        public Builder body(DescribeAssistRTMPServerAddressResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAssistRTMPServerAddressResponse build() {
            return new DescribeAssistRTMPServerAddressResponse(this);
        } 

    } 

}
