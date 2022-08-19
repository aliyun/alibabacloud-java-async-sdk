// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eiam.dev.models.*;

/**
 * {@link GetUserIdByPhoneNumberResponse} extends {@link TeaModel}
 *
 * <p>GetUserIdByPhoneNumberResponse</p>
 */
public class GetUserIdByPhoneNumberResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetUserIdByPhoneNumberResponseBody body;

    private GetUserIdByPhoneNumberResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetUserIdByPhoneNumberResponse create() {
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
    public GetUserIdByPhoneNumberResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetUserIdByPhoneNumberResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetUserIdByPhoneNumberResponseBody body);

        @Override
        GetUserIdByPhoneNumberResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetUserIdByPhoneNumberResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetUserIdByPhoneNumberResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetUserIdByPhoneNumberResponse response) {
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
        public Builder body(GetUserIdByPhoneNumberResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetUserIdByPhoneNumberResponse build() {
            return new GetUserIdByPhoneNumberResponse(this);
        } 

    } 

}
