// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link UpdateOssExternalStoreResponse} extends {@link TeaModel}
 *
 * <p>UpdateOssExternalStoreResponse</p>
 */
public class UpdateOssExternalStoreResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    private UpdateOssExternalStoreResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
    }

    public static UpdateOssExternalStoreResponse create() {
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

    public interface Builder extends Response.Builder<UpdateOssExternalStoreResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        @Override
        UpdateOssExternalStoreResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateOssExternalStoreResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateOssExternalStoreResponse response) {
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
        public UpdateOssExternalStoreResponse build() {
            return new UpdateOssExternalStoreResponse(this);
        } 

    } 

}
