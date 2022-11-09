// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeActiveOperationTaskResponse} extends {@link TeaModel}
 *
 * <p>DescribeActiveOperationTaskResponse</p>
 */
public class DescribeActiveOperationTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeActiveOperationTaskResponseBody body;

    private DescribeActiveOperationTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeActiveOperationTaskResponse create() {
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
    public DescribeActiveOperationTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeActiveOperationTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeActiveOperationTaskResponseBody body);

        @Override
        DescribeActiveOperationTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeActiveOperationTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeActiveOperationTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeActiveOperationTaskResponse response) {
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
        public Builder body(DescribeActiveOperationTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeActiveOperationTaskResponse build() {
            return new DescribeActiveOperationTaskResponse(this);
        } 

    } 

}
