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

    @NameInMap("body")
    @Validation(required = true)
    private PictureSearchPictureResponseBody body;

    private PictureSearchPictureResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
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
     * @return body
     */
    public PictureSearchPictureResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PictureSearchPictureResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PictureSearchPictureResponseBody body);

        @Override
        PictureSearchPictureResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PictureSearchPictureResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PictureSearchPictureResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PictureSearchPictureResponse response) {
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
