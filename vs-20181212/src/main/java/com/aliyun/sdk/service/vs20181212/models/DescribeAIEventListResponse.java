// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAIEventListResponse} extends {@link TeaModel}
 *
 * <p>DescribeAIEventListResponse</p>
 */
public class DescribeAIEventListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAIEventListResponseBody body;

    private DescribeAIEventListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAIEventListResponse create() {
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
    public DescribeAIEventListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAIEventListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAIEventListResponseBody body);

        @Override
        DescribeAIEventListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAIEventListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAIEventListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAIEventListResponse response) {
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
        public Builder body(DescribeAIEventListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAIEventListResponse build() {
            return new DescribeAIEventListResponse(this);
        } 

    } 

}
