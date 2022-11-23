// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenSensitiveFileScanResponse} extends {@link TeaModel}
 *
 * <p>OpenSensitiveFileScanResponse</p>
 */
public class OpenSensitiveFileScanResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OpenSensitiveFileScanResponseBody body;

    private OpenSensitiveFileScanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OpenSensitiveFileScanResponse create() {
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
    public OpenSensitiveFileScanResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OpenSensitiveFileScanResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OpenSensitiveFileScanResponseBody body);

        @Override
        OpenSensitiveFileScanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OpenSensitiveFileScanResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OpenSensitiveFileScanResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OpenSensitiveFileScanResponse response) {
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
        public Builder body(OpenSensitiveFileScanResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OpenSensitiveFileScanResponse build() {
            return new OpenSensitiveFileScanResponse(this);
        } 

    } 

}
