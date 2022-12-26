// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyClientConfSetupResponse} extends {@link TeaModel}
 *
 * <p>ModifyClientConfSetupResponse</p>
 */
public class ModifyClientConfSetupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyClientConfSetupResponseBody body;

    private ModifyClientConfSetupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyClientConfSetupResponse create() {
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
    public ModifyClientConfSetupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyClientConfSetupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyClientConfSetupResponseBody body);

        @Override
        ModifyClientConfSetupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyClientConfSetupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyClientConfSetupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyClientConfSetupResponse response) {
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
        public Builder body(ModifyClientConfSetupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyClientConfSetupResponse build() {
            return new ModifyClientConfSetupResponse(this);
        } 

    } 

}
