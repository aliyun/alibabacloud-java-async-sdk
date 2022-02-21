// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eais20190624.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEaiResponse} extends {@link TeaModel}
 *
 * <p>CreateEaiResponse</p>
 */
public class CreateEaiResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateEaiResponseBody body;

    private CreateEaiResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateEaiResponse create() {
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
    public CreateEaiResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateEaiResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateEaiResponseBody body);

        @Override
        CreateEaiResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateEaiResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateEaiResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateEaiResponse response) {
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
        public Builder body(CreateEaiResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateEaiResponse build() {
            return new CreateEaiResponse(this);
        } 

    } 

}
