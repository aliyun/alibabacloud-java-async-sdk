// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateInstanceSettingsResponse} extends {@link TeaModel}
 *
 * <p>UpdateInstanceSettingsResponse</p>
 */
public class UpdateInstanceSettingsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateInstanceSettingsResponseBody body;

    private UpdateInstanceSettingsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateInstanceSettingsResponse create() {
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
    public UpdateInstanceSettingsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateInstanceSettingsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateInstanceSettingsResponseBody body);

        @Override
        UpdateInstanceSettingsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateInstanceSettingsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateInstanceSettingsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateInstanceSettingsResponse response) {
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
        public Builder body(UpdateInstanceSettingsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateInstanceSettingsResponse build() {
            return new UpdateInstanceSettingsResponse(this);
        } 

    } 

}
