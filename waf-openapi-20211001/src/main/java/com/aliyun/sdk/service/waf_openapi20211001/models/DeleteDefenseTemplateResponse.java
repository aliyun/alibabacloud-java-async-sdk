// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDefenseTemplateResponse} extends {@link TeaModel}
 *
 * <p>DeleteDefenseTemplateResponse</p>
 */
public class DeleteDefenseTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDefenseTemplateResponseBody body;

    private DeleteDefenseTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDefenseTemplateResponse create() {
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
    public DeleteDefenseTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDefenseTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDefenseTemplateResponseBody body);

        @Override
        DeleteDefenseTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDefenseTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDefenseTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDefenseTemplateResponse response) {
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
        public Builder body(DeleteDefenseTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDefenseTemplateResponse build() {
            return new DeleteDefenseTemplateResponse(this);
        } 

    } 

}
