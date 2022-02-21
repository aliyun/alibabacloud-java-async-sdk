// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20210101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRamTestResponse} extends {@link TeaModel}
 *
 * <p>CreateRamTestResponse</p>
 */
public class CreateRamTestResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateRamTestResponseBody body;

    private CreateRamTestResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateRamTestResponse create() {
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
    public CreateRamTestResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateRamTestResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateRamTestResponseBody body);

        @Override
        CreateRamTestResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateRamTestResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateRamTestResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateRamTestResponse response) {
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
        public Builder body(CreateRamTestResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateRamTestResponse build() {
            return new CreateRamTestResponse(this);
        } 

    } 

}
