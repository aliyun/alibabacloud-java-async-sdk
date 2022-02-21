// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyClusterTemplateResponse} extends {@link TeaModel}
 *
 * <p>ModifyClusterTemplateResponse</p>
 */
public class ModifyClusterTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyClusterTemplateResponseBody body;

    private ModifyClusterTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyClusterTemplateResponse create() {
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
    public ModifyClusterTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyClusterTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyClusterTemplateResponseBody body);

        @Override
        ModifyClusterTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyClusterTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyClusterTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyClusterTemplateResponse response) {
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
        public Builder body(ModifyClusterTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyClusterTemplateResponse build() {
            return new ModifyClusterTemplateResponse(this);
        } 

    } 

}
