// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTotalAttackMaxFlowResponse} extends {@link TeaModel}
 *
 * <p>DescribeTotalAttackMaxFlowResponse</p>
 */
public class DescribeTotalAttackMaxFlowResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeTotalAttackMaxFlowResponseBody body;

    private DescribeTotalAttackMaxFlowResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeTotalAttackMaxFlowResponse create() {
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
    public DescribeTotalAttackMaxFlowResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeTotalAttackMaxFlowResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeTotalAttackMaxFlowResponseBody body);

        @Override
        DescribeTotalAttackMaxFlowResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeTotalAttackMaxFlowResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeTotalAttackMaxFlowResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeTotalAttackMaxFlowResponse response) {
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
        public Builder body(DescribeTotalAttackMaxFlowResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeTotalAttackMaxFlowResponse build() {
            return new DescribeTotalAttackMaxFlowResponse(this);
        } 

    } 

}
