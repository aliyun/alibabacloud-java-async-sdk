// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddFaceUserPictureResponse} extends {@link TeaModel}
 *
 * <p>AddFaceUserPictureResponse</p>
 */
public class AddFaceUserPictureResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddFaceUserPictureResponseBody body;

    private AddFaceUserPictureResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddFaceUserPictureResponse create() {
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
    public AddFaceUserPictureResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddFaceUserPictureResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddFaceUserPictureResponseBody body);

        @Override
        AddFaceUserPictureResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddFaceUserPictureResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddFaceUserPictureResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddFaceUserPictureResponse response) {
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
        public Builder body(AddFaceUserPictureResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddFaceUserPictureResponse build() {
            return new AddFaceUserPictureResponse(this);
        } 

    } 

}
