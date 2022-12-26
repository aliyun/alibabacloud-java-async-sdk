// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateJenkinsImageRegistryPersistenceDayResponse} extends {@link TeaModel}
 *
 * <p>UpdateJenkinsImageRegistryPersistenceDayResponse</p>
 */
public class UpdateJenkinsImageRegistryPersistenceDayResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateJenkinsImageRegistryPersistenceDayResponseBody body;

    private UpdateJenkinsImageRegistryPersistenceDayResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateJenkinsImageRegistryPersistenceDayResponse create() {
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
    public UpdateJenkinsImageRegistryPersistenceDayResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateJenkinsImageRegistryPersistenceDayResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateJenkinsImageRegistryPersistenceDayResponseBody body);

        @Override
        UpdateJenkinsImageRegistryPersistenceDayResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateJenkinsImageRegistryPersistenceDayResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateJenkinsImageRegistryPersistenceDayResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateJenkinsImageRegistryPersistenceDayResponse response) {
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
        public Builder body(UpdateJenkinsImageRegistryPersistenceDayResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateJenkinsImageRegistryPersistenceDayResponse build() {
            return new UpdateJenkinsImageRegistryPersistenceDayResponse(this);
        } 

    } 

}
