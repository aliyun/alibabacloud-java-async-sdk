// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVerifySchemeResponse} extends {@link TeaModel}
 *
 * <p>DescribeVerifySchemeResponse</p>
 */
public class DescribeVerifySchemeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeVerifySchemeResponseBody body;

    private DescribeVerifySchemeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeVerifySchemeResponse create() {
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
    public DescribeVerifySchemeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeVerifySchemeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeVerifySchemeResponseBody body);

        @Override
        DescribeVerifySchemeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeVerifySchemeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeVerifySchemeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeVerifySchemeResponse response) {
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
        public Builder body(DescribeVerifySchemeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeVerifySchemeResponse build() {
            return new DescribeVerifySchemeResponse(this);
        } 

    } 

}
