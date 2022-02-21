// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAssistWSServerAddressResponse} extends {@link TeaModel}
 *
 * <p>DescribeAssistWSServerAddressResponse</p>
 */
public class DescribeAssistWSServerAddressResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAssistWSServerAddressResponseBody body;

    private DescribeAssistWSServerAddressResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAssistWSServerAddressResponse create() {
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
    public DescribeAssistWSServerAddressResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAssistWSServerAddressResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAssistWSServerAddressResponseBody body);

        @Override
        DescribeAssistWSServerAddressResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAssistWSServerAddressResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAssistWSServerAddressResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAssistWSServerAddressResponse response) {
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
        public Builder body(DescribeAssistWSServerAddressResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAssistWSServerAddressResponse build() {
            return new DescribeAssistWSServerAddressResponse(this);
        } 

    } 

}
