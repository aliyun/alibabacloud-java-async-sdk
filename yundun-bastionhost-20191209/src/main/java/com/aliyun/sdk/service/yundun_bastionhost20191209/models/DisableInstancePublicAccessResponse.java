// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableInstancePublicAccessResponse} extends {@link TeaModel}
 *
 * <p>DisableInstancePublicAccessResponse</p>
 */
public class DisableInstancePublicAccessResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableInstancePublicAccessResponseBody body;

    private DisableInstancePublicAccessResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableInstancePublicAccessResponse create() {
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
    public DisableInstancePublicAccessResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableInstancePublicAccessResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableInstancePublicAccessResponseBody body);

        @Override
        DisableInstancePublicAccessResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableInstancePublicAccessResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableInstancePublicAccessResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableInstancePublicAccessResponse response) {
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
        public Builder body(DisableInstancePublicAccessResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableInstancePublicAccessResponse build() {
            return new DisableInstancePublicAccessResponse(this);
        } 

    } 

}
