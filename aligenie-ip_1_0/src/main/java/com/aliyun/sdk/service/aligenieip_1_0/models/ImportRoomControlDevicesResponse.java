// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportRoomControlDevicesResponse} extends {@link TeaModel}
 *
 * <p>ImportRoomControlDevicesResponse</p>
 */
public class ImportRoomControlDevicesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ImportRoomControlDevicesResponseBody body;

    private ImportRoomControlDevicesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ImportRoomControlDevicesResponse create() {
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
    public ImportRoomControlDevicesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ImportRoomControlDevicesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ImportRoomControlDevicesResponseBody body);

        @Override
        ImportRoomControlDevicesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ImportRoomControlDevicesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ImportRoomControlDevicesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ImportRoomControlDevicesResponse response) {
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
        public Builder body(ImportRoomControlDevicesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ImportRoomControlDevicesResponse build() {
            return new ImportRoomControlDevicesResponse(this);
        } 

    } 

}
