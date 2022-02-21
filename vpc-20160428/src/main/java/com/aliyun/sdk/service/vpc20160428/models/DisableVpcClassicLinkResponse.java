// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableVpcClassicLinkResponse} extends {@link TeaModel}
 *
 * <p>DisableVpcClassicLinkResponse</p>
 */
public class DisableVpcClassicLinkResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableVpcClassicLinkResponseBody body;

    private DisableVpcClassicLinkResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableVpcClassicLinkResponse create() {
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
    public DisableVpcClassicLinkResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableVpcClassicLinkResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableVpcClassicLinkResponseBody body);

        @Override
        DisableVpcClassicLinkResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableVpcClassicLinkResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableVpcClassicLinkResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableVpcClassicLinkResponse response) {
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
        public Builder body(DisableVpcClassicLinkResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableVpcClassicLinkResponse build() {
            return new DisableVpcClassicLinkResponse(this);
        } 

    } 

}
