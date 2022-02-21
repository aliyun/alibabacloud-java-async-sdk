// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckNumberAvaliableResponse} extends {@link TeaModel}
 *
 * <p>CheckNumberAvaliableResponse</p>
 */
public class CheckNumberAvaliableResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CheckNumberAvaliableResponseBody body;

    private CheckNumberAvaliableResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CheckNumberAvaliableResponse create() {
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
    public CheckNumberAvaliableResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckNumberAvaliableResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CheckNumberAvaliableResponseBody body);

        @Override
        CheckNumberAvaliableResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckNumberAvaliableResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CheckNumberAvaliableResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckNumberAvaliableResponse response) {
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
        public Builder body(CheckNumberAvaliableResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckNumberAvaliableResponse build() {
            return new CheckNumberAvaliableResponse(this);
        } 

    } 

}
