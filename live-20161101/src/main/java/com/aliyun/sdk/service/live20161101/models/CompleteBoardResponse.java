// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CompleteBoardResponse} extends {@link TeaModel}
 *
 * <p>CompleteBoardResponse</p>
 */
public class CompleteBoardResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CompleteBoardResponseBody body;

    private CompleteBoardResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CompleteBoardResponse create() {
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
    public CompleteBoardResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CompleteBoardResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CompleteBoardResponseBody body);

        @Override
        CompleteBoardResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CompleteBoardResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CompleteBoardResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CompleteBoardResponse response) {
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
        public Builder body(CompleteBoardResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CompleteBoardResponse build() {
            return new CompleteBoardResponse(this);
        } 

    } 

}
