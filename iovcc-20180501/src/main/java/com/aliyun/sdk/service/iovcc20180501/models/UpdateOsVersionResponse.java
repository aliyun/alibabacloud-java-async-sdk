// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateOsVersionResponse} extends {@link TeaModel}
 *
 * <p>UpdateOsVersionResponse</p>
 */
public class UpdateOsVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateOsVersionResponseBody body;

    private UpdateOsVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateOsVersionResponse create() {
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
    public UpdateOsVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateOsVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateOsVersionResponseBody body);

        @Override
        UpdateOsVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateOsVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateOsVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateOsVersionResponse response) {
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
        public Builder body(UpdateOsVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateOsVersionResponse build() {
            return new UpdateOsVersionResponse(this);
        } 

    } 

}
