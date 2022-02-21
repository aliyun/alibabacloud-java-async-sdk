// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateOsVersionStatusResponse} extends {@link TeaModel}
 *
 * <p>UpdateOsVersionStatusResponse</p>
 */
public class UpdateOsVersionStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateOsVersionStatusResponseBody body;

    private UpdateOsVersionStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateOsVersionStatusResponse create() {
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
    public UpdateOsVersionStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateOsVersionStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateOsVersionStatusResponseBody body);

        @Override
        UpdateOsVersionStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateOsVersionStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateOsVersionStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateOsVersionStatusResponse response) {
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
        public Builder body(UpdateOsVersionStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateOsVersionStatusResponse build() {
            return new UpdateOsVersionStatusResponse(this);
        } 

    } 

}
