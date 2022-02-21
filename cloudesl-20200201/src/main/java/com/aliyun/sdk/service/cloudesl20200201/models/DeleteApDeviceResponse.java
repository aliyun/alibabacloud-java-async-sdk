// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20200201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteApDeviceResponse} extends {@link TeaModel}
 *
 * <p>DeleteApDeviceResponse</p>
 */
public class DeleteApDeviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteApDeviceResponseBody body;

    private DeleteApDeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteApDeviceResponse create() {
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
    public DeleteApDeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteApDeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteApDeviceResponseBody body);

        @Override
        DeleteApDeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteApDeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteApDeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteApDeviceResponse response) {
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
        public Builder body(DeleteApDeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteApDeviceResponse build() {
            return new DeleteApDeviceResponse(this);
        } 

    } 

}
