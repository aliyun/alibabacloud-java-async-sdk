// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ValidateTemplateContentResponse} extends {@link TeaModel}
 *
 * <p>ValidateTemplateContentResponse</p>
 */
public class ValidateTemplateContentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ValidateTemplateContentResponseBody body;

    private ValidateTemplateContentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ValidateTemplateContentResponse create() {
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
    public ValidateTemplateContentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ValidateTemplateContentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ValidateTemplateContentResponseBody body);

        @Override
        ValidateTemplateContentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ValidateTemplateContentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ValidateTemplateContentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ValidateTemplateContentResponse response) {
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
        public Builder body(ValidateTemplateContentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ValidateTemplateContentResponse build() {
            return new ValidateTemplateContentResponse(this);
        } 

    } 

}
