// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateConfigMapResponse} extends {@link TeaModel}
 *
 * <p>CreateConfigMapResponse</p>
 */
public class CreateConfigMapResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateConfigMapResponseBody body;

    private CreateConfigMapResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateConfigMapResponse create() {
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
    public CreateConfigMapResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateConfigMapResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateConfigMapResponseBody body);

        @Override
        CreateConfigMapResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateConfigMapResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateConfigMapResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateConfigMapResponse response) {
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
        public Builder body(CreateConfigMapResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateConfigMapResponse build() {
            return new CreateConfigMapResponse(this);
        } 

    } 

}
