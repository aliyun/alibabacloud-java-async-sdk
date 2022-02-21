// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeJobErrorCodeResponse} extends {@link TeaModel}
 *
 * <p>DescribeJobErrorCodeResponse</p>
 */
public class DescribeJobErrorCodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeJobErrorCodeResponseBody body;

    private DescribeJobErrorCodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeJobErrorCodeResponse create() {
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
    public DescribeJobErrorCodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeJobErrorCodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeJobErrorCodeResponseBody body);

        @Override
        DescribeJobErrorCodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeJobErrorCodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeJobErrorCodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeJobErrorCodeResponse response) {
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
        public Builder body(DescribeJobErrorCodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeJobErrorCodeResponse build() {
            return new DescribeJobErrorCodeResponse(this);
        } 

    } 

}
