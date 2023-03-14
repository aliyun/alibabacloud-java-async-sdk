// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceDetailsResponse} extends {@link TeaModel}
 *
 * <p>DescribeInstanceDetailsResponse</p>
 */
public class DescribeInstanceDetailsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeInstanceDetailsResponseBody body;

    private DescribeInstanceDetailsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeInstanceDetailsResponse create() {
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
    public DescribeInstanceDetailsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeInstanceDetailsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeInstanceDetailsResponseBody body);

        @Override
        DescribeInstanceDetailsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeInstanceDetailsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeInstanceDetailsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeInstanceDetailsResponse response) {
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
        public Builder body(DescribeInstanceDetailsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeInstanceDetailsResponse build() {
            return new DescribeInstanceDetailsResponse(this);
        } 

    } 

}
