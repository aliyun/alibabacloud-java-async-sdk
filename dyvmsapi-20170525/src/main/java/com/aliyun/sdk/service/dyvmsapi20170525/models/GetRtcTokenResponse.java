// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRtcTokenResponse} extends {@link TeaModel}
 *
 * <p>GetRtcTokenResponse</p>
 */
public class GetRtcTokenResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetRtcTokenResponseBody body;

    private GetRtcTokenResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetRtcTokenResponse create() {
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
    public GetRtcTokenResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetRtcTokenResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetRtcTokenResponseBody body);

        @Override
        GetRtcTokenResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetRtcTokenResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetRtcTokenResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetRtcTokenResponse response) {
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
        public Builder body(GetRtcTokenResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetRtcTokenResponse build() {
            return new GetRtcTokenResponse(this);
        } 

    } 

}
