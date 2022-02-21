// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyPrivacyNumberCallDetailResponse} extends {@link TeaModel}
 *
 * <p>ModifyPrivacyNumberCallDetailResponse</p>
 */
public class ModifyPrivacyNumberCallDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyPrivacyNumberCallDetailResponseBody body;

    private ModifyPrivacyNumberCallDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyPrivacyNumberCallDetailResponse create() {
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
    public ModifyPrivacyNumberCallDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyPrivacyNumberCallDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyPrivacyNumberCallDetailResponseBody body);

        @Override
        ModifyPrivacyNumberCallDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyPrivacyNumberCallDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyPrivacyNumberCallDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyPrivacyNumberCallDetailResponse response) {
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
        public Builder body(ModifyPrivacyNumberCallDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyPrivacyNumberCallDetailResponse build() {
            return new ModifyPrivacyNumberCallDetailResponse(this);
        } 

    } 

}
