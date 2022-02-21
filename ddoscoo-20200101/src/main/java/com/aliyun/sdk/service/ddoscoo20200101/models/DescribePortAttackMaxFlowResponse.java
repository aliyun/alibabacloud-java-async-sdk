// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePortAttackMaxFlowResponse} extends {@link TeaModel}
 *
 * <p>DescribePortAttackMaxFlowResponse</p>
 */
public class DescribePortAttackMaxFlowResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribePortAttackMaxFlowResponseBody body;

    private DescribePortAttackMaxFlowResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribePortAttackMaxFlowResponse create() {
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
    public DescribePortAttackMaxFlowResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePortAttackMaxFlowResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribePortAttackMaxFlowResponseBody body);

        @Override
        DescribePortAttackMaxFlowResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePortAttackMaxFlowResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribePortAttackMaxFlowResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePortAttackMaxFlowResponse response) {
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
        public Builder body(DescribePortAttackMaxFlowResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePortAttackMaxFlowResponse build() {
            return new DescribePortAttackMaxFlowResponse(this);
        } 

    } 

}
