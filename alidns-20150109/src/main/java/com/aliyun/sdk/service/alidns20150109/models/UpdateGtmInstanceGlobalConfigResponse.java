// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateGtmInstanceGlobalConfigResponse} extends {@link TeaModel}
 *
 * <p>UpdateGtmInstanceGlobalConfigResponse</p>
 */
public class UpdateGtmInstanceGlobalConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateGtmInstanceGlobalConfigResponseBody body;

    private UpdateGtmInstanceGlobalConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateGtmInstanceGlobalConfigResponse create() {
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
    public UpdateGtmInstanceGlobalConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateGtmInstanceGlobalConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateGtmInstanceGlobalConfigResponseBody body);

        @Override
        UpdateGtmInstanceGlobalConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateGtmInstanceGlobalConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateGtmInstanceGlobalConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateGtmInstanceGlobalConfigResponse response) {
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
        public Builder body(UpdateGtmInstanceGlobalConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateGtmInstanceGlobalConfigResponse build() {
            return new UpdateGtmInstanceGlobalConfigResponse(this);
        } 

    } 

}
