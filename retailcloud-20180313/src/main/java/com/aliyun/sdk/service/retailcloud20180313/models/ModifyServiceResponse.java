// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyServiceResponse} extends {@link TeaModel}
 *
 * <p>ModifyServiceResponse</p>
 */
public class ModifyServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyServiceResponseBody body;

    private ModifyServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyServiceResponse create() {
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
    public ModifyServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyServiceResponseBody body);

        @Override
        ModifyServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyServiceResponse response) {
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
        public Builder body(ModifyServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyServiceResponse build() {
            return new ModifyServiceResponse(this);
        } 

    } 

}
