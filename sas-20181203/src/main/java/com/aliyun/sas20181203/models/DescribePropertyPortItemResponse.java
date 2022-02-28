// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePropertyPortItemResponse} extends {@link TeaModel}
 *
 * <p>DescribePropertyPortItemResponse</p>
 */
public class DescribePropertyPortItemResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribePropertyPortItemResponseBody body;

    private DescribePropertyPortItemResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribePropertyPortItemResponse create() {
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
    public DescribePropertyPortItemResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePropertyPortItemResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribePropertyPortItemResponseBody body);

        @Override
        DescribePropertyPortItemResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePropertyPortItemResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribePropertyPortItemResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePropertyPortItemResponse response) {
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
        public Builder body(DescribePropertyPortItemResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePropertyPortItemResponse build() {
            return new DescribePropertyPortItemResponse(this);
        } 

    } 

}
