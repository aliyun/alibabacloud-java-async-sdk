// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDevicesStorageResponse} extends {@link TeaModel}
 *
 * <p>UpdateDevicesStorageResponse</p>
 */
public class UpdateDevicesStorageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateDevicesStorageResponseBody body;

    private UpdateDevicesStorageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateDevicesStorageResponse create() {
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
    public UpdateDevicesStorageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateDevicesStorageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateDevicesStorageResponseBody body);

        @Override
        UpdateDevicesStorageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateDevicesStorageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateDevicesStorageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateDevicesStorageResponse response) {
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
        public Builder body(UpdateDevicesStorageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateDevicesStorageResponse build() {
            return new UpdateDevicesStorageResponse(this);
        } 

    } 

}
