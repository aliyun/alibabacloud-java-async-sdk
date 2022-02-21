// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeConfigMapResponse} extends {@link TeaModel}
 *
 * <p>DescribeConfigMapResponse</p>
 */
public class DescribeConfigMapResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeConfigMapResponseBody body;

    private DescribeConfigMapResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeConfigMapResponse create() {
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
    public DescribeConfigMapResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeConfigMapResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeConfigMapResponseBody body);

        @Override
        DescribeConfigMapResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeConfigMapResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeConfigMapResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeConfigMapResponse response) {
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
        public Builder body(DescribeConfigMapResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeConfigMapResponse build() {
            return new DescribeConfigMapResponse(this);
        } 

    } 

}
