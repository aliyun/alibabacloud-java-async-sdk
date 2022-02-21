// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link WhiteIpListResponse} extends {@link TeaModel}
 *
 * <p>WhiteIpListResponse</p>
 */
public class WhiteIpListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private WhiteIpListResponseBody body;

    private WhiteIpListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static WhiteIpListResponse create() {
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
    public WhiteIpListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<WhiteIpListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(WhiteIpListResponseBody body);

        @Override
        WhiteIpListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<WhiteIpListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private WhiteIpListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(WhiteIpListResponse response) {
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
        public Builder body(WhiteIpListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public WhiteIpListResponse build() {
            return new WhiteIpListResponse(this);
        } 

    } 

}
