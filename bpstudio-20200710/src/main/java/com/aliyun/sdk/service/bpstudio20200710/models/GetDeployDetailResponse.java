// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bpstudio20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDeployDetailResponse} extends {@link TeaModel}
 *
 * <p>GetDeployDetailResponse</p>
 */
public class GetDeployDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDeployDetailResponseBody body;

    private GetDeployDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDeployDetailResponse create() {
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
    public GetDeployDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDeployDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDeployDetailResponseBody body);

        @Override
        GetDeployDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDeployDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDeployDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDeployDetailResponse response) {
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
        public Builder body(GetDeployDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDeployDetailResponse build() {
            return new GetDeployDetailResponse(this);
        } 

    } 

}
