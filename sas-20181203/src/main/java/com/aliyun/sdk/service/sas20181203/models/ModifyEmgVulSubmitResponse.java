// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyEmgVulSubmitResponse} extends {@link TeaModel}
 *
 * <p>ModifyEmgVulSubmitResponse</p>
 */
public class ModifyEmgVulSubmitResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyEmgVulSubmitResponseBody body;

    private ModifyEmgVulSubmitResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyEmgVulSubmitResponse create() {
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
    public ModifyEmgVulSubmitResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyEmgVulSubmitResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyEmgVulSubmitResponseBody body);

        @Override
        ModifyEmgVulSubmitResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyEmgVulSubmitResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyEmgVulSubmitResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyEmgVulSubmitResponse response) {
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
        public Builder body(ModifyEmgVulSubmitResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyEmgVulSubmitResponse build() {
            return new ModifyEmgVulSubmitResponse(this);
        } 

    } 

}
