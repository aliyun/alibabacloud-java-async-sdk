// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyQuotaTemplateServiceStatusResponse} extends {@link TeaModel}
 *
 * <p>ModifyQuotaTemplateServiceStatusResponse</p>
 */
public class ModifyQuotaTemplateServiceStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyQuotaTemplateServiceStatusResponseBody body;

    private ModifyQuotaTemplateServiceStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyQuotaTemplateServiceStatusResponse create() {
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
    public ModifyQuotaTemplateServiceStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyQuotaTemplateServiceStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyQuotaTemplateServiceStatusResponseBody body);

        @Override
        ModifyQuotaTemplateServiceStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyQuotaTemplateServiceStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyQuotaTemplateServiceStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyQuotaTemplateServiceStatusResponse response) {
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
        public Builder body(ModifyQuotaTemplateServiceStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyQuotaTemplateServiceStatusResponse build() {
            return new ModifyQuotaTemplateServiceStatusResponse(this);
        } 

    } 

}
