// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOutlineBindingResponse} extends {@link TeaModel}
 *
 * <p>DescribeOutlineBindingResponse</p>
 */
public class DescribeOutlineBindingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeOutlineBindingResponseBody body;

    private DescribeOutlineBindingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeOutlineBindingResponse create() {
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
    public DescribeOutlineBindingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeOutlineBindingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeOutlineBindingResponseBody body);

        @Override
        DescribeOutlineBindingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeOutlineBindingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeOutlineBindingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeOutlineBindingResponse response) {
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
        public Builder body(DescribeOutlineBindingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeOutlineBindingResponse build() {
            return new DescribeOutlineBindingResponse(this);
        } 

    } 

}
