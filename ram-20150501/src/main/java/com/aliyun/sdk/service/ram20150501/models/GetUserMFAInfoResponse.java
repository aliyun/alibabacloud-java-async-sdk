// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserMFAInfoResponse} extends {@link TeaModel}
 *
 * <p>GetUserMFAInfoResponse</p>
 */
public class GetUserMFAInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetUserMFAInfoResponseBody body;

    private GetUserMFAInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetUserMFAInfoResponse create() {
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
    public GetUserMFAInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetUserMFAInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetUserMFAInfoResponseBody body);

        @Override
        GetUserMFAInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetUserMFAInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetUserMFAInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetUserMFAInfoResponse response) {
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
        public Builder body(GetUserMFAInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetUserMFAInfoResponse build() {
            return new GetUserMFAInfoResponse(this);
        } 

    } 

}
