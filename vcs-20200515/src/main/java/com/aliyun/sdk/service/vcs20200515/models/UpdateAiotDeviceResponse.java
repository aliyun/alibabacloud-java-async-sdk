// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAiotDeviceResponse} extends {@link TeaModel}
 *
 * <p>UpdateAiotDeviceResponse</p>
 */
public class UpdateAiotDeviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateAiotDeviceResponseBody body;

    private UpdateAiotDeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateAiotDeviceResponse create() {
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
    public UpdateAiotDeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateAiotDeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateAiotDeviceResponseBody body);

        @Override
        UpdateAiotDeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateAiotDeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateAiotDeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateAiotDeviceResponse response) {
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
        public Builder body(UpdateAiotDeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateAiotDeviceResponse build() {
            return new UpdateAiotDeviceResponse(this);
        } 

    } 

}
