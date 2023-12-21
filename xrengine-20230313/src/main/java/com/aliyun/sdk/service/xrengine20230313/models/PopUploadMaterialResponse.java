// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20230313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PopUploadMaterialResponse} extends {@link TeaModel}
 *
 * <p>PopUploadMaterialResponse</p>
 */
public class PopUploadMaterialResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private PopUploadMaterialResponseBody body;

    private PopUploadMaterialResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static PopUploadMaterialResponse create() {
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
    public PopUploadMaterialResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PopUploadMaterialResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(PopUploadMaterialResponseBody body);

        @Override
        PopUploadMaterialResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PopUploadMaterialResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private PopUploadMaterialResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PopUploadMaterialResponse response) {
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
        public Builder body(PopUploadMaterialResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PopUploadMaterialResponse build() {
            return new PopUploadMaterialResponse(this);
        } 

    } 

}
