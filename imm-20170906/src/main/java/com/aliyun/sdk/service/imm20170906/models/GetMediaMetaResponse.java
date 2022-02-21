// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMediaMetaResponse} extends {@link TeaModel}
 *
 * <p>GetMediaMetaResponse</p>
 */
public class GetMediaMetaResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetMediaMetaResponseBody body;

    private GetMediaMetaResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetMediaMetaResponse create() {
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
    public GetMediaMetaResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetMediaMetaResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetMediaMetaResponseBody body);

        @Override
        GetMediaMetaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetMediaMetaResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetMediaMetaResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetMediaMetaResponse response) {
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
        public Builder body(GetMediaMetaResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetMediaMetaResponse build() {
            return new GetMediaMetaResponse(this);
        } 

    } 

}
