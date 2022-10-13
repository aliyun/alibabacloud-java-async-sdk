// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RevokeNetLinkResponse} extends {@link TeaModel}
 *
 * <p>RevokeNetLinkResponse</p>
 */
public class RevokeNetLinkResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RevokeNetLinkResponseBody body;

    private RevokeNetLinkResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RevokeNetLinkResponse create() {
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
    public RevokeNetLinkResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RevokeNetLinkResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RevokeNetLinkResponseBody body);

        @Override
        RevokeNetLinkResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RevokeNetLinkResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RevokeNetLinkResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RevokeNetLinkResponse response) {
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
        public Builder body(RevokeNetLinkResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RevokeNetLinkResponse build() {
            return new RevokeNetLinkResponse(this);
        } 

    } 

}
