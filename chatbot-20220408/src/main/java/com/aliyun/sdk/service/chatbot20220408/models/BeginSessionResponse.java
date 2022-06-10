// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BeginSessionResponse} extends {@link TeaModel}
 *
 * <p>BeginSessionResponse</p>
 */
public class BeginSessionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BeginSessionResponseBody body;

    private BeginSessionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BeginSessionResponse create() {
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
    public BeginSessionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BeginSessionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BeginSessionResponseBody body);

        @Override
        BeginSessionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BeginSessionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BeginSessionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BeginSessionResponse response) {
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
        public Builder body(BeginSessionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BeginSessionResponse build() {
            return new BeginSessionResponse(this);
        } 

    } 

}
