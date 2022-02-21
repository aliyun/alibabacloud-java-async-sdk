// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddAutoCcWhitelistResponse} extends {@link TeaModel}
 *
 * <p>AddAutoCcWhitelistResponse</p>
 */
public class AddAutoCcWhitelistResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddAutoCcWhitelistResponseBody body;

    private AddAutoCcWhitelistResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddAutoCcWhitelistResponse create() {
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
    public AddAutoCcWhitelistResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddAutoCcWhitelistResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddAutoCcWhitelistResponseBody body);

        @Override
        AddAutoCcWhitelistResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddAutoCcWhitelistResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddAutoCcWhitelistResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddAutoCcWhitelistResponse response) {
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
        public Builder body(AddAutoCcWhitelistResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddAutoCcWhitelistResponse build() {
            return new AddAutoCcWhitelistResponse(this);
        } 

    } 

}
