// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateThingModelResponse} extends {@link TeaModel}
 *
 * <p>CreateThingModelResponse</p>
 */
public class CreateThingModelResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateThingModelResponseBody body;

    private CreateThingModelResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateThingModelResponse create() {
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
    public CreateThingModelResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateThingModelResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateThingModelResponseBody body);

        @Override
        CreateThingModelResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateThingModelResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateThingModelResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateThingModelResponse response) {
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
        public Builder body(CreateThingModelResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateThingModelResponse build() {
            return new CreateThingModelResponse(this);
        } 

    } 

}
