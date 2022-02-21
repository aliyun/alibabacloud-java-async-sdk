// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateThingModelValidationConfigResponse} extends {@link TeaModel}
 *
 * <p>UpdateThingModelValidationConfigResponse</p>
 */
public class UpdateThingModelValidationConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateThingModelValidationConfigResponseBody body;

    private UpdateThingModelValidationConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateThingModelValidationConfigResponse create() {
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
    public UpdateThingModelValidationConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateThingModelValidationConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateThingModelValidationConfigResponseBody body);

        @Override
        UpdateThingModelValidationConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateThingModelValidationConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateThingModelValidationConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateThingModelValidationConfigResponse response) {
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
        public Builder body(UpdateThingModelValidationConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateThingModelValidationConfigResponse build() {
            return new UpdateThingModelValidationConfigResponse(this);
        } 

    } 

}
