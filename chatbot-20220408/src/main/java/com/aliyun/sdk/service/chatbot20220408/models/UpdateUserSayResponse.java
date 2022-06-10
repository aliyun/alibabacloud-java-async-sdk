// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateUserSayResponse} extends {@link TeaModel}
 *
 * <p>UpdateUserSayResponse</p>
 */
public class UpdateUserSayResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateUserSayResponseBody body;

    private UpdateUserSayResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateUserSayResponse create() {
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
    public UpdateUserSayResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateUserSayResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateUserSayResponseBody body);

        @Override
        UpdateUserSayResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateUserSayResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateUserSayResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateUserSayResponse response) {
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
        public Builder body(UpdateUserSayResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateUserSayResponse build() {
            return new UpdateUserSayResponse(this);
        } 

    } 

}
