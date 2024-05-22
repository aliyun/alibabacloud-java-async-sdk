// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateIspFlushCacheInstanceConfigResponse} extends {@link TeaModel}
 *
 * <p>UpdateIspFlushCacheInstanceConfigResponse</p>
 */
public class UpdateIspFlushCacheInstanceConfigResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private UpdateIspFlushCacheInstanceConfigResponseBody body;

    private UpdateIspFlushCacheInstanceConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public UpdateIspFlushCacheInstanceConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateIspFlushCacheInstanceConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(UpdateIspFlushCacheInstanceConfigResponseBody body);

        @Override
        UpdateIspFlushCacheInstanceConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateIspFlushCacheInstanceConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private UpdateIspFlushCacheInstanceConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateIspFlushCacheInstanceConfigResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
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
