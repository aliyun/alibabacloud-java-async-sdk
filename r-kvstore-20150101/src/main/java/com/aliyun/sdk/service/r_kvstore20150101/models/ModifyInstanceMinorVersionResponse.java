// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyInstanceMinorVersionResponse} extends {@link TeaModel}
 *
 * <p>ModifyInstanceMinorVersionResponse</p>
 */
public class ModifyInstanceMinorVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyInstanceMinorVersionResponseBody body;

    private ModifyInstanceMinorVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyInstanceMinorVersionResponse create() {
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
    public ModifyInstanceMinorVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyInstanceMinorVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyInstanceMinorVersionResponseBody body);

        @Override
        ModifyInstanceMinorVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyInstanceMinorVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyInstanceMinorVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyInstanceMinorVersionResponse response) {
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
        public Builder body(ModifyInstanceMinorVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyInstanceMinorVersionResponse build() {
            return new ModifyInstanceMinorVersionResponse(this);
        } 

    } 

}
