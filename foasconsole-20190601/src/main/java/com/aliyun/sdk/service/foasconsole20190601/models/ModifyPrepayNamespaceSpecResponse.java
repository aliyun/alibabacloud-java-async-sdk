// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.foasconsole20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyPrepayNamespaceSpecResponse} extends {@link TeaModel}
 *
 * <p>ModifyPrepayNamespaceSpecResponse</p>
 */
public class ModifyPrepayNamespaceSpecResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyPrepayNamespaceSpecResponseBody body;

    private ModifyPrepayNamespaceSpecResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyPrepayNamespaceSpecResponse create() {
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
    public ModifyPrepayNamespaceSpecResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyPrepayNamespaceSpecResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyPrepayNamespaceSpecResponseBody body);

        @Override
        ModifyPrepayNamespaceSpecResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyPrepayNamespaceSpecResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyPrepayNamespaceSpecResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyPrepayNamespaceSpecResponse response) {
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
        public Builder body(ModifyPrepayNamespaceSpecResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyPrepayNamespaceSpecResponse build() {
            return new ModifyPrepayNamespaceSpecResponse(this);
        } 

    } 

}
