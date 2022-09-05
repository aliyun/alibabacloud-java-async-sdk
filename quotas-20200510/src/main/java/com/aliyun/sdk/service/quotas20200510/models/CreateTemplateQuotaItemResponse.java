// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTemplateQuotaItemResponse} extends {@link TeaModel}
 *
 * <p>CreateTemplateQuotaItemResponse</p>
 */
public class CreateTemplateQuotaItemResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateTemplateQuotaItemResponseBody body;

    private CreateTemplateQuotaItemResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateTemplateQuotaItemResponse create() {
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
    public CreateTemplateQuotaItemResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateTemplateQuotaItemResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateTemplateQuotaItemResponseBody body);

        @Override
        CreateTemplateQuotaItemResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateTemplateQuotaItemResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateTemplateQuotaItemResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateTemplateQuotaItemResponse response) {
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
        public Builder body(CreateTemplateQuotaItemResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateTemplateQuotaItemResponse build() {
            return new CreateTemplateQuotaItemResponse(this);
        } 

    } 

}
