// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bpstudio20210931.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ValuateTemplateResponse} extends {@link TeaModel}
 *
 * <p>ValuateTemplateResponse</p>
 */
public class ValuateTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ValuateTemplateResponseBody body;

    private ValuateTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ValuateTemplateResponse create() {
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
    public ValuateTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ValuateTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ValuateTemplateResponseBody body);

        @Override
        ValuateTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ValuateTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ValuateTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ValuateTemplateResponse response) {
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
        public Builder body(ValuateTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ValuateTemplateResponse build() {
            return new ValuateTemplateResponse(this);
        } 

    } 

}
