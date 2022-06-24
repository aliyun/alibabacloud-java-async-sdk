// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableInstanceAccessControlResponse} extends {@link TeaModel}
 *
 * <p>DisableInstanceAccessControlResponse</p>
 */
public class DisableInstanceAccessControlResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableInstanceAccessControlResponseBody body;

    private DisableInstanceAccessControlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableInstanceAccessControlResponse create() {
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
    public DisableInstanceAccessControlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableInstanceAccessControlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableInstanceAccessControlResponseBody body);

        @Override
        DisableInstanceAccessControlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableInstanceAccessControlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableInstanceAccessControlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableInstanceAccessControlResponse response) {
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
        public Builder body(DisableInstanceAccessControlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableInstanceAccessControlResponse build() {
            return new DisableInstanceAccessControlResponse(this);
        } 

    } 

}
