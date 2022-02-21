// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyElastictaskResponse} extends {@link TeaModel}
 *
 * <p>ModifyElastictaskResponse</p>
 */
public class ModifyElastictaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyElastictaskResponseBody body;

    private ModifyElastictaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyElastictaskResponse create() {
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
    public ModifyElastictaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyElastictaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyElastictaskResponseBody body);

        @Override
        ModifyElastictaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyElastictaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyElastictaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyElastictaskResponse response) {
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
        public Builder body(ModifyElastictaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyElastictaskResponse build() {
            return new ModifyElastictaskResponse(this);
        } 

    } 

}
