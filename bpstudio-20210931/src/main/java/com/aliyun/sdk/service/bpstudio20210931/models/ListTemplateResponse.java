// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bpstudio20210931.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTemplateResponse} extends {@link TeaModel}
 *
 * <p>ListTemplateResponse</p>
 */
public class ListTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListTemplateResponseBody body;

    private ListTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListTemplateResponse create() {
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
    public ListTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListTemplateResponseBody body);

        @Override
        ListTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListTemplateResponse response) {
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
        public Builder body(ListTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListTemplateResponse build() {
            return new ListTemplateResponse(this);
        } 

    } 

}
