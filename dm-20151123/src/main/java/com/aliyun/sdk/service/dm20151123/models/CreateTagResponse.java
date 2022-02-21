// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTagResponse} extends {@link TeaModel}
 *
 * <p>CreateTagResponse</p>
 */
public class CreateTagResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateTagResponseBody body;

    private CreateTagResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateTagResponse create() {
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
    public CreateTagResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateTagResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateTagResponseBody body);

        @Override
        CreateTagResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateTagResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateTagResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateTagResponse response) {
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
        public Builder body(CreateTagResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateTagResponse build() {
            return new CreateTagResponse(this);
        } 

    } 

}
