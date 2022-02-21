// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeActiveOperationTaskTypeResponse} extends {@link TeaModel}
 *
 * <p>DescribeActiveOperationTaskTypeResponse</p>
 */
public class DescribeActiveOperationTaskTypeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeActiveOperationTaskTypeResponseBody body;

    private DescribeActiveOperationTaskTypeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeActiveOperationTaskTypeResponse create() {
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
    public DescribeActiveOperationTaskTypeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeActiveOperationTaskTypeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeActiveOperationTaskTypeResponseBody body);

        @Override
        DescribeActiveOperationTaskTypeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeActiveOperationTaskTypeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeActiveOperationTaskTypeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeActiveOperationTaskTypeResponse response) {
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
        public Builder body(DescribeActiveOperationTaskTypeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeActiveOperationTaskTypeResponse build() {
            return new DescribeActiveOperationTaskTypeResponse(this);
        } 

    } 

}
