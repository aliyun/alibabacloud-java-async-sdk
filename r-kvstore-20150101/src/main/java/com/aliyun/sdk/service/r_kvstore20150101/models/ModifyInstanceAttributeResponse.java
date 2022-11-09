// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyInstanceAttributeResponse} extends {@link TeaModel}
 *
 * <p>ModifyInstanceAttributeResponse</p>
 */
public class ModifyInstanceAttributeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyInstanceAttributeResponseBody body;

    private ModifyInstanceAttributeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyInstanceAttributeResponse create() {
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
    public ModifyInstanceAttributeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyInstanceAttributeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyInstanceAttributeResponseBody body);

        @Override
        ModifyInstanceAttributeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyInstanceAttributeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyInstanceAttributeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyInstanceAttributeResponse response) {
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
        public Builder body(ModifyInstanceAttributeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyInstanceAttributeResponse build() {
            return new ModifyInstanceAttributeResponse(this);
        } 

    } 

}
