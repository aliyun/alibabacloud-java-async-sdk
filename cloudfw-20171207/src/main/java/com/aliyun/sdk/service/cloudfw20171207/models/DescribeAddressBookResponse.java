// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAddressBookResponse} extends {@link TeaModel}
 *
 * <p>DescribeAddressBookResponse</p>
 */
public class DescribeAddressBookResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAddressBookResponseBody body;

    private DescribeAddressBookResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAddressBookResponse create() {
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
    public DescribeAddressBookResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAddressBookResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAddressBookResponseBody body);

        @Override
        DescribeAddressBookResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAddressBookResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAddressBookResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAddressBookResponse response) {
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
        public Builder body(DescribeAddressBookResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAddressBookResponse build() {
            return new DescribeAddressBookResponse(this);
        } 

    } 

}
