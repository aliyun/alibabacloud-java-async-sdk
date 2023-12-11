// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPermissionApplyOrderDetailResponse} extends {@link TeaModel}
 *
 * <p>GetPermissionApplyOrderDetailResponse</p>
 */
public class GetPermissionApplyOrderDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetPermissionApplyOrderDetailResponseBody body;

    private GetPermissionApplyOrderDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetPermissionApplyOrderDetailResponse create() {
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
    public GetPermissionApplyOrderDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetPermissionApplyOrderDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetPermissionApplyOrderDetailResponseBody body);

        @Override
        GetPermissionApplyOrderDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetPermissionApplyOrderDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetPermissionApplyOrderDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetPermissionApplyOrderDetailResponse response) {
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
        public Builder body(GetPermissionApplyOrderDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetPermissionApplyOrderDetailResponse build() {
            return new GetPermissionApplyOrderDetailResponse(this);
        } 

    } 

}
