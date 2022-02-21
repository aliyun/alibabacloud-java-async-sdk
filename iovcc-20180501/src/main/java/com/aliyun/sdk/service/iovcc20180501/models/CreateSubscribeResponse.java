// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSubscribeResponse} extends {@link TeaModel}
 *
 * <p>CreateSubscribeResponse</p>
 */
public class CreateSubscribeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateSubscribeResponseBody body;

    private CreateSubscribeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateSubscribeResponse create() {
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
    public CreateSubscribeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateSubscribeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateSubscribeResponseBody body);

        @Override
        CreateSubscribeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateSubscribeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateSubscribeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateSubscribeResponse response) {
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
        public Builder body(CreateSubscribeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateSubscribeResponse build() {
            return new CreateSubscribeResponse(this);
        } 

    } 

}
