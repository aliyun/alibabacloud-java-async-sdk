// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PictureSearchPictureResponse} extends {@link TeaModel}
 *
 * <p>PictureSearchPictureResponse</p>
 */
public class PictureSearchPictureResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private PictureSearchPictureResponseBody body;

    private PictureSearchPictureResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static PictureSearchPictureResponse create() {
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
    public PictureSearchPictureResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PictureSearchPictureResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(PictureSearchPictureResponseBody body);

        @Override
        PictureSearchPictureResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PictureSearchPictureResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private PictureSearchPictureResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PictureSearchPictureResponse response) {
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
        public Builder body(PictureSearchPictureResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PictureSearchPictureResponse build() {
            return new PictureSearchPictureResponse(this);
        } 

    } 

}
