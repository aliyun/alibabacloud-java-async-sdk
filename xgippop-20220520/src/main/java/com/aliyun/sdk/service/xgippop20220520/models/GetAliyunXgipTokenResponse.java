// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xgippop20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAliyunXgipTokenResponse} extends {@link TeaModel}
 *
 * <p>GetAliyunXgipTokenResponse</p>
 */
public class GetAliyunXgipTokenResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAliyunXgipTokenResponseBody body;

    private GetAliyunXgipTokenResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAliyunXgipTokenResponse create() {
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
    public GetAliyunXgipTokenResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAliyunXgipTokenResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAliyunXgipTokenResponseBody body);

        @Override
        GetAliyunXgipTokenResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAliyunXgipTokenResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAliyunXgipTokenResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAliyunXgipTokenResponse response) {
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
        public Builder body(GetAliyunXgipTokenResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAliyunXgipTokenResponse build() {
            return new GetAliyunXgipTokenResponse(this);
        } 

    } 

}
