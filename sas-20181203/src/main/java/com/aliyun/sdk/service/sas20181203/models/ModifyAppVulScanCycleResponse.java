// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAppVulScanCycleResponse} extends {@link TeaModel}
 *
 * <p>ModifyAppVulScanCycleResponse</p>
 */
public class ModifyAppVulScanCycleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyAppVulScanCycleResponseBody body;

    private ModifyAppVulScanCycleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyAppVulScanCycleResponse create() {
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
    public ModifyAppVulScanCycleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyAppVulScanCycleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyAppVulScanCycleResponseBody body);

        @Override
        ModifyAppVulScanCycleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyAppVulScanCycleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyAppVulScanCycleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyAppVulScanCycleResponse response) {
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
        public Builder body(ModifyAppVulScanCycleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyAppVulScanCycleResponse build() {
            return new ModifyAppVulScanCycleResponse(this);
        } 

    } 

}
