// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveAntOpenPlatformConfigResponse} extends {@link TeaModel}
 *
 * <p>SaveAntOpenPlatformConfigResponse</p>
 */
public class SaveAntOpenPlatformConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SaveAntOpenPlatformConfigResponseBody body;

    private SaveAntOpenPlatformConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SaveAntOpenPlatformConfigResponse create() {
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
    public SaveAntOpenPlatformConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SaveAntOpenPlatformConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SaveAntOpenPlatformConfigResponseBody body);

        @Override
        SaveAntOpenPlatformConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SaveAntOpenPlatformConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SaveAntOpenPlatformConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SaveAntOpenPlatformConfigResponse response) {
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
        public Builder body(SaveAntOpenPlatformConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SaveAntOpenPlatformConfigResponse build() {
            return new SaveAntOpenPlatformConfigResponse(this);
        } 

    } 

}
