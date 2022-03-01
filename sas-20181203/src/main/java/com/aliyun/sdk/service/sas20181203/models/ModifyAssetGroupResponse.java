// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAssetGroupResponse} extends {@link TeaModel}
 *
 * <p>ModifyAssetGroupResponse</p>
 */
public class ModifyAssetGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyAssetGroupResponseBody body;

    private ModifyAssetGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyAssetGroupResponse create() {
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
    public ModifyAssetGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyAssetGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyAssetGroupResponseBody body);

        @Override
        ModifyAssetGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyAssetGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyAssetGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyAssetGroupResponse response) {
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
        public Builder body(ModifyAssetGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyAssetGroupResponse build() {
            return new ModifyAssetGroupResponse(this);
        } 

    } 

}
