// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInitializeVariableResponse} extends {@link TeaModel}
 *
 * <p>DescribeDBInitializeVariableResponse</p>
 */
public class DescribeDBInitializeVariableResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDBInitializeVariableResponseBody body;

    private DescribeDBInitializeVariableResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDBInitializeVariableResponse create() {
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
    public DescribeDBInitializeVariableResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDBInitializeVariableResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDBInitializeVariableResponseBody body);

        @Override
        DescribeDBInitializeVariableResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDBInitializeVariableResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDBInitializeVariableResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDBInitializeVariableResponse response) {
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
        public Builder body(DescribeDBInitializeVariableResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDBInitializeVariableResponse build() {
            return new DescribeDBInitializeVariableResponse(this);
        } 

    } 

}
