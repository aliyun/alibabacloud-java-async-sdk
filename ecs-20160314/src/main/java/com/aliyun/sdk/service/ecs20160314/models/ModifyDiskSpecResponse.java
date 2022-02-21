// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDiskSpecResponse} extends {@link TeaModel}
 *
 * <p>ModifyDiskSpecResponse</p>
 */
public class ModifyDiskSpecResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyDiskSpecResponseBody body;

    private ModifyDiskSpecResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyDiskSpecResponse create() {
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
    public ModifyDiskSpecResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyDiskSpecResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyDiskSpecResponseBody body);

        @Override
        ModifyDiskSpecResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyDiskSpecResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyDiskSpecResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyDiskSpecResponse response) {
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
        public Builder body(ModifyDiskSpecResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyDiskSpecResponse build() {
            return new ModifyDiskSpecResponse(this);
        } 

    } 

}
