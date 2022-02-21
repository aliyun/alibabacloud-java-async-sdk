// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteFaceUserPictureResponse} extends {@link TeaModel}
 *
 * <p>DeleteFaceUserPictureResponse</p>
 */
public class DeleteFaceUserPictureResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteFaceUserPictureResponseBody body;

    private DeleteFaceUserPictureResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteFaceUserPictureResponse create() {
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
    public DeleteFaceUserPictureResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteFaceUserPictureResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteFaceUserPictureResponseBody body);

        @Override
        DeleteFaceUserPictureResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteFaceUserPictureResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteFaceUserPictureResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteFaceUserPictureResponse response) {
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
        public Builder body(DeleteFaceUserPictureResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteFaceUserPictureResponse build() {
            return new DeleteFaceUserPictureResponse(this);
        } 

    } 

}
