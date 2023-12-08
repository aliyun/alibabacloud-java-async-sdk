// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckBindRamUserResponse} extends {@link TeaModel}
 *
 * <p>CheckBindRamUserResponse</p>
 */
public class CheckBindRamUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CheckBindRamUserResponseBody body;

    private CheckBindRamUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CheckBindRamUserResponse create() {
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
    public CheckBindRamUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckBindRamUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CheckBindRamUserResponseBody body);

        @Override
        CheckBindRamUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckBindRamUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CheckBindRamUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckBindRamUserResponse response) {
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
        public Builder body(CheckBindRamUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckBindRamUserResponse build() {
            return new CheckBindRamUserResponse(this);
        } 

    } 

}
