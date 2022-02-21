// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAccountKmsStatusResponse} extends {@link TeaModel}
 *
 * <p>DescribeAccountKmsStatusResponse</p>
 */
public class DescribeAccountKmsStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAccountKmsStatusResponseBody body;

    private DescribeAccountKmsStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAccountKmsStatusResponse create() {
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
    public DescribeAccountKmsStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAccountKmsStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAccountKmsStatusResponseBody body);

        @Override
        DescribeAccountKmsStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAccountKmsStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAccountKmsStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAccountKmsStatusResponse response) {
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
        public Builder body(DescribeAccountKmsStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAccountKmsStatusResponse build() {
            return new DescribeAccountKmsStatusResponse(this);
        } 

    } 

}
