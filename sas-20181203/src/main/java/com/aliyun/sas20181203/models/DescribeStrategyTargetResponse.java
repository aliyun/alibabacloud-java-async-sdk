// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeStrategyTargetResponse} extends {@link TeaModel}
 *
 * <p>DescribeStrategyTargetResponse</p>
 */
public class DescribeStrategyTargetResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeStrategyTargetResponseBody body;

    private DescribeStrategyTargetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeStrategyTargetResponse create() {
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
    public DescribeStrategyTargetResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeStrategyTargetResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeStrategyTargetResponseBody body);

        @Override
        DescribeStrategyTargetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeStrategyTargetResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeStrategyTargetResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeStrategyTargetResponse response) {
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
        public Builder body(DescribeStrategyTargetResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeStrategyTargetResponse build() {
            return new DescribeStrategyTargetResponse(this);
        } 

    } 

}
