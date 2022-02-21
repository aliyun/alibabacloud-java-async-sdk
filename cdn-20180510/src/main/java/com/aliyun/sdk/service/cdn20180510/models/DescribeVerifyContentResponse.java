// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVerifyContentResponse} extends {@link TeaModel}
 *
 * <p>DescribeVerifyContentResponse</p>
 */
public class DescribeVerifyContentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeVerifyContentResponseBody body;

    private DescribeVerifyContentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeVerifyContentResponse create() {
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
    public DescribeVerifyContentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeVerifyContentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeVerifyContentResponseBody body);

        @Override
        DescribeVerifyContentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeVerifyContentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeVerifyContentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeVerifyContentResponse response) {
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
        public Builder body(DescribeVerifyContentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeVerifyContentResponse build() {
            return new DescribeVerifyContentResponse(this);
        } 

    } 

}
