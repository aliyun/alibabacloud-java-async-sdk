// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNodeResponse} extends {@link TeaModel}
 *
 * <p>CreateNodeResponse</p>
 */
public class CreateNodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateNodeResponseBody body;

    private CreateNodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateNodeResponse create() {
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
    public CreateNodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateNodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateNodeResponseBody body);

        @Override
        CreateNodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateNodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateNodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateNodeResponse response) {
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
        public Builder body(CreateNodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateNodeResponse build() {
            return new CreateNodeResponse(this);
        } 

    } 

}
