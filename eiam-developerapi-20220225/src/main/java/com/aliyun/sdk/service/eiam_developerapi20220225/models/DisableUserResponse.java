// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eiam.dev.models.*;

/**
 * {@link DisableUserResponse} extends {@link TeaModel}
 *
 * <p>DisableUserResponse</p>
 */
public class DisableUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    private DisableUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
    }

    public static DisableUserResponse create() {
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

    public interface Builder extends Response.Builder<DisableUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        @Override
        DisableUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableUserResponse response) {
            super(response);
            this.headers = response.headers;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        @Override
        public DisableUserResponse build() {
            return new DisableUserResponse(this);
        } 

    } 

}
