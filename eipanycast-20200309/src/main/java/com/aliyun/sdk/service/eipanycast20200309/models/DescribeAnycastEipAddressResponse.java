// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eipanycast20200309.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAnycastEipAddressResponse} extends {@link TeaModel}
 *
 * <p>DescribeAnycastEipAddressResponse</p>
 */
public class DescribeAnycastEipAddressResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAnycastEipAddressResponseBody body;

    private DescribeAnycastEipAddressResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAnycastEipAddressResponse create() {
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
    public DescribeAnycastEipAddressResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAnycastEipAddressResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAnycastEipAddressResponseBody body);

        @Override
        DescribeAnycastEipAddressResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAnycastEipAddressResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAnycastEipAddressResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAnycastEipAddressResponse response) {
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
        public Builder body(DescribeAnycastEipAddressResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAnycastEipAddressResponse build() {
            return new DescribeAnycastEipAddressResponse(this);
        } 

    } 

}
