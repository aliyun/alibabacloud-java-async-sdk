// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyWebPathResponse} extends {@link TeaModel}
 *
 * <p>ModifyWebPathResponse</p>
 */
public class ModifyWebPathResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyWebPathResponseBody body;

    private ModifyWebPathResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyWebPathResponse create() {
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
    public ModifyWebPathResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyWebPathResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyWebPathResponseBody body);

        @Override
        ModifyWebPathResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyWebPathResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyWebPathResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyWebPathResponse response) {
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
        public Builder body(ModifyWebPathResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyWebPathResponse build() {
            return new ModifyWebPathResponse(this);
        } 

    } 

}
