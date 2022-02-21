// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetImageInfoResponse} extends {@link TeaModel}
 *
 * <p>GetImageInfoResponse</p>
 */
public class GetImageInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetImageInfoResponseBody body;

    private GetImageInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetImageInfoResponse create() {
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
    public GetImageInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetImageInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetImageInfoResponseBody body);

        @Override
        GetImageInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetImageInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetImageInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetImageInfoResponse response) {
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
        public Builder body(GetImageInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetImageInfoResponse build() {
            return new GetImageInfoResponse(this);
        } 

    } 

}
