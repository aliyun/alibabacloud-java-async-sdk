// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserByAliyunUidResponse} extends {@link TeaModel}
 *
 * <p>GetUserByAliyunUidResponse</p>
 */
public class GetUserByAliyunUidResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetUserByAliyunUidResponseBody body;

    private GetUserByAliyunUidResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetUserByAliyunUidResponse create() {
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
    public GetUserByAliyunUidResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetUserByAliyunUidResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetUserByAliyunUidResponseBody body);

        @Override
        GetUserByAliyunUidResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetUserByAliyunUidResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetUserByAliyunUidResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetUserByAliyunUidResponse response) {
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
        public Builder body(GetUserByAliyunUidResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetUserByAliyunUidResponse build() {
            return new GetUserByAliyunUidResponse(this);
        } 

    } 

}
