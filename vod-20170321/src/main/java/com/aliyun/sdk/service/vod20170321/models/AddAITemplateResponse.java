// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddAITemplateResponse} extends {@link TeaModel}
 *
 * <p>AddAITemplateResponse</p>
 */
public class AddAITemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddAITemplateResponseBody body;

    private AddAITemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddAITemplateResponse create() {
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
    public AddAITemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddAITemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddAITemplateResponseBody body);

        @Override
        AddAITemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddAITemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddAITemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddAITemplateResponse response) {
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
        public Builder body(AddAITemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddAITemplateResponse build() {
            return new AddAITemplateResponse(this);
        } 

    } 

}
