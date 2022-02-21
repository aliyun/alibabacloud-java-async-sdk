// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSenderAddressListResponse} extends {@link TeaModel}
 *
 * <p>GetSenderAddressListResponse</p>
 */
public class GetSenderAddressListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSenderAddressListResponseBody body;

    private GetSenderAddressListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSenderAddressListResponse create() {
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
    public GetSenderAddressListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSenderAddressListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSenderAddressListResponseBody body);

        @Override
        GetSenderAddressListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSenderAddressListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSenderAddressListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSenderAddressListResponse response) {
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
        public Builder body(GetSenderAddressListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSenderAddressListResponse build() {
            return new GetSenderAddressListResponse(this);
        } 

    } 

}
