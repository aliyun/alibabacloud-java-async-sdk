// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ValidateShardTaskResponse} extends {@link TeaModel}
 *
 * <p>ValidateShardTaskResponse</p>
 */
public class ValidateShardTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ValidateShardTaskResponseBody body;

    private ValidateShardTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ValidateShardTaskResponse create() {
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
    public ValidateShardTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ValidateShardTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ValidateShardTaskResponseBody body);

        @Override
        ValidateShardTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ValidateShardTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ValidateShardTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ValidateShardTaskResponse response) {
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
        public Builder body(ValidateShardTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ValidateShardTaskResponse build() {
            return new ValidateShardTaskResponse(this);
        } 

    } 

}
