// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyRefreshProcessInfoResponse} extends {@link TeaModel}
 *
 * <p>ModifyRefreshProcessInfoResponse</p>
 */
public class ModifyRefreshProcessInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyRefreshProcessInfoResponseBody body;

    private ModifyRefreshProcessInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyRefreshProcessInfoResponse create() {
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
    public ModifyRefreshProcessInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyRefreshProcessInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyRefreshProcessInfoResponseBody body);

        @Override
        ModifyRefreshProcessInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyRefreshProcessInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyRefreshProcessInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyRefreshProcessInfoResponse response) {
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
        public Builder body(ModifyRefreshProcessInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyRefreshProcessInfoResponse build() {
            return new ModifyRefreshProcessInfoResponse(this);
        } 

    } 

}
