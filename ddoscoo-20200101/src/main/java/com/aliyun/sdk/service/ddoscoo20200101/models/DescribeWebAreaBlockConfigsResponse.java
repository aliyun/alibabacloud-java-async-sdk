// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWebAreaBlockConfigsResponse} extends {@link TeaModel}
 *
 * <p>DescribeWebAreaBlockConfigsResponse</p>
 */
public class DescribeWebAreaBlockConfigsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeWebAreaBlockConfigsResponseBody body;

    private DescribeWebAreaBlockConfigsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeWebAreaBlockConfigsResponse create() {
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
    public DescribeWebAreaBlockConfigsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeWebAreaBlockConfigsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeWebAreaBlockConfigsResponseBody body);

        @Override
        DescribeWebAreaBlockConfigsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeWebAreaBlockConfigsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeWebAreaBlockConfigsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeWebAreaBlockConfigsResponse response) {
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
        public Builder body(DescribeWebAreaBlockConfigsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeWebAreaBlockConfigsResponse build() {
            return new DescribeWebAreaBlockConfigsResponse(this);
        } 

    } 

}
