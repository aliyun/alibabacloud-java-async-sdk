// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCallInfoResponse} extends {@link TeaModel}
 *
 * <p>GetCallInfoResponse</p>
 */
public class GetCallInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetCallInfoResponseBody body;

    private GetCallInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetCallInfoResponse create() {
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
    public GetCallInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetCallInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetCallInfoResponseBody body);

        @Override
        GetCallInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetCallInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetCallInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetCallInfoResponse response) {
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
        public Builder body(GetCallInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetCallInfoResponse build() {
            return new GetCallInfoResponse(this);
        } 

    } 

}
