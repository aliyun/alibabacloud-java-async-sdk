// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAITemplateResponse} extends {@link TeaModel}
 *
 * <p>ListAITemplateResponse</p>
 */
public class ListAITemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAITemplateResponseBody body;

    private ListAITemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAITemplateResponse create() {
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
    public ListAITemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAITemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAITemplateResponseBody body);

        @Override
        ListAITemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAITemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAITemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAITemplateResponse response) {
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
        public Builder body(ListAITemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAITemplateResponse build() {
            return new ListAITemplateResponse(this);
        } 

    } 

}
