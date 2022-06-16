// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xgippop20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFreeFlowInstanceResponse} extends {@link TeaModel}
 *
 * <p>GetFreeFlowInstanceResponse</p>
 */
public class GetFreeFlowInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetFreeFlowInstanceResponseBody body;

    private GetFreeFlowInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetFreeFlowInstanceResponse create() {
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
    public GetFreeFlowInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetFreeFlowInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetFreeFlowInstanceResponseBody body);

        @Override
        GetFreeFlowInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetFreeFlowInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetFreeFlowInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetFreeFlowInstanceResponse response) {
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
        public Builder body(GetFreeFlowInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetFreeFlowInstanceResponse build() {
            return new GetFreeFlowInstanceResponse(this);
        } 

    } 

}
