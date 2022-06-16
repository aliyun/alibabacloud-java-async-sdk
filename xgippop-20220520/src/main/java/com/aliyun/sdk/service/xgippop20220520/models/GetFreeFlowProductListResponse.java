// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xgippop20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFreeFlowProductListResponse} extends {@link TeaModel}
 *
 * <p>GetFreeFlowProductListResponse</p>
 */
public class GetFreeFlowProductListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetFreeFlowProductListResponseBody body;

    private GetFreeFlowProductListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetFreeFlowProductListResponse create() {
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
    public GetFreeFlowProductListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetFreeFlowProductListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetFreeFlowProductListResponseBody body);

        @Override
        GetFreeFlowProductListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetFreeFlowProductListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetFreeFlowProductListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetFreeFlowProductListResponse response) {
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
        public Builder body(GetFreeFlowProductListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetFreeFlowProductListResponse build() {
            return new GetFreeFlowProductListResponse(this);
        } 

    } 

}
