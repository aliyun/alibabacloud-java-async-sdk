// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAuthorizedApisResponse} extends {@link TeaModel}
 *
 * <p>DescribeAuthorizedApisResponse</p>
 */
public class DescribeAuthorizedApisResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAuthorizedApisResponseBody body;

    private DescribeAuthorizedApisResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAuthorizedApisResponse create() {
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
    public DescribeAuthorizedApisResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAuthorizedApisResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAuthorizedApisResponseBody body);

        @Override
        DescribeAuthorizedApisResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAuthorizedApisResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAuthorizedApisResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAuthorizedApisResponse response) {
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
        public Builder body(DescribeAuthorizedApisResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAuthorizedApisResponse build() {
            return new DescribeAuthorizedApisResponse(this);
        } 

    } 

}
