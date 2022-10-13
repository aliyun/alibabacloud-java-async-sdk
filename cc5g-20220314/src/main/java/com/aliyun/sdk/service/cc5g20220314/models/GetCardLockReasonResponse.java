// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCardLockReasonResponse} extends {@link TeaModel}
 *
 * <p>GetCardLockReasonResponse</p>
 */
public class GetCardLockReasonResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetCardLockReasonResponseBody body;

    private GetCardLockReasonResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetCardLockReasonResponse create() {
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
    public GetCardLockReasonResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetCardLockReasonResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetCardLockReasonResponseBody body);

        @Override
        GetCardLockReasonResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetCardLockReasonResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetCardLockReasonResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetCardLockReasonResponse response) {
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
        public Builder body(GetCardLockReasonResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetCardLockReasonResponse build() {
            return new GetCardLockReasonResponse(this);
        } 

    } 

}
