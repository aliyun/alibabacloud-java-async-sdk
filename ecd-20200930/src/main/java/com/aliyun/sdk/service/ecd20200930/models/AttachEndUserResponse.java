// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachEndUserResponse} extends {@link TeaModel}
 *
 * <p>AttachEndUserResponse</p>
 */
public class AttachEndUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AttachEndUserResponseBody body;

    private AttachEndUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AttachEndUserResponse create() {
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
    public AttachEndUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AttachEndUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AttachEndUserResponseBody body);

        @Override
        AttachEndUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AttachEndUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AttachEndUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AttachEndUserResponse response) {
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
        public Builder body(AttachEndUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AttachEndUserResponse build() {
            return new AttachEndUserResponse(this);
        } 

    } 

}
