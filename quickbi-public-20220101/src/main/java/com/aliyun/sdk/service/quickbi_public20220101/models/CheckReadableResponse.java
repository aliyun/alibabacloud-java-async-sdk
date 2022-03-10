// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckReadableResponse} extends {@link TeaModel}
 *
 * <p>CheckReadableResponse</p>
 */
public class CheckReadableResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CheckReadableResponseBody body;

    private CheckReadableResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CheckReadableResponse create() {
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
    public CheckReadableResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckReadableResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CheckReadableResponseBody body);

        @Override
        CheckReadableResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckReadableResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CheckReadableResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckReadableResponse response) {
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
        public Builder body(CheckReadableResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckReadableResponse build() {
            return new CheckReadableResponse(this);
        } 

    } 

}
