// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponse} extends {@link TeaModel}
 *
 * <p>AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponse</p>
 */
public class AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponseBody body;

    private AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponse create() {
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
    public AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponseBody body);

        @Override
        AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponse response) {
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
        public Builder body(AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponse build() {
            return new AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponse(this);
        } 

    } 

}
