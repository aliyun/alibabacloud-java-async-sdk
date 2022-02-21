// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOwnerApplyOrderDetailResponse} extends {@link TeaModel}
 *
 * <p>GetOwnerApplyOrderDetailResponse</p>
 */
public class GetOwnerApplyOrderDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetOwnerApplyOrderDetailResponseBody body;

    private GetOwnerApplyOrderDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetOwnerApplyOrderDetailResponse create() {
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
    public GetOwnerApplyOrderDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOwnerApplyOrderDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetOwnerApplyOrderDetailResponseBody body);

        @Override
        GetOwnerApplyOrderDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOwnerApplyOrderDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetOwnerApplyOrderDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOwnerApplyOrderDetailResponse response) {
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
        public Builder body(GetOwnerApplyOrderDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOwnerApplyOrderDetailResponse build() {
            return new GetOwnerApplyOrderDetailResponse(this);
        } 

    } 

}
