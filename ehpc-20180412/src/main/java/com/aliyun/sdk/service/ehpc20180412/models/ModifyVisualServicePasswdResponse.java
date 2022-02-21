// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyVisualServicePasswdResponse} extends {@link TeaModel}
 *
 * <p>ModifyVisualServicePasswdResponse</p>
 */
public class ModifyVisualServicePasswdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyVisualServicePasswdResponseBody body;

    private ModifyVisualServicePasswdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyVisualServicePasswdResponse create() {
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
    public ModifyVisualServicePasswdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyVisualServicePasswdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyVisualServicePasswdResponseBody body);

        @Override
        ModifyVisualServicePasswdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyVisualServicePasswdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyVisualServicePasswdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyVisualServicePasswdResponse response) {
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
        public Builder body(ModifyVisualServicePasswdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyVisualServicePasswdResponse build() {
            return new ModifyVisualServicePasswdResponse(this);
        } 

    } 

}
