// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcOperationPurchaseLandResponse} extends {@link TeaModel}
 *
 * <p>GetOcOperationPurchaseLandResponse</p>
 */
public class GetOcOperationPurchaseLandResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetOcOperationPurchaseLandResponseBody body;

    private GetOcOperationPurchaseLandResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetOcOperationPurchaseLandResponse create() {
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
    public GetOcOperationPurchaseLandResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOcOperationPurchaseLandResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetOcOperationPurchaseLandResponseBody body);

        @Override
        GetOcOperationPurchaseLandResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOcOperationPurchaseLandResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetOcOperationPurchaseLandResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOcOperationPurchaseLandResponse response) {
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
        public Builder body(GetOcOperationPurchaseLandResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOcOperationPurchaseLandResponse build() {
            return new GetOcOperationPurchaseLandResponse(this);
        } 

    } 

}
