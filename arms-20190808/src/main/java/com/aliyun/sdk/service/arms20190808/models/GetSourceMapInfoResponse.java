// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSourceMapInfoResponse} extends {@link TeaModel}
 *
 * <p>GetSourceMapInfoResponse</p>
 */
public class GetSourceMapInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSourceMapInfoResponseBody body;

    private GetSourceMapInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSourceMapInfoResponse create() {
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
    public GetSourceMapInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSourceMapInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSourceMapInfoResponseBody body);

        @Override
        GetSourceMapInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSourceMapInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSourceMapInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSourceMapInfoResponse response) {
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
        public Builder body(GetSourceMapInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSourceMapInfoResponse build() {
            return new GetSourceMapInfoResponse(this);
        } 

    } 

}
