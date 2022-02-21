// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20140828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAlarmResponse} extends {@link TeaModel}
 *
 * <p>ModifyAlarmResponse</p>
 */
public class ModifyAlarmResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyAlarmResponseBody body;

    private ModifyAlarmResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyAlarmResponse create() {
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
    public ModifyAlarmResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyAlarmResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyAlarmResponseBody body);

        @Override
        ModifyAlarmResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyAlarmResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyAlarmResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyAlarmResponse response) {
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
        public Builder body(ModifyAlarmResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyAlarmResponse build() {
            return new ModifyAlarmResponse(this);
        } 

    } 

}
