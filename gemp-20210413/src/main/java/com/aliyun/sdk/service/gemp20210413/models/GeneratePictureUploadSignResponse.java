// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GeneratePictureUploadSignResponse} extends {@link TeaModel}
 *
 * <p>GeneratePictureUploadSignResponse</p>
 */
public class GeneratePictureUploadSignResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GeneratePictureUploadSignResponseBody body;

    private GeneratePictureUploadSignResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
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
     * @return body
     */
    public GeneratePictureUploadSignResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GeneratePictureUploadSignResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GeneratePictureUploadSignResponseBody body);

        @Override
        GeneratePictureUploadSignResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GeneratePictureUploadSignResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GeneratePictureUploadSignResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GeneratePictureUploadSignResponse response) {
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
