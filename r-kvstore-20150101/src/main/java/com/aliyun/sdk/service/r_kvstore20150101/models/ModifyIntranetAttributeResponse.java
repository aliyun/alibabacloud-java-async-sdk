// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyIntranetAttributeResponse} extends {@link TeaModel}
 *
 * <p>ModifyIntranetAttributeResponse</p>
 */
public class ModifyIntranetAttributeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyIntranetAttributeResponseBody body;

    private ModifyIntranetAttributeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyIntranetAttributeResponse create() {
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
    public ModifyIntranetAttributeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyIntranetAttributeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyIntranetAttributeResponseBody body);

        @Override
        ModifyIntranetAttributeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyIntranetAttributeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyIntranetAttributeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyIntranetAttributeResponse response) {
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
        public Builder body(ModifyIntranetAttributeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyIntranetAttributeResponse build() {
            return new ModifyIntranetAttributeResponse(this);
        } 

    } 

}
