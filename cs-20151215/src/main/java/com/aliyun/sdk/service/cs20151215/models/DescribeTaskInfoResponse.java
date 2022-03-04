// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTaskInfoResponse} extends {@link TeaModel}
 *
 * <p>DescribeTaskInfoResponse</p>
 */
public class DescribeTaskInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeTaskInfoResponseBody body;

    private DescribeTaskInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeTaskInfoResponse create() {
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
    public DescribeTaskInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeTaskInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeTaskInfoResponseBody body);

        @Override
        DescribeTaskInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeTaskInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeTaskInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeTaskInfoResponse response) {
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
        public Builder body(DescribeTaskInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeTaskInfoResponse build() {
            return new DescribeTaskInfoResponse(this);
        } 

    } 

}
