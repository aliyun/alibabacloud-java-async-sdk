// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportRoomGenieScenesResponse} extends {@link TeaModel}
 *
 * <p>ImportRoomGenieScenesResponse</p>
 */
public class ImportRoomGenieScenesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ImportRoomGenieScenesResponseBody body;

    private ImportRoomGenieScenesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ImportRoomGenieScenesResponse create() {
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
    public ImportRoomGenieScenesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ImportRoomGenieScenesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ImportRoomGenieScenesResponseBody body);

        @Override
        ImportRoomGenieScenesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ImportRoomGenieScenesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ImportRoomGenieScenesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ImportRoomGenieScenesResponse response) {
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
        public Builder body(ImportRoomGenieScenesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ImportRoomGenieScenesResponse build() {
            return new ImportRoomGenieScenesResponse(this);
        } 

    } 

}
