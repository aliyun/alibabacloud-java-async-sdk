// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateReceiverResponse} extends {@link TeaModel}
 *
 * <p>CreateReceiverResponse</p>
 */
public class CreateReceiverResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateReceiverResponseBody body;

    private CreateReceiverResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateReceiverResponse create() {
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
    public CreateReceiverResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateReceiverResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateReceiverResponseBody body);

        @Override
        CreateReceiverResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateReceiverResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateReceiverResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateReceiverResponse response) {
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
        public Builder body(CreateReceiverResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateReceiverResponse build() {
            return new CreateReceiverResponse(this);
        } 

    } 

}
