// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateSdkDownloadInfoResponse} extends {@link TeaModel}
 *
 * <p>GenerateSdkDownloadInfoResponse</p>
 */
public class GenerateSdkDownloadInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GenerateSdkDownloadInfoResponseBody body;

    private GenerateSdkDownloadInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GenerateSdkDownloadInfoResponse create() {
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
    public GenerateSdkDownloadInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GenerateSdkDownloadInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GenerateSdkDownloadInfoResponseBody body);

        @Override
        GenerateSdkDownloadInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GenerateSdkDownloadInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GenerateSdkDownloadInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GenerateSdkDownloadInfoResponse response) {
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
        public Builder body(GenerateSdkDownloadInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GenerateSdkDownloadInfoResponse build() {
            return new GenerateSdkDownloadInfoResponse(this);
        } 

    } 

}
