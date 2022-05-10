// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PublicSyncAndCreateImageScanTaskResponse} extends {@link TeaModel}
 *
 * <p>PublicSyncAndCreateImageScanTaskResponse</p>
 */
public class PublicSyncAndCreateImageScanTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PublicSyncAndCreateImageScanTaskResponseBody body;

    private PublicSyncAndCreateImageScanTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PublicSyncAndCreateImageScanTaskResponse create() {
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
    public PublicSyncAndCreateImageScanTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PublicSyncAndCreateImageScanTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PublicSyncAndCreateImageScanTaskResponseBody body);

        @Override
        PublicSyncAndCreateImageScanTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PublicSyncAndCreateImageScanTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PublicSyncAndCreateImageScanTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PublicSyncAndCreateImageScanTaskResponse response) {
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
        public Builder body(PublicSyncAndCreateImageScanTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PublicSyncAndCreateImageScanTaskResponse build() {
            return new PublicSyncAndCreateImageScanTaskResponse(this);
        } 

    } 

}
