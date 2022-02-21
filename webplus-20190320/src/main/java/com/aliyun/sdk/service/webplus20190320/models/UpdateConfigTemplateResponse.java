// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateConfigTemplateResponse} extends {@link TeaModel}
 *
 * <p>UpdateConfigTemplateResponse</p>
 */
public class UpdateConfigTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateConfigTemplateResponseBody body;

    private UpdateConfigTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateConfigTemplateResponse create() {
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
    public UpdateConfigTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateConfigTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateConfigTemplateResponseBody body);

        @Override
        UpdateConfigTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateConfigTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateConfigTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateConfigTemplateResponse response) {
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
        public Builder body(UpdateConfigTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateConfigTemplateResponse build() {
            return new UpdateConfigTemplateResponse(this);
        } 

    } 

}
