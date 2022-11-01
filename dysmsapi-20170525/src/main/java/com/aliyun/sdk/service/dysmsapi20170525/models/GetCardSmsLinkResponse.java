// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCardSmsLinkResponse} extends {@link TeaModel}
 *
 * <p>GetCardSmsLinkResponse</p>
 */
public class GetCardSmsLinkResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetCardSmsLinkResponseBody body;

    private GetCardSmsLinkResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetCardSmsLinkResponse create() {
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
    public GetCardSmsLinkResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetCardSmsLinkResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetCardSmsLinkResponseBody body);

        @Override
        GetCardSmsLinkResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetCardSmsLinkResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetCardSmsLinkResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetCardSmsLinkResponse response) {
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
        public Builder body(GetCardSmsLinkResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetCardSmsLinkResponse build() {
            return new GetCardSmsLinkResponse(this);
        } 

    } 

}
