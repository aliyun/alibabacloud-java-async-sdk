// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddMessageTemplateResponse} extends {@link TeaModel}
 *
 * <p>AddMessageTemplateResponse</p>
 */
public class AddMessageTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddMessageTemplateResponseBody body;

    private AddMessageTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddMessageTemplateResponse create() {
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
    public AddMessageTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddMessageTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddMessageTemplateResponseBody body);

        @Override
        AddMessageTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddMessageTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddMessageTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddMessageTemplateResponse response) {
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
        public Builder body(AddMessageTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddMessageTemplateResponse build() {
            return new AddMessageTemplateResponse(this);
        } 

    } 

}
