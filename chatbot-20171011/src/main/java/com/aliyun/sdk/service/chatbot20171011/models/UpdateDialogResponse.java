// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDialogResponse} extends {@link TeaModel}
 *
 * <p>UpdateDialogResponse</p>
 */
public class UpdateDialogResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateDialogResponseBody body;

    private UpdateDialogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateDialogResponse create() {
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
    public UpdateDialogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateDialogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateDialogResponseBody body);

        @Override
        UpdateDialogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateDialogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateDialogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateDialogResponse response) {
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
        public Builder body(UpdateDialogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateDialogResponse build() {
            return new UpdateDialogResponse(this);
        } 

    } 

}
