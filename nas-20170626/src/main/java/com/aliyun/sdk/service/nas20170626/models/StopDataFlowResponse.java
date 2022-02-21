// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopDataFlowResponse} extends {@link TeaModel}
 *
 * <p>StopDataFlowResponse</p>
 */
public class StopDataFlowResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopDataFlowResponseBody body;

    private StopDataFlowResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopDataFlowResponse create() {
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
    public StopDataFlowResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopDataFlowResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopDataFlowResponseBody body);

        @Override
        StopDataFlowResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopDataFlowResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopDataFlowResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopDataFlowResponse response) {
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
        public Builder body(StopDataFlowResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopDataFlowResponse build() {
            return new StopDataFlowResponse(this);
        } 

    } 

}
