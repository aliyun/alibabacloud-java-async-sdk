// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xgippop20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQosFlowUsageResponse} extends {@link TeaModel}
 *
 * <p>GetQosFlowUsageResponse</p>
 */
public class GetQosFlowUsageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetQosFlowUsageResponseBody body;

    private GetQosFlowUsageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetQosFlowUsageResponse create() {
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
    public GetQosFlowUsageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetQosFlowUsageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetQosFlowUsageResponseBody body);

        @Override
        GetQosFlowUsageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetQosFlowUsageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetQosFlowUsageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetQosFlowUsageResponse response) {
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
        public Builder body(GetQosFlowUsageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetQosFlowUsageResponse build() {
            return new GetQosFlowUsageResponse(this);
        } 

    } 

}
