// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckAccountNameAvailableResponse} extends {@link TeaModel}
 *
 * <p>CheckAccountNameAvailableResponse</p>
 */
public class CheckAccountNameAvailableResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CheckAccountNameAvailableResponseBody body;

    private CheckAccountNameAvailableResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CheckAccountNameAvailableResponse create() {
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
    public CheckAccountNameAvailableResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckAccountNameAvailableResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CheckAccountNameAvailableResponseBody body);

        @Override
        CheckAccountNameAvailableResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckAccountNameAvailableResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CheckAccountNameAvailableResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckAccountNameAvailableResponse response) {
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
        public Builder body(CheckAccountNameAvailableResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckAccountNameAvailableResponse build() {
            return new CheckAccountNameAvailableResponse(this);
        } 

    } 

}
