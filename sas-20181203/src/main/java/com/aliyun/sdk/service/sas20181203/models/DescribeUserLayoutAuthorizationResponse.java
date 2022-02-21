// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserLayoutAuthorizationResponse} extends {@link TeaModel}
 *
 * <p>DescribeUserLayoutAuthorizationResponse</p>
 */
public class DescribeUserLayoutAuthorizationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeUserLayoutAuthorizationResponseBody body;

    private DescribeUserLayoutAuthorizationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeUserLayoutAuthorizationResponse create() {
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
    public DescribeUserLayoutAuthorizationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeUserLayoutAuthorizationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeUserLayoutAuthorizationResponseBody body);

        @Override
        DescribeUserLayoutAuthorizationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeUserLayoutAuthorizationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeUserLayoutAuthorizationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeUserLayoutAuthorizationResponse response) {
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
        public Builder body(DescribeUserLayoutAuthorizationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeUserLayoutAuthorizationResponse build() {
            return new DescribeUserLayoutAuthorizationResponse(this);
        } 

    } 

}
