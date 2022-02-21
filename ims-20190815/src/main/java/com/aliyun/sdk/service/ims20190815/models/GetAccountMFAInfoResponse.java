// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAccountMFAInfoResponse} extends {@link TeaModel}
 *
 * <p>GetAccountMFAInfoResponse</p>
 */
public class GetAccountMFAInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAccountMFAInfoResponseBody body;

    private GetAccountMFAInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAccountMFAInfoResponse create() {
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
    public GetAccountMFAInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAccountMFAInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAccountMFAInfoResponseBody body);

        @Override
        GetAccountMFAInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAccountMFAInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAccountMFAInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAccountMFAInfoResponse response) {
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
        public Builder body(GetAccountMFAInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAccountMFAInfoResponse build() {
            return new GetAccountMFAInfoResponse(this);
        } 

    } 

}
