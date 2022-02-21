// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDialogResponse} extends {@link TeaModel}
 *
 * <p>CreateDialogResponse</p>
 */
public class CreateDialogResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDialogResponseBody body;

    private CreateDialogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDialogResponse create() {
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
    public CreateDialogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDialogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDialogResponseBody body);

        @Override
        CreateDialogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDialogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDialogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDialogResponse response) {
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
        public Builder body(CreateDialogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDialogResponse build() {
            return new CreateDialogResponse(this);
        } 

    } 

}
