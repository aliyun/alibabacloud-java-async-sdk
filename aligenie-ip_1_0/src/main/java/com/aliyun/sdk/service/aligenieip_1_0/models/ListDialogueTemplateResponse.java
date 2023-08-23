// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDialogueTemplateResponse} extends {@link TeaModel}
 *
 * <p>ListDialogueTemplateResponse</p>
 */
public class ListDialogueTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDialogueTemplateResponseBody body;

    private ListDialogueTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDialogueTemplateResponse create() {
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
    public ListDialogueTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDialogueTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDialogueTemplateResponseBody body);

        @Override
        ListDialogueTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDialogueTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDialogueTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDialogueTemplateResponse response) {
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
        public Builder body(ListDialogueTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDialogueTemplateResponse build() {
            return new ListDialogueTemplateResponse(this);
        } 

    } 

}
