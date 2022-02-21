// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCoreWordResponse} extends {@link TeaModel}
 *
 * <p>UpdateCoreWordResponse</p>
 */
public class UpdateCoreWordResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateCoreWordResponseBody body;

    private UpdateCoreWordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateCoreWordResponse create() {
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
    public UpdateCoreWordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateCoreWordResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateCoreWordResponseBody body);

        @Override
        UpdateCoreWordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateCoreWordResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateCoreWordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateCoreWordResponse response) {
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
        public Builder body(UpdateCoreWordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateCoreWordResponse build() {
            return new UpdateCoreWordResponse(this);
        } 

    } 

}
