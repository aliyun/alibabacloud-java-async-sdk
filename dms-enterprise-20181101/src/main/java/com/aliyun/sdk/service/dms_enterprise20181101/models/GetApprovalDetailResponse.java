// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetApprovalDetailResponse} extends {@link TeaModel}
 *
 * <p>GetApprovalDetailResponse</p>
 */
public class GetApprovalDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetApprovalDetailResponseBody body;

    private GetApprovalDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetApprovalDetailResponse create() {
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
    public GetApprovalDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetApprovalDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetApprovalDetailResponseBody body);

        @Override
        GetApprovalDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetApprovalDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetApprovalDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetApprovalDetailResponse response) {
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
        public Builder body(GetApprovalDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetApprovalDetailResponse build() {
            return new GetApprovalDetailResponse(this);
        } 

    } 

}
