// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SaveDataSourceOrderConfigResponse} extends {@link TeaModel}
 *
 * <p>SaveDataSourceOrderConfigResponse</p>
 */
public class SaveDataSourceOrderConfigResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private SaveDataSourceOrderConfigResponseBody body;

    private SaveDataSourceOrderConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static SaveDataSourceOrderConfigResponse create() {
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
    public SaveDataSourceOrderConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SaveDataSourceOrderConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(SaveDataSourceOrderConfigResponseBody body);

        @Override
        SaveDataSourceOrderConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SaveDataSourceOrderConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private SaveDataSourceOrderConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SaveDataSourceOrderConfigResponse response) {
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
        public Builder body(SaveDataSourceOrderConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SaveDataSourceOrderConfigResponse build() {
            return new SaveDataSourceOrderConfigResponse(this);
        } 

    } 

}
