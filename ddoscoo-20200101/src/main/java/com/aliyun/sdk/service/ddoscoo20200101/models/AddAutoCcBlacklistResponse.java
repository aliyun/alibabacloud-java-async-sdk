// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddAutoCcBlacklistResponse} extends {@link TeaModel}
 *
 * <p>AddAutoCcBlacklistResponse</p>
 */
public class AddAutoCcBlacklistResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddAutoCcBlacklistResponseBody body;

    private AddAutoCcBlacklistResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddAutoCcBlacklistResponse create() {
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
    public AddAutoCcBlacklistResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddAutoCcBlacklistResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddAutoCcBlacklistResponseBody body);

        @Override
        AddAutoCcBlacklistResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddAutoCcBlacklistResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddAutoCcBlacklistResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddAutoCcBlacklistResponse response) {
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
        public Builder body(AddAutoCcBlacklistResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddAutoCcBlacklistResponse build() {
            return new AddAutoCcBlacklistResponse(this);
        } 

    } 

}
