// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GrantNetLinkResponse} extends {@link TeaModel}
 *
 * <p>GrantNetLinkResponse</p>
 */
public class GrantNetLinkResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GrantNetLinkResponseBody body;

    private GrantNetLinkResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GrantNetLinkResponse create() {
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
    public GrantNetLinkResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GrantNetLinkResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GrantNetLinkResponseBody body);

        @Override
        GrantNetLinkResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GrantNetLinkResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GrantNetLinkResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GrantNetLinkResponse response) {
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
        public Builder body(GrantNetLinkResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GrantNetLinkResponse build() {
            return new GrantNetLinkResponse(this);
        } 

    } 

}
