// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartImageVulScanResponse} extends {@link TeaModel}
 *
 * <p>StartImageVulScanResponse</p>
 */
public class StartImageVulScanResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartImageVulScanResponseBody body;

    private StartImageVulScanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartImageVulScanResponse create() {
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
    public StartImageVulScanResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartImageVulScanResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartImageVulScanResponseBody body);

        @Override
        StartImageVulScanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartImageVulScanResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartImageVulScanResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartImageVulScanResponse response) {
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
        public Builder body(StartImageVulScanResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartImageVulScanResponse build() {
            return new StartImageVulScanResponse(this);
        } 

    } 

}
