// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadMcubeMiniPackageResponse} extends {@link TeaModel}
 *
 * <p>UploadMcubeMiniPackageResponse</p>
 */
public class UploadMcubeMiniPackageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UploadMcubeMiniPackageResponseBody body;

    private UploadMcubeMiniPackageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UploadMcubeMiniPackageResponse create() {
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
    public UploadMcubeMiniPackageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UploadMcubeMiniPackageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UploadMcubeMiniPackageResponseBody body);

        @Override
        UploadMcubeMiniPackageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UploadMcubeMiniPackageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UploadMcubeMiniPackageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UploadMcubeMiniPackageResponse response) {
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
        public Builder body(UploadMcubeMiniPackageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UploadMcubeMiniPackageResponse build() {
            return new UploadMcubeMiniPackageResponse(this);
        } 

    } 

}
