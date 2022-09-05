// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyTemplateQuotaItemResponse} extends {@link TeaModel}
 *
 * <p>ModifyTemplateQuotaItemResponse</p>
 */
public class ModifyTemplateQuotaItemResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyTemplateQuotaItemResponseBody body;

    private ModifyTemplateQuotaItemResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyTemplateQuotaItemResponse create() {
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
    public ModifyTemplateQuotaItemResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyTemplateQuotaItemResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyTemplateQuotaItemResponseBody body);

        @Override
        ModifyTemplateQuotaItemResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyTemplateQuotaItemResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyTemplateQuotaItemResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyTemplateQuotaItemResponse response) {
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
        public Builder body(ModifyTemplateQuotaItemResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyTemplateQuotaItemResponse build() {
            return new ModifyTemplateQuotaItemResponse(this);
        } 

    } 

}
