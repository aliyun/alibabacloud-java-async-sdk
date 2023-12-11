// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApprovePermissionApplyOrderResponse} extends {@link TeaModel}
 *
 * <p>ApprovePermissionApplyOrderResponse</p>
 */
public class ApprovePermissionApplyOrderResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ApprovePermissionApplyOrderResponseBody body;

    private ApprovePermissionApplyOrderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ApprovePermissionApplyOrderResponse create() {
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
    public ApprovePermissionApplyOrderResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ApprovePermissionApplyOrderResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ApprovePermissionApplyOrderResponseBody body);

        @Override
        ApprovePermissionApplyOrderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ApprovePermissionApplyOrderResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ApprovePermissionApplyOrderResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ApprovePermissionApplyOrderResponse response) {
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
        public Builder body(ApprovePermissionApplyOrderResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ApprovePermissionApplyOrderResponse build() {
            return new ApprovePermissionApplyOrderResponse(this);
        } 

    } 

}
