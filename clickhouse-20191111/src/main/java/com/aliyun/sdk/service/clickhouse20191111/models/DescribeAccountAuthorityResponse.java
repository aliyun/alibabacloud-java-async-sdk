// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAccountAuthorityResponse} extends {@link TeaModel}
 *
 * <p>DescribeAccountAuthorityResponse</p>
 */
public class DescribeAccountAuthorityResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAccountAuthorityResponseBody body;

    private DescribeAccountAuthorityResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAccountAuthorityResponse create() {
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
    public DescribeAccountAuthorityResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAccountAuthorityResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAccountAuthorityResponseBody body);

        @Override
        DescribeAccountAuthorityResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAccountAuthorityResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAccountAuthorityResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAccountAuthorityResponse response) {
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
        public Builder body(DescribeAccountAuthorityResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAccountAuthorityResponse build() {
            return new DescribeAccountAuthorityResponse(this);
        } 

    } 

}
