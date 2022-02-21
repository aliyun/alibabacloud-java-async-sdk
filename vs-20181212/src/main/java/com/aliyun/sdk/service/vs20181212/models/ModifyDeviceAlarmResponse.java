// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDeviceAlarmResponse} extends {@link TeaModel}
 *
 * <p>ModifyDeviceAlarmResponse</p>
 */
public class ModifyDeviceAlarmResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyDeviceAlarmResponseBody body;

    private ModifyDeviceAlarmResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyDeviceAlarmResponse create() {
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
    public ModifyDeviceAlarmResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyDeviceAlarmResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyDeviceAlarmResponseBody body);

        @Override
        ModifyDeviceAlarmResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyDeviceAlarmResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyDeviceAlarmResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyDeviceAlarmResponse response) {
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
        public Builder body(ModifyDeviceAlarmResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyDeviceAlarmResponse build() {
            return new ModifyDeviceAlarmResponse(this);
        } 

    } 

}
