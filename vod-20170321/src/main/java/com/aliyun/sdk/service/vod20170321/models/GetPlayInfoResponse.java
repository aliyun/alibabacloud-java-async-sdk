// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPlayInfoResponse} extends {@link TeaModel}
 *
 * <p>GetPlayInfoResponse</p>
 */
public class GetPlayInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetPlayInfoResponseBody body;

    private GetPlayInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetPlayInfoResponse create() {
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
    public GetPlayInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetPlayInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetPlayInfoResponseBody body);

        @Override
        GetPlayInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetPlayInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetPlayInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetPlayInfoResponse response) {
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
        public Builder body(GetPlayInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetPlayInfoResponse build() {
            return new GetPlayInfoResponse(this);
        } 

    } 

}
