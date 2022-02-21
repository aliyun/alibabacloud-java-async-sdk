// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EditJobTemplateResponse} extends {@link TeaModel}
 *
 * <p>EditJobTemplateResponse</p>
 */
public class EditJobTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EditJobTemplateResponseBody body;

    private EditJobTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EditJobTemplateResponse create() {
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
    public EditJobTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EditJobTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EditJobTemplateResponseBody body);

        @Override
        EditJobTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EditJobTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EditJobTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EditJobTemplateResponse response) {
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
        public Builder body(EditJobTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EditJobTemplateResponse build() {
            return new EditJobTemplateResponse(this);
        } 

    } 

}
