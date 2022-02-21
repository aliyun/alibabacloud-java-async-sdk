// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddFaceUserResponse} extends {@link TeaModel}
 *
 * <p>AddFaceUserResponse</p>
 */
public class AddFaceUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddFaceUserResponseBody body;

    private AddFaceUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddFaceUserResponse create() {
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
    public AddFaceUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddFaceUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddFaceUserResponseBody body);

        @Override
        AddFaceUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddFaceUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddFaceUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddFaceUserResponse response) {
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
        public Builder body(AddFaceUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddFaceUserResponse build() {
            return new AddFaceUserResponse(this);
        } 

    } 

}
