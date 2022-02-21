// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAdminPasswordResponse} extends {@link TeaModel}
 *
 * <p>UpdateAdminPasswordResponse</p>
 */
public class UpdateAdminPasswordResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateAdminPasswordResponseBody body;

    private UpdateAdminPasswordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateAdminPasswordResponse create() {
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
    public UpdateAdminPasswordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateAdminPasswordResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateAdminPasswordResponseBody body);

        @Override
        UpdateAdminPasswordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateAdminPasswordResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateAdminPasswordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateAdminPasswordResponse response) {
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
        public Builder body(UpdateAdminPasswordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateAdminPasswordResponse build() {
            return new UpdateAdminPasswordResponse(this);
        } 

    } 

}
