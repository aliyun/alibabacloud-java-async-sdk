// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDialogFlowResponse} extends {@link TeaModel}
 *
 * <p>DescribeDialogFlowResponse</p>
 */
public class DescribeDialogFlowResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDialogFlowResponseBody body;

    private DescribeDialogFlowResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDialogFlowResponse create() {
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
    public DescribeDialogFlowResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDialogFlowResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDialogFlowResponseBody body);

        @Override
        DescribeDialogFlowResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDialogFlowResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDialogFlowResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDialogFlowResponse response) {
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
        public Builder body(DescribeDialogFlowResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDialogFlowResponse build() {
            return new DescribeDialogFlowResponse(this);
        } 

    } 

}
