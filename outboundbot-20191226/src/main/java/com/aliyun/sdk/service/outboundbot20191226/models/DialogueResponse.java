// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DialogueResponse} extends {@link TeaModel}
 *
 * <p>DialogueResponse</p>
 */
public class DialogueResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DialogueResponseBody body;

    private DialogueResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DialogueResponse create() {
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
    public DialogueResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DialogueResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DialogueResponseBody body);

        @Override
        DialogueResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DialogueResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DialogueResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DialogueResponse response) {
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
        public Builder body(DialogueResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DialogueResponse build() {
            return new DialogueResponse(this);
        } 

    } 

}
