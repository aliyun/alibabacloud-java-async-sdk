// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ValidateTemplateResponse} extends {@link TeaModel}
 *
 * <p>ValidateTemplateResponse</p>
 */
public class ValidateTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ValidateTemplateResponseBody body;

    private ValidateTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ValidateTemplateResponse create() {
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
    public ValidateTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ValidateTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ValidateTemplateResponseBody body);

        @Override
        ValidateTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ValidateTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ValidateTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ValidateTemplateResponse response) {
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
        public Builder body(ValidateTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ValidateTemplateResponse build() {
            return new ValidateTemplateResponse(this);
        } 

    } 

}
