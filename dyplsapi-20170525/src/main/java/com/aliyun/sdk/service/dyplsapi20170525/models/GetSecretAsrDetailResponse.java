// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSecretAsrDetailResponse} extends {@link TeaModel}
 *
 * <p>GetSecretAsrDetailResponse</p>
 */
public class GetSecretAsrDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSecretAsrDetailResponseBody body;

    private GetSecretAsrDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSecretAsrDetailResponse create() {
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
    public GetSecretAsrDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSecretAsrDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSecretAsrDetailResponseBody body);

        @Override
        GetSecretAsrDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSecretAsrDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSecretAsrDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSecretAsrDetailResponse response) {
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
        public Builder body(GetSecretAsrDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSecretAsrDetailResponse build() {
            return new GetSecretAsrDetailResponse(this);
        } 

    } 

}
