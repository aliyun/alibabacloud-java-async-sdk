// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePackageResponse} extends {@link TeaModel}
 *
 * <p>UpdatePackageResponse</p>
 */
public class UpdatePackageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdatePackageResponseBody body;

    private UpdatePackageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdatePackageResponse create() {
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
    public UpdatePackageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdatePackageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdatePackageResponseBody body);

        @Override
        UpdatePackageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdatePackageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdatePackageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdatePackageResponse response) {
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
        public Builder body(UpdatePackageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdatePackageResponse build() {
            return new UpdatePackageResponse(this);
        } 

    } 

}
