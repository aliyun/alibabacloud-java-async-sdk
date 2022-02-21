// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMezzanineInfoResponse} extends {@link TeaModel}
 *
 * <p>GetMezzanineInfoResponse</p>
 */
public class GetMezzanineInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetMezzanineInfoResponseBody body;

    private GetMezzanineInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetMezzanineInfoResponse create() {
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
    public GetMezzanineInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetMezzanineInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetMezzanineInfoResponseBody body);

        @Override
        GetMezzanineInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetMezzanineInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetMezzanineInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetMezzanineInfoResponse response) {
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
        public Builder body(GetMezzanineInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetMezzanineInfoResponse build() {
            return new GetMezzanineInfoResponse(this);
        } 

    } 

}
