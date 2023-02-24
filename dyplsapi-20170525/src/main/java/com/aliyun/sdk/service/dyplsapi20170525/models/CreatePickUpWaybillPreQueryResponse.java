// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePickUpWaybillPreQueryResponse} extends {@link TeaModel}
 *
 * <p>CreatePickUpWaybillPreQueryResponse</p>
 */
public class CreatePickUpWaybillPreQueryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreatePickUpWaybillPreQueryResponseBody body;

    private CreatePickUpWaybillPreQueryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreatePickUpWaybillPreQueryResponse create() {
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
    public CreatePickUpWaybillPreQueryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreatePickUpWaybillPreQueryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreatePickUpWaybillPreQueryResponseBody body);

        @Override
        CreatePickUpWaybillPreQueryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreatePickUpWaybillPreQueryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreatePickUpWaybillPreQueryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreatePickUpWaybillPreQueryResponse response) {
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
        public Builder body(CreatePickUpWaybillPreQueryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreatePickUpWaybillPreQueryResponse build() {
            return new CreatePickUpWaybillPreQueryResponse(this);
        } 

    } 

}
