// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePickUpWaybillResponse} extends {@link TeaModel}
 *
 * <p>CreatePickUpWaybillResponse</p>
 */
public class CreatePickUpWaybillResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreatePickUpWaybillResponseBody body;

    private CreatePickUpWaybillResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreatePickUpWaybillResponse create() {
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
    public CreatePickUpWaybillResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreatePickUpWaybillResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreatePickUpWaybillResponseBody body);

        @Override
        CreatePickUpWaybillResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreatePickUpWaybillResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreatePickUpWaybillResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreatePickUpWaybillResponse response) {
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
        public Builder body(CreatePickUpWaybillResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreatePickUpWaybillResponse build() {
            return new CreatePickUpWaybillResponse(this);
        } 

    } 

}
