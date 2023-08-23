// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddOrUpdateWelcomeTextResponse} extends {@link TeaModel}
 *
 * <p>AddOrUpdateWelcomeTextResponse</p>
 */
public class AddOrUpdateWelcomeTextResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddOrUpdateWelcomeTextResponseBody body;

    private AddOrUpdateWelcomeTextResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddOrUpdateWelcomeTextResponse create() {
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
    public AddOrUpdateWelcomeTextResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddOrUpdateWelcomeTextResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddOrUpdateWelcomeTextResponseBody body);

        @Override
        AddOrUpdateWelcomeTextResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddOrUpdateWelcomeTextResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddOrUpdateWelcomeTextResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddOrUpdateWelcomeTextResponse response) {
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
        public Builder body(AddOrUpdateWelcomeTextResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddOrUpdateWelcomeTextResponse build() {
            return new AddOrUpdateWelcomeTextResponse(this);
        } 

    } 

}
