// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePrivateRdsClassResponse} extends {@link TeaModel}
 *
 * <p>UpdatePrivateRdsClassResponse</p>
 */
public class UpdatePrivateRdsClassResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdatePrivateRdsClassResponseBody body;

    private UpdatePrivateRdsClassResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdatePrivateRdsClassResponse create() {
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
    public UpdatePrivateRdsClassResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdatePrivateRdsClassResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdatePrivateRdsClassResponseBody body);

        @Override
        UpdatePrivateRdsClassResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdatePrivateRdsClassResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdatePrivateRdsClassResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdatePrivateRdsClassResponse response) {
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
        public Builder body(UpdatePrivateRdsClassResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdatePrivateRdsClassResponse build() {
            return new UpdatePrivateRdsClassResponse(this);
        } 

    } 

}
