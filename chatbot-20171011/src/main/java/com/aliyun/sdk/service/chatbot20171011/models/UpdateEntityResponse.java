// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateEntityResponse} extends {@link TeaModel}
 *
 * <p>UpdateEntityResponse</p>
 */
public class UpdateEntityResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateEntityResponseBody body;

    private UpdateEntityResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateEntityResponse create() {
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
    public UpdateEntityResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateEntityResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateEntityResponseBody body);

        @Override
        UpdateEntityResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateEntityResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateEntityResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateEntityResponse response) {
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
        public Builder body(UpdateEntityResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateEntityResponse build() {
            return new UpdateEntityResponse(this);
        } 

    } 

}
