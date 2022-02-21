// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAbolishApiTaskResponse} extends {@link TeaModel}
 *
 * <p>DescribeAbolishApiTaskResponse</p>
 */
public class DescribeAbolishApiTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAbolishApiTaskResponseBody body;

    private DescribeAbolishApiTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAbolishApiTaskResponse create() {
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
    public DescribeAbolishApiTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAbolishApiTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAbolishApiTaskResponseBody body);

        @Override
        DescribeAbolishApiTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAbolishApiTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAbolishApiTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAbolishApiTaskResponse response) {
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
        public Builder body(DescribeAbolishApiTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAbolishApiTaskResponse build() {
            return new DescribeAbolishApiTaskResponse(this);
        } 

    } 

}
