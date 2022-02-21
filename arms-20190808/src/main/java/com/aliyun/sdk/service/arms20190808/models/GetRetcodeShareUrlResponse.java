// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRetcodeShareUrlResponse} extends {@link TeaModel}
 *
 * <p>GetRetcodeShareUrlResponse</p>
 */
public class GetRetcodeShareUrlResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetRetcodeShareUrlResponseBody body;

    private GetRetcodeShareUrlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetRetcodeShareUrlResponse create() {
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
    public GetRetcodeShareUrlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetRetcodeShareUrlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetRetcodeShareUrlResponseBody body);

        @Override
        GetRetcodeShareUrlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetRetcodeShareUrlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetRetcodeShareUrlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetRetcodeShareUrlResponse response) {
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
        public Builder body(GetRetcodeShareUrlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetRetcodeShareUrlResponse build() {
            return new GetRetcodeShareUrlResponse(this);
        } 

    } 

}
