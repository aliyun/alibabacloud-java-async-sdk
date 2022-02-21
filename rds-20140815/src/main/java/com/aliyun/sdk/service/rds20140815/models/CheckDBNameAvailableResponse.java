// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckDBNameAvailableResponse} extends {@link TeaModel}
 *
 * <p>CheckDBNameAvailableResponse</p>
 */
public class CheckDBNameAvailableResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CheckDBNameAvailableResponseBody body;

    private CheckDBNameAvailableResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CheckDBNameAvailableResponse create() {
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
    public CheckDBNameAvailableResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckDBNameAvailableResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CheckDBNameAvailableResponseBody body);

        @Override
        CheckDBNameAvailableResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckDBNameAvailableResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CheckDBNameAvailableResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckDBNameAvailableResponse response) {
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
        public Builder body(CheckDBNameAvailableResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckDBNameAvailableResponse build() {
            return new CheckDBNameAvailableResponse(this);
        } 

    } 

}
