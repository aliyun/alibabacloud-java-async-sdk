// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wfts20220212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLjxAccountInfoResponse} extends {@link TeaModel}
 *
 * <p>GetLjxAccountInfoResponse</p>
 */
public class GetLjxAccountInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetLjxAccountInfoResponseBody body;

    private GetLjxAccountInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetLjxAccountInfoResponse create() {
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
    public GetLjxAccountInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetLjxAccountInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetLjxAccountInfoResponseBody body);

        @Override
        GetLjxAccountInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetLjxAccountInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetLjxAccountInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetLjxAccountInfoResponse response) {
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
        public Builder body(GetLjxAccountInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetLjxAccountInfoResponse build() {
            return new GetLjxAccountInfoResponse(this);
        } 

    } 

}
