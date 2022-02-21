// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePerspectiveResponse} extends {@link TeaModel}
 *
 * <p>UpdatePerspectiveResponse</p>
 */
public class UpdatePerspectiveResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdatePerspectiveResponseBody body;

    private UpdatePerspectiveResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdatePerspectiveResponse create() {
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
    public UpdatePerspectiveResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdatePerspectiveResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdatePerspectiveResponseBody body);

        @Override
        UpdatePerspectiveResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdatePerspectiveResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdatePerspectiveResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdatePerspectiveResponse response) {
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
        public Builder body(UpdatePerspectiveResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdatePerspectiveResponse build() {
            return new UpdatePerspectiveResponse(this);
        } 

    } 

}
