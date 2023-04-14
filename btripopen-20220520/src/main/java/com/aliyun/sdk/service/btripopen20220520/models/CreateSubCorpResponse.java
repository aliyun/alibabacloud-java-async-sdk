// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSubCorpResponse} extends {@link TeaModel}
 *
 * <p>CreateSubCorpResponse</p>
 */
public class CreateSubCorpResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateSubCorpResponseBody body;

    private CreateSubCorpResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateSubCorpResponse create() {
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
    public CreateSubCorpResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateSubCorpResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateSubCorpResponseBody body);

        @Override
        CreateSubCorpResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateSubCorpResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateSubCorpResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateSubCorpResponse response) {
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
        public Builder body(CreateSubCorpResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateSubCorpResponse build() {
            return new CreateSubCorpResponse(this);
        } 

    } 

}
