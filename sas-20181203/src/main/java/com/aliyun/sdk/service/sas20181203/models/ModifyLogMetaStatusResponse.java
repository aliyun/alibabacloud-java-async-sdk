// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyLogMetaStatusResponse} extends {@link TeaModel}
 *
 * <p>ModifyLogMetaStatusResponse</p>
 */
public class ModifyLogMetaStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyLogMetaStatusResponseBody body;

    private ModifyLogMetaStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyLogMetaStatusResponse create() {
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
    public ModifyLogMetaStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyLogMetaStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyLogMetaStatusResponseBody body);

        @Override
        ModifyLogMetaStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyLogMetaStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyLogMetaStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyLogMetaStatusResponse response) {
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
        public Builder body(ModifyLogMetaStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyLogMetaStatusResponse build() {
            return new ModifyLogMetaStatusResponse(this);
        } 

    } 

}
