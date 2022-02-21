// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeConfigIndexResponse} extends {@link TeaModel}
 *
 * <p>DescribeConfigIndexResponse</p>
 */
public class DescribeConfigIndexResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeConfigIndexResponseBody body;

    private DescribeConfigIndexResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeConfigIndexResponse create() {
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
    public DescribeConfigIndexResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeConfigIndexResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeConfigIndexResponseBody body);

        @Override
        DescribeConfigIndexResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeConfigIndexResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeConfigIndexResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeConfigIndexResponse response) {
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
        public Builder body(DescribeConfigIndexResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeConfigIndexResponse build() {
            return new DescribeConfigIndexResponse(this);
        } 

    } 

}
