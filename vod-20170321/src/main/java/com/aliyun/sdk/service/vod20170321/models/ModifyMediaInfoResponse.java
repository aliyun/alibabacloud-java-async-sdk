// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyMediaInfoResponse} extends {@link TeaModel}
 *
 * <p>ModifyMediaInfoResponse</p>
 */
public class ModifyMediaInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyMediaInfoResponseBody body;

    private ModifyMediaInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyMediaInfoResponse create() {
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
    public ModifyMediaInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyMediaInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyMediaInfoResponseBody body);

        @Override
        ModifyMediaInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyMediaInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyMediaInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyMediaInfoResponse response) {
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
        public Builder body(ModifyMediaInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyMediaInfoResponse build() {
            return new ModifyMediaInfoResponse(this);
        } 

    } 

}
