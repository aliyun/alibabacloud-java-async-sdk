// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCloudDriveServicesResponse} extends {@link TeaModel}
 *
 * <p>DeleteCloudDriveServicesResponse</p>
 */
public class DeleteCloudDriveServicesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteCloudDriveServicesResponseBody body;

    private DeleteCloudDriveServicesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteCloudDriveServicesResponse create() {
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
    public DeleteCloudDriveServicesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteCloudDriveServicesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteCloudDriveServicesResponseBody body);

        @Override
        DeleteCloudDriveServicesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteCloudDriveServicesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteCloudDriveServicesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteCloudDriveServicesResponse response) {
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
        public Builder body(DeleteCloudDriveServicesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteCloudDriveServicesResponse build() {
            return new DeleteCloudDriveServicesResponse(this);
        } 

    } 

}
