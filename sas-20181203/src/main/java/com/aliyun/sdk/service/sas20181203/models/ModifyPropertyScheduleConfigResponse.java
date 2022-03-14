// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyPropertyScheduleConfigResponse} extends {@link TeaModel}
 *
 * <p>ModifyPropertyScheduleConfigResponse</p>
 */
public class ModifyPropertyScheduleConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyPropertyScheduleConfigResponseBody body;

    private ModifyPropertyScheduleConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyPropertyScheduleConfigResponse create() {
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
    public ModifyPropertyScheduleConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyPropertyScheduleConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyPropertyScheduleConfigResponseBody body);

        @Override
        ModifyPropertyScheduleConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyPropertyScheduleConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyPropertyScheduleConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyPropertyScheduleConfigResponse response) {
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
        public Builder body(ModifyPropertyScheduleConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyPropertyScheduleConfigResponse build() {
            return new ModifyPropertyScheduleConfigResponse(this);
        } 

    } 

}
