// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSchemaSubscribeResponse} extends {@link TeaModel}
 *
 * <p>CreateSchemaSubscribeResponse</p>
 */
public class CreateSchemaSubscribeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateSchemaSubscribeResponseBody body;

    private CreateSchemaSubscribeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateSchemaSubscribeResponse create() {
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
    public CreateSchemaSubscribeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateSchemaSubscribeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateSchemaSubscribeResponseBody body);

        @Override
        CreateSchemaSubscribeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateSchemaSubscribeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateSchemaSubscribeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateSchemaSubscribeResponse response) {
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
        public Builder body(CreateSchemaSubscribeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateSchemaSubscribeResponse build() {
            return new CreateSchemaSubscribeResponse(this);
        } 

    } 

}
