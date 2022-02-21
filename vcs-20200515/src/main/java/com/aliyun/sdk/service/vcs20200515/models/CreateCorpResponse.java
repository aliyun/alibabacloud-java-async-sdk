// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCorpResponse} extends {@link TeaModel}
 *
 * <p>CreateCorpResponse</p>
 */
public class CreateCorpResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateCorpResponseBody body;

    private CreateCorpResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateCorpResponse create() {
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
    public CreateCorpResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateCorpResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateCorpResponseBody body);

        @Override
        CreateCorpResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateCorpResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateCorpResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateCorpResponse response) {
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
        public Builder body(CreateCorpResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateCorpResponse build() {
            return new CreateCorpResponse(this);
        } 

    } 

}
