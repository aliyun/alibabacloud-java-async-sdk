// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eiam.dev.models.*;

/**
 * {@link PatchUserResponse} extends {@link TeaModel}
 *
 * <p>PatchUserResponse</p>
 */
public class PatchUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    private PatchUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
    }

    public static PatchUserResponse create() {
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

    public interface Builder extends Response.Builder<PatchUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        @Override
        PatchUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PatchUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PatchUserResponse response) {
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
        public PatchUserResponse build() {
            return new PatchUserResponse(this);
        } 

    } 

}
