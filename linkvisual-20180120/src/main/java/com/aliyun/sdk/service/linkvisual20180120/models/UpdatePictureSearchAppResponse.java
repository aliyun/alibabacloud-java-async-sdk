// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePictureSearchAppResponse} extends {@link TeaModel}
 *
 * <p>UpdatePictureSearchAppResponse</p>
 */
public class UpdatePictureSearchAppResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdatePictureSearchAppResponseBody body;

    private UpdatePictureSearchAppResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdatePictureSearchAppResponse create() {
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
    public UpdatePictureSearchAppResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdatePictureSearchAppResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdatePictureSearchAppResponseBody body);

        @Override
        UpdatePictureSearchAppResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdatePictureSearchAppResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdatePictureSearchAppResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdatePictureSearchAppResponse response) {
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
        public Builder body(UpdatePictureSearchAppResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdatePictureSearchAppResponse build() {
            return new UpdatePictureSearchAppResponse(this);
        } 

    } 

}
