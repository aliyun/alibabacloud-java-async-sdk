// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20200201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBindersResponse} extends {@link TeaModel}
 *
 * <p>DescribeBindersResponse</p>
 */
public class DescribeBindersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeBindersResponseBody body;

    private DescribeBindersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeBindersResponse create() {
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
    public DescribeBindersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeBindersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeBindersResponseBody body);

        @Override
        DescribeBindersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeBindersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeBindersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeBindersResponse response) {
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
        public Builder body(DescribeBindersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeBindersResponse build() {
            return new DescribeBindersResponse(this);
        } 

    } 

}
