// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PublicCreateImageScanTaskResponse} extends {@link TeaModel}
 *
 * <p>PublicCreateImageScanTaskResponse</p>
 */
public class PublicCreateImageScanTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PublicCreateImageScanTaskResponseBody body;

    private PublicCreateImageScanTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PublicCreateImageScanTaskResponse create() {
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
    public PublicCreateImageScanTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PublicCreateImageScanTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PublicCreateImageScanTaskResponseBody body);

        @Override
        PublicCreateImageScanTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PublicCreateImageScanTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PublicCreateImageScanTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PublicCreateImageScanTaskResponse response) {
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
        public Builder body(PublicCreateImageScanTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PublicCreateImageScanTaskResponse build() {
            return new PublicCreateImageScanTaskResponse(this);
        } 

    } 

}
