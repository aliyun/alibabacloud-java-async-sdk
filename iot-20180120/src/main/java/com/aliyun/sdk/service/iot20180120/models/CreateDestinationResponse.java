// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDestinationResponse} extends {@link TeaModel}
 *
 * <p>CreateDestinationResponse</p>
 */
public class CreateDestinationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDestinationResponseBody body;

    private CreateDestinationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDestinationResponse create() {
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
    public CreateDestinationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDestinationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDestinationResponseBody body);

        @Override
        CreateDestinationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDestinationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDestinationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDestinationResponse response) {
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
        public Builder body(CreateDestinationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDestinationResponse build() {
            return new CreateDestinationResponse(this);
        } 

    } 

}
