// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTemplateQuotaItemResponse} extends {@link TeaModel}
 *
 * <p>DeleteTemplateQuotaItemResponse</p>
 */
public class DeleteTemplateQuotaItemResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteTemplateQuotaItemResponseBody body;

    private DeleteTemplateQuotaItemResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteTemplateQuotaItemResponse create() {
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
    public DeleteTemplateQuotaItemResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteTemplateQuotaItemResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteTemplateQuotaItemResponseBody body);

        @Override
        DeleteTemplateQuotaItemResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteTemplateQuotaItemResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteTemplateQuotaItemResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteTemplateQuotaItemResponse response) {
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
        public Builder body(DeleteTemplateQuotaItemResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteTemplateQuotaItemResponse build() {
            return new DeleteTemplateQuotaItemResponse(this);
        } 

    } 

}
