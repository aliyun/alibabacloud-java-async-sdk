// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCnameDetailResponse} extends {@link TeaModel}
 *
 * <p>GetCnameDetailResponse</p>
 */
public class GetCnameDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetCnameDetailResponseBody body;

    private GetCnameDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetCnameDetailResponse create() {
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
    public GetCnameDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetCnameDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetCnameDetailResponseBody body);

        @Override
        GetCnameDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetCnameDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetCnameDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetCnameDetailResponse response) {
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
        public Builder body(GetCnameDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetCnameDetailResponse build() {
            return new GetCnameDetailResponse(this);
        } 

    } 

}
