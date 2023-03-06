// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListChatappTemplateResponse} extends {@link TeaModel}
 *
 * <p>ListChatappTemplateResponse</p>
 */
public class ListChatappTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListChatappTemplateResponseBody body;

    private ListChatappTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListChatappTemplateResponse create() {
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
    public ListChatappTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListChatappTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListChatappTemplateResponseBody body);

        @Override
        ListChatappTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListChatappTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListChatappTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListChatappTemplateResponse response) {
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
        public Builder body(ListChatappTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListChatappTemplateResponse build() {
            return new ListChatappTemplateResponse(this);
        } 

    } 

}
