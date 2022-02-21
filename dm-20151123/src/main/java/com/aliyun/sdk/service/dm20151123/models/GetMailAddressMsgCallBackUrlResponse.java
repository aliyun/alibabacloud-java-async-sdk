// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMailAddressMsgCallBackUrlResponse} extends {@link TeaModel}
 *
 * <p>GetMailAddressMsgCallBackUrlResponse</p>
 */
public class GetMailAddressMsgCallBackUrlResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetMailAddressMsgCallBackUrlResponseBody body;

    private GetMailAddressMsgCallBackUrlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetMailAddressMsgCallBackUrlResponse create() {
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
    public GetMailAddressMsgCallBackUrlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetMailAddressMsgCallBackUrlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetMailAddressMsgCallBackUrlResponseBody body);

        @Override
        GetMailAddressMsgCallBackUrlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetMailAddressMsgCallBackUrlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetMailAddressMsgCallBackUrlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetMailAddressMsgCallBackUrlResponse response) {
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
        public Builder body(GetMailAddressMsgCallBackUrlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetMailAddressMsgCallBackUrlResponse build() {
            return new GetMailAddressMsgCallBackUrlResponse(this);
        } 

    } 

}
