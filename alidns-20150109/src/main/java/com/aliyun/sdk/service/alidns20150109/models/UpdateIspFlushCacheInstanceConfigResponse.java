// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateIspFlushCacheInstanceConfigResponse} extends {@link TeaModel}
 *
 * <p>UpdateIspFlushCacheInstanceConfigResponse</p>
 */
public class UpdateIspFlushCacheInstanceConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateIspFlushCacheInstanceConfigResponseBody body;

    private UpdateIspFlushCacheInstanceConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateIspFlushCacheInstanceConfigResponse create() {
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
    public UpdateIspFlushCacheInstanceConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateIspFlushCacheInstanceConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateIspFlushCacheInstanceConfigResponseBody body);

        @Override
        UpdateIspFlushCacheInstanceConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateIspFlushCacheInstanceConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateIspFlushCacheInstanceConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateIspFlushCacheInstanceConfigResponse response) {
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
        public Builder body(UpdateIspFlushCacheInstanceConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateIspFlushCacheInstanceConfigResponse build() {
            return new UpdateIspFlushCacheInstanceConfigResponse(this);
        } 

    } 

}
