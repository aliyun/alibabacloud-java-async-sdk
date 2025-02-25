// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GeneratePictureUploadSignResponse} extends {@link TeaModel}
 *
 * <p>GeneratePictureUploadSignResponse</p>
 */
public class GeneratePictureUploadSignResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GeneratePictureUploadSignResponseBody body;

    private GeneratePictureUploadSignResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GeneratePictureUploadSignResponse create() {
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
    public GeneratePictureUploadSignResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GeneratePictureUploadSignResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GeneratePictureUploadSignResponseBody body);

        @Override
        GeneratePictureUploadSignResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GeneratePictureUploadSignResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GeneratePictureUploadSignResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GeneratePictureUploadSignResponse response) {
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
        public Builder body(GeneratePictureUploadSignResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GeneratePictureUploadSignResponse build() {
            return new GeneratePictureUploadSignResponse(this);
        } 

    } 

}
