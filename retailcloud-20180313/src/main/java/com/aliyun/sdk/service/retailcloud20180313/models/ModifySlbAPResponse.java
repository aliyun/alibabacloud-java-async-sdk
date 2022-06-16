// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySlbAPResponse} extends {@link TeaModel}
 *
 * <p>ModifySlbAPResponse</p>
 */
public class ModifySlbAPResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifySlbAPResponseBody body;

    private ModifySlbAPResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifySlbAPResponse create() {
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
    public ModifySlbAPResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifySlbAPResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifySlbAPResponseBody body);

        @Override
        ModifySlbAPResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifySlbAPResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifySlbAPResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifySlbAPResponse response) {
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
        public Builder body(ModifySlbAPResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifySlbAPResponse build() {
            return new ModifySlbAPResponse(this);
        } 

    } 

}
