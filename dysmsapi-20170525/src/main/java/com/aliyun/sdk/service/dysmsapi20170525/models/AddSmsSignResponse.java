// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddSmsSignResponse} extends {@link TeaModel}
 *
 * <p>AddSmsSignResponse</p>
 */
public class AddSmsSignResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddSmsSignResponseBody body;

    private AddSmsSignResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddSmsSignResponse create() {
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
    public AddSmsSignResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddSmsSignResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddSmsSignResponseBody body);

        @Override
        AddSmsSignResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddSmsSignResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddSmsSignResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddSmsSignResponse response) {
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
        public Builder body(AddSmsSignResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddSmsSignResponse build() {
            return new AddSmsSignResponse(this);
        } 

    } 

}
