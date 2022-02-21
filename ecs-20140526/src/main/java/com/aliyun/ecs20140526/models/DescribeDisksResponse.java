// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDisksResponse} extends {@link TeaModel}
 *
 * <p>DescribeDisksResponse</p>
 */
public class DescribeDisksResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDisksResponseBody body;

    private DescribeDisksResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDisksResponse create() {
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
    public DescribeDisksResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDisksResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDisksResponseBody body);

        @Override
        DescribeDisksResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDisksResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDisksResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDisksResponse response) {
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
        public Builder body(DescribeDisksResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDisksResponse build() {
            return new DescribeDisksResponse(this);
        } 

    } 

}
