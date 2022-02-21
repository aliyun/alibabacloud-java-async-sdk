// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTableListByTypeResponse} extends {@link TeaModel}
 *
 * <p>DescribeTableListByTypeResponse</p>
 */
public class DescribeTableListByTypeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeTableListByTypeResponseBody body;

    private DescribeTableListByTypeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeTableListByTypeResponse create() {
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
    public DescribeTableListByTypeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeTableListByTypeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeTableListByTypeResponseBody body);

        @Override
        DescribeTableListByTypeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeTableListByTypeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeTableListByTypeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeTableListByTypeResponse response) {
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
        public Builder body(DescribeTableListByTypeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeTableListByTypeResponse build() {
            return new DescribeTableListByTypeResponse(this);
        } 

    } 

}
