// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVersionsResponse} extends {@link TeaModel}
 *
 * <p>DescribeVersionsResponse</p>
 */
public class DescribeVersionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeVersionsResponseBody body;

    private DescribeVersionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeVersionsResponse create() {
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
    public DescribeVersionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeVersionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeVersionsResponseBody body);

        @Override
        DescribeVersionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeVersionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeVersionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeVersionsResponse response) {
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
        public Builder body(DescribeVersionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeVersionsResponse build() {
            return new DescribeVersionsResponse(this);
        } 

    } 

}
