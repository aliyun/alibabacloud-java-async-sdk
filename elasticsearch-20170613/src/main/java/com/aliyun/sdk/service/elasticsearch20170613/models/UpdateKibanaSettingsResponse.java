// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateKibanaSettingsResponse} extends {@link TeaModel}
 *
 * <p>UpdateKibanaSettingsResponse</p>
 */
public class UpdateKibanaSettingsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateKibanaSettingsResponseBody body;

    private UpdateKibanaSettingsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateKibanaSettingsResponse create() {
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
    public UpdateKibanaSettingsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateKibanaSettingsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateKibanaSettingsResponseBody body);

        @Override
        UpdateKibanaSettingsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateKibanaSettingsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateKibanaSettingsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateKibanaSettingsResponse response) {
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
        public Builder body(UpdateKibanaSettingsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateKibanaSettingsResponse build() {
            return new UpdateKibanaSettingsResponse(this);
        } 

    } 

}
