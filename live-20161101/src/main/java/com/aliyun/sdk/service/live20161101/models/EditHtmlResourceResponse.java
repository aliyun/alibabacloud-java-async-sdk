// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EditHtmlResourceResponse} extends {@link TeaModel}
 *
 * <p>EditHtmlResourceResponse</p>
 */
public class EditHtmlResourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EditHtmlResourceResponseBody body;

    private EditHtmlResourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EditHtmlResourceResponse create() {
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
    public EditHtmlResourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EditHtmlResourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EditHtmlResourceResponseBody body);

        @Override
        EditHtmlResourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EditHtmlResourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EditHtmlResourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EditHtmlResourceResponse response) {
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
        public Builder body(EditHtmlResourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EditHtmlResourceResponse build() {
            return new EditHtmlResourceResponse(this);
        } 

    } 

}
