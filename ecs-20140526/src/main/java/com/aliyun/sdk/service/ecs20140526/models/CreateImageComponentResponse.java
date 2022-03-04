// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateImageComponentResponse} extends {@link TeaModel}
 *
 * <p>CreateImageComponentResponse</p>
 */
public class CreateImageComponentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateImageComponentResponseBody body;

    private CreateImageComponentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateImageComponentResponse create() {
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
    public CreateImageComponentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateImageComponentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateImageComponentResponseBody body);

        @Override
        CreateImageComponentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateImageComponentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateImageComponentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateImageComponentResponse response) {
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
        public Builder body(CreateImageComponentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateImageComponentResponse build() {
            return new CreateImageComponentResponse(this);
        } 

    } 

}
