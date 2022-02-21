// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateFaceUserResponse} extends {@link TeaModel}
 *
 * <p>UpdateFaceUserResponse</p>
 */
public class UpdateFaceUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateFaceUserResponseBody body;

    private UpdateFaceUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateFaceUserResponse create() {
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
    public UpdateFaceUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateFaceUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateFaceUserResponseBody body);

        @Override
        UpdateFaceUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateFaceUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateFaceUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateFaceUserResponse response) {
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
        public Builder body(UpdateFaceUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateFaceUserResponse build() {
            return new UpdateFaceUserResponse(this);
        } 

    } 

}
