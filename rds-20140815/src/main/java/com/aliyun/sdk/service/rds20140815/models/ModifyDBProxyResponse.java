// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBProxyResponse} extends {@link TeaModel}
 *
 * <p>ModifyDBProxyResponse</p>
 */
public class ModifyDBProxyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyDBProxyResponseBody body;

    private ModifyDBProxyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyDBProxyResponse create() {
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
    public ModifyDBProxyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyDBProxyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyDBProxyResponseBody body);

        @Override
        ModifyDBProxyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyDBProxyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyDBProxyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyDBProxyResponse response) {
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
        public Builder body(ModifyDBProxyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyDBProxyResponse build() {
            return new ModifyDBProxyResponse(this);
        } 

    } 

}
