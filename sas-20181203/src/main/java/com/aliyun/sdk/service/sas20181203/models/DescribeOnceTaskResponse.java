// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOnceTaskResponse} extends {@link TeaModel}
 *
 * <p>DescribeOnceTaskResponse</p>
 */
public class DescribeOnceTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeOnceTaskResponseBody body;

    private DescribeOnceTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeOnceTaskResponse create() {
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
    public DescribeOnceTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeOnceTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeOnceTaskResponseBody body);

        @Override
        DescribeOnceTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeOnceTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeOnceTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeOnceTaskResponse response) {
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
        public Builder body(DescribeOnceTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeOnceTaskResponse build() {
            return new DescribeOnceTaskResponse(this);
        } 

    } 

}
