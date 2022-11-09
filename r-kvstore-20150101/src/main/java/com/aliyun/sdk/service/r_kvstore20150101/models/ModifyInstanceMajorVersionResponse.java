// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyInstanceMajorVersionResponse} extends {@link TeaModel}
 *
 * <p>ModifyInstanceMajorVersionResponse</p>
 */
public class ModifyInstanceMajorVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyInstanceMajorVersionResponseBody body;

    private ModifyInstanceMajorVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyInstanceMajorVersionResponse create() {
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
    public ModifyInstanceMajorVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyInstanceMajorVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyInstanceMajorVersionResponseBody body);

        @Override
        ModifyInstanceMajorVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyInstanceMajorVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyInstanceMajorVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyInstanceMajorVersionResponse response) {
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
        public Builder body(ModifyInstanceMajorVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyInstanceMajorVersionResponse build() {
            return new ModifyInstanceMajorVersionResponse(this);
        } 

    } 

}
