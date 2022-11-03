// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xgippop20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInventoryInfoResponse} extends {@link TeaModel}
 *
 * <p>GetInventoryInfoResponse</p>
 */
public class GetInventoryInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetInventoryInfoResponseBody body;

    private GetInventoryInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetInventoryInfoResponse create() {
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
    public GetInventoryInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetInventoryInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetInventoryInfoResponseBody body);

        @Override
        GetInventoryInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetInventoryInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetInventoryInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetInventoryInfoResponse response) {
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
        public Builder body(GetInventoryInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetInventoryInfoResponse build() {
            return new GetInventoryInfoResponse(this);
        } 

    } 

}
