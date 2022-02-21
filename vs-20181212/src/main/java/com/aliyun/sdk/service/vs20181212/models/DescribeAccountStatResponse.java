// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAccountStatResponse} extends {@link TeaModel}
 *
 * <p>DescribeAccountStatResponse</p>
 */
public class DescribeAccountStatResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAccountStatResponseBody body;

    private DescribeAccountStatResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAccountStatResponse create() {
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
    public DescribeAccountStatResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAccountStatResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAccountStatResponseBody body);

        @Override
        DescribeAccountStatResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAccountStatResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAccountStatResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAccountStatResponse response) {
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
        public Builder body(DescribeAccountStatResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAccountStatResponse build() {
            return new DescribeAccountStatResponse(this);
        } 

    } 

}
