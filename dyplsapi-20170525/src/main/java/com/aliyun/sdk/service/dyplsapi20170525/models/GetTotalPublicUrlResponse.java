// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTotalPublicUrlResponse} extends {@link TeaModel}
 *
 * <p>GetTotalPublicUrlResponse</p>
 */
public class GetTotalPublicUrlResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetTotalPublicUrlResponseBody body;

    private GetTotalPublicUrlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetTotalPublicUrlResponse create() {
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
    public GetTotalPublicUrlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTotalPublicUrlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetTotalPublicUrlResponseBody body);

        @Override
        GetTotalPublicUrlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTotalPublicUrlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetTotalPublicUrlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTotalPublicUrlResponse response) {
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
        public Builder body(GetTotalPublicUrlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTotalPublicUrlResponse build() {
            return new GetTotalPublicUrlResponse(this);
        } 

    } 

}
