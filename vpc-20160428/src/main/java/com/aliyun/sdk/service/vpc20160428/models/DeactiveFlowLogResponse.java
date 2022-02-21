// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeactiveFlowLogResponse} extends {@link TeaModel}
 *
 * <p>DeactiveFlowLogResponse</p>
 */
public class DeactiveFlowLogResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeactiveFlowLogResponseBody body;

    private DeactiveFlowLogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeactiveFlowLogResponse create() {
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
    public DeactiveFlowLogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeactiveFlowLogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeactiveFlowLogResponseBody body);

        @Override
        DeactiveFlowLogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeactiveFlowLogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeactiveFlowLogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeactiveFlowLogResponse response) {
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
        public Builder body(DeactiveFlowLogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeactiveFlowLogResponse build() {
            return new DeactiveFlowLogResponse(this);
        } 

    } 

}
