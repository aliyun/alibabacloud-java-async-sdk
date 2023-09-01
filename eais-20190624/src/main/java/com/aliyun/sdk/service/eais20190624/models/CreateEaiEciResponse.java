// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eais20190624.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEaiEciResponse} extends {@link TeaModel}
 *
 * <p>CreateEaiEciResponse</p>
 */
public class CreateEaiEciResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateEaiEciResponseBody body;

    private CreateEaiEciResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateEaiEciResponse create() {
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
    public CreateEaiEciResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateEaiEciResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateEaiEciResponseBody body);

        @Override
        CreateEaiEciResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateEaiEciResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateEaiEciResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateEaiEciResponse response) {
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
        public Builder body(CreateEaiEciResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateEaiEciResponse build() {
            return new CreateEaiEciResponse(this);
        } 

    } 

}
