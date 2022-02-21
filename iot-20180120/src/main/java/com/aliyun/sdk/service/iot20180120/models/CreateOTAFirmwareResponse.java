// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOTAFirmwareResponse} extends {@link TeaModel}
 *
 * <p>CreateOTAFirmwareResponse</p>
 */
public class CreateOTAFirmwareResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateOTAFirmwareResponseBody body;

    private CreateOTAFirmwareResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateOTAFirmwareResponse create() {
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
    public CreateOTAFirmwareResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateOTAFirmwareResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateOTAFirmwareResponseBody body);

        @Override
        CreateOTAFirmwareResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateOTAFirmwareResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateOTAFirmwareResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateOTAFirmwareResponse response) {
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
        public Builder body(CreateOTAFirmwareResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateOTAFirmwareResponse build() {
            return new CreateOTAFirmwareResponse(this);
        } 

    } 

}
