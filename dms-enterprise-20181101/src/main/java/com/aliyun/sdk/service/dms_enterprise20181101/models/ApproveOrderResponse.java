// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApproveOrderResponse} extends {@link TeaModel}
 *
 * <p>ApproveOrderResponse</p>
 */
public class ApproveOrderResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ApproveOrderResponseBody body;

    private ApproveOrderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ApproveOrderResponse create() {
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
    public ApproveOrderResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ApproveOrderResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ApproveOrderResponseBody body);

        @Override
        ApproveOrderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ApproveOrderResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ApproveOrderResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ApproveOrderResponse response) {
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
        public Builder body(ApproveOrderResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ApproveOrderResponse build() {
            return new ApproveOrderResponse(this);
        } 

    } 

}
