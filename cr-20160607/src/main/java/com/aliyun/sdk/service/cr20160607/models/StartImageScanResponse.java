// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20160607.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartImageScanResponse} extends {@link TeaModel}
 *
 * <p>StartImageScanResponse</p>
 */
public class StartImageScanResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    private StartImageScanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
    }

    public static StartImageScanResponse create() {
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

    public interface Builder extends Response.Builder<StartImageScanResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        @Override
        StartImageScanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartImageScanResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartImageScanResponse response) {
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
        public StartImageScanResponse build() {
            return new StartImageScanResponse(this);
        } 

    } 

}
