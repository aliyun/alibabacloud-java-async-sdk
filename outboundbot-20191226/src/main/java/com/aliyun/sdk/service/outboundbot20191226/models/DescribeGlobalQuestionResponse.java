// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGlobalQuestionResponse} extends {@link TeaModel}
 *
 * <p>DescribeGlobalQuestionResponse</p>
 */
public class DescribeGlobalQuestionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeGlobalQuestionResponseBody body;

    private DescribeGlobalQuestionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeGlobalQuestionResponse create() {
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
    public DescribeGlobalQuestionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeGlobalQuestionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeGlobalQuestionResponseBody body);

        @Override
        DescribeGlobalQuestionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeGlobalQuestionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeGlobalQuestionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeGlobalQuestionResponse response) {
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
        public Builder body(DescribeGlobalQuestionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeGlobalQuestionResponse build() {
            return new DescribeGlobalQuestionResponse(this);
        } 

    } 

}
