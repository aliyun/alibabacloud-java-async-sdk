// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPermApplyOrderDetailResponse} extends {@link TeaModel}
 *
 * <p>GetPermApplyOrderDetailResponse</p>
 */
public class GetPermApplyOrderDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetPermApplyOrderDetailResponseBody body;

    private GetPermApplyOrderDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetPermApplyOrderDetailResponse create() {
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
    public GetPermApplyOrderDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetPermApplyOrderDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetPermApplyOrderDetailResponseBody body);

        @Override
        GetPermApplyOrderDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetPermApplyOrderDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetPermApplyOrderDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetPermApplyOrderDetailResponse response) {
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
        public Builder body(GetPermApplyOrderDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetPermApplyOrderDetailResponse build() {
            return new GetPermApplyOrderDetailResponse(this);
        } 

    } 

}
