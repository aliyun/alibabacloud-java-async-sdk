// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDrdsIpWhiteListResponse} extends {@link TeaModel}
 *
 * <p>ModifyDrdsIpWhiteListResponse</p>
 */
public class ModifyDrdsIpWhiteListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyDrdsIpWhiteListResponseBody body;

    private ModifyDrdsIpWhiteListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyDrdsIpWhiteListResponse create() {
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
    public ModifyDrdsIpWhiteListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyDrdsIpWhiteListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyDrdsIpWhiteListResponseBody body);

        @Override
        ModifyDrdsIpWhiteListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyDrdsIpWhiteListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyDrdsIpWhiteListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyDrdsIpWhiteListResponse response) {
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
        public Builder body(ModifyDrdsIpWhiteListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyDrdsIpWhiteListResponse build() {
            return new ModifyDrdsIpWhiteListResponse(this);
        } 

    } 

}
