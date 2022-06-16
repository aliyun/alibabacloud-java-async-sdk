// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xgippop20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFreeFlowUsageStatisticResponse} extends {@link TeaModel}
 *
 * <p>GetFreeFlowUsageStatisticResponse</p>
 */
public class GetFreeFlowUsageStatisticResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetFreeFlowUsageStatisticResponseBody body;

    private GetFreeFlowUsageStatisticResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetFreeFlowUsageStatisticResponse create() {
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
    public GetFreeFlowUsageStatisticResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetFreeFlowUsageStatisticResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetFreeFlowUsageStatisticResponseBody body);

        @Override
        GetFreeFlowUsageStatisticResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetFreeFlowUsageStatisticResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetFreeFlowUsageStatisticResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetFreeFlowUsageStatisticResponse response) {
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
        public Builder body(GetFreeFlowUsageStatisticResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetFreeFlowUsageStatisticResponse build() {
            return new GetFreeFlowUsageStatisticResponse(this);
        } 

    } 

}
