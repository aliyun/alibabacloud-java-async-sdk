// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xgippop20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ValidControllerAuthorResponse} extends {@link TeaModel}
 *
 * <p>ValidControllerAuthorResponse</p>
 */
public class ValidControllerAuthorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ValidControllerAuthorResponseBody body;

    private ValidControllerAuthorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ValidControllerAuthorResponse create() {
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
    public ValidControllerAuthorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ValidControllerAuthorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ValidControllerAuthorResponseBody body);

        @Override
        ValidControllerAuthorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ValidControllerAuthorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ValidControllerAuthorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ValidControllerAuthorResponse response) {
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
        public Builder body(ValidControllerAuthorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ValidControllerAuthorResponse build() {
            return new ValidControllerAuthorResponse(this);
        } 

    } 

}
