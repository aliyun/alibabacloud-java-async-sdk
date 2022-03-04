// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescirbeWorkflowResponse} extends {@link TeaModel}
 *
 * <p>DescirbeWorkflowResponse</p>
 */
public class DescirbeWorkflowResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescirbeWorkflowResponseBody body;

    private DescirbeWorkflowResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescirbeWorkflowResponse create() {
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
    public DescirbeWorkflowResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescirbeWorkflowResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescirbeWorkflowResponseBody body);

        @Override
        DescirbeWorkflowResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescirbeWorkflowResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescirbeWorkflowResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescirbeWorkflowResponse response) {
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
        public Builder body(DescirbeWorkflowResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescirbeWorkflowResponse build() {
            return new DescirbeWorkflowResponse(this);
        } 

    } 

}
